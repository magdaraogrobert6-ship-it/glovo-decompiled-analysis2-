package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zza implements IInterface {
    public final String read;
    public final IBinder write;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.write;
    }

    public zza(IBinder iBinder, String str) {
        this.write = iBinder;
        this.read = str;
    }

    public final Parcel zzB(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.write.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.read);
        return parcelObtain;
    }
}
