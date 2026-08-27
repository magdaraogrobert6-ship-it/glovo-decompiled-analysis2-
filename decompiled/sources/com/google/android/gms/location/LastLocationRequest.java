package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.getNumPad0EK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzaa();
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.location.zze zzd;

    public static final class Builder {
        private long zza;
        private int zzb;
        private final boolean zzc;
        private final com.google.android.gms.internal.location.zze zzd;

        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder(LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zza();
            this.zzd = lastLocationRequest.zzb();
        }

        public Builder setGranularity(int i) {
            zzq.zza(i);
            this.zzb = i;
            return this;
        }

        public Builder setMaxUpdateAgeMillis(long j) {
            accessgetSystemNavigationDowncp.write("maxUpdateAgeMillis must be greater than 0", j > 0);
            this.zza = j;
            return this;
        }

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
        }
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.location.zze zzb() {
        return this.zzd;
    }

    public String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sbM.append("maxAge=");
            getNumPad0EK5gGoQ.RemoteActionCompatParcelizer(this.zza, sbM);
        }
        if (this.zzb != 0) {
            sbM.append(", ");
            sbM.append(zzq.zzb(this.zzb));
        }
        if (this.zzc) {
            sbM.append(", bypass");
        }
        if (this.zzd != null) {
            sbM.append(", impersonation=");
            sbM.append(this.zzd);
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
        boolean z = this.zzc;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, this.zzd, i);
        SQLite.serializer(i2, parcel);
    }

    public LastLocationRequest(long j, int i, boolean z, com.google.android.gms.internal.location.zze zzeVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = zzeVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && TuplesKt.write(this.zzd, lastLocationRequest.zzd);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc)});
    }
}
