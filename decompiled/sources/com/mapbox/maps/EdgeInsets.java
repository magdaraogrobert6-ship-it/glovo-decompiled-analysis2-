package com.mapbox.maps;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class EdgeInsets implements Serializable {
    private final double bottom;
    private final double left;
    private final double right;
    private final double top;

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public EdgeInsets(double d, double d2, double d3, double d4) {
        this.top = d;
        this.left = d2;
        this.bottom = d3;
        this.right = d4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[top: ");
        m1$$ExternalSyntheticOutline0.m(this.top, ", left: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.left, ", bottom: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.bottom, ", right: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.right, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.top), Double.valueOf(this.left), Double.valueOf(this.bottom), Double.valueOf(this.right));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EdgeInsets.class != obj.getClass()) {
            return false;
        }
        EdgeInsets edgeInsets = (EdgeInsets) obj;
        return PartialEq.compare(this.top, edgeInsets.top) && PartialEq.compare(this.left, edgeInsets.left) && PartialEq.compare(this.bottom, edgeInsets.bottom) && PartialEq.compare(this.right, edgeInsets.right);
    }
}
