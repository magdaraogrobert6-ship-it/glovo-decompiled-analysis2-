package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.LocationAvailability;
import kotlin.LazyKt__LazyJVMKt;
import o.ParentDataModifierDefaultImpls;
import o.getMinusEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdg extends zzb {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ ParentDataModifierDefaultImpls write;

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = this.serializer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.write;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i != 1) {
                    return false;
                }
                Status status = (Status) getMinusEK5gGoQ.read(parcel, Status.CREATOR);
                boolean z = parcel.readInt() != 0;
                getMinusEK5gGoQ.serializer(parcel);
                LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(status, Boolean.valueOf(z), parentDataModifierDefaultImpls);
                return true;
            }
            if (i != 1) {
                return false;
            }
            Status status2 = (Status) getMinusEK5gGoQ.read(parcel, Status.CREATOR);
            LocationAvailability locationAvailability = (LocationAvailability) getMinusEK5gGoQ.read(parcel, LocationAvailability.CREATOR);
            getMinusEK5gGoQ.serializer(parcel);
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(status2, locationAvailability, parentDataModifierDefaultImpls);
            return true;
        }
        if (i == 1) {
            int i4 = parcel.readInt();
            parcel.createStringArray();
            getMinusEK5gGoQ.serializer(parcel);
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(new Status(GeofenceStatusCodes.zza(i4), null, null, null), (Object) null, parentDataModifierDefaultImpls);
            return true;
        }
        if (i == 2) {
            int i5 = parcel.readInt();
            parcel.createStringArray();
            getMinusEK5gGoQ.serializer(parcel);
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(new Status(GeofenceStatusCodes.zza(i5), null, null, null), (Object) null, parentDataModifierDefaultImpls);
            return true;
        }
        if (i != 3) {
            return false;
        }
        int i6 = parcel.readInt();
        getMinusEK5gGoQ.serializer(parcel);
        LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(new Status(GeofenceStatusCodes.zza(i6), null, null, null), (Object) null, parentDataModifierDefaultImpls);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(int i, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
        this.serializer = i;
        if (i == 1) {
            this.write = parentDataModifierDefaultImpls;
            super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
        } else if (i != 2) {
            this.write = parentDataModifierDefaultImpls;
        } else {
            this.write = parentDataModifierDefaultImpls;
            super("com.google.android.gms.location.internal.IBooleanStatusCallback");
        }
    }
}
