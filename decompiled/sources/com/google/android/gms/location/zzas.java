package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        int i2 = this.zza;
        int i3 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(i2);
        int i4 = this.zzb;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i4);
        int i5 = this.zzc;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(i5);
        int i6 = this.zzd;
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(i6);
        SQLite.serializer(i3, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.zza == zzasVar.zza && this.zzb == zzasVar.zzb && this.zzc == zzasVar.zzc && this.zzd == zzasVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length3 = String.valueOf(i3).length();
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i4).length() + 1);
        c8$$ExternalSyntheticOutline0.m(i, i2, "UserPreferredSleepWindow [startHour=", ", startMinute=", sb);
        c8$$ExternalSyntheticOutline0.m(i3, i4, ", endHour=", ", endMinute=", sb);
        sb.append("]");
        return sb.toString();
    }

    public zzas(int i, int i2, int i3, int i4) {
        accessgetSystemNavigationDowncp.serializer("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        accessgetSystemNavigationDowncp.serializer("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
        accessgetSystemNavigationDowncp.serializer("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
        accessgetSystemNavigationDowncp.serializer("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
        accessgetSystemNavigationDowncp.serializer("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }
}
