package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzh(2);
    public double RemoteActionCompatParcelizer;
    public double write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        double d = this.write;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.RemoteActionCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeDouble(d2);
        SQLite.serializer(i2, parcel);
    }
}
