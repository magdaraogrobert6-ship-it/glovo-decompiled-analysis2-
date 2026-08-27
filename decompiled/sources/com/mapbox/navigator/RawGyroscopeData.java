package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class RawGyroscopeData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final Point3d rotationRate;

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Point3d getRotationRate() {
        return this.rotationRate;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.rotationRate, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public RawGyroscopeData(Point3d point3d, long j) {
        this.rotationRate = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[rotationRate: ");
        sb.append(RecordUtils.fieldToString(this.rotationRate));
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
        RawGyroscopeData rawGyroscopeData = (RawGyroscopeData) obj;
        return Objects.equals(this.rotationRate, rawGyroscopeData.rotationRate) && this.monotonicTimestampNanoseconds == rawGyroscopeData.monotonicTimestampNanoseconds;
    }
}
