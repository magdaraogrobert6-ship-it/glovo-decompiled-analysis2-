package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public class GooglePlayInstallReferrerDetails {
    public Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public String installReferrer;
    public String installVersion;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public String toString() {
        String str = this.installReferrer;
        long j = this.referrerClickTimestampSeconds;
        long j2 = this.installBeginTimestampSeconds;
        long j3 = this.referrerClickTimestampServerSeconds;
        long j4 = this.installBeginTimestampServerSeconds;
        return Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s", str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), this.installVersion, this.googlePlayInstant);
    }

    public GooglePlayInstallReferrerDetails(ReferrerDetails referrerDetails) {
        if (referrerDetails == null) {
            return;
        }
        this.installReferrer = referrerDetails.installReferrer;
        this.referrerClickTimestampSeconds = referrerDetails.referrerClickTimestampSeconds;
        this.installBeginTimestampSeconds = referrerDetails.installBeginTimestampSeconds;
        this.referrerClickTimestampServerSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        this.installBeginTimestampServerSeconds = referrerDetails.installBeginTimestampServerSeconds;
        this.installVersion = referrerDetails.installVersion;
        this.googlePlayInstant = referrerDetails.googlePlayInstant;
    }
}
