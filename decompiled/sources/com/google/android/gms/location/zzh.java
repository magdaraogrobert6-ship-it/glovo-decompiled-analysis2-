package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iWrite = UrlUtils.write(parcel);
        ArrayList arrayListWrite = null;
        String strSerializer = null;
        ArrayList arrayListWrite2 = null;
        String strSerializer2 = null;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListWrite = UrlUtils.write(parcel, i, ActivityTransition.CREATOR);
            } else if (c == 2) {
                strSerializer = UrlUtils.serializer(parcel, i);
            } else if (c == 3) {
                arrayListWrite2 = UrlUtils.write(parcel, i, ClientIdentity.CREATOR);
            } else if (c != 4) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                strSerializer2 = UrlUtils.serializer(parcel, i);
            }
        }
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
        return new ActivityTransitionRequest(arrayListWrite, strSerializer, arrayListWrite2, strSerializer2);
    }
}
