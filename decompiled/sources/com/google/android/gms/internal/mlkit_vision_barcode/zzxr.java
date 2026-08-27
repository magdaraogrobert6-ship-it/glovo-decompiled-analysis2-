package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new zzh(18);
    public final String IconCompatParcelizer;
    public final zzxq MediaBrowserCompatMediaItem;
    public final zzxq MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.write);
        SQLite.serializer(parcel, 2, this.serializer);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 4, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 5, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, this.MediaDescriptionCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, this.MediaBrowserCompatMediaItem, i);
        SQLite.serializer(i2, parcel);
    }

    public zzxr(String str, String str2, String str3, String str4, String str5, zzxq zzxqVar, zzxq zzxqVar2) {
        this.write = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.read = str5;
        this.MediaDescriptionCompat = zzxqVar;
        this.MediaBrowserCompatMediaItem = zzxqVar2;
    }
}
