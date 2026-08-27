package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        WorkSource workSource = new WorkSource();
        com.google.android.gms.internal.location.zze zzeVar = null;
        int iPlaybackStateCompatCustomAction = 0;
        boolean zMediaSessionCompatQueueItem = false;
        int iPlaybackStateCompatCustomAction2 = 0;
        long jPlaybackStateCompat = Long.MAX_VALUE;
        long jPlaybackStateCompat2 = Long.MAX_VALUE;
        int iPlaybackStateCompatCustomAction3 = 102;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 2:
                    iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 3:
                    iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case 4:
                    jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 5:
                    zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 6:
                    workSource = (WorkSource) UrlUtils.read(parcel, i, WorkSource.CREATOR);
                    break;
                case 7:
                    iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    break;
                case '\b':
                default:
                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    break;
                case '\t':
                    zzeVar = (com.google.android.gms.internal.location.zze) UrlUtils.read(parcel, i, com.google.android.gms.internal.location.zze.CREATOR);
                    break;
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new CurrentLocationRequest(jPlaybackStateCompat, iPlaybackStateCompatCustomAction, iPlaybackStateCompatCustomAction3, jPlaybackStateCompat2, zMediaSessionCompatQueueItem, iPlaybackStateCompatCustomAction2, workSource, zzeVar);
    }
}
