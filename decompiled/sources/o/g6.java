package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class g6 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public g6(int i, int i2, int i3, int i4) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        this.read = i3;
        this.write = i4;
    }

    public static g6 IconCompatParcelizer(g6 g6Var, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = g6Var.IconCompatParcelizer;
        int i6 = g6Var.serializer;
        if ((i3 & 8) != 0) {
            int i7 = MediaBrowserCompatMediaItem + 5;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i8;
            int i9 = i7 % 2;
            i2 = g6Var.write;
            int i10 = i8 + 73;
            MediaBrowserCompatMediaItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        g6Var.getClass();
        return new g6(i5, i6, i, i2);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(this.serializer, Integer.hashCode(this.IconCompatParcelizer) * 31, 31), 31);
        int i4 = RemoteActionCompatParcelizer + 117;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.serializer, "SafeArea(start=", ", end=", ", top=");
        sbM.append(this.read);
        sbM.append(", bottom=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if ((r8 instanceof o.g6) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r8 = (o.g6) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r7.IconCompatParcelizer == r8.IconCompatParcelizer) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r1 = r1 + 39;
        o.g6.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r7.serializer == r8.serializer) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r3 = r3 + 87;
        o.g6.RemoteActionCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r7.read == r8.read) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7.write == r8.write) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r8 = r1 + 101;
        o.g6.MediaBrowserCompatMediaItem = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
        r1 = r1 + 19;
        o.g6.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if ((r1 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r8 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 43;
        o.g6.RemoteActionCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r3 % 2) != 0) goto L11;
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
            int r1 = o.g6.RemoteActionCompatParcelizer
            int r2 = r1 + 111
            int r3 = r2 % 128
            o.g6.MediaBrowserCompatMediaItem = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 84
            int r2 = r2 / r5
            if (r7 != r8) goto L24
            goto L18
        L16:
            if (r7 != r8) goto L24
        L18:
            int r3 = r3 + 43
            int r8 = r3 % 128
            o.g6.RemoteActionCompatParcelizer = r8
            int r3 = r3 % r0
            if (r3 != 0) goto L22
            return r4
        L22:
            r8 = 0
            throw r8
        L24:
            boolean r2 = r8 instanceof o.g6
            if (r2 != 0) goto L29
            return r5
        L29:
            o.g6 r8 = (o.g6) r8
            int r2 = r7.IconCompatParcelizer
            int r6 = r8.IconCompatParcelizer
            if (r2 == r6) goto L39
            int r1 = r1 + 39
            int r8 = r1 % 128
            o.g6.MediaBrowserCompatMediaItem = r8
            int r1 = r1 % r0
            return r5
        L39:
            int r2 = r7.serializer
            int r6 = r8.serializer
            if (r2 == r6) goto L47
            int r3 = r3 + 87
            int r8 = r3 % 128
            o.g6.RemoteActionCompatParcelizer = r8
            int r3 = r3 % r0
            return r5
        L47:
            int r2 = r7.read
            int r3 = r8.read
            if (r2 == r3) goto L4e
            return r5
        L4e:
            int r2 = r7.write
            int r8 = r8.write
            if (r2 == r8) goto L68
            int r8 = r1 + 101
            int r2 = r8 % 128
            o.g6.MediaBrowserCompatMediaItem = r2
            int r8 = r8 % r0
            int r1 = r1 + 19
            int r8 = r1 % 128
            o.g6.MediaBrowserCompatMediaItem = r8
            int r1 = r1 % r0
            if (r1 != 0) goto L67
            r8 = 56
            int r8 = r8 / r5
        L67:
            return r5
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g6.equals(java.lang.Object):boolean");
    }
}
