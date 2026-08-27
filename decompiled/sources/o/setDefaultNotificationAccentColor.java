package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultNotificationAccentColor implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8 RemoteActionCompatParcelizer = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(13);
    public final setDefaultNotificationAccentColorandroid_sdk_base_release read;
    public final setCustomEndpoint serializer;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public setDefaultNotificationAccentColor(NetworkBody networkBody) {
        this.serializer = (setCustomEndpoint) networkBody.IconCompatParcelizer;
        this.read = (setDefaultNotificationAccentColorandroid_sdk_base_release) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "PersonProperty{id=" + this.serializer + ", property=" + this.read + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.setDefaultNotificationAccentColor
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setDefaultNotificationAccentColor r5 = (o.setDefaultNotificationAccentColor) r5
            o.setCustomEndpoint r2 = r5.serializer
            o.setCustomEndpoint r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setDefaultNotificationAccentColorandroid_sdk_base_release r5 = r5.read
            o.setDefaultNotificationAccentColorandroid_sdk_base_release r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDefaultNotificationAccentColor.equals(java.lang.Object):boolean");
    }
}
