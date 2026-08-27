package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        float f = 0.0f;
        byte b = 0;
        long j = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            float fRatingCompat = f;
            float fRatingCompat2 = f2;
            float fRatingCompat3 = f3;
            float fRatingCompat4 = f4;
            byte b2 = b;
            long jPlaybackStateCompat = j;
            float[] fArrCreateFloatArray = null;
            while (true) {
                if (parcel.dataPosition() >= iWrite) {
                    UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
                    return new DeviceOrientation(fArrCreateFloatArray, fRatingCompat4, fRatingCompat2, jPlaybackStateCompat, b2, fRatingCompat3, fRatingCompat);
                }
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    switch (c) {
                        case 4:
                            fRatingCompat4 = UrlUtils.RatingCompat(parcel, i);
                            break;
                        case 5:
                            fRatingCompat2 = UrlUtils.RatingCompat(parcel, i);
                            break;
                        case 6:
                            jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i);
                            break;
                        case 7:
                            UrlUtils.read(parcel, i, 4);
                            b2 = (byte) parcel.readInt();
                            break;
                        case '\b':
                            fRatingCompat3 = UrlUtils.RatingCompat(parcel, i);
                            break;
                        case '\t':
                            fRatingCompat = UrlUtils.RatingCompat(parcel, i);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                            break;
                    }
                } else {
                    int iParcelableVolumeInfo = UrlUtils.ParcelableVolumeInfo(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iParcelableVolumeInfo == 0) {
                        break;
                    }
                    fArrCreateFloatArray = parcel.createFloatArray();
                    parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
                }
            }
            f4 = fRatingCompat4;
            f2 = fRatingCompat2;
            j = jPlaybackStateCompat;
            b = b2;
            f3 = fRatingCompat3;
            f = fRatingCompat;
        }
    }
}
