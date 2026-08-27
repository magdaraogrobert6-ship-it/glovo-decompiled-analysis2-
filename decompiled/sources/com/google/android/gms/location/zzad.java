package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();
    private final boolean zza;
    private final com.google.android.gms.internal.location.zze zzb;

    public final String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("LocationAvailabilityRequest[");
        if (this.zza) {
            sbM.append("bypass, ");
        }
        if (this.zzb != null) {
            sbM.append("impersonation=");
            sbM.append(this.zzb);
            sbM.append(", ");
        }
        sbM.setLength(sbM.length() - 2);
        sbM.append(']');
        return sbM.toString();
    }

    public zzad(boolean z, com.google.android.gms.internal.location.zze zzeVar) {
        this.zza = z;
        this.zzb = zzeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.zzb, i);
        SQLite.serializer(i2, parcel);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        return this.zza == zzadVar.zza && TuplesKt.write(this.zzb, zzadVar.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }
}
