package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();
    private final long zza;
    private final boolean zzb;
    private final WorkSource zzc;
    private final String zzd;
    private final int[] zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private String zzi;

    public final zzb zza(String str) {
        this.zzi = str;
        return this;
    }

    public zzb(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.zza = j;
        this.zzb = z;
        this.zzc = workSource;
        this.zzd = str;
        this.zze = iArr;
        this.zzf = z2;
        this.zzg = str2;
        this.zzh = j2;
        this.zzi = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        int i2 = SQLite.read(20293, parcel);
        long j = this.zza;
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeLong(j);
        boolean z = this.zzb;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.zzc, i);
        SQLite.serializer(parcel, 4, this.zzd);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, this.zze);
        boolean z2 = this.zzf;
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SQLite.serializer(parcel, 7, this.zzg);
        long j2 = this.zzh;
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 8);
        parcel.writeLong(j2);
        SQLite.serializer(parcel, 9, this.zzi);
        SQLite.serializer(i2, parcel);
    }
}
