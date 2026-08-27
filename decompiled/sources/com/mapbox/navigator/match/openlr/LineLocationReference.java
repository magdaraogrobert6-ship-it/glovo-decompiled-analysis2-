package com.mapbox.navigator.match.openlr;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
public class LineLocationReference implements Serializable {
    private final double negativeOffset;
    private final List<LocationReferencePoint> points;
    private final double positiveOffset;

    public double getNegativeOffset() {
        return this.negativeOffset;
    }

    public List<LocationReferencePoint> getPoints() {
        return this.points;
    }

    public double getPositiveOffset() {
        return this.positiveOffset;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.points, Double.valueOf(this.positiveOffset), Double.valueOf(this.negativeOffset));
    }

    public LineLocationReference(List<LocationReferencePoint> list, double d, double d2) {
        this.points = list;
        this.positiveOffset = d;
        this.negativeOffset = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[points: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.points, ", positiveOffset: ");
        m1$$ExternalSyntheticOutline0.m(this.positiveOffset, ", negativeOffset: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.negativeOffset, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLocationReference lineLocationReference = (LineLocationReference) obj;
        return Objects.equals(this.points, lineLocationReference.points) && PartialEq.compare(this.positiveOffset, lineLocationReference.positiveOffset) && PartialEq.compare(this.negativeOffset, lineLocationReference.negativeOffset);
    }
}
