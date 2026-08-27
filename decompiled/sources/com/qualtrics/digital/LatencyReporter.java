package com.qualtrics.digital;

import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
class LatencyReporter {
    private static final String LOG_TAG = "Qualtrics";
    private String mID;
    private long mStartTime = getCurrentTimeInMillis();
    private String mURL;

    public void resetTimer() {
        this.mStartTime = -1L;
    }

    public LatencyReporter(String str, String str2) {
        this.mID = str;
        this.mURL = str2;
    }

    private long getCurrentTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public void stopTimerAndReport() {
        try {
            LatencyReportingService.instance().reportLatency(this.mID, this.mURL, getCurrentTimeInMillis() - this.mStartTime);
        } catch (Exception e) {
            SiteInterceptService.instance().postErrorLog(e);
        }
    }

    public void startTimer() {
        if (this.mStartTime < 0) {
            this.mStartTime = getCurrentTimeInMillis();
        }
    }
}
