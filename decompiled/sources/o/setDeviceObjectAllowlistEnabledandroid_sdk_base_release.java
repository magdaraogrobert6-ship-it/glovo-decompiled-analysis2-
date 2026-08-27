package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setDeviceObjectAllowlistEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem serializer = new io.sentry.hints.MediaSessionCompatQueueItem(0, 14);
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.write;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (str3 != null ? str3.hashCode() : 0)) * (-2128831035);
    }

    public setDeviceObjectAllowlistEnabledandroid_sdk_base_release(BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4) {
        this.RemoteActionCompatParcelizer = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer;
        this.read = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write;
        this.write = brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiAddress{country=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", city=");
        sb.append(this.read);
        sb.append(", city_type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
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
            boolean r2 = r5 instanceof o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release r5 = (o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release) r5
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.String r5 = r5.write
            java.lang.String r2 = r4.write
            if (r2 == r5) goto L3b
            if (r2 == 0) goto L3a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
