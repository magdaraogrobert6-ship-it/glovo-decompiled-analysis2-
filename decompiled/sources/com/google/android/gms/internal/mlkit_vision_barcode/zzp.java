package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzh(3);
    public String IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public String MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 3, this.read);
        SQLite.serializer(parcel, 4, this.serializer);
        SQLite.serializer(parcel, 5, this.write);
        SQLite.serializer(parcel, 6, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 7, this.MediaDescriptionCompat);
        SQLite.serializer(parcel, 8, this.MediaSessionCompatQueueItem);
        SQLite.serializer(i2, parcel);
    }
}
