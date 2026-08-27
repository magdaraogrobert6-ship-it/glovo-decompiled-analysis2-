package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getItemId implements notifyItemChanged, hasObservers {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final androidx.compose.ui.layout.ContentScale serializer;
    public final Float write;

    public getItemId(String str, androidx.compose.ui.layout.ContentScale contentScale, Float f) {
        str.getClass();
        contentScale.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.serializer = contentScale;
        this.write = f;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer.hashCode();
            this.serializer.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        Float f = this.write;
        if (f == null) {
            int i3 = read + 39;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ImageViewEntity(source=" + this.RemoteActionCompatParcelizer + ", contentScale=" + this.serializer + ", weight=" + this.write + ")";
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.getItemId) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = r4 + 109;
        o.getItemId.read = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r1 = (o.getItemId) r22;
        r12 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r19 = new java.lang.Object[]{r21.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r19 = new java.lang.Object[]{r21.write, r1.write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.getItemId.read
            int r3 = r3 + 117
            int r4 = r3 % 128
            o.getItemId.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L1a
            r3 = 94
            int r3 = r3 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r3 = r1 instanceof o.getItemId
            if (r3 != 0) goto L2c
            int r4 = r4 + 109
            int r1 = r4 % 128
            o.getItemId.read = r1
            int r4 = r4 % r2
            if (r4 == 0) goto L2b
            return r5
        L2b:
            return r6
        L2c:
            o.getItemId r1 = (o.getItemId) r1
            java.lang.String r2 = r0.RemoteActionCompatParcelizer
            java.lang.String r3 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r12 = new java.lang.Object[]{r2, r3}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r2 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r3 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r2
            r9 = r3
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L5b
            return r6
        L5b:
            androidx.compose.ui.layout.ContentScale r4 = r0.serializer
            androidx.compose.ui.layout.ContentScale r7 = r1.serializer
            java.lang.Object[] r19 = new java.lang.Object[]{r4, r7}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r2
            r16 = r3
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L83
            return r6
        L83:
            java.lang.Float r4 = r0.write
            java.lang.Float r1 = r1.write
            java.lang.Object[] r19 = new java.lang.Object[]{r4, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r2
            r16 = r3
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lab
            return r6
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getItemId.equals(java.lang.Object):boolean");
    }
}
