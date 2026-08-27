package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzya extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzya> CREATOR = new zzh(27);
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.read);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.write);
        SQLite.serializer(i2, parcel);
    }

    public zzya(String str, String str2, int i) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = i;
    }
}
