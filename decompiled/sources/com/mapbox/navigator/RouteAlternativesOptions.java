package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class RouteAlternativesOptions implements Serializable {
    private final float minTimeBeforeManeuverSeconds;
    private final short requestIntervalSeconds;

    public float getMinTimeBeforeManeuverSeconds() {
        return this.minTimeBeforeManeuverSeconds;
    }

    public short getRequestIntervalSeconds() {
        return this.requestIntervalSeconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteAlternativesOptions(short s, float f) {
        this.requestIntervalSeconds = s;
        this.minTimeBeforeManeuverSeconds = f;
    }

    public String toString() {
        return "[requestIntervalSeconds: " + RecordUtils.fieldToString(Short.valueOf(this.requestIntervalSeconds)) + ", minTimeBeforeManeuverSeconds: " + RecordUtils.fieldToString(Float.valueOf(this.minTimeBeforeManeuverSeconds)) + "]";
    }

    public int hashCode() {
        return Objects.hash(Short.valueOf(this.requestIntervalSeconds), Float.valueOf(this.minTimeBeforeManeuverSeconds));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteAlternativesOptions routeAlternativesOptions = (RouteAlternativesOptions) obj;
        return this.requestIntervalSeconds == routeAlternativesOptions.requestIntervalSeconds && PartialEq.compare(this.minTimeBeforeManeuverSeconds, routeAlternativesOptions.minTimeBeforeManeuverSeconds);
    }
}
