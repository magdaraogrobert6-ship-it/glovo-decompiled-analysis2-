package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zzd(15);
    public final int IconCompatParcelizer;
    public final Bundle read;
    public final int serializer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.serializer);
        SQLite.IconCompatParcelizer(parcel, 3, this.read);
        SQLite.serializer(i2, parcel);
    }

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        this.read = bundle;
    }
}
