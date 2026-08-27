package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class AttitudeData implements Serializable {
    private final float pitch;
    private final float roll;
    private final float yaw;

    public float getPitch() {
        return this.pitch;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getYaw() {
        return this.yaw;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AttitudeData(float f, float f2, float f3) {
        this.pitch = f;
        this.yaw = f2;
        this.roll = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[pitch: ");
        getBitmapFromCache.write(this.pitch, ", yaw: ", sb);
        getBitmapFromCache.write(this.yaw, ", roll: ", sb);
        sb.append(RecordUtils.fieldToString(Float.valueOf(this.roll)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.pitch), Float.valueOf(this.yaw), Float.valueOf(this.roll));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttitudeData attitudeData = (AttitudeData) obj;
        return PartialEq.compare(this.pitch, attitudeData.pitch) && PartialEq.compare(this.yaw, attitudeData.yaw) && PartialEq.compare(this.roll, attitudeData.roll);
    }
}
