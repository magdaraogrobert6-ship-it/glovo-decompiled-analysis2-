package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzd(16);
    public final GoogleSignInOptions read;
    public final String serializer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, this.read, i);
        SQLite.serializer(i2, parcel);
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.serializer = str;
        this.read = googleSignInOptions;
    }

    public final int hashCode() {
        String str = this.serializer;
        int iHashCode = str == null ? 0 : str.hashCode();
        GoogleSignInOptions googleSignInOptions = this.read;
        return ((iHashCode + 31) * 31) + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.serializer.equals(signInConfiguration.serializer)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.read;
            GoogleSignInOptions googleSignInOptions2 = this.read;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }
}
