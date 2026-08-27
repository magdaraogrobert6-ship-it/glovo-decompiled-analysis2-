package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.FixedSizeIntrinsicsPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new FixedSizeIntrinsicsPlaceable(6);
    public final int IconCompatParcelizer;
    public final float MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeFloat(this.MediaMetadataCompat);
        SQLite.serializer(i2, parcel);
    }

    public zzou(int i, int i2, int i3, int i4, boolean z, float f) {
        this.write = i;
        this.IconCompatParcelizer = i2;
        this.read = i3;
        this.serializer = i4;
        this.RemoteActionCompatParcelizer = z;
        this.MediaMetadataCompat = f;
    }
}
