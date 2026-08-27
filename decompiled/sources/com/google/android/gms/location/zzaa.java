package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        com.google.android.gms.internal.location.zze zzeVar = null;
        int iPlaybackStateCompatCustomAction = 0;
        boolean zMediaSessionCompatQueueItem = false;
        long jPlaybackStateCompat = Long.MAX_VALUE;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
            } else if (c == 2) {
                iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            } else if (c == 3) {
                zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
            } else if (c != 5) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                zzeVar = (com.google.android.gms.internal.location.zze) UrlUtils.read(parcel, i, com.google.android.gms.internal.location.zze.CREATOR);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new LastLocationRequest(jPlaybackStateCompat, iPlaybackStateCompatCustomAction, zMediaSessionCompatQueueItem, zzeVar);
    }
}
