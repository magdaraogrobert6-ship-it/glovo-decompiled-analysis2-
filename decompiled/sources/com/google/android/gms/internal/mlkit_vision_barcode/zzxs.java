package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxs> CREATOR = new zzh(19);
    public final zzxu[] IconCompatParcelizer;
    public final String[] MediaBrowserCompatMediaItem;
    public final zzxp[] RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final zzxx[] read;
    public final String serializer;
    public final zzxw write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, this.write, i);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 3, this.serializer);
        SQLite.serializer(parcel, 4, this.read, i);
        SQLite.serializer(parcel, 5, this.IconCompatParcelizer, i);
        SQLite.IconCompatParcelizer(parcel, 6, this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 7, this.RatingCompat, i);
        SQLite.serializer(i2, parcel);
    }

    public zzxs(zzxw zzxwVar, String str, String str2, zzxx[] zzxxVarArr, zzxu[] zzxuVarArr, String[] strArr, zzxp[] zzxpVarArr) {
        this.write = zzxwVar;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.read = zzxxVarArr;
        this.IconCompatParcelizer = zzxuVarArr;
        this.MediaBrowserCompatMediaItem = strArr;
        this.RatingCompat = zzxpVarArr;
    }
}
