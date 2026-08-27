package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class DRSensorFusionStatus implements Serializable {
    private final byte progressCorrectionBuckets;
    private final byte progressInitDistance;
    private final DRSensorFusionState state;

    public byte getProgressCorrectionBuckets() {
        return this.progressCorrectionBuckets;
    }

    public byte getProgressInitDistance() {
        return this.progressInitDistance;
    }

    public DRSensorFusionState getState() {
        return this.state;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.state, Byte.valueOf(this.progressInitDistance), Byte.valueOf(this.progressCorrectionBuckets));
    }

    public DRSensorFusionStatus(DRSensorFusionState dRSensorFusionState, byte b, byte b2) {
        this.state = dRSensorFusionState;
        this.progressInitDistance = b;
        this.progressCorrectionBuckets = b2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[state: ");
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", progressInitDistance: ");
        MediaSessionCompatQueueItem.serializer(this.progressInitDistance, sb, ", progressCorrectionBuckets: ");
        sb.append(RecordUtils.fieldToString(Byte.valueOf(this.progressCorrectionBuckets)));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DRSensorFusionStatus dRSensorFusionStatus = (DRSensorFusionStatus) obj;
        return Objects.equals(this.state, dRSensorFusionStatus.state) && this.progressInitDistance == dRSensorFusionStatus.progressInitDistance && this.progressCorrectionBuckets == dRSensorFusionStatus.progressCorrectionBuckets;
    }
}
