package com.iLoong.Clock.Timer;

import java.io.File;
import java.io.FileWriter;
import java.util.Timer;
import java.util.TimerTask;

import com.iLoong.launcher.Desktop3D.Log;

public class ClockTimer {

	private static String TAG = "ClockTimer";

	private long mWidgetTimerId = 0L;

	private String mCacheFilePath = null;

	private static int mInterval = 1 * 1000;

	private Timer mTimer = new Timer();

	private TimerTask mTimerTask = null;

	private ClockTimerListener mTimerListener;

	private boolean mIsTaskPaused = true;

	private boolean mIsTaskStopped = true;

	public ClockTimer(ClockTimerListener listener, int interval) {
		this.mTimerListener = listener;
		this.mInterval = interval;
		createTimerTask();
	}

	public void start() {
		if (mIsTaskStopped) {
			createTimerTask();
		}
		mIsTaskPaused = false;
		// if (mTimer != null && mTimerTask != null) {
		// mTimer.schedule(this.mTimerTask, 0, mInterval);
		// } else {
		// if (mTimer == null) {
		// this.mTimer = new Timer();
		// }
		// if (mTimerTask == null) {
		// this.mTimerTask = new TimeTask();
		// }
		// mTimer.schedule(this.mTimerTask, 0, mInterval);
		// }
	}

	public void stop() {
		Log.v("ClockTimer", "stop ClockTimer");
		if (this.mTimerTask != null) {
			this.mTimerTask.cancel();
			this.mTimerTask = null;
		}

		if (this.mTimer != null) {
			this.mTimer.cancel();
			this.mTimer = null;
		}
	}

	private class TimeTask extends TimerTask {
		public void run() {
			if (!mIsTaskPaused) {
				// Log.v("timetask", "run");
				mTimerListener.clockTimeChanged();
			}
		}
	}

	private void createTimerTask() {
		this.mWidgetTimerId = System.currentTimeMillis();
		if (mTimer != null) {
			mTimer.cancel();
		}
		if (mTimerTask != null) {
			mTimerTask.cancel();
		}
		this.mTimer = new Timer();
		this.mTimerTask = new TimeTask();
		mTimer.schedule(this.mTimerTask, 0, mInterval);
		mIsTaskStopped = false;

		if (mCacheFilePath != null) {
			try {
				Log.e(TAG, "create " + mCacheFilePath);
				File file = new File(mCacheFilePath);
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter fw = new FileWriter(mCacheFilePath);
				fw.write(String.valueOf(mWidgetTimerId));
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}