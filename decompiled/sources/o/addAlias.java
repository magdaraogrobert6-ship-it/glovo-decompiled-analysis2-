package o;

import com.sentiance.core.model.thrift.O$b;

/* JADX INFO: loaded from: classes3.dex */
public final class addAlias implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE IconCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(18);
    public final Double MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final Double read;
    public final Double serializer;
    public final Double write;

    public final int hashCode() {
        Double d = this.read;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.write;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Double d3 = this.serializer;
        int iHashCode4 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.MediaMetadataCompat;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (d4 != null ? d4.hashCode() : 0)) * (-2128831035);
    }

    public addAlias(O$b o$b) {
        this.read = (Double) o$b.write;
        this.write = (Double) o$b.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (String) o$b.read;
        this.serializer = (Double) o$b.serializer;
        this.MediaMetadataCompat = (Double) o$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "SmartSenseMotion{battery=" + this.read + ", lqi=" + this.write + ", motion=" + this.RemoteActionCompatParcelizer + ", rssi=" + this.serializer + ", temperature=" + this.MediaMetadataCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r5 = r5.MediaMetadataCompat;
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
            boolean r2 = r5 instanceof o.addAlias
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.addAlias r5 = (o.addAlias) r5
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L1d:
            java.lang.Double r2 = r5.write
            java.lang.Double r3 = r4.write
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L2b:
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L39:
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L47:
            java.lang.Double r5 = r5.MediaMetadataCompat
            java.lang.Double r2 = r4.MediaMetadataCompat
            if (r2 == r5) goto L57
            if (r2 == 0) goto L56
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L56
            goto L57
        L56:
            return r1
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addAlias.equals(java.lang.Object):boolean");
    }
}
