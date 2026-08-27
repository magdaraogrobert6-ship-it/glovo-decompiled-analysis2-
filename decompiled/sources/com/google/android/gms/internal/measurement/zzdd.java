package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zza(7);
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final Bundle read;
    public final long serializer;
    public final long write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeLong(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        SQLite.IconCompatParcelizer(parcel, 7, this.read);
        SQLite.serializer(parcel, 8, this.RemoteActionCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzdd(long j, long j2, boolean z, Bundle bundle, String str) {
        this.serializer = j;
        this.write = j2;
        this.IconCompatParcelizer = z;
        this.read = bundle;
        this.RemoteActionCompatParcelizer = str;
    }
}
