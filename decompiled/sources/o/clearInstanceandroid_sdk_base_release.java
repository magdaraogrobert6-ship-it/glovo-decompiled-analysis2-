package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class clearInstanceandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getSdkEnablementProviderandroid_sdk_base_release IconCompatParcelizer = new getSdkEnablementProviderandroid_sdk_base_release(0);
    public final Boolean RemoteActionCompatParcelizer;
    public final Boolean serializer;
    public final Boolean write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public clearInstanceandroid_sdk_base_release(getDeviceDataProviderandroid_sdk_base_release getdevicedataproviderandroid_sdk_base_release) {
        this.serializer = getdevicedataproviderandroid_sdk_base_release.write;
        this.write = getdevicedataproviderandroid_sdk_base_release.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = getdevicedataproviderandroid_sdk_base_release.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GisFeatures{has_bus_route=");
        sb.append(this.serializer);
        sb.append(", has_train_route=");
        sb.append(this.write);
        sb.append(", has_rail_route=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.clearInstanceandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.clearInstanceandroid_sdk_base_release r5 = (o.clearInstanceandroid_sdk_base_release) r5
            java.lang.Boolean r2 = r5.serializer
            java.lang.Boolean r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L1b:
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L34
        L27:
            java.lang.Boolean r5 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clearInstanceandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
