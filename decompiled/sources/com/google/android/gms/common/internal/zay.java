package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new com.google.android.gms.common.api.zzd(25);
    public final int RemoteActionCompatParcelizer;
    public final GoogleSignInAccount read;
    public final Account serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.serializer, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.read, i);
        SQLite.serializer(i2, parcel);
    }

    public zay(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = account;
        this.write = i2;
        this.read = googleSignInAccount;
    }
}
