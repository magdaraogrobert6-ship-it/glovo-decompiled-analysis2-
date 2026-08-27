package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setAdmMessagingRegistrationEnabled implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem read = new io.sentry.hints.MediaSessionCompatQueueItem((byte) 0, 10);
    public final Short IconCompatParcelizer;
    public final Short RemoteActionCompatParcelizer;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.IconCompatParcelizer.hashCode()) * (-2128831035);
    }

    public setAdmMessagingRegistrationEnabled(setApiKey setapikey) {
        this.RemoteActionCompatParcelizer = setapikey.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = setapikey.read;
    }

    public final String toString() {
        return "CrashDetectionPeakCheckConfiguration{peak_threshold=" + this.RemoteActionCompatParcelizer + ", min_peak_timespan=" + this.IconCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.IconCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setAdmMessagingRegistrationEnabled
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setAdmMessagingRegistrationEnabled r5 = (o.setAdmMessagingRegistrationEnabled) r5
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Short r5 = r5.IconCompatParcelizer
            java.lang.Short r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAdmMessagingRegistrationEnabled.equals(java.lang.Object):boolean");
    }
}
