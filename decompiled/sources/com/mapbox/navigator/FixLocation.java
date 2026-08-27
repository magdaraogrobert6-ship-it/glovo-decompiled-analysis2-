package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
public class FixLocation implements Serializable {
    private final Float accuracyHorizontal;
    private final Float altitude;
    private final Float bearing;
    private final Float bearingAccuracy;
    private final Point coordinate;
    private final HashMap<String, Value> extras;
    private final boolean isMock;
    private final long monotonicTimestampNanoseconds;
    private final String provider;
    private final Float speed;
    private final Float speedAccuracy;
    private final Date time;
    private final Float verticalAccuracy;

    public Float getAccuracyHorizontal() {
        return this.accuracyHorizontal;
    }

    public Float getAltitude() {
        return this.altitude;
    }

    public Float getBearing() {
        return this.bearing;
    }

    public Float getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public Point getCoordinate() {
        return this.coordinate;
    }

    public HashMap<String, Value> getExtras() {
        return this.extras;
    }

    public boolean getIsMock() {
        return this.isMock;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public String getProvider() {
        return this.provider;
    }

    public Float getSpeed() {
        return this.speed;
    }

    public Float getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public Date getTime() {
        return this.time;
    }

    public Float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        Point point = this.coordinate;
        long j = this.monotonicTimestampNanoseconds;
        return Objects.hash(point, Long.valueOf(j), this.time, this.speed, this.bearing, this.altitude, this.accuracyHorizontal, this.provider, this.bearingAccuracy, this.speedAccuracy, this.verticalAccuracy, this.extras, Boolean.valueOf(this.isMock));
    }

    public FixLocation(Point point, long j, Date date, Float f, Float f2, Float f3, Float f4, String str, Float f5, Float f6, Float f7, HashMap<String, Value> map, boolean z) {
        this.coordinate = point;
        this.monotonicTimestampNanoseconds = j;
        this.time = date;
        this.speed = f;
        this.bearing = f2;
        this.altitude = f3;
        this.accuracyHorizontal = f4;
        this.provider = str;
        this.bearingAccuracy = f5;
        this.speedAccuracy = f6;
        this.verticalAccuracy = f7;
        this.extras = map;
        this.isMock = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[coordinate: ");
        c8$$ExternalSyntheticOutline0.m(this.coordinate, sb, ", monotonicTimestampNanoseconds: ");
        af$$ExternalSyntheticOutline1.m(this.monotonicTimestampNanoseconds, ", time: ", sb);
        sb.append(RecordUtils.fieldToString(this.time));
        sb.append(", speed: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.speed, sb, ", bearing: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.bearing, sb, ", altitude: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.altitude, sb, ", accuracyHorizontal: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.accuracyHorizontal, sb, ", provider: ");
        IconCompatParcelizer.read(sb, this.provider, ", bearingAccuracy: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.bearingAccuracy, sb, ", speedAccuracy: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.speedAccuracy, sb, ", verticalAccuracy: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.verticalAccuracy, sb, ", extras: ");
        sb.append(RecordUtils.fieldToString(this.extras));
        sb.append(", isMock: ");
        return ff$$ExternalSyntheticOutline0.m(this.isMock, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FixLocation fixLocation = (FixLocation) obj;
        return Objects.equals(this.coordinate, fixLocation.coordinate) && this.monotonicTimestampNanoseconds == fixLocation.monotonicTimestampNanoseconds && Objects.equals(this.time, fixLocation.time) && Objects.equals(this.speed, fixLocation.speed) && Objects.equals(this.bearing, fixLocation.bearing) && Objects.equals(this.altitude, fixLocation.altitude) && Objects.equals(this.accuracyHorizontal, fixLocation.accuracyHorizontal) && Objects.equals(this.provider, fixLocation.provider) && Objects.equals(this.bearingAccuracy, fixLocation.bearingAccuracy) && Objects.equals(this.speedAccuracy, fixLocation.speedAccuracy) && Objects.equals(this.verticalAccuracy, fixLocation.verticalAccuracy) && Objects.equals(this.extras, fixLocation.extras) && this.isMock == fixLocation.isMock;
    }
}
