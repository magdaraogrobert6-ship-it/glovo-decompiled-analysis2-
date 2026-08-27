package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class ValueOnEdge implements Serializable {
    private final double percentAlong;
    private final float shapeIndex;
    private final double value;

    public double getPercentAlong() {
        return this.percentAlong;
    }

    public float getShapeIndex() {
        return this.shapeIndex;
    }

    public double getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ValueOnEdge(float f, double d, double d2) {
        this.shapeIndex = f;
        this.percentAlong = d;
        this.value = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[shapeIndex: ");
        getBitmapFromCache.write(this.shapeIndex, ", percentAlong: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.percentAlong, ", value: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.value, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.shapeIndex), Double.valueOf(this.percentAlong), Double.valueOf(this.value));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValueOnEdge valueOnEdge = (ValueOnEdge) obj;
        return PartialEq.compare(this.shapeIndex, valueOnEdge.shapeIndex) && PartialEq.compare(this.percentAlong, valueOnEdge.percentAlong) && PartialEq.compare(this.value, valueOnEdge.value);
    }
}
