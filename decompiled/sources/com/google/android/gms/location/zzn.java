package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        boolean zMediaSessionCompatQueueItem = false;
        long jPlaybackStateCompat = 0;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
            } else if (c != 6) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
            }
        }
        Object[] objArr = {parcel, Integer.valueOf(iWrite)};
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), objArr);
        return new DeviceOrientationRequest(jPlaybackStateCompat, zMediaSessionCompatQueueItem);
    }
}
