package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class removeLayers extends isRendererInitialised {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final ArrayList IconCompatParcelizer;
    public final nowInSecondsPrecise MediaBrowserCompatMediaItem;
    public final boolean read;
    public final setAccuracyRadius write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public removeLayers(nowInSecondsPrecise nowinsecondsprecise, setAccuracyRadius setaccuracyradius, ArrayList arrayList) {
        super(true, false);
        boolean z = true;
        this.MediaBrowserCompatMediaItem = nowinsecondsprecise;
        this.write = setaccuracyradius;
        this.IconCompatParcelizer = arrayList;
        if (setaccuracyradius != null) {
            int i = MediaDescriptionCompat + 67;
            MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            int i4 = MediaDescriptionCompat + 33;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        this.read = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaBrowserCompatMediaItem.hashCode();
            throw null;
        }
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        setAccuracyRadius setaccuracyradius = this.write;
        int iHashCode2 = this.IconCompatParcelizer.hashCode() + (((iHashCode * 31) + (setaccuracyradius == null ? 0 : setaccuracyradius.hashCode())) * 31);
        int i3 = MediaMetadataCompat + 119;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Deliveries(summation=" + this.MediaBrowserCompatMediaItem + ", latestItem=" + this.write + ", items=" + this.IconCompatParcelizer + ")";
        int i2 = MediaMetadataCompat + 119;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r11.IconCompatParcelizer.equals(r12.IconCompatParcelizer) != true) goto L16;
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
            r1 = 1
            if (r11 != r12) goto L7
            goto L69
        L7:
            boolean r2 = r12 instanceof o.removeLayers
            if (r2 != 0) goto L15
            int r12 = o.removeLayers.MediaMetadataCompat
            int r12 = r12 + 109
            int r1 = r12 % 128
            o.removeLayers.MediaDescriptionCompat = r1
            int r12 = r12 % r0
            goto L57
        L15:
            o.removeLayers r12 = (o.removeLayers) r12
            o.nowInSecondsPrecise r2 = r11.MediaBrowserCompatMediaItem
            o.nowInSecondsPrecise r3 = r12.MediaBrowserCompatMediaItem
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L57
        L22:
            o.setAccuracyRadius r2 = r11.write
            o.setAccuracyRadius r3 = r12.write
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
            if (r2 != 0) goto L4d
            goto L57
        L4d:
            java.util.ArrayList r2 = r11.IconCompatParcelizer
            java.util.ArrayList r12 = r12.IconCompatParcelizer
            boolean r12 = r2.equals(r12)
            if (r12 == r1) goto L69
        L57:
            int r12 = o.removeLayers.MediaDescriptionCompat
            int r12 = r12 + 5
            int r1 = r12 % 128
            o.removeLayers.MediaMetadataCompat = r1
            int r12 = r12 % r0
            if (r12 == 0) goto L64
            r12 = 0
            return r12
        L64:
            r12 = 0
            r12.hashCode()
            throw r12
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeLayers.equals(java.lang.Object):boolean");
    }
}
