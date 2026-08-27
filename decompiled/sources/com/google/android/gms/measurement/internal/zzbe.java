package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.gtm.zzkh;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new zza(9);
    public final Bundle read;

    public final String IconCompatParcelizer() {
        return this.read.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzkh(this);
    }

    public final String toString() {
        return this.read.toString();
    }

    public final Bundle write() {
        return new Bundle(this.read);
    }

    public final Object write(String str) {
        return this.read.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.IconCompatParcelizer(parcel, 2, write());
        SQLite.serializer(i2, parcel);
    }

    public zzbe(Bundle bundle) {
        this.read = bundle;
    }

    public final Double RemoteActionCompatParcelizer() {
        return Double.valueOf(this.read.getDouble("value"));
    }
}
