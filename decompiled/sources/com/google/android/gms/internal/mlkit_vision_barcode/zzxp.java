package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new zzh(13);
    public final int RemoteActionCompatParcelizer;
    public final String[] read;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.IconCompatParcelizer(parcel, 2, this.read);
        SQLite.serializer(i2, parcel);
    }

    public zzxp(String[] strArr, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = strArr;
    }
}
