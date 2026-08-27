package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes3.dex */
class QualtricsLog {
    private static final String LOG_TAG = "Qualtrics";
    static QualtricsLogLevel mLogLevel = QualtricsLogLevel.NONE;

    private QualtricsLog() {
    }

    public static void logInfo(String str) {
        QualtricsLogLevel qualtricsLogLevel = QualtricsLogLevel.INFO;
    }

    public static void setLogLevel(QualtricsLogLevel qualtricsLogLevel) {
        mLogLevel = qualtricsLogLevel;
    }

    public static void logError(Throwable th) {
        if (th == null || th.toString() == null) {
            return;
        }
        SentryLogcatAdapter.serializer("Qualtrics", th.toString());
    }

    public static void logError(String str, Throwable th) {
        SentryLogcatAdapter.read("Qualtrics", str, th);
    }

    public static void logError(String str) {
        SentryLogcatAdapter.serializer("Qualtrics", str);
    }
}
