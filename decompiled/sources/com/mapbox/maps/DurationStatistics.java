package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public final class DurationStatistics implements Serializable {
    private final double maxMillis;
    private final double medianMillis;

    public double getMaxMillis() {
        return this.maxMillis;
    }

    public double getMedianMillis() {
        return this.medianMillis;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DurationStatistics(double d, double d2) {
        this.maxMillis = d;
        this.medianMillis = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[maxMillis: ");
        m1$$ExternalSyntheticOutline0.m(this.maxMillis, ", medianMillis: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.medianMillis, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.maxMillis), Double.valueOf(this.medianMillis));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DurationStatistics.class != obj.getClass()) {
            return false;
        }
        DurationStatistics durationStatistics = (DurationStatistics) obj;
        return PartialEq.compare(this.maxMillis, durationStatistics.maxMillis) && PartialEq.compare(this.medianMillis, durationStatistics.medianMillis);
    }
}
