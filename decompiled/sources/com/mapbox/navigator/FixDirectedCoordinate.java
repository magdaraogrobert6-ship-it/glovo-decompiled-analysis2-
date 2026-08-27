package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class FixDirectedCoordinate implements Serializable {
    private final double bearing;
    private final double x;
    private final double y;

    public double getBearing() {
        return this.bearing;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public FixDirectedCoordinate(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.bearing = d3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[x: ");
        m1$$ExternalSyntheticOutline0.m(this.x, ", y: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.y, ", bearing: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.bearing, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.x), Double.valueOf(this.y), Double.valueOf(this.bearing));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FixDirectedCoordinate fixDirectedCoordinate = (FixDirectedCoordinate) obj;
        return PartialEq.compare(this.x, fixDirectedCoordinate.x) && PartialEq.compare(this.y, fixDirectedCoordinate.y) && PartialEq.compare(this.bearing, fixDirectedCoordinate.bearing);
    }
}
