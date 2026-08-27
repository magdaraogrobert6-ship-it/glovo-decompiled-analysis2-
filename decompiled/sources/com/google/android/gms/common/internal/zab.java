package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new com.google.android.gms.common.api.zzd(23);
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 2, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public zab(int i, int i2, long j, String str, boolean z) {
        this.RemoteActionCompatParcelizer = i;
        this.read = str;
        this.serializer = j;
        this.IconCompatParcelizer = i2;
        this.write = z;
    }
}
