package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class SpeedLimitInfo implements Serializable {
    private final SpeedLimitRestriction restriction;
    private final SpeedLimitType type;
    private final SpeedLimitUnit unit;
    private final int value;

    public SpeedLimitRestriction getRestriction() {
        return this.restriction;
    }

    public SpeedLimitType getType() {
        return this.type;
    }

    public SpeedLimitUnit getUnit() {
        return this.unit;
    }

    public int getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SpeedLimitInfo(int i, SpeedLimitUnit speedLimitUnit, SpeedLimitType speedLimitType, SpeedLimitRestriction speedLimitRestriction) {
        this.value = i;
        this.unit = speedLimitUnit;
        this.type = speedLimitType;
        this.restriction = speedLimitRestriction;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[value: ");
        IconCompatParcelizer.write(this.value, ", unit: ", sb);
        sb.append(RecordUtils.fieldToString(this.unit));
        sb.append(", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", restriction: ");
        sb.append(RecordUtils.fieldToString(this.restriction));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int i = this.value;
        return Objects.hash(Integer.valueOf(i), this.unit, this.type, this.restriction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimitInfo speedLimitInfo = (SpeedLimitInfo) obj;
        return this.value == speedLimitInfo.value && Objects.equals(this.unit, speedLimitInfo.unit) && Objects.equals(this.type, speedLimitInfo.type) && Objects.equals(this.restriction, speedLimitInfo.restriction);
    }
}
