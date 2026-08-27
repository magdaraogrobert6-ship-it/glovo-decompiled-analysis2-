package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzh(1);
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public String read;
    public int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int i3 = this.write;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i3);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 4, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 5, this.read);
        SQLite.serializer(i2, parcel);
    }
}
