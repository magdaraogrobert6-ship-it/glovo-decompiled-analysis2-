package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem serializer = new io.sentry.hints.MediaSessionCompatQueueItem((byte) 0, 13);
    public final Short IconCompatParcelizer;
    public final Short write;

    public final int hashCode() {
        Short sh = this.IconCompatParcelizer;
        int iHashCode = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.write;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (sh2 != null ? sh2.hashCode() : 0)) * (-2128831035);
    }

    public setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release(setApiKey setapikey) {
        this.IconCompatParcelizer = setapikey.RemoteActionCompatParcelizer;
        this.write = setapikey.read;
    }

    public final String toString() {
        return "CrashLoopDetectionConfig{post_sdk_init_startup_crash_window_seconds=" + this.IconCompatParcelizer + ", min_startup_crashes_for_crash_loop=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r5 = r5.write;
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
            boolean r2 = r5 instanceof o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release r5 = (o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release) r5
            java.lang.Short r2 = r5.IconCompatParcelizer
            java.lang.Short r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Short r5 = r5.write
            java.lang.Short r2 = r4.write
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomHtmlWebViewActivityClassNameandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
