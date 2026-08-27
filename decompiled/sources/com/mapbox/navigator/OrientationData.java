package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes4.dex */
public class OrientationData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final Float pitch;
    private final Float roll;
    private final Float yaw;

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Float getPitch() {
        return this.pitch;
    }

    public Float getRoll() {
        return this.roll;
    }

    public Float getYaw() {
        return this.yaw;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.pitch, this.yaw, this.roll, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public OrientationData(Float f, Float f2, Float f3, long j) {
        this.pitch = f;
        this.yaw = f2;
        this.roll = f3;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[pitch: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.pitch, sb, ", yaw: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.yaw, sb, ", roll: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.roll, sb, ", monotonicTimestampNanoseconds: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrientationData orientationData = (OrientationData) obj;
        return Objects.equals(this.pitch, orientationData.pitch) && Objects.equals(this.yaw, orientationData.yaw) && Objects.equals(this.roll, orientationData.roll) && this.monotonicTimestampNanoseconds == orientationData.monotonicTimestampNanoseconds;
    }
}
