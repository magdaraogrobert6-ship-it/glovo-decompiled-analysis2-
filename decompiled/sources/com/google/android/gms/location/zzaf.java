package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.internal.location.zze zzeVar = null;
        boolean zMediaSessionCompatQueueItem = false;
        int iPlaybackStateCompatCustomAction = 0;
        int iPlaybackStateCompatCustomAction2 = 0;
        boolean zMediaSessionCompatQueueItem2 = false;
        long jPlaybackStateCompat = -1;
        float fRatingCompat = 0.0f;
        int iPlaybackStateCompatCustomAction3 = Integer.MAX_VALUE;
        long jPlaybackStateCompat2 = Long.MAX_VALUE;
        long jPlaybackStateCompat3 = Long.MAX_VALUE;
        long jPlaybackStateCompat4 = 0;
        long jPlaybackStateCompat5 = 600000;
        long jPlaybackStateCompat6 = 3600000;
        int iPlaybackStateCompatCustomAction4 = 102;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iPlaybackStateCompatCustomAction4 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 2:
                    jPlaybackStateCompat6 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 3:
                    jPlaybackStateCompat5 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 4:
                case 14:
                default:
                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    break;
                case 5:
                    jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 6:
                    iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 7:
                    fRatingCompat = UrlUtils.RatingCompat(parcel, i);
                    break;
                case '\b':
                    jPlaybackStateCompat4 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case '\t':
                    zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case '\n':
                    jPlaybackStateCompat3 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 11:
                    jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case '\f':
                    iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case '\r':
                    iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 15:
                    zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) UrlUtils.read(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    zzeVar = (com.google.android.gms.internal.location.zze) UrlUtils.read(parcel, i, com.google.android.gms.internal.location.zze.CREATOR);
                    break;
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new LocationRequest(iPlaybackStateCompatCustomAction4, jPlaybackStateCompat6, jPlaybackStateCompat5, jPlaybackStateCompat4, jPlaybackStateCompat2, jPlaybackStateCompat3, iPlaybackStateCompatCustomAction3, fRatingCompat, zMediaSessionCompatQueueItem, jPlaybackStateCompat, iPlaybackStateCompatCustomAction, iPlaybackStateCompatCustomAction2, zMediaSessionCompatQueueItem2, workSource, zzeVar);
    }
}
