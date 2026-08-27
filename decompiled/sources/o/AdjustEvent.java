package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustEvent {
    private static int MediaSessionCompatToken = 0;
    private static int ResultReceiver = 1;
    public final boolean IconCompatParcelizer;
    public final getFailureResponseData MediaBrowserCompatMediaItem;
    public final Calendar MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final getDeduplicationId MediaSessionCompatQueueItem;
    public final Calendar MediaSessionCompatResultReceiverWrapper;
    public final Long ParcelableVolumeInfo;
    public final accesssetCustomBrazeNotificationFactorycp PlaybackStateCompat;
    public final Long PlaybackStateCompatCustomAction;
    public final Long RatingCompat;
    public final Boolean RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final List write;

    public AdjustEvent(Long l, Long l2, Long l3, getFailureResponseData getfailureresponsedata, String str, Calendar calendar, Calendar calendar2, getDeduplicationId getdeduplicationid, accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp, boolean z, String str2, List list, Boolean bool, boolean z2) {
        getfailureresponsedata.getClass();
        getdeduplicationid.getClass();
        this.RatingCompat = l;
        this.PlaybackStateCompatCustomAction = l2;
        this.ParcelableVolumeInfo = l3;
        this.MediaBrowserCompatMediaItem = getfailureresponsedata;
        this.serializer = str;
        this.MediaSessionCompatResultReceiverWrapper = calendar;
        this.MediaDescriptionCompat = calendar2;
        this.MediaSessionCompatQueueItem = getdeduplicationid;
        this.PlaybackStateCompat = accesssetcustombrazenotificationfactorycp;
        this.IconCompatParcelizer = z;
        this.read = str2;
        this.write = list;
        this.RemoteActionCompatParcelizer = bool;
        this.MediaMetadataCompat = z2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        Long l = this.RatingCompat;
        int iHashCode5 = 0;
        if (l == null) {
            int i2 = MediaSessionCompatToken + 101;
            ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Long l2 = this.PlaybackStateCompatCustomAction;
        int iHashCode6 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.ParcelableVolumeInfo;
        int iM = af$$ExternalSyntheticOutline0.m((this.MediaBrowserCompatMediaItem.hashCode() + (((((iHashCode * 31) + iHashCode6) * 31) + (l3 == null ? 0 : l3.hashCode())) * 31)) * 31, 31, this.serializer);
        int iHashCode7 = this.MediaSessionCompatResultReceiverWrapper.hashCode();
        int iHashCode8 = this.MediaDescriptionCompat.hashCode();
        int iHashCode9 = this.MediaSessionCompatQueueItem.hashCode();
        accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = this.PlaybackStateCompat;
        if (accesssetcustombrazenotificationfactorycp == null) {
            int i4 = ResultReceiver + 71;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = accesssetcustombrazenotificationfactorycp.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((iHashCode9 + ((iHashCode8 + ((iHashCode7 + iM) * 31)) * 31)) * 31) + iHashCode2) * 31, 31, this.IconCompatParcelizer);
        String str = this.read;
        if (str == null) {
            int i6 = ResultReceiver + 119;
            MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        List list = this.write;
        if (list == null) {
            int i8 = MediaSessionCompatToken + 87;
            ResultReceiver = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode4 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        Boolean bool = this.RemoteActionCompatParcelizer;
        if (bool != null) {
            iHashCode5 = bool.hashCode();
            int i9 = ResultReceiver + 1;
            MediaSessionCompatToken = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return Boolean.hashCode(this.MediaMetadataCompat) + ((((((iM2 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("FutureShift(id=");
        sb.append(this.RatingCompat);
        sb.append(", zoneId=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", startingAreaId=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", riderStatus=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", area=");
        sb.append(this.serializer);
        sb.append(", startTime=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", endTime=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", shiftStatus=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", startingArea=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", canStartShift=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bonusMultiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, ", bonusTypes=", this.write, ", calendarEnabled=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", hasShiftMode=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaSessionCompatToken + 79;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = ResultReceiver + 87;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof AdjustEvent)) {
                return false;
            }
            AdjustEvent adjustEvent = (AdjustEvent) obj;
            Object[] objArr = {this.RatingCompat, adjustEvent.RatingCompat};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = ResultReceiver + 89;
                MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                int i5 = 4 / 3;
                return false;
            }
            Object[] objArr2 = {this.PlaybackStateCompatCustomAction, adjustEvent.PlaybackStateCompatCustomAction};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.ParcelableVolumeInfo, adjustEvent.ParcelableVolumeInfo};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.MediaBrowserCompatMediaItem, adjustEvent.MediaBrowserCompatMediaItem};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue() || !this.serializer.equals(adjustEvent.serializer) || !this.MediaSessionCompatResultReceiverWrapper.equals(adjustEvent.MediaSessionCompatResultReceiverWrapper) || !this.MediaDescriptionCompat.equals(adjustEvent.MediaDescriptionCompat) || this.MediaSessionCompatQueueItem != adjustEvent.MediaSessionCompatQueueItem) {
                return false;
            }
            Object[] objArr5 = {this.PlaybackStateCompat, adjustEvent.PlaybackStateCompat};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != adjustEvent.IconCompatParcelizer) {
                return false;
            }
            Object[] objArr6 = {this.read, adjustEvent.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr7 = {this.write, adjustEvent.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr8 = {this.RemoteActionCompatParcelizer, adjustEvent.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
                int i6 = ResultReceiver + 15;
                MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return false;
                }
                int i7 = 3 % 4;
                return false;
            }
            if (this.MediaMetadataCompat != adjustEvent.MediaMetadataCompat) {
                return false;
            }
        }
        int i8 = ResultReceiver + 53;
        MediaSessionCompatToken = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
