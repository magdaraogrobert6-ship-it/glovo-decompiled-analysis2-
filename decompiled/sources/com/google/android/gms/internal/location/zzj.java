package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.google.android.gms.location.zzs;
import com.google.android.gms.location.zzt;
import o.getNumPad8EK5gGoQ;
import o.getNumPadCommaEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzq(10);
    public final int IconCompatParcelizer;
    public final getNumPad8EK5gGoQ read;
    public final zzh serializer;
    public final zzt write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.serializer, i);
        zzt zztVar = this.write;
        SQLite.write(parcel, 3, zztVar == null ? null : zztVar.asBinder());
        getNumPad8EK5gGoQ getnumpad8ek5ggoq = this.read;
        SQLite.write(parcel, 4, getnumpad8ek5ggoq != null ? getnumpad8ek5ggoq.asBinder() : null);
        SQLite.serializer(i2, parcel);
    }

    public zzj(int i, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        this.IconCompatParcelizer = i;
        this.serializer = zzhVar;
        getNumPad8EK5gGoQ getnumpadcommaek5ggoq = null;
        this.write = iBinder == null ? null : zzs.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            getnumpadcommaek5ggoq = iInterfaceQueryLocalInterface instanceof getNumPad8EK5gGoQ ? (getNumPad8EK5gGoQ) iInterfaceQueryLocalInterface : new getNumPadCommaEK5gGoQ(iBinder2);
        }
        this.read = getnumpadcommaek5ggoq;
    }
}
