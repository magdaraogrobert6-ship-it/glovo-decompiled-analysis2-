package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        boolean zMediaSessionCompatQueueItem = false;
        boolean zMediaSessionCompatQueueItem2 = false;
        boolean zMediaSessionCompatQueueItem3 = false;
        boolean zMediaSessionCompatQueueItem4 = false;
        boolean zMediaSessionCompatQueueItem5 = false;
        boolean zMediaSessionCompatQueueItem6 = false;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 2:
                    zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 3:
                    zMediaSessionCompatQueueItem3 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 4:
                    zMediaSessionCompatQueueItem4 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 5:
                    zMediaSessionCompatQueueItem5 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                case 6:
                    zMediaSessionCompatQueueItem6 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                    break;
                default:
                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    break;
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new LocationSettingsStates(zMediaSessionCompatQueueItem, zMediaSessionCompatQueueItem2, zMediaSessionCompatQueueItem3, zMediaSessionCompatQueueItem4, zMediaSessionCompatQueueItem5, zMediaSessionCompatQueueItem6);
    }
}
