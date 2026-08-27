package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class checkEventI {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final int IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final checkForPreinstallI serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        int i3 = 10 / 0;
        return this.write;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 11;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.MediaMetadataCompat;
        int i5 = i2 + 113;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final checkForPreinstallI RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        checkForPreinstallI checkforpreinstalli = this.serializer;
        int i5 = i3 + 3;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return checkforpreinstalli;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 91;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        int i6 = i3 + 79;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        return i5;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        throw null;
    }

    public checkEventI(String str, String str2, String str3, int i, String str4, checkForPreinstallI checkforpreinstalli) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        checkforpreinstalli.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaMetadataCompat = str3;
        this.IconCompatParcelizer = i;
        this.write = str4;
        this.serializer = checkforpreinstalli;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 71;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.MediaMetadataCompat), 31);
        String str = this.write;
        if (str == null) {
            int i4 = MediaSessionCompatQueueItem + 47;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.serializer.hashCode() + ((iM + iHashCode) * 31);
        int i6 = MediaSessionCompatQueueItem + 25;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Channel(id=", this.read, ", name=", this.RemoteActionCompatParcelizer, ", sound=");
        sbM.append(this.MediaMetadataCompat);
        sbM.append(", color=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", desc=");
        sbM.append(this.write);
        sbM.append(", priority=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 67;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r1 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r22 instanceof o.checkEventI) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r1 = (o.checkEventI) r22;
        r12 = new java.lang.Object[]{r21.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r19 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r19 = new java.lang.Object[]{r21.MediaMetadataCompat, r1.MediaMetadataCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r1 = o.checkEventI.MediaSessionCompatQueueItem;
        r3 = r1 + 35;
        o.checkEventI.MediaBrowserCompatMediaItem = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r1 = r1 + 79;
        o.checkEventI.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (r21.IconCompatParcelizer == r1.IconCompatParcelizer) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        r19 = new java.lang.Object[]{r21.write, r1.write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        r1 = o.checkEventI.MediaSessionCompatQueueItem + 97;
        o.checkEventI.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f9, code lost:
    
        if (r21.serializer == r1.serializer) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        r1 = o.checkEventI.MediaBrowserCompatMediaItem + 31;
        o.checkEventI.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0104, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r3 = r3 + 73;
        o.checkEventI.MediaBrowserCompatMediaItem = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r3 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.checkEventI.equals(java.lang.Object):boolean");
    }
}
