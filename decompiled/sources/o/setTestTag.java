package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setTestTag {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final List IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final Long RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public setTestTag(String str, Long l, String str2, String str3, String str4, List list, String str5, String str6, String str7, long j, List list2, String str8, String str9) {
        m1$$ExternalSyntheticOutline0.m(str, str3, str4, str5, str6);
        str7.getClass();
        list2.getClass();
        str8.getClass();
        this.MediaMetadataCompat = str;
        this.RatingCompat = l;
        this.ParcelableVolumeInfo = str2;
        this.PlaybackStateCompat = str3;
        this.serializer = str4;
        this.IconCompatParcelizer = list;
        this.MediaSessionCompatQueueItem = str5;
        this.MediaSessionCompatResultReceiverWrapper = str6;
        this.read = str7;
        this.RemoteActionCompatParcelizer = j;
        this.MediaBrowserCompatMediaItem = list2;
        this.write = str8;
        this.MediaDescriptionCompat = str9;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("UserData(id=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", expires=");
        sb.append(this.RatingCompat);
        sb.append(", username=REDACTED, token=REDACTED, contractType=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, ", countries=", this.IconCompatParcelizer, ", countryCode=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, ", url=", this.MediaSessionCompatResultReceiverWrapper, ", city=");
        sb.append(this.read);
        sb.append(", cityId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", idVerificationLocations=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", brand=");
        sb.append(this.write);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", name=", this.MediaDescriptionCompat, ")");
        int i2 = PlaybackStateCompatCustomAction + 69;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.MediaMetadataCompat.hashCode();
        int iHashCode4 = this.RatingCompat.hashCode();
        String str = this.ParcelableVolumeInfo;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = PlaybackStateCompatCustomAction + 65;
            MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((iHashCode4 + (iHashCode3 * 31)) * 31) + iHashCode) * 31, 31, this.PlaybackStateCompat), 31, this.serializer);
        List list = this.IconCompatParcelizer;
        if (list == null) {
            int i4 = MediaSessionCompatToken + 53;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + iHashCode2) * 31, 31, this.MediaSessionCompatQueueItem), 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.read), 31, this.RemoteActionCompatParcelizer), 31), 31, this.write);
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            int i6 = MediaSessionCompatToken + 123;
            PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode5 = str2.hashCode();
        }
        return iM2 + iHashCode5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0203, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTestTag.equals(java.lang.Object):boolean");
    }
}
