package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class Projection implements Serializable {
    private final FixDirectedCoordinate coordinate;
    private final double distance;
    private final long id;
    private final double percentAlong;

    public FixDirectedCoordinate getCoordinate() {
        return this.coordinate;
    }

    public double getDistance() {
        return this.distance;
    }

    public long getId() {
        return this.id;
    }

    public double getPercentAlong() {
        return this.percentAlong;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Projection(long j, FixDirectedCoordinate fixDirectedCoordinate, double d, double d2) {
        this.id = j;
        this.coordinate = fixDirectedCoordinate;
        this.distance = d;
        this.percentAlong = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        af$$ExternalSyntheticOutline1.m(this.id, ", coordinate: ", sb);
        sb.append(RecordUtils.fieldToString(this.coordinate));
        sb.append(", distance: ");
        m1$$ExternalSyntheticOutline0.m(this.distance, ", percentAlong: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.percentAlong, "]", sb);
    }

    public int hashCode() {
        long j = this.id;
        return Objects.hash(Long.valueOf(j), this.coordinate, Double.valueOf(this.distance), Double.valueOf(this.percentAlong));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Projection projection = (Projection) obj;
        return this.id == projection.id && Objects.equals(this.coordinate, projection.coordinate) && PartialEq.compare(this.distance, projection.distance) && PartialEq.compare(this.percentAlong, projection.percentAlong);
    }
}
