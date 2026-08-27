package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxu> CREATOR = new zzh(21);
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.serializer(parcel, 2, this.serializer);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 4, this.read);
        SQLite.serializer(i2, parcel);
    }

    public zzxu(int i, String str, String str2, String str3) {
        this.write = i;
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }
}
