package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetUserCachep implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY write = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(8);
    public final setDeviceObjectAllowlistEnabledandroid_sdk_base_release read;
    public final r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o serializer;

    public final int hashCode() {
        return (((this.read.hashCode() ^ 16777619) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public accessgetUserCachep(FormBody.Builder builder) {
        this.read = (setDeviceObjectAllowlistEnabledandroid_sdk_base_release) builder.serializer;
        this.serializer = (r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "PointOfInterest{poi_address=" + this.read + ", poi_location=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.accessgetUserCachep
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.accessgetUserCachep r5 = (o.accessgetUserCachep) r5
            o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release r2 = r5.read
            o.setDeviceObjectAllowlistEnabledandroid_sdk_base_release r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o r5 = r5.serializer
            o.r8lambdalhrh0WCduaLB1UBrBFl71Ebc4o r2 = r4.serializer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetUserCachep.equals(java.lang.Object):boolean");
    }
}
