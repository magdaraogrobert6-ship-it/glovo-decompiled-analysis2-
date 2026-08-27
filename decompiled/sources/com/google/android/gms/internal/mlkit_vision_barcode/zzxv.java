package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxv> CREATOR = new zzh(22);
    public final double RemoteActionCompatParcelizer;
    public final double read;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeDouble(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeDouble(this.RemoteActionCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzxv(double d, double d2) {
        this.read = d;
        this.RemoteActionCompatParcelizer = d2;
    }
}
