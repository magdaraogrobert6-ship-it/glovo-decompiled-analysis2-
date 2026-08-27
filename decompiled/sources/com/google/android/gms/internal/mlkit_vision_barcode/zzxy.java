package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxy> CREATOR = new zzh(25);
    public final String read;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.read);
        SQLite.serializer(parcel, 2, this.write);
        SQLite.serializer(i2, parcel);
    }

    public zzxy(String str, String str2) {
        this.read = str;
        this.write = str2;
    }
}
