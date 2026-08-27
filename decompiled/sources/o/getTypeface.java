package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getTypeface {
    private static int serializer = 1;
    private static int write;
    public final doLoadui_text IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public getTypeface(String str, doLoadui_text doloadui_text) {
        str.getClass();
        doloadui_text.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = doloadui_text;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = serializer + 55;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.getTypeface) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r13 = (o.getTypeface) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r12.RemoteActionCompatParcelizer, r13.RemoteActionCompatParcelizer}, o.getCieXyz.write())).booleanValue()) == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r12.IconCompatParcelizer == r13.IconCompatParcelizer) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r13 = o.getTypeface.write + 45;
        o.getTypeface.serializer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r13 = o.getTypeface.serializer + 37;
        o.getTypeface.write = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r13 = o.getTypeface.serializer + 9;
        o.getTypeface.write = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getTypeface.serializer
            int r1 = r1 + 119
            int r2 = r1 % 128
            o.getTypeface.write = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 63
            int r1 = r1 / r3
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r13 instanceof o.getTypeface
            if (r1 != 0) goto L1e
            return r3
        L1e:
            o.getTypeface r13 = (o.getTypeface) r13
            java.lang.String r1 = r12.RemoteActionCompatParcelizer
            java.lang.String r4 = r13.RemoteActionCompatParcelizer
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r4}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r2
            if (r1 == r2) goto L65
            o.doLoadui_text r1 = r12.IconCompatParcelizer
            o.doLoadui_text r13 = r13.IconCompatParcelizer
            if (r1 == r13) goto L5b
            int r13 = o.getTypeface.write
            int r13 = r13 + 45
            int r1 = r13 % 128
            o.getTypeface.serializer = r1
            int r13 = r13 % r0
            return r3
        L5b:
            int r13 = o.getTypeface.serializer
            int r13 = r13 + 37
            int r1 = r13 % 128
            o.getTypeface.write = r1
            int r13 = r13 % r0
            return r2
        L65:
            int r13 = o.getTypeface.serializer
            int r13 = r13 + 9
            int r1 = r13 % 128
            o.getTypeface.write = r1
            int r13 = r13 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTypeface.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Tag(title=" + this.RemoteActionCompatParcelizer + ", style=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
