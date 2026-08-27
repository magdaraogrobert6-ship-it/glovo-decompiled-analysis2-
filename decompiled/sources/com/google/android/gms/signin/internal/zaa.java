package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import o.accessgetNumPadCommacp;

/* JADX INFO: loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements accessgetNumPadCommacp {
    public static final Parcelable.Creator<zaa> CREATOR = new zzq(19);
    public final Intent IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.IconCompatParcelizer, i);
        SQLite.serializer(i2, parcel);
    }

    public zaa(int i, int i2, Intent intent) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
        this.IconCompatParcelizer = intent;
    }

    @Override // o.accessgetNumPadCommacp
    public final Status getStatus() {
        return this.serializer == 0 ? Status.IconCompatParcelizer : Status.serializer;
    }
}
