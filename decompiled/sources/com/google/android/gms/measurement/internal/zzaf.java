package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzq(12);
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeLong(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzaf(long j, long j2, int i) {
        this.IconCompatParcelizer = j;
        this.write = i;
        this.RemoteActionCompatParcelizer = j2;
    }
}
