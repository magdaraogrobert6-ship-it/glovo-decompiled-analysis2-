package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setLineIdlambda20 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY IconCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(15);
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.serializer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (str4 != null ? str4.hashCode() : 0)) * (-2128831035);
    }

    public setLineIdlambda20(setPhoneNumberlambda3 setphonenumberlambda3) {
        this.read = setphonenumberlambda3.RemoteActionCompatParcelizer;
        this.serializer = setphonenumberlambda3.write;
        this.RemoteActionCompatParcelizer = setphonenumberlambda3.IconCompatParcelizer;
        this.write = setphonenumberlambda3.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorInfo{sensor_type_id=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.serializer);
        sb.append(", token=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", user_id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
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
            boolean r2 = r5 instanceof o.setLineIdlambda20
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLineIdlambda20 r5 = (o.setLineIdlambda20) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L1d:
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L2b:
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L39:
            java.lang.String r5 = r5.write
            java.lang.String r2 = r4.write
            if (r2 == r5) goto L49
            if (r2 == 0) goto L48
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLineIdlambda20.equals(java.lang.Object):boolean");
    }
}
