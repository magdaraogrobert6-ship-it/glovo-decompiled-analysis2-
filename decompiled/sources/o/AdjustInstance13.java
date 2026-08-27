package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance13 {
    private static int PlaybackStateCompat = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final AdjustInstance101 MediaDescriptionCompat;
    public final AdjustInstance11 MediaMetadataCompat;
    public final Long MediaSessionCompatQueueItem;
    public final Integer MediaSessionCompatToken;
    public final AdjustInstance12 RatingCompat;
    public final Boolean RemoteActionCompatParcelizer;
    public final String read;
    public final t3 serializer;
    public final boolean write;

    public final boolean read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        boolean z = this.write;
        int i5 = i3 + 107;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return z;
    }

    public AdjustInstance13(Long l, AdjustInstance11 adjustInstance11, Integer num, String str, String str2, AdjustInstance12 adjustInstance12, boolean z, AdjustInstance101 adjustInstance101, boolean z2, t3 t3Var, Boolean bool) {
        adjustInstance11.getClass();
        str2.getClass();
        this.MediaSessionCompatQueueItem = l;
        this.MediaMetadataCompat = adjustInstance11;
        this.MediaSessionCompatToken = num;
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.RatingCompat = adjustInstance12;
        this.MediaBrowserCompatMediaItem = z;
        this.MediaDescriptionCompat = adjustInstance101;
        this.write = z2;
        this.serializer = t3Var;
        this.RemoteActionCompatParcelizer = bool;
    }

    public static AdjustInstance13 RemoteActionCompatParcelizer(AdjustInstance13 adjustInstance13) {
        int i = 2 % 2;
        Long l = adjustInstance13.MediaSessionCompatQueueItem;
        AdjustInstance11 adjustInstance11 = adjustInstance13.MediaMetadataCompat;
        Integer num = adjustInstance13.MediaSessionCompatToken;
        String str = adjustInstance13.read;
        String str2 = adjustInstance13.IconCompatParcelizer;
        AdjustInstance12 adjustInstance12 = adjustInstance13.RatingCompat;
        AdjustInstance101 adjustInstance101 = adjustInstance13.MediaDescriptionCompat;
        boolean z = adjustInstance13.write;
        t3 t3Var = adjustInstance13.serializer;
        Boolean bool = adjustInstance13.RemoteActionCompatParcelizer;
        adjustInstance11.getClass();
        str2.getClass();
        AdjustInstance13 adjustInstance14 = new AdjustInstance13(l, adjustInstance11, num, str, str2, adjustInstance12, false, adjustInstance101, z, t3Var, bool);
        int i2 = PlaybackStateCompat + 109;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return adjustInstance14;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Long l = this.MediaSessionCompatQueueItem;
        if (l == null) {
            int i2 = PlaybackStateCompat + 49;
            PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        int iHashCode3 = this.MediaMetadataCompat.hashCode();
        Integer num = this.MediaSessionCompatToken;
        int iM = d$$ExternalSyntheticOutline0.m((this.RatingCompat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((iHashCode3 + (iHashCode * 31)) * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.read), 31, this.IconCompatParcelizer)) * 31, 31, this.MediaBrowserCompatMediaItem);
        AdjustInstance101 adjustInstance101 = this.MediaDescriptionCompat;
        if (adjustInstance101 == null) {
            int i4 = PlaybackStateCompatCustomAction + 65;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = adjustInstance101.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + iHashCode2) * 31, 31, this.write);
        t3 t3Var = this.serializer;
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode() + ((iM2 + (t3Var != null ? t3Var.hashCode() : 0)) * 31);
        int i6 = PlaybackStateCompat + 115;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("FutureShiftViewEntity(shiftId=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", startSessionType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", zoneId=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", shiftDuration=");
        sb.append(this.read);
        sb.append(", area=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", stateMessage=");
        sb.append(this.RatingCompat);
        sb.append(", showStartShiftButton=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", showOnMapButton=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", markerSelected=");
        sb.append(this.write);
        sb.append(", bonusMultiplier=");
        sb.append(this.serializer);
        sb.append(", calendarEnabled=");
        String strM = c8$$ExternalSyntheticOutline0.m(sb, ")", this.RemoteActionCompatParcelizer);
        int i2 = PlaybackStateCompatCustomAction + 23;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r21 instanceof o.AdjustInstance13) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r1 = (o.AdjustInstance13) r21;
        r11 = new java.lang.Object[]{r20.MediaSessionCompatQueueItem, r1.MediaSessionCompatQueueItem};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r11, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        r1 = o.AdjustInstance13.PlaybackStateCompat + 81;
        o.AdjustInstance13.PlaybackStateCompatCustomAction = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r20.MediaMetadataCompat == r1.MediaMetadataCompat) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r18 = new java.lang.Object[]{r20.MediaSessionCompatToken, r1.MediaSessionCompatToken};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r20.read.equals(r1.read) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        r18 = new java.lang.Object[]{r20.IconCompatParcelizer, r1.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (r20.RatingCompat.equals(r1.RatingCompat) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (r20.MediaBrowserCompatMediaItem == r1.MediaBrowserCompatMediaItem) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        r18 = new java.lang.Object[]{r20.MediaDescriptionCompat, r1.MediaDescriptionCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fd, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        if (r20.write == r1.write) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        r18 = new java.lang.Object[]{r20.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        if (r20.RemoteActionCompatParcelizer.equals(r1.RemoteActionCompatParcelizer) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0138, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r3 = r3 + 25;
        o.AdjustInstance13.PlaybackStateCompat = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdjustInstance13.equals(java.lang.Object):boolean");
    }
}
