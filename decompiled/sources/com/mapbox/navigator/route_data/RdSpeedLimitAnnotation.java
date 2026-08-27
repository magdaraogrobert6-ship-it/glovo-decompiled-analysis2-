package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class RdSpeedLimitAnnotation implements Serializable {
    private final RdSpeedUnits units;
    private final Integer value;

    public RdSpeedUnits getUnits() {
        return this.units;
    }

    public Integer getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.units, this.value);
    }

    public RdSpeedLimitAnnotation(Integer num) {
        this.value = num;
        this.units = RdSpeedUnits.NONE;
    }

    public String toString() {
        return "[units: " + RecordUtils.fieldToString(this.units) + ", value: " + RecordUtils.fieldToString(this.value) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdSpeedLimitAnnotation rdSpeedLimitAnnotation = (RdSpeedLimitAnnotation) obj;
        return Objects.equals(this.units, rdSpeedLimitAnnotation.units) && Objects.equals(this.value, rdSpeedLimitAnnotation.value);
    }

    public RdSpeedLimitAnnotation(RdSpeedUnits rdSpeedUnits, Integer num) {
        this.units = rdSpeedUnits;
        this.value = num;
    }
}
