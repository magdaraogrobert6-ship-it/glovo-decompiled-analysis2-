package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteRegisteredGeofenceCache implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 serializer = new stopInstancelambda11(27);
    public final Boolean IconCompatParcelizer;
    public final Boolean RemoteActionCompatParcelizer;
    public final Boolean write;

    public final int hashCode() {
        Boolean bool = this.write;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.IconCompatParcelizer;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (bool3 != null ? bool3.hashCode() : 0)) * (-2128831035);
    }

    public deleteRegisteredGeofenceCache(getDeviceDataProviderandroid_sdk_base_release getdevicedataproviderandroid_sdk_base_release) {
        this.write = getdevicedataproviderandroid_sdk_base_release.write;
        this.IconCompatParcelizer = getdevicedataproviderandroid_sdk_base_release.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = getdevicedataproviderandroid_sdk_base_release.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppConfigChangeEvent{notifications_allowed=");
        sb.append(this.write);
        sb.append(", scheduling_exact_alarms_allowed=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", auto_reset_permissions_enabled=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
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
            boolean r2 = r5 instanceof o.deleteRegisteredGeofenceCache
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.deleteRegisteredGeofenceCache r5 = (o.deleteRegisteredGeofenceCache) r5
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.lang.Boolean r2 = r5.IconCompatParcelizer
            java.lang.Boolean r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.Boolean r5 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.deleteRegisteredGeofenceCache.equals(java.lang.Object):boolean");
    }
}
