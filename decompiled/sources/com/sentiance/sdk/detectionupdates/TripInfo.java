package com.sentiance.sdk.detectionupdates;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.trip.TripType;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class TripInfo {
    private final TripType mTripType;

    public TripType getTripType() {
        return this.mTripType;
    }

    public int hashCode() {
        return this.mTripType.hashCode();
    }

    public TripInfo(TripType tripType) {
        this.mTripType = tripType;
    }

    public String toString() {
        return "TripInfo{type=" + this.mTripType.name() + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mTripType == ((TripInfo) obj).mTripType;
    }
}
