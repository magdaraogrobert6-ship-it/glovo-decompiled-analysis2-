package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setItemViewCacheSize {
    private static int serializer = 1;
    private static int write;
    public final processAdapterUpdatesAndSetAnimationFlags IconCompatParcelizer;
    public final scrollStep RemoteActionCompatParcelizer;

    public setItemViewCacheSize(scrollStep scrollstep, processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags) {
        this.RemoteActionCompatParcelizer = scrollstep;
        this.IconCompatParcelizer = processadapterupdatesandsetanimationflags;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = serializer + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InAppNotificationResponseWithAnalyticsData(response=" + this.RemoteActionCompatParcelizer + ", analyticsData=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r3.IconCompatParcelizer.equals(r4.IconCompatParcelizer) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            if (r3 != r4) goto Lf
            int r4 = o.setItemViewCacheSize.write
            int r4 = r4 + 49
            int r1 = r4 % 128
            o.setItemViewCacheSize.serializer = r1
            int r4 = r4 % r0
            goto L3b
        Lf:
            boolean r1 = r4 instanceof o.setItemViewCacheSize
            if (r1 != 0) goto L14
            goto L2b
        L14:
            o.setItemViewCacheSize r4 = (o.setItemViewCacheSize) r4
            o.scrollStep r1 = r3.RemoteActionCompatParcelizer
            o.scrollStep r2 = r4.RemoteActionCompatParcelizer
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            goto L2b
        L21:
            o.processAdapterUpdatesAndSetAnimationFlags r1 = r3.IconCompatParcelizer
            o.processAdapterUpdatesAndSetAnimationFlags r4 = r4.IconCompatParcelizer
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L3b
        L2b:
            int r4 = o.setItemViewCacheSize.write
            int r4 = r4 + 83
            int r1 = r4 % 128
            o.setItemViewCacheSize.serializer = r1
            int r4 = r4 % r0
            r0 = 0
            if (r4 != 0) goto L3a
            r4 = 15
            int r4 = r4 / r0
        L3a:
            return r0
        L3b:
            int r4 = o.setItemViewCacheSize.serializer
            int r4 = r4 + 111
            int r1 = r4 % 128
            o.setItemViewCacheSize.write = r1
            int r4 = r4 % r0
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setItemViewCacheSize.equals(java.lang.Object):boolean");
    }
}
