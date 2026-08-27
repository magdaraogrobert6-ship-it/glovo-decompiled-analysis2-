package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setAutomaticGeofenceRequestsEnabled implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem read = new io.sentry.hints.MediaSessionCompatQueueItem((byte) 0, 11);
    public final Short serializer;
    public final Short write;

    public final int hashCode() {
        return (((this.write.hashCode() ^ 16777619) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public setAutomaticGeofenceRequestsEnabled(FormBody.Builder builder) {
        this.write = (Short) builder.serializer;
        this.serializer = (Short) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "CrashDetectionPeakTriggeredLocationRequest{interval_secs=" + this.write + ", duration_secs=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.serializer;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.setAutomaticGeofenceRequestsEnabled
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setAutomaticGeofenceRequestsEnabled r5 = (o.setAutomaticGeofenceRequestsEnabled) r5
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Short r5 = r5.serializer
            java.lang.Short r2 = r4.serializer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAutomaticGeofenceRequestsEnabled.equals(java.lang.Object):boolean");
    }
}
