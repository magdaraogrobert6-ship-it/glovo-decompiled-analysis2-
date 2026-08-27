package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class GantryDistanceInfo implements Serializable {
    private final double distance;
    private final Position position;

    public double getDistance() {
        return this.distance;
    }

    public Position getPosition() {
        return this.position;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public GantryDistanceInfo(double d, Position position) {
        this.distance = d;
        this.position = position;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distance: ");
        m1$$ExternalSyntheticOutline0.m(this.distance, ", position: ", sb);
        sb.append(RecordUtils.fieldToString(this.position));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        double d = this.distance;
        return Objects.hash(Double.valueOf(d), this.position);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GantryDistanceInfo gantryDistanceInfo = (GantryDistanceInfo) obj;
        return PartialEq.compare(this.distance, gantryDistanceInfo.distance) && Objects.equals(this.position, gantryDistanceInfo.position);
    }
}
