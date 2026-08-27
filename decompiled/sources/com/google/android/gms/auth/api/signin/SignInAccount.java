package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd(19);
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final GoogleSignInAccount serializer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 4, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, this.serializer, i);
        SQLite.serializer(parcel, 8, this.RemoteActionCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.serializer = googleSignInAccount;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "8.3 and 8.4 SDKs require non-null email");
        this.read = str;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.RemoteActionCompatParcelizer = str2;
    }
}
