package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveTextDirectionIhaHGbI implements TextStyleKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String read;
    public final String serializer;
    public final String write;

    public resolveTextDirectionIhaHGbI(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.serializer = str;
        this.write = str2;
        this.read = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write);
        int i4 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BottomSheetWithActionsAndAcceptanceRate(title=", this.serializer, ", actionAccept=", this.write, ", actionConfirm="), this.read, ")");
            int i3 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BottomSheetWithActionsAndAcceptanceRate(title=", this.serializer, ", actionAccept=", this.write, ", actionConfirm="), this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.resolveTextDirectionIhaHGbI) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = r4 + 43;
        o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((r4 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        return !r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r1 = (o.resolveTextDirectionIhaHGbI) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.serializer, r1.serializer}, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r1 = o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer + 17;
        o.resolveTextDirectionIhaHGbI.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.write, r1.write}, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.read, r1.read}, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        r1 = o.resolveTextDirectionIhaHGbI.IconCompatParcelizer + 95;
        o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
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
            int r3 = o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer
            int r3 = r3 + 7
            int r4 = r3 % 128
            o.resolveTextDirectionIhaHGbI.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L1a
            r3 = 57
            int r3 = r3 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r3 = r1 instanceof o.resolveTextDirectionIhaHGbI
            if (r3 != 0) goto L2f
            int r4 = r4 + 43
            int r1 = r4 % 128
            o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r2
            if (r4 != 0) goto L2b
            goto L2c
        L2b:
            r6 = r5
        L2c:
            r1 = r6 ^ 1
            return r1
        L2f:
            o.resolveTextDirectionIhaHGbI r1 = (o.resolveTextDirectionIhaHGbI) r1
            java.lang.String r3 = r0.serializer
            java.lang.String r4 = r1.serializer
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r4 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L67
            int r1 = o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer
            int r1 = r1 + 17
            int r3 = r1 % 128
            o.resolveTextDirectionIhaHGbI.IconCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        L67:
            java.lang.String r7 = r0.write
            java.lang.String r8 = r1.write
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r8}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L8f
            return r6
        L8f:
            java.lang.String r7 = r0.read
            java.lang.String r1 = r1.read
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lc0
            int r1 = o.resolveTextDirectionIhaHGbI.IconCompatParcelizer
            int r1 = r1 + 95
            int r3 = r1 % 128
            o.resolveTextDirectionIhaHGbI.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolveTextDirectionIhaHGbI.equals(java.lang.Object):boolean");
    }
}
