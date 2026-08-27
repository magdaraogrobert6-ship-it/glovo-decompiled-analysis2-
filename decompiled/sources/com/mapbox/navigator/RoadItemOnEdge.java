package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class RoadItemOnEdge implements Serializable {
    private final double percentAlong;
    private final RoadItem roadItem;
    private final float shapeIndex;

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public RoadItem getRoadItem() {
        return this.roadItem;
    }

    public float getShapeIndex() {
        return this.shapeIndex;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RoadItemOnEdge(float f, double d, RoadItem roadItem) {
        this.shapeIndex = f;
        this.percentAlong = d;
        this.roadItem = roadItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[shapeIndex: ");
        getBitmapFromCache.write(this.shapeIndex, ", percentAlong: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.percentAlong, ", roadItem: ", sb);
        sb.append(RecordUtils.fieldToString(this.roadItem));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        float f = this.shapeIndex;
        double d = this.percentAlong;
        return Objects.hash(Float.valueOf(f), Double.valueOf(d), this.roadItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoadItemOnEdge roadItemOnEdge = (RoadItemOnEdge) obj;
        return PartialEq.compare(this.shapeIndex, roadItemOnEdge.shapeIndex) && PartialEq.compare(this.percentAlong, roadItemOnEdge.percentAlong) && Objects.equals(this.roadItem, roadItemOnEdge.roadItem);
    }
}
