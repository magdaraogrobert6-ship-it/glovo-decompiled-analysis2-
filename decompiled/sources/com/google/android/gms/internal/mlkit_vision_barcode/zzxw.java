package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxw> CREATOR = new zzh(23);
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.read);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 3, this.serializer);
        SQLite.serializer(parcel, 4, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 5, this.write);
        SQLite.serializer(parcel, 6, this.RatingCompat);
        SQLite.serializer(parcel, 7, this.MediaDescriptionCompat);
        SQLite.serializer(i2, parcel);
    }

    public zzxw(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = str3;
        this.IconCompatParcelizer = str4;
        this.write = str5;
        this.RatingCompat = str6;
        this.MediaDescriptionCompat = str7;
    }
}
