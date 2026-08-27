package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        boolean zMediaSessionCompatQueueItem = false;
        ArrayList arrayListWrite = null;
        boolean zMediaSessionCompatQueueItem2 = false;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListWrite = UrlUtils.write(parcel, i, LocationRequest.CREATOR);
            } else if (c == 2) {
                zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
            } else if (c != 3) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new LocationSettingsRequest(arrayListWrite, zMediaSessionCompatQueueItem, zMediaSessionCompatQueueItem2);
    }
}
