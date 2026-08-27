package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TuplesKt;
import o.accessgetTvInputHdmi2cp;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzq(4);
    public final LocationRequest IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, this.IconCompatParcelizer, i);
        SQLite.serializer(i2, parcel);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return TuplesKt.write(this.IconCompatParcelizer, ((zzeg) obj).IconCompatParcelizer);
        }
        return false;
    }

    public zzeg(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        WorkSource workSource;
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    accessgetTvInputHdmi2cp.serializer(workSource, clientIdentity.write, clientIdentity.RemoteActionCompatParcelizer);
                }
            }
            builder.zzc(workSource);
        }
        if (z) {
            builder.setGranularity(1);
        }
        if (z2) {
            builder.zza(2);
        }
        if (z3) {
            builder.zzb(true);
        }
        if (z4) {
            builder.setWaitForAccurateLocation(true);
        }
        if (j != Long.MAX_VALUE) {
            builder.setMaxUpdateAgeMillis(j);
        }
        this.IconCompatParcelizer = builder.build();
    }

    public static zzeg read(LocationRequest locationRequest) {
        return new zzeg(locationRequest, null, false, false, false, false, Long.MAX_VALUE);
    }
}
