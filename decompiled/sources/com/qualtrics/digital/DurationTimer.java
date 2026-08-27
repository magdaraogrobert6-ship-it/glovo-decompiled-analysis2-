package com.qualtrics.digital;

import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class DurationTimer {
    private static DurationTimer mDurationTimer;
    private long mStartSeconds;

    private DurationTimer() {
    }

    public double getElapsedHours() {
        return getElapsedMinutes() / 60.0d;
    }

    public double getElapsedMinutes() {
        return getElapsedSeconds() / 60.0d;
    }

    private long getCurrentTimeInSeconds() {
        return Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public long getElapsedSeconds() {
        return getCurrentTimeInSeconds() - this.mStartSeconds;
    }

    public void start() {
        this.mStartSeconds = getCurrentTimeInSeconds();
    }

    public static DurationTimer instance() {
        if (mDurationTimer == null) {
            mDurationTimer = new DurationTimer();
        }
        return mDurationTimer;
    }
}
