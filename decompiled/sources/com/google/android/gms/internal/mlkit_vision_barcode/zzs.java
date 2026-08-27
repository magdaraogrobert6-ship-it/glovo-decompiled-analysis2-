package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzh(6);
    public String IconCompatParcelizer;
    public String read;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 3, this.read);
        SQLite.serializer(i2, parcel);
    }
}
