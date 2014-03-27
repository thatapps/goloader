Video Downloader for Android 
================================================================

Download video and extract or convert audio to mp3.
For Android 4+ 

################################################################


DISCLAIMER
================================================================
    You, the user, accept the full responsibility for the usage of 
    this application, excluding the developer from any liability about 
    any consequence that may derive. Thus, this application has to be 
    considered as a mere technical service provider.
    
NOTICE
================================================================
    Complying with the GPL below is mandatory.
    It's not that difficult: just give proper credits 
    to this sources and release your modified ones.

LICENSE
================================================================
Copyright (C) 2014  

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.


OTHER LICENSES
================================================================
    Additional licenses informations about code used in this project
    is available from within the App's "About" menu:

    	Main Licenses 
     
    This App is released under the GPL-3.0. 
    (YouTubeDownloader for Android Copyright (C) 2012-2013 Samuele Rini) 
     
    The FFmpeg binary (http://www.ffmpeg.org/index.html), 
    used for the audio extraction feature, is released under the GPL-3.0. 
    (FFmpeg version 2.0.1 Copyright (C) 2000-2013 the FFmpeg developers) 
     
    The filechooser library is released under the MIT license. 
    (android-filechooser Copyright (C) 2012 Hai Bison) 
     
    The SlidingMenu library is released under the Apache License. 
    (Copyright (C) 2012 Jeremy Feinstein) 

    The liblame library, used to compile FFmpeg, is released under the LGPL. 
	A GitHub project, https://github.com/intervigilium/liblame, 
	has been used to compile the lame libraries for Android. 
    (liblame Copyright (C) 2010 Ethan Chen) 
    (LAME Copyright (C) 1999-2007 The LAME Project, 
    Copyright (C) 1999-2001 Mark Taylor, 
    Copyright (C) 1998 Micheal Cheng) 
    (mpglib Copyright (C) 1995-1997 Michael Hipp) 
     
    YTD`s mp3 tags are written with MyID3: a Java ID3 Tag Library 
    (http://www.fightingquaker.com/myid3 and 
    https://sites.google.com/site/eternalsandbox/myid3-for-android)
	released under the Apache license, as its dependency Jakarta Regexp library. 
    (MyID3 Copyright (C) 2008 Charles M. Chen, adapted for Android by Romulus Urakagi Ts`ai) 
     
    Picasso: Image downloading and caching library
	Copyright 2013 Square, Inc. - http://square.github.io/picasso/ 
     
    Launcher and notification icons by Sam Plane: http://samplane123.deviantart.com/, 
    released under the CC BY-NC-ND (http://creativecommons.org/licenses/by-nc-nd/3.0) 
     
    Credits for the custom download manager to Hiroshi Matsunaga (matsuhiro): 
    https://github.com/matsuhiro/AndroidDownloadManger (released "unlicensed"). 
     
     	Code excerpts Licenses 
     
    Stack Overflow (http://stackoverflow.com), a question and answer site for programmers where
	all the content is CC BY-SA 3.0 licensed (see http://creativecommons.org/licenses/by-sa/3.0) 
     
    checkMD5(...) and calculateMD5(...): 
    https://github.com/CyanogenMod/android_packages_apps_CMUpdater
	Copyright (C) 2012 The CyanogenMod Project, licensed under the GNU GPLv2 license 
     
    FfmpegController.java: GPL-3.0 - Copyright (C) 2009, Nathan Freitas, Orbot / The Guardian Project
	http://openideals.com/guardian - https://github.com/guardianproject/android-ffmpeg-java 
     
    Observer.java: reference: https://gist.github.com/shirou/659180 
     
    SectionedAdapter.java: GPL-3.0
	Copyright (C) 2008-2010 CommonsWare, LLC - portions Copyright (C) 2008 Jeffrey Sharkey 
     
    Utils.getCpuInfo(): http://www.roman10.net/how-to-get-cpu-information-on-android/ - by Liu Feipeng 
     
    Utils.scanMedia(...):
	http://www.grokkingandroid.com/adding-files-to-androids-media-library-using-the-mediascanner/
	by Wolfram Rittmeyer 
     
    DashboardAdapter.java and DashboardListItem.java: 
    code adapted from https://github.com/survivingwithandroid/Surviving-with-android/
	by Francesco Azzola (JFrankie) 
     
    Rhino.jar: open-source implementation of JavaScript written entirely in Java;
	https://developer.mozilla.org/en-US/docs/Rhino - license: http://www.mozilla.org/MPL/2.0/ 
     
    Javascript function `decryptSignature` from the Greasemonkey script 
    http://userscripts.org/scripts/show/25105 (MIT License) - by Gantt 
    
    QueueThread.java:
	reference: http://mindtherobot.com/blog/159/android-guts-intro-to-loopers-and-handlers/ 
    by Ivan Memruk 
     
     
    
   

    Note:
    the device-framed screenshots in the project's directory have 
    been generated with the "Device Frame Generator" Android App by 
    Prateek Srivastava, available at 
    <https://github.com/f2prateek/Device-Frame-Generator/>.
    The generated artwork is released ander the "Creative Commons 
    Attribution 3.0 Unported" license (CC BY).


KNOWN ISSUES
================================================================
	[x] Downloads running:
		- for a long time (around 20 or 30 minutes)
		AND 
		- without having the Dashboard Activity to the front
		may be forced to PAUSE. In this case a manual resume is needed.
