package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class CorrectedLocationData implements Serializable {
    private final DRSensorFusionStatus drSensorFusionStatus;
    private final IMUDerivedData imuData;
    private final boolean isDeadReckoning;
    private final boolean isStill;
    private final FixLocation location;
    private final Integer satellitesCount;

    public DRSensorFusionStatus getDrSensorFusionStatus() {
        return this.drSensorFusionStatus;
    }

    public IMUDerivedData getImuData() {
        return this.imuData;
    }

    public boolean getIsDeadReckoning() {
        return this.isDeadReckoning;
    }

    public boolean getIsStill() {
        return this.isStill;
    }

    public FixLocation getLocation() {
        return this.location;
    }

    public Integer getSatellitesCount() {
        return this.satellitesCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        FixLocation fixLocation = this.location;
        boolean z = this.isStill;
        IMUDerivedData iMUDerivedData = this.imuData;
        boolean z2 = this.isDeadReckoning;
        return Objects.hash(fixLocation, Boolean.valueOf(z), iMUDerivedData, Boolean.valueOf(z2), this.satellitesCount, this.drSensorFusionStatus);
    }

    public CorrectedLocationData(FixLocation fixLocation, boolean z, IMUDerivedData iMUDerivedData, boolean z2, Integer num, DRSensorFusionStatus dRSensorFusionStatus) {
        this.location = fixLocation;
        this.isStill = z;
        this.imuData = iMUDerivedData;
        this.isDeadReckoning = z2;
        this.satellitesCount = num;
        this.drSensorFusionStatus = dRSensorFusionStatus;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[location: ");
        sb.append(RecordUtils.fieldToString(this.location));
        sb.append(", isStill: ");
        MediaSessionCompatQueueItem.write(sb, this.isStill, ", imuData: ");
        sb.append(RecordUtils.fieldToString(this.imuData));
        sb.append(", isDeadReckoning: ");
        MediaSessionCompatQueueItem.write(sb, this.isDeadReckoning, ", satellitesCount: ");
        SweepGradientShader9KIMszodefault.read(this.satellitesCount, ", drSensorFusionStatus: ", sb);
        sb.append(RecordUtils.fieldToString(this.drSensorFusionStatus));
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
        CorrectedLocationData correctedLocationData = (CorrectedLocationData) obj;
        return Objects.equals(this.location, correctedLocationData.location) && this.isStill == correctedLocationData.isStill && Objects.equals(this.imuData, correctedLocationData.imuData) && this.isDeadReckoning == correctedLocationData.isDeadReckoning && Objects.equals(this.satellitesCount, correctedLocationData.satellitesCount) && Objects.equals(this.drSensorFusionStatus, correctedLocationData.drSensorFusionStatus);
    }
}
