package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputHdmi2cp;
import o.getNumPad0EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final boolean zze;
    private final int zzf;
    private final WorkSource zzg;
    private final com.google.android.gms.internal.location.zze zzh;

    public static final class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private final boolean zze;
        private final int zzf;
        private final WorkSource zzg;
        private final com.google.android.gms.internal.location.zze zzh;

        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, new WorkSource(this.zzg), this.zzh);
        }

        public Builder(CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zza();
            this.zzf = currentLocationRequest.zzb();
            this.zzg = new WorkSource(currentLocationRequest.zzc());
            this.zzh = currentLocationRequest.zzd();
        }

        public Builder setGranularity(int i) {
            zzq.zza(i);
            this.zzb = i;
            return this;
        }

        public Builder setPriority(int i) {
            zzan.zza(i);
            this.zzc = i;
            return this;
        }

        public Builder setDurationMillis(long j) {
            accessgetSystemNavigationDowncp.write("durationMillis must be greater than 0", j > 0);
            this.zzd = j;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j) {
            accessgetSystemNavigationDowncp.write("maxUpdateAgeMillis must be greater than or equal to 0", j >= 0);
            this.zza = j;
            return this;
        }

        public Builder() {
            this.zza = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = 0;
            this.zzg = null;
            this.zzh = null;
        }
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final WorkSource zzc() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.location.zze zzd() {
        return this.zzh;
    }

    public String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("CurrentLocationRequest[");
        sbM.append(zzan.zzb(this.zzc));
        if (this.zza != Long.MAX_VALUE) {
            sbM.append(", maxAge=");
            getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(this.zza, sbM);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sbM.append(", duration=");
            sbM.append(this.zzd);
            sbM.append("ms");
        }
        if (this.zzb != 0) {
            sbM.append(", ");
            sbM.append(zzq.zzb(this.zzb));
        }
        if (this.zze) {
            sbM.append(", bypass");
        }
        if (this.zzf != 0) {
            sbM.append(", ");
            sbM.append(zzar.zzb(this.zzf));
        }
        if (!accessgetTvInputHdmi2cp.RemoteActionCompatParcelizer(this.zzg)) {
            sbM.append(", workSource=");
            sbM.append(this.zzg);
        }
        if (this.zzh != null) {
            sbM.append(", impersonation=");
            sbM.append(this.zzh);
        }
        sbM.append(']');
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        long maxUpdateAgeMillis = getMaxUpdateAgeMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeLong(maxUpdateAgeMillis);
        int granularity = getGranularity();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(granularity);
        int priority = getPriority();
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(priority);
        long durationMillis = getDurationMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 8);
        parcel.writeLong(durationMillis);
        boolean z = this.zze;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, this.zzg, i);
        int i3 = this.zzf;
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeInt(i3);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, this.zzh, i);
        SQLite.serializer(i2, parcel);
    }

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, com.google.android.gms.internal.location.zze zzeVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = z;
        this.zzf = i3;
        this.zzg = workSource;
        this.zzh = zzeVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && TuplesKt.write(this.zzg, currentLocationRequest.zzg) && TuplesKt.write(this.zzh, currentLocationRequest.zzh);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd)});
    }
}
