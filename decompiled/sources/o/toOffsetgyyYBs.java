package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class toOffsetgyyYBs {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final getExtendedTouchPaddinghWWAJMo RemoteActionCompatParcelizer;
    public final boolean read;
    public final getEllipsisgIe3tQ8 write;

    public toOffsetgyyYBs(getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo, boolean z, boolean z2, getEllipsisgIe3tQ8 getellipsisgie3tq8) {
        this.RemoteActionCompatParcelizer = getextendedtouchpaddinghwwajmo;
        this.IconCompatParcelizer = z;
        this.read = z2;
        this.write = getellipsisgie3tq8;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.read);
        int i4 = MediaBrowserCompatMediaItem + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r8 instanceof o.toOffsetgyyYBs) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r8 = (o.toOffsetgyyYBs) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r7.RemoteActionCompatParcelizer == r8.RemoteActionCompatParcelizer) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r1 = r1 + 103;
        o.toOffsetgyyYBs.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r7.IconCompatParcelizer == r8.IconCompatParcelizer) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r7.read == r8.read) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r7.write == r8.write) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        r3 = r3 + 23;
        o.toOffsetgyyYBs.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.toOffsetgyyYBs.serializer
            int r2 = r1 + 47
            int r3 = r2 % 128
            o.toOffsetgyyYBs.MediaBrowserCompatMediaItem = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L15
            int r2 = r5 / r5
            if (r7 != r8) goto L18
            goto L17
        L15:
            if (r7 != r8) goto L18
        L17:
            return r4
        L18:
            boolean r2 = r8 instanceof o.toOffsetgyyYBs
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            o.toOffsetgyyYBs r8 = (o.toOffsetgyyYBs) r8
            o.getExtendedTouchPaddinghWWAJMo r2 = r7.RemoteActionCompatParcelizer
            o.getExtendedTouchPaddinghWWAJMo r6 = r8.RemoteActionCompatParcelizer
            if (r2 == r6) goto L2d
            int r1 = r1 + 103
            int r8 = r1 % 128
            o.toOffsetgyyYBs.MediaBrowserCompatMediaItem = r8
            int r1 = r1 % r0
            return r5
        L2d:
            boolean r1 = r7.IconCompatParcelizer
            boolean r2 = r8.IconCompatParcelizer
            if (r1 == r2) goto L34
            goto L3a
        L34:
            boolean r1 = r7.read
            boolean r2 = r8.read
            if (r1 == r2) goto L3b
        L3a:
            return r5
        L3b:
            o.getEllipsisgIe3tQ8 r1 = r7.write
            o.getEllipsisgIe3tQ8 r8 = r8.write
            if (r1 == r8) goto L42
            return r5
        L42:
            int r3 = r3 + 23
            int r8 = r3 % 128
            o.toOffsetgyyYBs.serializer = r8
            int r3 = r3 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toOffsetgyyYBs.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QrControllerState(controller=" + this.RemoteActionCompatParcelizer + ", isFlashAvailable=" + this.IconCompatParcelizer + ", isTorchOn=" + this.read + ", toggleTorch=" + this.write + ")";
        int i2 = MediaBrowserCompatMediaItem + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
