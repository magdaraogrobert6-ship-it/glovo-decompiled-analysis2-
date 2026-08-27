package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import java.util.List;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        List listWrite = LocationResult.zza;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                listWrite = UrlUtils.write(parcel, i, Location.CREATOR);
            }
        }
        Object[] objArr = {parcel, Integer.valueOf(iWrite)};
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), objArr);
        return new LocationResult(listWrite);
    }
}
