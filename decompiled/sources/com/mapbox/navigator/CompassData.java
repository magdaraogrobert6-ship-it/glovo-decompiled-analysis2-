package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes4.dex */
public class CompassData implements Serializable {
    private final Float headingAccuracy;
    private final Float magneticHeading;
    private final long monotonicTimestampNanoseconds;
    private final Point3d rawGeomagneticData;
    private final Float trueHeading;

    public Float getHeadingAccuracy() {
        return this.headingAccuracy;
    }

    public Float getMagneticHeading() {
        return this.magneticHeading;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Point3d getRawGeomagneticData() {
        return this.rawGeomagneticData;
    }

    public Float getTrueHeading() {
        return this.trueHeading;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.magneticHeading, this.trueHeading, this.headingAccuracy, this.rawGeomagneticData, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public CompassData(Float f, Float f2, Float f3, Point3d point3d, long j) {
        this.magneticHeading = f;
        this.trueHeading = f2;
        this.headingAccuracy = f3;
        this.rawGeomagneticData = point3d;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[magneticHeading: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.magneticHeading, sb, ", trueHeading: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.trueHeading, sb, ", headingAccuracy: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.headingAccuracy, sb, ", rawGeomagneticData: ");
        sb.append(RecordUtils.fieldToString(this.rawGeomagneticData));
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
        CompassData compassData = (CompassData) obj;
        return Objects.equals(this.magneticHeading, compassData.magneticHeading) && Objects.equals(this.trueHeading, compassData.trueHeading) && Objects.equals(this.headingAccuracy, compassData.headingAccuracy) && Objects.equals(this.rawGeomagneticData, compassData.rawGeomagneticData) && this.monotonicTimestampNanoseconds == compassData.monotonicTimestampNanoseconds;
    }
}
