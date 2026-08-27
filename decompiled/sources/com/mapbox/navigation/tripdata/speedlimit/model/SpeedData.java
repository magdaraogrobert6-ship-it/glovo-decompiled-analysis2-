package com.mapbox.navigation.tripdata.speedlimit.model;

import com.mapbox.navigation.base.formatter.UnitType;
import com.mapbox.navigation.base.speed.model.SpeedUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedData {
    public final SpeedUnit fromUnit;
    public final double speed;
    public final UnitType toUnit;

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.speed);
        return this.toUnit.hashCode() + ((this.fromUnit.hashCode() + (iHashCode * 31)) * 31);
    }

    public SpeedData(double d, SpeedUnit speedUnit, UnitType unitType) {
        speedUnit.getClass();
        unitType.getClass();
        this.speed = d;
        this.fromUnit = speedUnit;
        this.toUnit = unitType;
    }

    public final String toString() {
        return "SpeedData(speed=" + this.speed + ", fromUnit=" + this.fromUnit + ", toUnit=" + this.toUnit + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SpeedData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SpeedData speedData = (SpeedData) obj;
        return this.speed == speedData.speed && this.fromUnit == speedData.fromUnit && this.toUnit == speedData.toUnit;
    }
}
