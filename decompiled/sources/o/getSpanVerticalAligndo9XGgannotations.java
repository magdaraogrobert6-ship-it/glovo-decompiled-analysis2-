package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getSpanVerticalAligndo9XGgannotations {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final setPlaceholder IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final boolean write;

    public getSpanVerticalAligndo9XGgannotations(long j, String str, boolean z, String str2, String str3, String str4, setPlaceholder setplaceholder) {
        this.serializer = j;
        this.RatingCompat = str;
        this.write = z;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.IconCompatParcelizer = setplaceholder;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("PhoneNumber(deliveryId=", ", number=", this.serializer, this.RatingCompat);
        sb.append(", masked=");
        sb.append(this.write);
        sb.append(", isVoipEnabled=false, callee=");
        sb.append(this.read);
        c8$$ExternalSyntheticOutline0.m(sb, ", calleeName=", this.RemoteActionCompatParcelizer, ", orderCode=", this.MediaBrowserCompatMediaItem);
        sb.append(", analytics=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i4 = MediaSessionCompatQueueItem + 3;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.serializer);
        String str = this.RatingCompat;
        if (str == null) {
            int i2 = MediaSessionCompatQueueItem + 31;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode3 * 31) + iHashCode) * 31, 31, this.write), 31, false);
        String str2 = this.read;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.RemoteActionCompatParcelizer;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaBrowserCompatMediaItem;
        if (str4 == null) {
            int i4 = MediaDescriptionCompat;
            int i5 = i4 + 73;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i5 % 2 == 0 ? 1 : 0;
            int i6 = i4 + 43;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = str4.hashCode();
        }
        setPlaceholder setplaceholder = this.IconCompatParcelizer;
        return ((((((iM + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (setplaceholder != null ? setplaceholder.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0113, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSpanVerticalAligndo9XGgannotations.equals(java.lang.Object):boolean");
    }
}
