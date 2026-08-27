package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransition[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        int iPlaybackStateCompatCustomAction = 0;
        int iPlaybackStateCompatCustomAction2 = 0;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            } else if (c != 2) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new ActivityTransition(iPlaybackStateCompatCustomAction, iPlaybackStateCompatCustomAction2);
    }
}
