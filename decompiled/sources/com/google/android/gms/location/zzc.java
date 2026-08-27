package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        WorkSource workSource = null;
        String strSerializer = null;
        int[] iArr = null;
        String strSerializer2 = null;
        String strSerializer3 = null;
        long jPlaybackStateCompat = 0;
        long jPlaybackStateCompat2 = 0;
        boolean zMediaSessionCompatQueueItem = false;
        boolean zMediaSessionCompatQueueItem2 = false;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case 2:
                    zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 3:
                    workSource = (WorkSource) UrlUtils.read(parcel, i, WorkSource.CREATOR);
                    break;
                case 4:
                    strSerializer = UrlUtils.serializer(parcel, i);
                    break;
                case 5:
                    iArr = UrlUtils.read(parcel, i);
                    break;
                case 6:
                    zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 7:
                    strSerializer2 = UrlUtils.serializer(parcel, i);
                    break;
                case '\b':
                    jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i);
                    break;
                case '\t':
                    strSerializer3 = UrlUtils.serializer(parcel, i);
                    break;
                default:
                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    break;
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new zzb(jPlaybackStateCompat, zMediaSessionCompatQueueItem, workSource, strSerializer, iArr, zMediaSessionCompatQueueItem2, strSerializer2, jPlaybackStateCompat2, strSerializer3);
    }
}
