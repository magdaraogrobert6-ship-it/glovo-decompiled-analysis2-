package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzh(4);
    public int serializer;
    public String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int i3 = this.serializer;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i3);
        SQLite.serializer(parcel, 3, this.write);
        SQLite.serializer(i2, parcel);
    }
}
