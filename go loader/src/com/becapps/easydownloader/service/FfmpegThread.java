package com.becapps.easydownloader.service;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;


public class FfmpegThread extends Thread {

	private static final String DEBUG_TAG = "FfmpegThread";
	
	private Handler handler;
	
	private int totalQueued;
	
	private int totalCompleted;
	
	private FfmpegThreadListener listener;
	
	public FfmpegThread(FfmpegThreadListener listener) {
		this.listener = listener;
	}
	
	@Override
	public void run() {
		try {
			// preparing a looper on current thread			
			// the current thread is being detected implicitly
			Looper.prepare();

			Log.i(DEBUG_TAG, "FfmpegThread entering the loop");

			// now, the handler will automatically bind to the
			// Looper that is attached to the current thread
			// You don't need to specify the Looper explicitly
			handler = new Handler();
			
			// After the following line the thread will start
			// running the message loop and will not normally
			// exit the loop unless a problem happens or you
			// quit() the looper (see below)
			Looper.loop();
			
			Log.i(DEBUG_TAG, "FfmpegThread exiting gracefully");
		} catch (Throwable t) {
			Log.e(DEBUG_TAG, "FfmpegThread halted due to an error", t);
		} 
	}
	
	// This method is allowed to be called from any thread
	public synchronized void requestStop() {
		// using the handler, post a Runnable that will quit()
		// the Looper attached to our FfmpegThread
		// obviously, all previously queued tasks will be executed
		// before the loop gets the quit Runnable
		handler.post(new Runnable() {
			@Override
			public void run() {
				// This is guaranteed to run on the FfmpegThread
				// so we can use myLooper() to get its looper
				Log.i(DEBUG_TAG, "FfmpegThread loop quitting by request");
				
				Looper.myLooper().quit();
			}
		});
	}
	
	public synchronized void enqueueAudioJob(final Runnable task) {
		// Wrap FfmpegTask into another Runnable to track the statistics
		handler.post(new Runnable() {
			@Override
			public void run() {
				try {
					task.run();
				} finally {					
					// register task completion
					synchronized (FfmpegThread.this) {
						totalCompleted++;
					}
					// tell the listener something has happened
					signalUpdate();
				}				
			}
		});
		
		totalQueued++;
		// tell the listeners the queue is now longer
		signalUpdate();
	}
	
	public synchronized int getTotalQueued() {
		return totalQueued;
	}
	
	public synchronized int getTotalCompleted() {
		return totalCompleted;
	}
	
	// Please note! This method will normally be called from the ffmpeg thread.
	// Thus, it is up for the listener to deal with that (in case it is a UI component,
	// it has to execute the signal handling code in the UI thread using Handler - see
	// FfmpegQueueActivity for example).
	private void signalUpdate() {
		if (listener != null) {
			listener.handleFfmpegThreadUpdate();
		}
	}
}
