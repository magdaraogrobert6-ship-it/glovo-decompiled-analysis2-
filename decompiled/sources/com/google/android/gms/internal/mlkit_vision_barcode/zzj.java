package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzh(11);
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public String MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int i3 = this.RemoteActionCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.IconCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(i4);
        int i5 = this.write;
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(i5);
        int i6 = this.read;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(i6);
        int i7 = this.serializer;
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(i7);
        int i8 = this.MediaBrowserCompatMediaItem;
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeInt(i8);
        boolean z = this.MediaSessionCompatQueueItem;
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.serializer(parcel, 9, this.MediaMetadataCompat);
        SQLite.serializer(i2, parcel);
    }
}
