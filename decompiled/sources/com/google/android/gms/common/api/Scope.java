package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zzd(0);
    public final String read;
    public final int write;

    public final String toString() {
        return this.read;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        SQLite.serializer(parcel, 2, this.read);
        SQLite.serializer(i2, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.read.equals(((Scope) obj).read);
    }

    public Scope(int i, String str) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "scopeUri must not be null or empty");
        this.write = i;
        this.read = str;
    }
}
