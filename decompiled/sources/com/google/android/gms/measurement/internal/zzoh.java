package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzq(15);
    public final int RemoteActionCompatParcelizer;
    public final String serializer;
    public final long write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzoh(String str, long j, int i) {
        this.serializer = str;
        this.write = j;
        this.RemoteActionCompatParcelizer = i;
    }
}
