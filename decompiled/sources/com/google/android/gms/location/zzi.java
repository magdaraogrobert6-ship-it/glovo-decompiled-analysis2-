package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        ArrayList arrayListWrite = null;
        Bundle bundleIconCompatParcelizer = null;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListWrite = UrlUtils.write(parcel, i, ActivityTransitionEvent.CREATOR);
            } else if (c != 2) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                bundleIconCompatParcelizer = UrlUtils.IconCompatParcelizer(parcel, i);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new ActivityTransitionResult(arrayListWrite, bundleIconCompatParcelizer);
    }
}
