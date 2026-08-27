package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        boolean zMediaSessionCompatQueueItem = false;
        zzal[] zzalVarArr = null;
        long jPlaybackStateCompat = 0;
        int iPlaybackStateCompatCustomAction = 1;
        int iPlaybackStateCompatCustomAction2 = 1;
        int iPlaybackStateCompatCustomAction3 = 1000;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 2:
                    iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 3:
                    jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 4:
                    iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 5:
                    zzalVarArr = (zzal[]) UrlUtils.serializer(parcel, i, zzal.CREATOR);
                    break;
                case 6:
                    zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                default:
                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    break;
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new LocationAvailability(iPlaybackStateCompatCustomAction3, iPlaybackStateCompatCustomAction, iPlaybackStateCompatCustomAction2, jPlaybackStateCompat, zzalVarArr, zMediaSessionCompatQueueItem);
    }
}
