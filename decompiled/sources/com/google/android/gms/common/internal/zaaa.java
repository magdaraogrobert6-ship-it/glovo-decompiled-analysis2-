package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.TuplesKt;
import o.accessgetRcp;
import o.accessgetScrollLockcp;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new com.google.android.gms.common.api.zzd(21);
    public final int IconCompatParcelizer;
    public final IBinder RemoteActionCompatParcelizer;
    public final boolean read;
    public final ConnectionResult serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.write(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.serializer, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.read ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public zaaa(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = iBinder;
        this.serializer = connectionResult;
        this.read = z;
        this.write = z2;
    }

    public final accessgetScrollLockcp IconCompatParcelizer() {
        IBinder iBinder = this.RemoteActionCompatParcelizer;
        if (iBinder == null) {
            return null;
        }
        return accessgetRcp.write(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaaa)) {
            return false;
        }
        zaaa zaaaVar = (zaaa) obj;
        return this.serializer.equals(zaaaVar.serializer) && TuplesKt.write(IconCompatParcelizer(), zaaaVar.IconCompatParcelizer());
    }
}
