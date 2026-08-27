package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        int iPlaybackStateCompatCustomAction = 0;
        ArrayList arrayListWrite = null;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListWrite = UrlUtils.write(parcel, i, zzas.CREATOR);
            } else if (c != 2) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            }
        }
        Object[] objArr = {parcel, Integer.valueOf(iWrite)};
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), objArr);
        return new SleepSegmentRequest(arrayListWrite, iPlaybackStateCompatCustomAction);
    }
}
