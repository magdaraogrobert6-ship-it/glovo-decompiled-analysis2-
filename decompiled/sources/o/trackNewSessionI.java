package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class trackNewSessionI {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final teardownActivityStateS IconCompatParcelizer;
    public final List write;

    public trackNewSessionI(List list, teardownActivityStateS teardownactivitystates) {
        this.write = list;
        this.IconCompatParcelizer = teardownactivitystates;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.write.hashCode();
        teardownActivityStateS teardownactivitystates = this.IconCompatParcelizer;
        if (teardownactivitystates == null) {
            int i3 = serializer + 105;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode2 = teardownactivitystates.hashCode();
            int i4 = serializer + 3;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RecentDeliveriesViewEntity(deliveries=" + this.write + ", earnings=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r10.IconCompatParcelizer, r11.IconCompatParcelizer}, o.getCieXyz.write())).booleanValue()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.trackNewSessionI.RemoteActionCompatParcelizer
            int r1 = r1 + 3
            int r2 = r1 % 128
            o.trackNewSessionI.serializer = r2
            int r1 = r1 % r0
            r1 = 1
            if (r10 != r11) goto L10
            goto L5c
        L10:
            boolean r2 = r11 instanceof o.trackNewSessionI
            if (r2 != 0) goto L15
            goto L4d
        L15:
            o.trackNewSessionI r11 = (o.trackNewSessionI) r11
            java.util.List r2 = r10.write
            java.util.List r3 = r11.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L4d
        L22:
            o.teardownActivityStateS r2 = r10.IconCompatParcelizer
            o.teardownActivityStateS r11 = r11.IconCompatParcelizer
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r11}
            int r3 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r6 = o.getCieXyz.write()
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r11 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ r1
            if (r11 == 0) goto L5c
        L4d:
            int r11 = o.trackNewSessionI.RemoteActionCompatParcelizer
            int r11 = r11 + 35
            int r1 = r11 % 128
            o.trackNewSessionI.serializer = r1
            int r11 = r11 % r0
            if (r11 == 0) goto L5a
            r11 = 0
            return r11
        L5a:
            r11 = 0
            throw r11
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.trackNewSessionI.equals(java.lang.Object):boolean");
    }
}
