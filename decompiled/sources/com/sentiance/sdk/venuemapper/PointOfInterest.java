package com.sentiance.sdk.venuemapper;

import com.sentiance.sdk.DontObfuscate;
import o.accessgetUserCachep;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class PointOfInterest {
    private PoiAddress mPoiAddress;
    private PoiLocation mPoiLocation;

    public PoiAddress getPoiAddress() {
        return this.mPoiAddress;
    }

    public PoiLocation getPoiLocation() {
        return this.mPoiLocation;
    }

    public static PointOfInterest fromThrift(accessgetUserCachep accessgetusercachep) {
        return new PointOfInterest(PoiAddress.fromThrift(accessgetusercachep.read), PoiLocation.fromThrift(accessgetusercachep.serializer));
    }

    public int hashCode() {
        return this.mPoiLocation.hashCode() + (this.mPoiAddress.hashCode() * 31);
    }

    public PointOfInterest(PoiAddress poiAddress, PoiLocation poiLocation) {
        this.mPoiAddress = poiAddress;
        this.mPoiLocation = poiLocation;
    }

    public String toString() {
        return "PointOfInterest{mPoiAddress=" + this.mPoiAddress + ", mPoiLocation=" + this.mPoiLocation + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointOfInterest pointOfInterest = (PointOfInterest) obj;
        if (this.mPoiAddress.equals(pointOfInterest.mPoiAddress)) {
            return this.mPoiLocation.equals(pointOfInterest.mPoiLocation);
        }
        return false;
    }
}
