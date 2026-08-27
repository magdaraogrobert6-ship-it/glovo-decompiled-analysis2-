package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.FixedSizeIntrinsicsPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new FixedSizeIntrinsicsPlaceable(2);
    public final int IconCompatParcelizer;
    public final float MediaDescriptionCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeFloat(this.MediaDescriptionCompat);
        SQLite.serializer(i2, parcel);
    }

    public zzh(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.serializer = i3;
        this.write = z;
        this.RemoteActionCompatParcelizer = z2;
        this.MediaDescriptionCompat = f;
    }
}
