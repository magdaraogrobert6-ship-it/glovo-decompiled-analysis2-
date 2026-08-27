package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setCountry implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY write = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(21);
    public final Double IconCompatParcelizer;
    public final String MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.IconCompatParcelizer;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.serializer;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaSessionCompatQueueItem;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (str4 != null ? str4.hashCode() : 0)) * (-2128831035);
    }

    public setCountry(setCustomAttributeArray setcustomattributearray) {
        this.read = setcustomattributearray.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = setcustomattributearray.serializer;
        this.RemoteActionCompatParcelizer = setcustomattributearray.read;
        this.serializer = setcustomattributearray.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = setcustomattributearray.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnomalyElement{category=");
        sb.append(this.read);
        sb.append(", duration=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ended=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", start=");
        sb.append(this.serializer);
        sb.append(", type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r5 = r5.MediaSessionCompatQueueItem;
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
            boolean r2 = r5 instanceof o.setCountry
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCountry r5 = (o.setCountry) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L1d:
            java.lang.Double r2 = r5.IconCompatParcelizer
            java.lang.Double r3 = r4.IconCompatParcelizer
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
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L56
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L56
        L47:
            java.lang.String r5 = r5.MediaSessionCompatQueueItem
            java.lang.String r2 = r4.MediaSessionCompatQueueItem
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
        throw new UnsupportedOperationException("Method not decompiled: o.setCountry.equals(java.lang.Object):boolean");
    }
}
