package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzh(12);
    public String IconCompatParcelizer;
    public zzj MediaBrowserCompatMediaItem;
    public zzj MediaMetadataCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.write);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 4, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 5, this.read);
        SQLite.serializer(parcel, 6, this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, this.MediaMetadataCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, this.MediaBrowserCompatMediaItem, i);
        SQLite.serializer(i2, parcel);
    }
}
