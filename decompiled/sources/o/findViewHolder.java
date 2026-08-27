package o;

/* JADX INFO: loaded from: classes3.dex */
public final class findViewHolder extends markViewHoldersUpdated {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final hasStableIds RemoteActionCompatParcelizer;
    public final processAdapterUpdatesAndSetAnimationFlags serializer;

    public findViewHolder(hasStableIds hasstableids, processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags) {
        hasstableids.getClass();
        this.RemoteActionCompatParcelizer = hasstableids;
        this.serializer = processadapterupdatesandsetanimationflags;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode() / (this.RemoteActionCompatParcelizer.hashCode() + 104);
        }
        return this.serializer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(page=" + this.RemoteActionCompatParcelizer + ", inAppNotificationAnalyticsData=" + this.serializer + ")";
        int i2 = write + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r11.serializer.equals(r12.serializer) == false) goto L15;
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
            int r1 = o.findViewHolder.IconCompatParcelizer
            int r1 = r1 + 3
            int r2 = r1 % 128
            o.findViewHolder.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5f
            r1 = 0
            if (r11 != r12) goto L12
            goto L4f
        L12:
            boolean r2 = r12 instanceof o.findViewHolder
            if (r2 != 0) goto L17
            goto L4e
        L17:
            o.findViewHolder r12 = (o.findViewHolder) r12
            o.hasStableIds r2 = r11.RemoteActionCompatParcelizer
            o.hasStableIds r3 = r12.RemoteActionCompatParcelizer
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
            goto L4e
        L44:
            o.processAdapterUpdatesAndSetAnimationFlags r2 = r11.serializer
            o.processAdapterUpdatesAndSetAnimationFlags r12 = r12.serializer
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L4f
        L4e:
            return r1
        L4f:
            int r12 = o.findViewHolder.IconCompatParcelizer
            int r12 = r12 + 67
            int r2 = r12 % 128
            o.findViewHolder.write = r2
            int r12 = r12 % r0
            r0 = 1
            if (r12 == 0) goto L5e
            r12 = 9
            int r12 = r12 / r1
        L5e:
            return r0
        L5f:
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findViewHolder.equals(java.lang.Object):boolean");
    }
}
