package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzh(8);
    public boolean RemoteActionCompatParcelizer;
    public int read;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int i3 = this.read;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i3);
        boolean z = this.RemoteActionCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (this.read == zzahVar.read) {
            if (TuplesKt.write(Boolean.valueOf(this.RemoteActionCompatParcelizer), Boolean.valueOf(zzahVar.RemoteActionCompatParcelizer))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.read), Boolean.valueOf(this.RemoteActionCompatParcelizer)});
    }
}
