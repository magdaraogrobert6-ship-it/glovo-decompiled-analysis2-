package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public final class ProjectedMeters implements Serializable {
    private final double easting;
    private final double northing;

    public double getEasting() {
        return this.easting;
    }

    public double getNorthing() {
        return this.northing;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ProjectedMeters(double d, double d2) {
        this.northing = d;
        this.easting = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[northing: ");
        m1$$ExternalSyntheticOutline0.m(this.northing, ", easting: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.easting, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.northing), Double.valueOf(this.easting));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProjectedMeters.class != obj.getClass()) {
            return false;
        }
        ProjectedMeters projectedMeters = (ProjectedMeters) obj;
        return PartialEq.compare(this.northing, projectedMeters.northing) && PartialEq.compare(this.easting, projectedMeters.easting);
    }
}
