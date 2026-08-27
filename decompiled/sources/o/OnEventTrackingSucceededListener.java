package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OnEventTrackingSucceededListener {
    private static int ResultReceiver = 1;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final long ParcelableVolumeInfo;
    public final Calendar PlaybackStateCompat;
    public final OnGoogleAdIdReadListener PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final OnAdidReadListener serializer;
    public final String write;

    public OnEventTrackingSucceededListener(long j, String str, String str2, int i, String str3, String str4, Calendar calendar, boolean z, boolean z2, boolean z3, boolean z4, List list, OnGoogleAdIdReadListener onGoogleAdIdReadListener, long j2, OnAdidReadListener onAdidReadListener) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.read = j;
        this.MediaSessionCompatResultReceiverWrapper = str;
        this.write = str2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaSessionCompatToken = str4;
        this.PlaybackStateCompat = calendar;
        this.RatingCompat = z;
        this.MediaDescriptionCompat = z2;
        this.MediaMetadataCompat = z3;
        this.MediaSessionCompatQueueItem = z4;
        this.MediaBrowserCompatMediaItem = list;
        this.PlaybackStateCompatCustomAction = onGoogleAdIdReadListener;
        this.ParcelableVolumeInfo = j2;
        this.serializer = onAdidReadListener;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.MediaSessionCompatResultReceiverWrapper), 31, this.write), 31), 31, this.RemoteActionCompatParcelizer), 31, this.MediaSessionCompatToken);
        Calendar calendar = this.PlaybackStateCompat;
        int iHashCode2 = 0;
        if (calendar == null) {
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 67;
            ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = calendar.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.RatingCompat), 31, this.MediaDescriptionCompat), 31, this.MediaMetadataCompat), 31, this.MediaSessionCompatQueueItem);
        List list = this.MediaBrowserCompatMediaItem;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        OnGoogleAdIdReadListener onGoogleAdIdReadListener = this.PlaybackStateCompatCustomAction;
        int iM3 = d$$ExternalSyntheticOutline0.m((((iM2 + iHashCode3) * 31) + (onGoogleAdIdReadListener == null ? 0 : onGoogleAdIdReadListener.coordinates.hashCode())) * 31, 31, this.ParcelableVolumeInfo);
        OnAdidReadListener onAdidReadListener = this.serializer;
        if (onAdidReadListener == null) {
            int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 43;
            ResultReceiver = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
        } else {
            iHashCode2 = onAdidReadListener.hashCode();
        }
        return iM3 + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 87;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ShiftInfoEntity(id=", ", zone=", this.read, this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", city=");
        sb.append(this.write);
        sb.append(", cityId=");
        sb.append(this.IconCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sb, ", contractType=", this.RemoteActionCompatParcelizer, ", status=", this.MediaSessionCompatToken);
        sb.append(", statusEndingTime=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", isEndBreakAllowed=");
        sb.append(this.RatingCompat);
        sb.append(", isBreakScheduled=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isShiftExtensionAllowed=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", isShiftExtensionRequestedByRider=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", shifts=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", startingArea=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", timestamp=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", balanceLimit=");
        sb.append(this.serializer);
        sb.append(")");
        String string = sb.toString();
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 31;
        ResultReceiver = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = ResultReceiver + 71;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof OnEventTrackingSucceededListener)) {
            return false;
        }
        OnEventTrackingSucceededListener onEventTrackingSucceededListener = (OnEventTrackingSucceededListener) obj;
        if (this.read == onEventTrackingSucceededListener.read) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatResultReceiverWrapper, onEventTrackingSucceededListener.MediaSessionCompatResultReceiverWrapper}, getCieXyz.write())).booleanValue()) {
                int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 99;
                ResultReceiver = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, onEventTrackingSucceededListener.write}, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != onEventTrackingSucceededListener.IconCompatParcelizer) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, onEventTrackingSucceededListener.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i6 = ResultReceiver + 89;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, onEventTrackingSucceededListener.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, onEventTrackingSucceededListener.PlaybackStateCompat}, getCieXyz.write())).booleanValue() || this.RatingCompat != onEventTrackingSucceededListener.RatingCompat || this.MediaDescriptionCompat != onEventTrackingSucceededListener.MediaDescriptionCompat || this.MediaMetadataCompat != onEventTrackingSucceededListener.MediaMetadataCompat || this.MediaSessionCompatQueueItem != onEventTrackingSucceededListener.MediaSessionCompatQueueItem) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, onEventTrackingSucceededListener.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, onEventTrackingSucceededListener.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue() || this.ParcelableVolumeInfo != onEventTrackingSucceededListener.ParcelableVolumeInfo) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, onEventTrackingSucceededListener.serializer}, getCieXyz.write())).booleanValue();
                }
                int i8 = ResultReceiver + 51;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 3;
            ResultReceiver = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i10 % 2 == 0;
        }
        int i11 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 1;
        ResultReceiver = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 == 0;
    }
}
