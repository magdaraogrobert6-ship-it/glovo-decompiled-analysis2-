package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxz> CREATOR = new zzh(26);
    public final String RemoteActionCompatParcelizer;
    public final String read;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 2, this.read);
        SQLite.serializer(i2, parcel);
    }

    public zzxz(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }
}
