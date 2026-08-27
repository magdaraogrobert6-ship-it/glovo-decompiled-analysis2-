package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzq(16);
    public final int IconCompatParcelizer;
    public final long MediaDescriptionCompat;
    public String RatingCompat;
    public byte[] RemoteActionCompatParcelizer;
    public final String read;
    public final Bundle serializer;
    public final long write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeLong(this.write);
        SQLite.IconCompatParcelizer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 3, this.read);
        SQLite.IconCompatParcelizer(parcel, 4, this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 8);
        parcel.writeLong(this.MediaDescriptionCompat);
        SQLite.serializer(parcel, 7, this.RatingCompat);
        SQLite.serializer(i2, parcel);
    }

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.write = j;
        this.RemoteActionCompatParcelizer = bArr;
        this.read = str;
        this.serializer = bundle;
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat = j2;
        this.RatingCompat = str2;
    }
}
