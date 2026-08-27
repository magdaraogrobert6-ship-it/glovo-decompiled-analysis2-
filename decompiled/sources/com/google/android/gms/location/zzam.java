package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzam implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        long jPlaybackStateCompat = -1;
        long jPlaybackStateCompat2 = -1;
        int iPlaybackStateCompatCustomAction = 1;
        int iPlaybackStateCompatCustomAction2 = 1;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            } else if (c == 2) {
                iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            } else if (c == 3) {
                jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
            } else if (c != 4) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new zzal(iPlaybackStateCompatCustomAction, iPlaybackStateCompatCustomAction2, jPlaybackStateCompat, jPlaybackStateCompat2);
    }
}
