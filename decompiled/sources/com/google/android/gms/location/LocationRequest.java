package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputHdmi2cp;
import o.getNumPad0EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzaf();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final WorkSource zzm;
    private final com.google.android.gms.internal.location.zze zzn;

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzh = z;
        return this;
    }

    public final int zza() {
        return this.zzk;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final WorkSource zzc() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.location.zze zzd() {
        return this.zzn;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private boolean zzl;
        private WorkSource zzm;
        private com.google.android.gms.internal.location.zze zzn;

        public Builder setWaitForAccurateLocation(boolean z) {
            this.zzh = z;
            return this;
        }

        public final Builder zzb(boolean z) {
            this.zzl = z;
            return this;
        }

        public final Builder zzc(WorkSource workSource) {
            this.zzm = workSource;
            return this;
        }

        public Builder setGranularity(int i) {
            zzq.zza(i);
            this.zzj = i;
            return this;
        }

        public Builder setPriority(int i) {
            zzan.zza(i);
            this.zza = i;
            return this;
        }

        public final Builder zza(int i) {
            zzar.zza(i);
            this.zzk = i;
            return this;
        }

        public Builder(LocationRequest locationRequest) {
            this(locationRequest.getPriority(), locationRequest.getIntervalMillis());
            setMinUpdateIntervalMillis(locationRequest.getMinUpdateIntervalMillis());
            setMaxUpdateDelayMillis(locationRequest.getMaxUpdateDelayMillis());
            setDurationMillis(locationRequest.getDurationMillis());
            setMaxUpdates(locationRequest.getMaxUpdates());
            setMinUpdateDistanceMeters(locationRequest.getMinUpdateDistanceMeters());
            setWaitForAccurateLocation(locationRequest.isWaitForAccurateLocation());
            setMaxUpdateAgeMillis(locationRequest.getMaxUpdateAgeMillis());
            setGranularity(locationRequest.getGranularity());
            int iZza = locationRequest.zza();
            zzar.zza(iZza);
            this.zzk = iZza;
            this.zzl = locationRequest.zzb();
            this.zzm = locationRequest.zzc();
            com.google.android.gms.internal.location.zze zzeVarZzd = locationRequest.zzd();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzeVarZzd == null || zzeVarZzd.MediaDescriptionCompat == null);
            this.zzn = zzeVarZzd;
        }

        public LocationRequest build() {
            int i = this.zza;
            long j = this.zzb;
            long jMin = this.zzc;
            if (jMin == -1) {
                jMin = j;
            } else if (i != 105) {
                jMin = Math.min(jMin, j);
            }
            long jMax = Math.max(this.zzd, this.zzb);
            long j2 = this.zze;
            int i2 = this.zzf;
            float f = this.zzg;
            boolean z = this.zzh;
            long j3 = this.zzi;
            return new LocationRequest(i, j, jMin, jMax, Long.MAX_VALUE, j2, i2, f, z, j3 == -1 ? this.zzb : j3, this.zzj, this.zzk, this.zzl, new WorkSource(this.zzm), this.zzn);
        }

        public Builder setMaxUpdates(int i) {
            accessgetSystemNavigationDowncp.write("maxUpdates must be greater than 0", i > 0);
            this.zzf = i;
            return this;
        }

        public Builder setMinUpdateDistanceMeters(float f) {
            accessgetSystemNavigationDowncp.write("minUpdateDistanceMeters must be greater than or equal to 0", f >= 0.0f);
            this.zzg = f;
            return this;
        }

        public Builder setDurationMillis(long j) {
            accessgetSystemNavigationDowncp.write("durationMillis must be greater than 0", j > 0);
            this.zze = j;
            return this;
        }

        public Builder setIntervalMillis(long j) {
            accessgetSystemNavigationDowncp.write("intervalMillis must be greater than or equal to 0", j >= 0);
            this.zzb = j;
            return this;
        }

        public Builder setMaxUpdateDelayMillis(long j) {
            accessgetSystemNavigationDowncp.write("maxUpdateDelayMillis must be greater than or equal to 0", j >= 0);
            this.zzd = j;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j) {
            accessgetSystemNavigationDowncp.write("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j == -1 || j >= 0);
            this.zzi = j;
            return this;
        }

        public Builder setMinUpdateIntervalMillis(long j) {
            accessgetSystemNavigationDowncp.write("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j == -1 || j >= 0);
            this.zzc = j;
            return this;
        }

        public Builder(long j) {
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = false;
            this.zzm = null;
            this.zzn = null;
            setIntervalMillis(j);
        }

        public Builder(int i, long j) {
            this(j);
            setPriority(i);
        }
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "invalid numUpdates: ", new StringBuilder(String.valueOf(i).length() + 20)));
        return null;
    }

    public String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Request[");
        if (isPassive()) {
            sbM.append(zzan.zzb(this.zza));
            if (this.zzd > 0) {
                sbM.append("/");
                getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(this.zzd, sbM);
            }
        } else {
            sbM.append("@");
            boolean zIsBatched = isBatched();
            long j = this.zzb;
            if (zIsBatched) {
                getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(j, sbM);
                sbM.append("/");
                getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(this.zzd, sbM);
            } else {
                getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(j, sbM);
            }
            sbM.append(" ");
            sbM.append(zzan.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sbM.append(", minUpdateInterval=");
            sbM.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            sbM.append(", minUpdateDistance=");
            sbM.append(this.zzg);
        }
        boolean zIsPassive = isPassive();
        long j2 = this.zzi;
        if (!zIsPassive ? j2 != this.zzb : j2 != Long.MAX_VALUE) {
            sbM.append(", maxUpdateAge=");
            sbM.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sbM.append(", duration=");
            getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(this.zze, sbM);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sbM.append(", maxUpdates=");
            sbM.append(this.zzf);
        }
        if (this.zzk != 0) {
            sbM.append(", ");
            sbM.append(zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            sbM.append(", ");
            sbM.append(zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            sbM.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            sbM.append(", bypass");
        }
        if (!accessgetTvInputHdmi2cp.RemoteActionCompatParcelizer(this.zzm)) {
            sbM.append(", ");
            sbM.append(this.zzm);
        }
        if (this.zzn != null) {
            sbM.append(", impersonation=");
            sbM.append(this.zzn);
        }
        sbM.append(']');
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int priority = getPriority();
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(priority);
        long intervalMillis = getIntervalMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(intervalMillis);
        long minUpdateIntervalMillis = getMinUpdateIntervalMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(minUpdateIntervalMillis);
        int maxUpdates = getMaxUpdates();
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(maxUpdates);
        float minUpdateDistanceMeters = getMinUpdateDistanceMeters();
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeFloat(minUpdateDistanceMeters);
        long maxUpdateDelayMillis = getMaxUpdateDelayMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 8);
        parcel.writeLong(maxUpdateDelayMillis);
        boolean zIsWaitForAccurateLocation = isWaitForAccurateLocation();
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeInt(zIsWaitForAccurateLocation ? 1 : 0);
        long durationMillis = getDurationMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 10, 8);
        parcel.writeLong(durationMillis);
        long maxUpdateAgeMillis = getMaxUpdateAgeMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 11, 8);
        parcel.writeLong(maxUpdateAgeMillis);
        int granularity = getGranularity();
        SQLite.RemoteActionCompatParcelizer(parcel, 12, 4);
        parcel.writeInt(granularity);
        int i3 = this.zzk;
        SQLite.RemoteActionCompatParcelizer(parcel, 13, 4);
        parcel.writeInt(i3);
        boolean z = this.zzl;
        SQLite.RemoteActionCompatParcelizer(parcel, 15, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 16, this.zzm, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 17, this.zzn, i);
        SQLite.serializer(i2, parcel);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, com.google.android.gms.internal.location.zze zzeVar) {
        long j7;
        this.zza = i;
        if (i == 105) {
            this.zzb = Long.MAX_VALUE;
            j7 = j;
        } else {
            j7 = j;
            this.zzb = j7;
        }
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j7;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = z2;
        this.zzm = workSource;
        this.zzn = zzeVar;
    }

    @Deprecated
    public LocationRequest setPriority(int i) {
        zzan.zza(i);
        this.zza = i;
        return this;
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    @Deprecated
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zze;
        long j2 = jElapsedRealtime + j;
        if (((jElapsedRealtime ^ j2) & (j ^ j2)) < 0) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j) {
        accessgetSystemNavigationDowncp.serializer(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzc = j;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j) {
        accessgetSystemNavigationDowncp.serializer(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.zzd = j;
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.zza != locationRequest.zza) {
            return false;
        }
        if ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched()) {
            return (!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && TuplesKt.write(this.zzn, locationRequest.zzn);
        }
        return false;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 22);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int i = this.zza;
        long j = this.zzb;
        long j2 = this.zzc;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), this.zzm});
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = Math.max(1L, j - SystemClock.elapsedRealtime());
        return this;
    }

    public boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j) {
        accessgetSystemNavigationDowncp.write("durationMillis must be greater than 0", j > 0);
        this.zze = j;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j) {
        accessgetSystemNavigationDowncp.write("intervalMillis must be greater than or equal to 0", j >= 0);
        long j2 = this.zzc;
        long j3 = this.zzb;
        if (j2 == j3 / 6) {
            this.zzc = j / 6;
        }
        if (this.zzi == j3) {
            this.zzi = j;
        }
        this.zzb = j;
        return this;
    }

    private static String zze(long j) {
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        return getNumPad0EK5gGoQ.IconCompatParcelizer(j);
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
