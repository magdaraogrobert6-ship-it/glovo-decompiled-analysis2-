package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyu> CREATOR = new zzh(28);
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeLong(this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzyu(long j, int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.serializer = i3;
        this.read = i4;
        this.IconCompatParcelizer = j;
    }
}
