package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class OdometryData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final float x;
    private final float y;
    private final float yawAngle;
    private final float z;

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getYawAngle() {
        return this.yawAngle;
    }

    public float getZ() {
        return this.z;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public OdometryData(float f, float f2, float f3, float f4, long j) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.yawAngle = f4;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[x: ");
        getBitmapFromCache.write(this.x, ", y: ", sb);
        getBitmapFromCache.write(this.y, ", z: ", sb);
        getBitmapFromCache.write(this.z, ", yawAngle: ", sb);
        getBitmapFromCache.write(this.yawAngle, ", monotonicTimestampNanoseconds: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z), Float.valueOf(this.yawAngle), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OdometryData odometryData = (OdometryData) obj;
        return PartialEq.compare(this.x, odometryData.x) && PartialEq.compare(this.y, odometryData.y) && PartialEq.compare(this.z, odometryData.z) && PartialEq.compare(this.yawAngle, odometryData.yawAngle) && this.monotonicTimestampNanoseconds == odometryData.monotonicTimestampNanoseconds;
    }
}
