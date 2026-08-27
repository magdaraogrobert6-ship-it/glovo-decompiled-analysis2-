package o;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDefaultPaddingcp {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    @SerializedName("details")
    private final Map<String, String> details;

    @SerializedName("id")
    private final String id;

    public accessgetDefaultPaddingcp(String str, Map map) {
        str.getClass();
        this.id = str;
        this.details = map;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.id.hashCode();
        Map<String, String> map = this.details;
        if (map == null) {
            int i4 = write + 61;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = map.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Contact(id=" + this.id + ", details=" + this.details + ")";
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.accessgetDefaultPaddingcp) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 89;
        o.accessgetDefaultPaddingcp.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.accessgetDefaultPaddingcp) r22;
        r12 = new java.lang.Object[]{r21.id, r1.id};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r1 = o.accessgetDefaultPaddingcp.write + 7;
        o.accessgetDefaultPaddingcp.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r19 = new java.lang.Object[]{r21.details, r1.details};
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        r1 = o.accessgetDefaultPaddingcp.RemoteActionCompatParcelizer + 15;
        o.accessgetDefaultPaddingcp.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if ((r1 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
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
            int r3 = o.accessgetDefaultPaddingcp.RemoteActionCompatParcelizer
            int r4 = r3 + 83
            int r5 = r4 % 128
            o.accessgetDefaultPaddingcp.write = r5
            int r4 = r4 % r2
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L1a
            r4 = 93
            int r4 = r4 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r4 = r1 instanceof o.accessgetDefaultPaddingcp
            if (r4 != 0) goto L29
            int r3 = r3 + 89
            int r1 = r3 % 128
            o.accessgetDefaultPaddingcp.write = r1
            int r3 = r3 % r2
            return r6
        L29:
            o.accessgetDefaultPaddingcp r1 = (o.accessgetDefaultPaddingcp) r1
            java.lang.String r3 = r0.id
            java.lang.String r4 = r1.id
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
            if (r3 != 0) goto L62
            int r1 = o.accessgetDefaultPaddingcp.write
            int r1 = r1 + 7
            int r3 = r1 % 128
            o.accessgetDefaultPaddingcp.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r6
        L62:
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.details
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.details
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L93
            int r1 = o.accessgetDefaultPaddingcp.RemoteActionCompatParcelizer
            int r1 = r1 + 15
            int r3 = r1 % 128
            o.accessgetDefaultPaddingcp.write = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L92
            return r5
        L92:
            return r6
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetDefaultPaddingcp.equals(java.lang.Object):boolean");
    }
}
