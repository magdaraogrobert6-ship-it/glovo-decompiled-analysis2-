package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPlatformLocaleDelegate extends PlatformLocaleDelegate {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final Integer MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final boolean write;

    public getPlatformLocaleDelegate(int i, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, String str3, Integer num, boolean z, boolean z2) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.read = i;
        this.MediaBrowserCompatMediaItem = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaSessionCompatQueueItem = num;
        this.write = z;
        this.MediaDescriptionCompat = z2;
    }

    public static getPlatformLocaleDelegate IconCompatParcelizer(getPlatformLocaleDelegate getplatformlocaledelegate, int i, Integer num, boolean z, boolean z2, int i2) {
        Integer num2;
        boolean z3;
        int i3 = 2 % 2;
        int i4 = RatingCompat;
        int i5 = i4 + 45;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = (i5 % 2 == 0 || (i2 & 1) == 0) ? i : getplatformlocaledelegate.read;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = getplatformlocaledelegate.MediaBrowserCompatMediaItem;
        String str = getplatformlocaledelegate.IconCompatParcelizer;
        String str2 = getplatformlocaledelegate.serializer;
        String str3 = getplatformlocaledelegate.RemoteActionCompatParcelizer;
        if ((i2 & 32) != 0) {
            int i7 = i4 + 51;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            num2 = getplatformlocaledelegate.MediaSessionCompatQueueItem;
        } else {
            num2 = num;
        }
        boolean z4 = (i2 & 64) != 0 ? getplatformlocaledelegate.write : z;
        if ((i2 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i9 = MediaMetadataCompat + 69;
            RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z3 = getplatformlocaledelegate.MediaDescriptionCompat;
        } else {
            z3 = z2;
        }
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        return new getPlatformLocaleDelegate(i6, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, str3, num2, z4, z3);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.MediaBrowserCompatMediaItem.hashCode() + (Integer.hashCode(this.read) * 31)) * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode2 = 0;
        if (str == null) {
            int i4 = RatingCompat + 35;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.MediaSessionCompatQueueItem;
        if (num == null) {
            int i6 = RatingCompat + 49;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = num.hashCode();
        }
        return Boolean.hashCode(this.MediaDescriptionCompat) + d$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + iHashCode2) * 31, 31, this.write);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("EntrancePicture(currentImagePosition=");
        sb.append(this.read);
        sb.append(", imageUrls=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", customerName=");
        c8$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ", address=", this.serializer, ", deliveryNotes=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", expandIcon=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", areDetailsExpanded=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.write, ", isPictureExpanded=", this.MediaDescriptionCompat, ")");
        int i2 = MediaMetadataCompat + 115;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strSerializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r19.MediaDescriptionCompat != r1.MediaDescriptionCompat) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPlatformLocaleDelegate.equals(java.lang.Object):boolean");
    }
}
