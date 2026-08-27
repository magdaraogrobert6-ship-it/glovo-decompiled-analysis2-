package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class report {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final ArrayList RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final clearBitmaps write;

    public report(clearBitmaps clearbitmaps, ArrayList arrayList) {
        this.write = clearbitmaps;
        this.RemoteActionCompatParcelizer = arrayList;
        this.serializer = !arrayList.isEmpty();
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() >>> (this.write.hashCode() - 45);
        } else {
            iHashCode = (this.write.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = IconCompatParcelizer + 29;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ViewEntity(group=" + this.write + ", childList=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.RemoteActionCompatParcelizer.equals(r6.RemoteActionCompatParcelizer) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.report.IconCompatParcelizer
            int r1 = r1 + 29
            int r2 = r1 % 128
            o.report.read = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 23
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L43
        L16:
            if (r5 != r6) goto L19
            goto L43
        L19:
            boolean r1 = r6 instanceof o.report
            if (r1 != 0) goto L1e
            goto L35
        L1e:
            o.report r6 = (o.report) r6
            o.clearBitmaps r1 = r5.write
            o.clearBitmaps r4 = r6.write
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2b
            goto L35
        L2b:
            java.util.ArrayList r1 = r5.RemoteActionCompatParcelizer
            java.util.ArrayList r6 = r6.RemoteActionCompatParcelizer
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L43
        L35:
            int r6 = o.report.IconCompatParcelizer
            int r6 = r6 + r2
            int r1 = r6 % 128
            o.report.read = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L42
            r6 = 14
            int r6 = r6 / r3
        L42:
            return r3
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.report.equals(java.lang.Object):boolean");
    }
}
