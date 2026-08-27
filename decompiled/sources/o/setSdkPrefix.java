package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setSdkPrefix {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final Calendar IconCompatParcelizer;
    public final getReferrer MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final setUrlStrategy MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final setStoreInfo RatingCompat;
    public final setPreinstallFilePath RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final long write;

    public setSdkPrefix(long j, setUrlStrategy seturlstrategy, Calendar calendar, getReferrer getreferrer, ArrayList arrayList, setPreinstallFilePath setpreinstallfilepath, setStoreInfo setstoreinfo, boolean z, boolean z2, long j2) {
        this.write = j;
        this.MediaMetadataCompat = seturlstrategy;
        this.IconCompatParcelizer = calendar;
        this.MediaBrowserCompatMediaItem = getreferrer;
        this.MediaDescriptionCompat = arrayList;
        this.RemoteActionCompatParcelizer = setpreinstallfilepath;
        this.RatingCompat = setstoreinfo;
        this.serializer = z;
        this.read = z2;
        this.MediaSessionCompatQueueItem = j2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.write);
        int iHashCode4 = this.MediaMetadataCompat.hashCode();
        Calendar calendar = this.IconCompatParcelizer;
        if (calendar == null) {
            int i2 = PlaybackStateCompat;
            int i3 = i2 + 121;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = calendar.hashCode();
        }
        getReferrer getreferrer = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = getreferrer == null ? 0 : getreferrer.hashCode();
        List list = this.MediaDescriptionCompat;
        if (list == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
            int i7 = PlaybackStateCompat + 109;
            ParcelableVolumeInfo = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return Long.hashCode(this.MediaSessionCompatQueueItem) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.RatingCompat.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + ((((((((iHashCode4 + (iHashCode3 * 31)) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31)) * 31)) * 31, 31, false), 31, this.serializer), 31, this.read);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Courier(id=");
        sb.append(this.write);
        sb.append(", state=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", currentStateEndingTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shift=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", shifts=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", breakRequest=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", shiftExtension=");
        sb.append(this.RatingCompat);
        sb.append(", isPushTokenInvalid=false, isShiftEnded=");
        sb.append(this.serializer);
        sb.append(", hasMultipleFutureShifts=");
        sb.append(this.read);
        sb.append(", timestamp=");
        String strM = c8$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, ")", sb);
        int i2 = ParcelableVolumeInfo + 39;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat;
        int i3 = i2 + 125;
        ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof setSdkPrefix) {
            setSdkPrefix setsdkprefix = (setSdkPrefix) obj;
            if (this.write != setsdkprefix.write) {
                int i5 = i2 + 103;
                ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else if (this.MediaMetadataCompat == setsdkprefix.MediaMetadataCompat) {
                Object[] objArr = {this.IconCompatParcelizer, setsdkprefix.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.MediaBrowserCompatMediaItem, setsdkprefix.MediaBrowserCompatMediaItem};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        Object[] objArr3 = {this.MediaDescriptionCompat, setsdkprefix.MediaDescriptionCompat};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer.equals(setsdkprefix.RemoteActionCompatParcelizer) && this.RatingCompat.equals(setsdkprefix.RatingCompat) && this.serializer == setsdkprefix.serializer && this.read == setsdkprefix.read && this.MediaSessionCompatQueueItem == setsdkprefix.MediaSessionCompatQueueItem) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
