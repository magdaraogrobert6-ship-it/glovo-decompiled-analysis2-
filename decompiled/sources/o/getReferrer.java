package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getReferrer {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken;
    public final Calendar IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final getDeduplicationId MediaDescriptionCompat;
    public final Calendar MediaMetadataCompat;
    public final Long MediaSessionCompatQueueItem;
    public final Long ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final Long PlaybackStateCompatCustomAction;
    public final accesssetCustomBrazeNotificationFactorycp RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final Boolean serializer;
    public final List write;

    public getReferrer(Calendar calendar, Calendar calendar2, String str, Long l, Long l2, Long l3, getDeduplicationId getdeduplicationid, accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp, String str2, List list, Boolean bool, boolean z, String str3) {
        getdeduplicationid.getClass();
        this.MediaMetadataCompat = calendar;
        this.IconCompatParcelizer = calendar2;
        this.read = str;
        this.ParcelableVolumeInfo = l;
        this.PlaybackStateCompatCustomAction = l2;
        this.MediaSessionCompatQueueItem = l3;
        this.MediaDescriptionCompat = getdeduplicationid;
        this.RatingCompat = accesssetcustombrazenotificationfactorycp;
        this.RemoteActionCompatParcelizer = str2;
        this.write = list;
        this.serializer = bool;
        this.MediaBrowserCompatMediaItem = z;
        this.PlaybackStateCompat = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Shift(startedAt=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", endedAt=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", area=");
        sb.append(this.read);
        sb.append(", zoneId=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", startingAreaId=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", id=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", shiftStatus=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", startingArea=");
        sb.append(this.RatingCompat);
        sb.append(", bonusMultiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ", bonusTypes=", this.write, ", calendarEnabled=");
        sb.append(this.serializer);
        sb.append(", hasShiftMode=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", zoneGeoJson=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.PlaybackStateCompat, ")");
        int i2 = MediaSessionCompatResultReceiverWrapper + 15;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        Calendar calendar = this.MediaMetadataCompat;
        int iHashCode5 = calendar == null ? 0 : calendar.hashCode();
        Calendar calendar2 = this.IconCompatParcelizer;
        int iHashCode6 = calendar2 == null ? 0 : calendar2.hashCode();
        String str = this.read;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Long l = this.ParcelableVolumeInfo;
        int iHashCode8 = 1;
        if (l == null) {
            int i2 = MediaSessionCompatToken + 7;
            MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.PlaybackStateCompatCustomAction;
        if (l2 == null) {
            int i3 = MediaSessionCompatResultReceiverWrapper + 91;
            MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l2.hashCode();
            int i5 = MediaSessionCompatToken + 87;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
        }
        Long l3 = this.MediaSessionCompatQueueItem;
        int iHashCode9 = l3 == null ? 0 : l3.hashCode();
        int iHashCode10 = this.MediaDescriptionCompat.hashCode();
        accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = this.RatingCompat;
        int iHashCode11 = accesssetcustombrazenotificationfactorycp == null ? 0 : accesssetcustombrazenotificationfactorycp.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            int i7 = MediaSessionCompatResultReceiverWrapper + 107;
            MediaSessionCompatToken = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode3 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        List list = this.write;
        if (list == null) {
            int i8 = MediaSessionCompatToken + 117;
            MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode4 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        Boolean bool = this.serializer;
        if (bool == null) {
            int i9 = MediaSessionCompatResultReceiverWrapper + 115;
            MediaSessionCompatToken = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                iHashCode8 = 0;
            }
        } else {
            iHashCode8 = bool.hashCode();
        }
        int iM = d$$ExternalSyntheticOutline0.m((((((((((iHashCode10 + (((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9) * 31)) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31, 31, this.MediaBrowserCompatMediaItem);
        String str3 = this.PlaybackStateCompat;
        int iHashCode12 = iM + (str3 != null ? str3.hashCode() : 0);
        int i10 = MediaSessionCompatToken + 29;
        MediaSessionCompatResultReceiverWrapper = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return iHashCode12;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getReferrer)) {
            int i2 = MediaSessionCompatToken + 51;
            MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        getReferrer getreferrer = (getReferrer) obj;
        Object[] objArr = {this.MediaMetadataCompat, getreferrer.MediaMetadataCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = MediaSessionCompatResultReceiverWrapper + 111;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.IconCompatParcelizer, getreferrer.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.read, getreferrer.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.ParcelableVolumeInfo, getreferrer.ParcelableVolumeInfo};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.PlaybackStateCompatCustomAction, getreferrer.PlaybackStateCompatCustomAction};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            int i5 = MediaSessionCompatToken + 49;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        Object[] objArr6 = {this.MediaSessionCompatQueueItem, getreferrer.MediaSessionCompatQueueItem};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue() || this.MediaDescriptionCompat != getreferrer.MediaDescriptionCompat) {
            return false;
        }
        Object[] objArr7 = {this.RatingCompat, getreferrer.RatingCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr8 = {this.RemoteActionCompatParcelizer, getreferrer.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
            int i7 = MediaSessionCompatToken + 113;
            MediaSessionCompatResultReceiverWrapper = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        Object[] objArr9 = {this.write, getreferrer.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr9, getCieXyz.write())).booleanValue()) {
            int i9 = MediaSessionCompatToken + 113;
            MediaSessionCompatResultReceiverWrapper = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        Object[] objArr10 = {this.serializer, getreferrer.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr10, getCieXyz.write())).booleanValue()) {
            int i11 = MediaSessionCompatToken + 75;
            MediaSessionCompatResultReceiverWrapper = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (this.MediaBrowserCompatMediaItem != getreferrer.MediaBrowserCompatMediaItem) {
            return false;
        }
        Object[] objArr11 = {this.PlaybackStateCompat, getreferrer.PlaybackStateCompat};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr11, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i13 = MediaSessionCompatResultReceiverWrapper + 81;
        MediaSessionCompatToken = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }
}
