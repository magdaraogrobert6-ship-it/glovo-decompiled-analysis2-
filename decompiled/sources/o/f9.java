package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f9 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final List write;

    public f9(List list) {
        list.getClass();
        this.write = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = serializer + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.read("MapLayer(elements=", ")", this.write);
        }
        int i3 = 20 / 0;
        return MediaSessionCompatQueueItem.read("MapLayer(elements=", ")", this.write);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.f9) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 89;
        o.f9.serializer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r13 = null;
        r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r10 = new java.lang.Object[]{r12.write, ((o.f9) r13).write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r13 = o.f9.IconCompatParcelizer + 59;
        o.f9.serializer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
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
            int r1 = o.f9.serializer
            int r1 = r1 + 101
            int r2 = r1 % 128
            o.f9.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 73
            int r1 = r1 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r13 instanceof o.f9
            if (r1 != 0) goto L2c
            int r2 = r2 + 89
            int r13 = r2 % 128
            o.f9.serializer = r13
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            return r4
        L27:
            r13 = 0
            r13.hashCode()
            throw r13
        L2c:
            o.f9 r13 = (o.f9) r13
            java.util.List r1 = r12.write
            java.util.List r13 = r13.write
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L62
            int r13 = o.f9.IconCompatParcelizer
            int r13 = r13 + 59
            int r1 = r13 % 128
            o.f9.serializer = r1
            int r13 = r13 % r0
            return r4
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f9.equals(java.lang.Object):boolean");
    }
}
