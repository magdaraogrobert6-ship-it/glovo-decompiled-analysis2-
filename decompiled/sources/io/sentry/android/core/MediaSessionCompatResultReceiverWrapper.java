package io.sentry.android.core;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import java.util.Date;
import o.setTextMetricsParamsCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatResultReceiverWrapper {
    public final long read;
    public final Object serializer;
    public long write;

    public int RemoteActionCompatParcelizer() {
        if (!((setTextMetricsParamsCompat) this.serializer).serializer()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.write == -1) {
            this.write = jUptimeMillis;
        }
        long j = jUptimeMillis - this.write;
        if (j <= 120000) {
            return 1000;
        }
        return j <= 300000 ? 2000 : 4000;
    }

    public int serializer() {
        boolean zSerializer = ((setTextMetricsParamsCompat) this.serializer).serializer();
        long j = this.read;
        if (zSerializer) {
            return j > 0 ? Math.min((int) j, Constants.THIRTY_MINUTES) : Constants.THIRTY_MINUTES;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }

    public MediaSessionCompatResultReceiverWrapper(setTextMetricsParamsCompat settextmetricsparamscompat, long j) {
        this.serializer = settextmetricsparamscompat;
        this.write = -1L;
        this.read = j;
    }

    public MediaSessionCompatResultReceiverWrapper(long j, long j2, Date date) {
        this.read = j;
        this.write = j2;
        this.serializer = date;
    }
}
