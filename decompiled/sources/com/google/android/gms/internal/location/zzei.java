package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzy;
import com.google.android.gms.location.zzz;
import o.getNumPad8EK5gGoQ;
import o.getNumPadCommaEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new zzq(5);
    public final zzw IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final getNumPad8EK5gGoQ MediaSessionCompatQueueItem;
    public final PendingIntent RemoteActionCompatParcelizer;
    public final zzz read;
    public final int serializer;
    public final zzeg write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.write, i);
        zzz zzzVar = this.read;
        SQLite.write(parcel, 3, zzzVar == null ? null : zzzVar.asBinder());
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.RemoteActionCompatParcelizer, i);
        zzw zzwVar = this.IconCompatParcelizer;
        SQLite.write(parcel, 5, zzwVar == null ? null : zzwVar.asBinder());
        getNumPad8EK5gGoQ getnumpad8ek5ggoq = this.MediaSessionCompatQueueItem;
        SQLite.write(parcel, 6, getnumpad8ek5ggoq != null ? getnumpad8ek5ggoq.asBinder() : null);
        SQLite.serializer(parcel, 8, this.MediaMetadataCompat);
        SQLite.serializer(i2, parcel);
    }

    public zzei(int i, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.serializer = i;
        this.write = zzegVar;
        getNumPad8EK5gGoQ getnumpadcommaek5ggoq = null;
        this.read = iBinder != null ? zzy.zzb(iBinder) : null;
        this.RemoteActionCompatParcelizer = pendingIntent;
        this.IconCompatParcelizer = iBinder2 != null ? zzv.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            getnumpadcommaek5ggoq = iInterfaceQueryLocalInterface instanceof getNumPad8EK5gGoQ ? (getNumPad8EK5gGoQ) iInterfaceQueryLocalInterface : new getNumPadCommaEK5gGoQ(iBinder3);
        }
        this.MediaSessionCompatQueueItem = getnumpadcommaek5ggoq;
        this.MediaMetadataCompat = str;
    }
}
