package com.mapbox.navigation.core.trip.session.location;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class DRSensorFusionStatus {
    public final byte progressCorrectionBuckets;
    public final byte progressInitDistance;
    public final String state;

    public final int hashCode() {
        int iHashCode = this.state.hashCode();
        return (((iHashCode * 31) + this.progressInitDistance) * 31) + this.progressCorrectionBuckets;
    }

    public DRSensorFusionStatus(String str, byte b, byte b2) {
        this.state = str;
        this.progressInitDistance = b;
        this.progressCorrectionBuckets = b2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DRSensorFusionStatus(state='");
        sb.append(this.state);
        sb.append("', progressInitDistance=");
        sb.append((int) this.progressInitDistance);
        sb.append(", progressCorrectionBuckets=");
        return af$$ExternalSyntheticOutline0.m(sb, (int) this.progressCorrectionBuckets, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DRSensorFusionStatus.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DRSensorFusionStatus dRSensorFusionStatus = (DRSensorFusionStatus) obj;
        return this.state.equals(dRSensorFusionStatus.state) && this.progressInitDistance == dRSensorFusionStatus.progressInitDistance && this.progressCorrectionBuckets == dRSensorFusionStatus.progressCorrectionBuckets;
    }
}
