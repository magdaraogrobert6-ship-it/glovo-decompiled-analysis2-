package com.mapbox.navigation.core.internal.congestions.model;

import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.createNodeAt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$WrongFalsePositiveOverrideDetected extends createNodeAt {
    public final CongestionNumericOverride congestionNumericOverride;
    public final NavigationRoute route;

    public final int hashCode() {
        return this.congestionNumericOverride.hashCode() + (this.route.hashCode() * 31);
    }

    public SpeedAnalysisResult$WrongFalsePositiveOverrideDetected(NavigationRoute navigationRoute, CongestionNumericOverride congestionNumericOverride) {
        navigationRoute.getClass();
        this.route = navigationRoute;
        this.congestionNumericOverride = congestionNumericOverride;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected)) {
            return false;
        }
        SpeedAnalysisResult$WrongFalsePositiveOverrideDetected speedAnalysisResult$WrongFalsePositiveOverrideDetected = (SpeedAnalysisResult$WrongFalsePositiveOverrideDetected) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, speedAnalysisResult$WrongFalsePositiveOverrideDetected.route}, getCieXyz.write())).booleanValue() && this.congestionNumericOverride.equals(speedAnalysisResult$WrongFalsePositiveOverrideDetected.congestionNumericOverride);
    }

    public final String toString() {
        return "WrongFalsePositiveOverrideDetected(route=" + this.route + ", congestionNumericOverride=" + this.congestionNumericOverride + ')';
    }
}
