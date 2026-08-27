package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class commitCurrentBulletSpan {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    @SerializedName("text")
    private final String text;

    @SerializedName("type")
    private final String type;

    public commitCurrentBulletSpan(String str) {
        str.getClass();
        this.text = str;
        this.type = "UserMessage";
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TextEventRequest(text=", this.text, ", type=", this.type, ")");
        int i4 = IconCompatParcelizer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.type.hashCode() % (this.text.hashCode() + 2);
        } else {
            iHashCode = this.type.hashCode() + (this.text.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 111;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.commitCurrentBulletSpan) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 121;
        o.commitCurrentBulletSpan.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r1 = (o.commitCurrentBulletSpan) r22;
        r12 = new java.lang.Object[]{r21.text, r1.text};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r19 = new java.lang.Object[]{r21.type, r1.type};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        r1 = o.commitCurrentBulletSpan.write + 59;
        o.commitCurrentBulletSpan.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
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
            int r3 = o.commitCurrentBulletSpan.IconCompatParcelizer
            int r4 = r3 + 87
            int r5 = r4 % 128
            o.commitCurrentBulletSpan.write = r5
            int r4 = r4 % r2
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L1a
            r4 = 36
            int r4 = r4 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r4 = r1 instanceof o.commitCurrentBulletSpan
            if (r4 != 0) goto L2c
            int r3 = r3 + 121
            int r1 = r3 % 128
            o.commitCurrentBulletSpan.write = r1
            int r3 = r3 % r2
            if (r3 != 0) goto L2b
            return r5
        L2b:
            return r6
        L2c:
            o.commitCurrentBulletSpan r1 = (o.commitCurrentBulletSpan) r1
            java.lang.String r3 = r0.text
            java.lang.String r4 = r1.text
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r15
            r9 = r16
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5c
            return r6
        L5c:
            java.lang.String r3 = r0.type
            java.lang.String r1 = r1.type
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L8a
            int r1 = o.commitCurrentBulletSpan.write
            int r1 = r1 + 59
            int r3 = r1 % 128
            o.commitCurrentBulletSpan.IconCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.commitCurrentBulletSpan.equals(java.lang.Object):boolean");
    }
}
