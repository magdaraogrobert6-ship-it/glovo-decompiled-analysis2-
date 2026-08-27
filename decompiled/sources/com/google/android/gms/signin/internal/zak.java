package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zzq(22);
    public final zaaa IconCompatParcelizer;
    public final int read;
    public final ConnectionResult write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.write, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.IconCompatParcelizer, i);
        SQLite.serializer(i2, parcel);
    }

    public zak(int i, ConnectionResult connectionResult, zaaa zaaaVar) {
        this.read = i;
        this.write = connectionResult;
        this.IconCompatParcelizer = zaaaVar;
    }
}
