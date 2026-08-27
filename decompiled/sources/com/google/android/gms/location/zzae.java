package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        com.google.android.gms.internal.location.zze zzeVar = null;
        boolean zMediaSessionCompatQueueItem = false;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
            } else if (c != 2) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                zzeVar = (com.google.android.gms.internal.location.zze) UrlUtils.read(parcel, i, com.google.android.gms.internal.location.zze.CREATOR);
            }
        }
        Object[] objArr = {parcel, Integer.valueOf(iWrite)};
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), objArr);
        return new zzad(zMediaSessionCompatQueueItem, zzeVar);
    }
}
