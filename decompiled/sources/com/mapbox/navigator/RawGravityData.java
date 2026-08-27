package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class RawGravityData implements Serializable {
    private final Point3d gravity;
    private final long monotonicTimestampNanoseconds;

    public Point3d getGravity() {
        return this.gravity;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.gravity, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public RawGravityData(Point3d point3d, long j) {
        this.gravity = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[gravity: ");
        sb.append(RecordUtils.fieldToString(this.gravity));
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
        RawGravityData rawGravityData = (RawGravityData) obj;
        return Objects.equals(this.gravity, rawGravityData.gravity) && this.monotonicTimestampNanoseconds == rawGravityData.monotonicTimestampNanoseconds;
    }
}
