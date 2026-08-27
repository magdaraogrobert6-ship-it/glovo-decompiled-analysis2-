package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import o.getNumLockEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new zzn();
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;
    private final long zza;
    private final boolean zzb;

    public static final class Builder {
        private long zza;
        private final boolean zzb;

        public DeviceOrientationRequest build() {
            return new DeviceOrientationRequest(this.zza, this.zzb);
        }

        public Builder(DeviceOrientationRequest deviceOrientationRequest) {
            this.zza = deviceOrientationRequest.zza();
            this.zzb = deviceOrientationRequest.zzb();
        }

        public Builder(long j) {
            this.zzb = false;
            setSamplingPeriodMicros(j);
        }

        public Builder setSamplingPeriodMicros(long j) {
            boolean z = j >= 0 && j < Long.MAX_VALUE;
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 102);
            sb.append("Invalid interval: ");
            sb.append(j);
            sb.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
            getNumLockEK5gGoQ.IconCompatParcelizer(sb.toString(), z);
            this.zza = j;
            return this;
        }
    }

    public long getSamplingPeriodMicros() {
        return this.zza;
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzb() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        long samplingPeriodMicros = getSamplingPeriodMicros();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(samplingPeriodMicros);
        boolean z = this.zzb;
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public DeviceOrientationRequest(long j, boolean z) {
        this.zza = j;
        this.zzb = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.zza == deviceOrientationRequest.zza && this.zzb == deviceOrientationRequest.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    public String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        String str = true != this.zzb ? "" : ", withVelocity";
        StringBuilder sb = new StringBuilder(str.length() + length + 46 + 1);
        sb.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(j);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
