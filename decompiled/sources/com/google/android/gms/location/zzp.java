package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzek;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        ArrayList arrayListWrite = null;
        int iPlaybackStateCompatCustomAction = 0;
        String strSerializer = null;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListWrite = UrlUtils.write(parcel, i, zzek.CREATOR);
            } else if (c == 2) {
                iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
            } else if (c != 4) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                strSerializer = UrlUtils.serializer(parcel, i);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new GeofencingRequest(arrayListWrite, iPlaybackStateCompatCustomAction, strSerializer);
    }
}
