package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getThirdPartySharingSettingsWithTimeout {
    private static int read = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getThirdPartySharingSettingsWithTimeout(String str, String str2, int i) {
        if ((i & 1) != 0) {
            int i2 = read;
            int i3 = i2 + 97;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 34 / 0;
            }
            int i5 = i2 + 107;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(str, str2, (String) null);
    }

    public getThirdPartySharingSettingsWithTimeout(String str, String str2, String str3) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("TrackingData(errorCode=", this.serializer, ", errorMessage=", this.IconCompatParcelizer, ", accountStatus="), this.RemoteActionCompatParcelizer, ")");
        int i4 = write + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.serializer;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = write + 59;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.IconCompatParcelizer);
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            int i4 = read + 43;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode2 = str2.hashCode();
        }
        int i5 = iM + iHashCode2;
        int i6 = read + 99;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.getThirdPartySharingSettingsWithTimeout) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = (o.getThirdPartySharingSettingsWithTimeout) r22;
        r12 = new java.lang.Object[]{r21.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r1 = o.getThirdPartySharingSettingsWithTimeout.write + 39;
        o.getThirdPartySharingSettingsWithTimeout.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r19 = new java.lang.Object[]{r21.IconCompatParcelizer, r1.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        r1 = o.getThirdPartySharingSettingsWithTimeout.write;
        r3 = r1 + 119;
        o.getThirdPartySharingSettingsWithTimeout.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r1 = r1 + 5;
        o.getThirdPartySharingSettingsWithTimeout.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        r19 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        r1 = o.getThirdPartySharingSettingsWithTimeout.write + 77;
        o.getThirdPartySharingSettingsWithTimeout.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
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
            int r3 = o.getThirdPartySharingSettingsWithTimeout.read
            int r3 = r3 + 45
            int r4 = r3 % 128
            o.getThirdPartySharingSettingsWithTimeout.write = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L19
            r3 = 4
            int r3 = r3 / r5
            if (r0 != r1) goto L1c
            goto L1b
        L19:
            if (r0 != r1) goto L1c
        L1b:
            return r4
        L1c:
            boolean r3 = r1 instanceof o.getThirdPartySharingSettingsWithTimeout
            if (r3 != 0) goto L21
            return r5
        L21:
            o.getThirdPartySharingSettingsWithTimeout r1 = (o.getThirdPartySharingSettingsWithTimeout) r1
            java.lang.String r3 = r0.serializer
            java.lang.String r6 = r1.serializer
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r6
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5c
            int r1 = o.getThirdPartySharingSettingsWithTimeout.write
            int r1 = r1 + 39
            int r3 = r1 % 128
            o.getThirdPartySharingSettingsWithTimeout.read = r3
            int r1 = r1 % r2
            if (r1 == 0) goto L5b
            return r4
        L5b:
            return r5
        L5c:
            java.lang.String r7 = r0.IconCompatParcelizer
            java.lang.String r8 = r1.IconCompatParcelizer
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r8}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r6
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L94
            int r1 = o.getThirdPartySharingSettingsWithTimeout.write
            int r3 = r1 + 119
            int r4 = r3 % 128
            o.getThirdPartySharingSettingsWithTimeout.read = r4
            int r3 = r3 % r2
            int r1 = r1 + 5
            int r3 = r1 % 128
            o.getThirdPartySharingSettingsWithTimeout.read = r3
            int r1 = r1 % r2
            return r5
        L94:
            java.lang.String r7 = r0.RemoteActionCompatParcelizer
            java.lang.String r1 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r6
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lc5
            int r1 = o.getThirdPartySharingSettingsWithTimeout.write
            int r1 = r1 + 77
            int r3 = r1 % 128
            o.getThirdPartySharingSettingsWithTimeout.read = r3
            int r1 = r1 % r2
            return r5
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getThirdPartySharingSettingsWithTimeout.equals(java.lang.Object):boolean");
    }
}
