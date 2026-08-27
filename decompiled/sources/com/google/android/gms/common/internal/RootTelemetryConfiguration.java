package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zza(2);
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.read);
        SQLite.serializer(i2, parcel);
    }

    public RootTelemetryConfiguration(boolean z, int i, boolean z2, int i2, int i3) {
        this.write = i;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
        this.serializer = i2;
        this.read = i3;
    }
}
