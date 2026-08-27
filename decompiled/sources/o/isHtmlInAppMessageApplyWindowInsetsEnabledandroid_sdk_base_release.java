package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release serializer;
    public final getGoodNetworkIntervalandroid_sdk_base_release write;

    public final int hashCode() {
        getGoodNetworkIntervalandroid_sdk_base_release getgoodnetworkintervalandroid_sdk_base_release = this.write;
        int iHashCode = getgoodnetworkintervalandroid_sdk_base_release == null ? 0 : getgoodnetworkintervalandroid_sdk_base_release.hashCode();
        getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release != null ? getfallbackfirebasemessagingserviceclasspathandroid_sdk_base_release.hashCode() : 0)) * (-2128831035);
    }

    public isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release(NetworkBody networkBody) {
        this.write = (getGoodNetworkIntervalandroid_sdk_base_release) networkBody.IconCompatParcelizer;
        this.serializer = (getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "StationaryProperties{geo_location=" + this.write + ", venue_info=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release r5 = (o.isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release) r5
            o.getGoodNetworkIntervalandroid_sdk_base_release r2 = r5.write
            o.getGoodNetworkIntervalandroid_sdk_base_release r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            o.getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release r5 = r5.serializer
            o.getFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release r2 = r4.serializer
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
        throw new UnsupportedOperationException("Method not decompiled: o.isHtmlInAppMessageApplyWindowInsetsEnabledandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
