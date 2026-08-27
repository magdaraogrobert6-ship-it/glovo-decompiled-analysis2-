package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxx> CREATOR = new zzh(24);
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 2, this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzxx(int i, String str) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = str;
    }
}
