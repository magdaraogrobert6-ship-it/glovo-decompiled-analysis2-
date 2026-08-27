package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzh(14);
    public zzq[] IconCompatParcelizer;
    public String[] MediaBrowserCompatMediaItem;
    public zzi[] MediaDescriptionCompat;
    public String RemoteActionCompatParcelizer;
    public zzn[] read;
    public zzp serializer;
    public String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.serializer, i);
        SQLite.serializer(parcel, 3, this.write);
        SQLite.serializer(parcel, 4, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 5, this.IconCompatParcelizer, i);
        SQLite.serializer(parcel, 6, this.read, i);
        SQLite.IconCompatParcelizer(parcel, 7, this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 8, this.MediaDescriptionCompat, i);
        SQLite.serializer(i2, parcel);
    }
}
