package o;

import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class getSdkFlavorandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release serializer = new setCustomLocationProviderNamesandroid_sdk_base_release(5);
    public final getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release RemoteActionCompatParcelizer;
    public final getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release read;

    public getSdkFlavorandroid_sdk_base_release(IOParser$Decoder iOParser$Decoder) {
        this.RemoteActionCompatParcelizer = (getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.read = (getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release) iOParser$Decoder.read;
    }

    public final String toString() {
        return "CallingProperties{mobile_properties=" + this.RemoteActionCompatParcelizer + ", voip_properties=" + this.read + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r5 = r5.read;
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
            boolean r2 = r5 instanceof o.getSdkFlavorandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getSdkFlavorandroid_sdk_base_release r5 = (o.getSdkFlavorandroid_sdk_base_release) r5
            o.getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release r2 = r5.RemoteActionCompatParcelizer
            o.getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            o.getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release r5 = r5.read
            o.getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release r2 = r4.read
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
        throw new UnsupportedOperationException("Method not decompiled: o.getSdkFlavorandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((((this.RemoteActionCompatParcelizer == null ? 0 : 16777619) ^ 16777619) * (-2128831035)) ^ (this.read != null ? 16777619 : 0)) * (-2128831035);
    }
}
