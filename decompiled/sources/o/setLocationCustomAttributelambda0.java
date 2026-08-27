package o;

import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class setLocationCustomAttributelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY read = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(17);
    public final Short RemoteActionCompatParcelizer;
    public final Boolean serializer;
    public final Short write;

    public final int hashCode() {
        Boolean bool = this.serializer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Short sh = this.write;
        int iHashCode2 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (sh2 != null ? sh2.hashCode() : 0)) * (-2128831035);
    }

    public setLocationCustomAttributelambda0(C$b c$b) {
        this.serializer = (Boolean) c$b.serializer;
        this.write = (Short) c$b.write;
        this.RemoteActionCompatParcelizer = (Short) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "ShortStationaryEndDetectorConfiguration{enabled_for_non_gig_mode=" + this.serializer + ", location_request_duration_secs=" + this.write + ", location_request_interval_secs=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.write;
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
            boolean r2 = r5 instanceof o.setLocationCustomAttributelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLocationCustomAttributelambda0 r5 = (o.setLocationCustomAttributelambda0) r5
            java.lang.Boolean r2 = r5.serializer
            java.lang.Boolean r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.Short r5 = r5.RemoteActionCompatParcelizer
            java.lang.Short r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setLocationCustomAttributelambda0.equals(java.lang.Object):boolean");
    }
}
