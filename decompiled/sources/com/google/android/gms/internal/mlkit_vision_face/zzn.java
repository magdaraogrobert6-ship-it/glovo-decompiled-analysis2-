package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.FixedSizeIntrinsicsPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new FixedSizeIntrinsicsPlaceable(3);
    public final float IconCompatParcelizer;
    public final float read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeFloat(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeFloat(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.serializer);
        SQLite.serializer(i2, parcel);
    }

    public zzn(float f, float f2, int i, int i2) {
        this.write = i;
        this.read = f;
        this.IconCompatParcelizer = f2;
        this.serializer = i2;
    }
}
