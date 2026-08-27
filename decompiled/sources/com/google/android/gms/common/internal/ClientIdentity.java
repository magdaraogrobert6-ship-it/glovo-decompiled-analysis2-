package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new com.google.android.gms.common.api.zzd(20);
    public final String RemoteActionCompatParcelizer;
    public final int write;

    public final int hashCode() {
        return this.write;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public ClientIdentity(int i, String str) {
        this.write = i;
        this.RemoteActionCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.write == this.write && TuplesKt.write((Object) clientIdentity.RemoteActionCompatParcelizer, (Object) this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.write;
        int length = String.valueOf(i).length();
        String str = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}
