package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setSdkEnablementProviderandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte RemoteActionCompatParcelizer;
    public final BrazeCompanionExternalSyntheticLambda4 read;

    public final int hashCode() {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.read;
        int iHashCode = brazeCompanionExternalSyntheticLambda4 == null ? 0 : brazeCompanionExternalSyntheticLambda4.hashCode();
        Byte b = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (b != null ? b.hashCode() : 0)) * (-2128831035);
    }

    public setSdkEnablementProviderandroid_sdk_base_release(NetworkBody networkBody) {
        this.read = (BrazeCompanionExternalSyntheticLambda4) networkBody.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Byte) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartbeatEvent{location=");
        sb.append(this.read);
        sb.append(", wifi_status=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.RemoteActionCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r5 = r5.RemoteActionCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setSdkEnablementProviderandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setSdkEnablementProviderandroid_sdk_base_release r5 = (o.setSdkEnablementProviderandroid_sdk_base_release) r5
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r5.read
            o.BrazeCompanionExternalSyntheticLambda4 r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Byte r5 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setSdkEnablementProviderandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
