package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import o.accessgetNumPadCommacp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable implements accessgetNumPadCommacp {
    public static final Parcelable.Creator<zzl> CREATOR = new zzq(11);
    public final Status read;

    @Override // o.accessgetNumPadCommacp
    public final Status getStatus() {
        return this.read;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, this.read, i);
        SQLite.serializer(i2, parcel);
    }

    public zzl(Status status) {
        this.read = status;
    }
}
