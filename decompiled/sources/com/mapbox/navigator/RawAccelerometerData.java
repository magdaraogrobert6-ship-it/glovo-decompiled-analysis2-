package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class RawAccelerometerData implements Serializable {
    private final Point3d acceleration;
    private final long monotonicTimestampNanoseconds;

    public Point3d getAcceleration() {
        return this.acceleration;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.acceleration, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public RawAccelerometerData(Point3d point3d, long j) {
        this.acceleration = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[acceleration: ");
        sb.append(RecordUtils.fieldToString(this.acceleration));
        sb.append(", monotonicTimestampNanoseconds: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawAccelerometerData rawAccelerometerData = (RawAccelerometerData) obj;
        return Objects.equals(this.acceleration, rawAccelerometerData.acceleration) && this.monotonicTimestampNanoseconds == rawAccelerometerData.monotonicTimestampNanoseconds;
    }
}
