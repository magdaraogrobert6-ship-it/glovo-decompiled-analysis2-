package com.mapbox.navigation.core.trip.session.location;

import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.common.location.Location;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CorrectedLocationData {
    public final DRSensorFusionStatus drSensorFusionStatus;
    public final boolean isStill;
    public final Location location;

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.location.hashCode() * 31, 31, this.isStill);
        DRSensorFusionStatus dRSensorFusionStatus = this.drSensorFusionStatus;
        return iM + (dRSensorFusionStatus != null ? dRSensorFusionStatus.hashCode() : 0);
    }

    public CorrectedLocationData(Location location, boolean z, DRSensorFusionStatus dRSensorFusionStatus) {
        this.location = location;
        this.isStill = z;
        this.drSensorFusionStatus = dRSensorFusionStatus;
    }

    public final String toString() {
        return "CorrectedLocationData(location=" + this.location + ", isStill=" + this.isStill + ", drSensorFusionStatus=" + this.drSensorFusionStatus + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CorrectedLocationData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        CorrectedLocationData correctedLocationData = (CorrectedLocationData) obj;
        if (!this.location.equals(correctedLocationData.location) || this.isStill != correctedLocationData.isStill) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drSensorFusionStatus, correctedLocationData.drSensorFusionStatus}, getCieXyz.write())).booleanValue();
    }
}
