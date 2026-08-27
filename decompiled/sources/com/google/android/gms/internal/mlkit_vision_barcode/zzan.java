package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzh(9);
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public int read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int i3 = this.read;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i3);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeLong(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(this.serializer);
        SQLite.serializer(i2, parcel);
    }

    public zzan(long j, int i, int i2, int i3, int i4) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = i3;
        this.IconCompatParcelizer = j;
        this.serializer = i4;
    }
}
