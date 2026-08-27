package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxq> CREATOR = new zzh(17);
    public final int IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(this.RatingCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeInt(this.MediaSessionCompatQueueItem ? 1 : 0);
        SQLite.serializer(parcel, 8, this.MediaDescriptionCompat);
        SQLite.serializer(i2, parcel);
    }

    public zzxq(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.serializer = i;
        this.read = i2;
        this.write = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.IconCompatParcelizer = i5;
        this.RatingCompat = i6;
        this.MediaSessionCompatQueueItem = z;
        this.MediaDescriptionCompat = str;
    }
}
