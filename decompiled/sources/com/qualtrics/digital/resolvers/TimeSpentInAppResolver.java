package com.qualtrics.digital.resolvers;

import com.qualtrics.digital.DurationTimer;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes3.dex */
public class TimeSpentInAppResolver {
    private static DurationTimer durationTimer = DurationTimer.instance();

    public boolean evaluateTimeSpentInApp(String str, String str2) {
        try {
            long j = Long.parseLong(str2);
            str.getClass();
            if (str.equals("GT")) {
                return durationTimer.getElapsedSeconds() > j;
            }
            if (str.equals("LT")) {
                return durationTimer.getElapsedSeconds() < j;
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected variable operator: ".concat(str));
            return false;
        } catch (Exception unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Error, unexpected rightValue: " + str2);
            return false;
        }
    }
}
