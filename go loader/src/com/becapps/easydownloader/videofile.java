
package com.becapps.easydownloader;

import java.io.File;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.bugsense.trace.BugSenseHandler;

import com.becapps.easydownloader.utils.PopUps;

public class YTD extends Application {
	
	static String DEBUG_TAG = "YTD";

	public static String BugsenseApiKey = "ee39403d";

	public static SharedPreferences settings;
	public static final String PREFS_NAME = "com.becapps.easydownloader_preferences";
	
	@Override
    public void onCreate() {
		Log.d(DEBUG_TAG, "onCreate");
		settings = getSharedPreferences(PREFS_NAME, 0);
		
        BugSenseHandler.initAndStartSession(getApplicationContext(), BugsenseApiKey);
		
		checkDownloadProvider(".apk");
		checkDownloadProvider("Ui.apk");
        	
        super.onCreate();
	}

	private void checkDownloadProvider(String suffix) {
		File downProvSysApp = new File("/system/app/DownloadProvider" + suffix);
		if (downProvSysApp.exists()) {
			settings.edit().putBoolean("DOWNLOAD_PROVIDER_" + suffix, true).commit();
		} else {
			settings.edit().putBoolean("DOWNLOAD_PROVIDER_" + suffix, false).commit();
		}
		Log.i(DEBUG_TAG, "DownloadProvider" + suffix + " system app present: " + downProvSysApp.exists());
		BugSenseHandler.leaveBreadcrumb("DownloadProvider" + suffix + ": " + downProvSysApp.exists());
	}

	public static void NoDownProvPopUp(Context context) {
		PopUps.showPopUp(context.getString(R.string.no_downloads_sys_app), context.getString(R.string.ytd_useless), "alert", context);
	}
}
