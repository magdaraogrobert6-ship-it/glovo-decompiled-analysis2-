package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class getSessionTimeoutandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final io.sentry.hints.MediaSessionCompatQueueItem RemoteActionCompatParcelizer = new io.sentry.hints.MediaSessionCompatQueueItem((byte) 0, 4);
    public final Byte IconCompatParcelizer;
    public final getSdkFlavorandroid_sdk_base_release write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        getSdkFlavorandroid_sdk_base_release getsdkflavorandroid_sdk_base_release = this.write;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (getsdkflavorandroid_sdk_base_release == null ? 0 : getsdkflavorandroid_sdk_base_release.hashCode())) * (-2128831035);
    }

    public getSessionTimeoutandroid_sdk_base_release(FormBody.Builder builder) {
        this.IconCompatParcelizer = (Byte) builder.serializer;
        this.write = (getSdkFlavorandroid_sdk_base_release) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Calling{value=" + this.IconCompatParcelizer + ", properties=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.getSessionTimeoutandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getSessionTimeoutandroid_sdk_base_release r5 = (o.getSessionTimeoutandroid_sdk_base_release) r5
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            o.getSdkFlavorandroid_sdk_base_release r5 = r5.write
            o.getSdkFlavorandroid_sdk_base_release r2 = r4.write
            if (r2 == r5) goto L2b
            if (r2 == 0) goto L2a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSessionTimeoutandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
