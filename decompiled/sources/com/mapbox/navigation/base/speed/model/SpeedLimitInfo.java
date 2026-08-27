package com.mapbox.navigation.base.speed.model;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedLimitInfo {
    public final SpeedLimitSign sign;
    public final Integer speed;
    public final SpeedUnit unit;

    public SpeedLimitInfo(Integer num, SpeedUnit speedUnit, SpeedLimitSign speedLimitSign) {
        this.speed = num;
        this.unit = speedUnit;
        this.sign = speedLimitSign;
    }

    public final int hashCode() {
        Integer num = this.speed;
        return this.sign.hashCode() + ((this.unit.hashCode() + ((num != null ? num.intValue() : 0) * 31)) * 31);
    }

    public final String toString() {
        return "SpeedLimitInfo(speed=" + this.speed + ", unit=" + this.unit + ", sign=" + this.sign + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SpeedLimitInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SpeedLimitInfo speedLimitInfo = (SpeedLimitInfo) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.speed, speedLimitInfo.speed}, getCieXyz.write())).booleanValue() && this.unit == speedLimitInfo.unit && this.sign == speedLimitInfo.sign;
    }
}
