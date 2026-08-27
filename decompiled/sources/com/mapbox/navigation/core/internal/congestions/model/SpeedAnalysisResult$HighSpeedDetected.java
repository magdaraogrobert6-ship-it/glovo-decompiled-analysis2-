package com.mapbox.navigation.core.internal.congestions.model;

import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import o.createNodeAt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$HighSpeedDetected extends createNodeAt {
    public final float currentSpeed;
    public final RouteLegProgress legProgress;
    public final NavigationRoute route;

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.currentSpeed);
        return this.route.hashCode() + ((this.legProgress.hashCode() + (iHashCode * 31)) * 31);
    }

    public SpeedAnalysisResult$HighSpeedDetected(float f, RouteLegProgress routeLegProgress, NavigationRoute navigationRoute) {
        this.currentSpeed = f;
        this.legProgress = routeLegProgress;
        this.route = navigationRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedAnalysisResult$HighSpeedDetected)) {
            return false;
        }
        SpeedAnalysisResult$HighSpeedDetected speedAnalysisResult$HighSpeedDetected = (SpeedAnalysisResult$HighSpeedDetected) obj;
        if (!MetersPerSecond.m4783equalsimpl0(this.currentSpeed, speedAnalysisResult$HighSpeedDetected.currentSpeed) || !this.legProgress.equals(speedAnalysisResult$HighSpeedDetected.legProgress)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, speedAnalysisResult$HighSpeedDetected.route}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "HighSpeedDetected(currentSpeed=" + ((Object) MetersPerSecond.m4784toStringimpl(this.currentSpeed)) + ", legProgress=" + this.legProgress + ", route=" + this.route + ')';
    }
}
