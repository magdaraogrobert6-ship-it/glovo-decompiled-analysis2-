package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class SpeedLimit implements Serializable {
    private final SpeedLimitSign localeSign;
    private final SpeedLimitUnit localeUnit;
    private final Integer speed;

    public SpeedLimitSign getLocaleSign() {
        return this.localeSign;
    }

    public SpeedLimitUnit getLocaleUnit() {
        return this.localeUnit;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.speed, this.localeUnit, this.localeSign);
    }

    public SpeedLimit(Integer num, SpeedLimitUnit speedLimitUnit, SpeedLimitSign speedLimitSign) {
        this.speed = num;
        this.localeUnit = speedLimitUnit;
        this.localeSign = speedLimitSign;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[speed: ");
        SweepGradientShader9KIMszodefault.read(this.speed, ", localeUnit: ", sb);
        sb.append(RecordUtils.fieldToString(this.localeUnit));
        sb.append(", localeSign: ");
        sb.append(RecordUtils.fieldToString(this.localeSign));
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
        SpeedLimit speedLimit = (SpeedLimit) obj;
        return Objects.equals(this.speed, speedLimit.speed) && Objects.equals(this.localeUnit, speedLimit.localeUnit) && Objects.equals(this.localeSign, speedLimit.localeSign);
    }
}
