package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zza(3);
    public Bundle RemoteActionCompatParcelizer;
    public int read;
    public ConnectionTelemetryConfiguration serializer;
    public Feature[] write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.IconCompatParcelizer(parcel, 1, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 2, this.write, i);
        int i3 = this.read;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(i3);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.serializer, i);
        SQLite.serializer(i2, parcel);
    }
}
