package com.mapbox.navigation.ui.maps.internal.camera;

import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class CachedRemainingPoints {
    public final RouteIndices indices;
    public final List remainingPointsOnCurrentStep;

    public final int hashCode() {
        return this.remainingPointsOnCurrentStep.hashCode() + (this.indices.hashCode() * 31);
    }

    public CachedRemainingPoints(RouteIndices routeIndices, List list) {
        this.indices = routeIndices;
        this.remainingPointsOnCurrentStep = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedRemainingPoints)) {
            return false;
        }
        CachedRemainingPoints cachedRemainingPoints = (CachedRemainingPoints) obj;
        return this.indices.equals(cachedRemainingPoints.indices) && this.remainingPointsOnCurrentStep.equals(cachedRemainingPoints.remainingPointsOnCurrentStep);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedRemainingPoints(indices=");
        sb.append(this.indices);
        sb.append(", remainingPointsOnCurrentStep=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.remainingPointsOnCurrentStep, ')');
    }
}
