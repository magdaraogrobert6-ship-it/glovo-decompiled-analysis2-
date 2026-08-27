package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class RouteIndices implements Serializable {
    private final int geometryIndex;
    private final int intersectionIndex;
    private final boolean isForkPointPassed;
    private final int legIndex;
    private final int legShapeIndex;
    private final RouteIdentifier routeId;
    private final int stepIndex;

    public int getGeometryIndex() {
        return this.geometryIndex;
    }

    public int getIntersectionIndex() {
        return this.intersectionIndex;
    }

    public boolean getIsForkPointPassed() {
        return this.isForkPointPassed;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public int getLegShapeIndex() {
        return this.legShapeIndex;
    }

    public RouteIdentifier getRouteId() {
        return this.routeId;
    }

    public int getStepIndex() {
        return this.stepIndex;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.routeId, Integer.valueOf(this.legIndex), Integer.valueOf(this.stepIndex), Integer.valueOf(this.geometryIndex), Integer.valueOf(this.legShapeIndex), Integer.valueOf(this.intersectionIndex), Boolean.valueOf(this.isForkPointPassed));
    }

    public RouteIndices(RouteIdentifier routeIdentifier, int i, int i2, int i3, int i4, int i5) {
        this.routeId = routeIdentifier;
        this.legIndex = i;
        this.stepIndex = i2;
        this.geometryIndex = i3;
        this.legShapeIndex = i4;
        this.intersectionIndex = i5;
        this.isForkPointPassed = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[routeId: ");
        sb.append(RecordUtils.fieldToString(this.routeId));
        sb.append(", legIndex: ");
        IconCompatParcelizer.write(this.legIndex, ", stepIndex: ", sb);
        IconCompatParcelizer.write(this.stepIndex, ", geometryIndex: ", sb);
        IconCompatParcelizer.write(this.geometryIndex, ", legShapeIndex: ", sb);
        IconCompatParcelizer.write(this.legShapeIndex, ", intersectionIndex: ", sb);
        IconCompatParcelizer.write(this.intersectionIndex, ", isForkPointPassed: ", sb);
        return ff$$ExternalSyntheticOutline0.m(this.isForkPointPassed, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteIndices routeIndices = (RouteIndices) obj;
        return Objects.equals(this.routeId, routeIndices.routeId) && this.legIndex == routeIndices.legIndex && this.stepIndex == routeIndices.stepIndex && this.geometryIndex == routeIndices.geometryIndex && this.legShapeIndex == routeIndices.legShapeIndex && this.intersectionIndex == routeIndices.intersectionIndex && this.isForkPointPassed == routeIndices.isForkPointPassed;
    }

    public RouteIndices(RouteIdentifier routeIdentifier, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.routeId = routeIdentifier;
        this.legIndex = i;
        this.stepIndex = i2;
        this.geometryIndex = i3;
        this.legShapeIndex = i4;
        this.intersectionIndex = i5;
        this.isForkPointPassed = z;
    }
}
