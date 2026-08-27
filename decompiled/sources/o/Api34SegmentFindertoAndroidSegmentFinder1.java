package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class Api34SegmentFindertoAndroidSegmentFinder1 extends nextStartBoundary {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final ArrayList read;

    public Api34SegmentFindertoAndroidSegmentFinder1(String str, ArrayList arrayList) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = arrayList;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 11;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = this.read.hashCode();
            i = iHashCode2 - 116;
        } else {
            int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
            iHashCode = this.read.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = serializer + 123;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderItems(title=" + this.RemoteActionCompatParcelizer + ", orderItems=" + this.read + ")";
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if ((!r11.read.equals(r12.read)) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.Api34SegmentFindertoAndroidSegmentFinder1.IconCompatParcelizer
            int r1 = r1 + 113
            int r2 = r1 % 128
            o.Api34SegmentFindertoAndroidSegmentFinder1.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L5b
            r1 = 1
            if (r11 != r12) goto L12
            goto L4f
        L12:
            boolean r2 = r12 instanceof o.Api34SegmentFindertoAndroidSegmentFinder1
            if (r2 != 0) goto L17
            goto L50
        L17:
            o.Api34SegmentFindertoAndroidSegmentFinder1 r12 = (o.Api34SegmentFindertoAndroidSegmentFinder1) r12
            java.lang.String r2 = r11.RemoteActionCompatParcelizer
            java.lang.String r3 = r12.RemoteActionCompatParcelizer
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r3}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L44
            goto L50
        L44:
            java.util.ArrayList r2 = r11.read
            java.util.ArrayList r12 = r12.read
            boolean r12 = r2.equals(r12)
            r12 = r12 ^ r1
            if (r12 == r1) goto L50
        L4f:
            return r1
        L50:
            int r12 = o.Api34SegmentFindertoAndroidSegmentFinder1.IconCompatParcelizer
            int r12 = r12 + 43
            int r1 = r12 % 128
            o.Api34SegmentFindertoAndroidSegmentFinder1.serializer = r1
            int r12 = r12 % r0
            r12 = 0
            return r12
        L5b:
            r12 = 0
            r12.hashCode()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Api34SegmentFindertoAndroidSegmentFinder1.equals(java.lang.Object):boolean");
    }
}
