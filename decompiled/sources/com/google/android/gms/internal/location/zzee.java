package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new com.google.android.gms.common.zza(6);
    public final String IconCompatParcelizer;
    public final IBinder RemoteActionCompatParcelizer;
    public final PendingIntent read;
    public final IBinder serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.write(parcel, 2, this.serializer);
        SQLite.write(parcel, 3, this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.read, i);
        SQLite.serializer(parcel, 6, this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzee(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.write = i;
        this.serializer = iBinder;
        this.RemoteActionCompatParcelizer = iBinder2;
        this.read = pendingIntent;
        this.IconCompatParcelizer = str;
    }
}
