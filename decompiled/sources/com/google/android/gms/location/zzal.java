package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzal(int i, int i2, long j, long j2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int i3 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(i2);
        int i4 = this.zzb;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i4);
        long j = this.zzc;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(j);
        long j2 = this.zzd;
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 8);
        parcel.writeLong(j2);
        SQLite.serializer(i3, parcel);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzal)) {
            return false;
        }
        zzal zzalVar = (zzal) obj;
        return this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc)});
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        long j = this.zzd;
        int length3 = String.valueOf(j).length();
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        c8$$ExternalSyntheticOutline0.m(i, i2, "NetworkLocationStatus: Wifi status: ", " Cell status: ", sb);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, " elapsed time NS: ", j, " system time ms: ");
        sb.append(j2);
        return sb.toString();
    }
}
