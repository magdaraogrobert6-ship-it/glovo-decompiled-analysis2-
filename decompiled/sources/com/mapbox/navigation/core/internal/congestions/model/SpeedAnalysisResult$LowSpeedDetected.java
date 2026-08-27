package com.mapbox.navigation.core.internal.congestions.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import o.createNodeAt;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$LowSpeedDetected extends createNodeAt {
    public final Integer currentCongestion;
    public final float currentSpeed;
    public final int expectedCongestion;
    public final float expectedSpeed;
    public final RouteLegProgress legProgress;
    public final long resultElapsedMilliseconds;
    public final NavigationRoute route;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.expectedSpeed, Float.hashCode(this.currentSpeed) * 31, 31);
        Integer num = this.currentCongestion;
        int iM2 = af$$ExternalSyntheticOutline0.m(this.expectedCongestion, (iM + (num == null ? 0 : num.hashCode())) * 31, 31);
        return Long.hashCode(this.resultElapsedMilliseconds) + ((this.route.hashCode() + ((this.legProgress.hashCode() + iM2) * 31)) * 31);
    }

    public SpeedAnalysisResult$LowSpeedDetected(float f, float f2, Integer num, int i, RouteLegProgress routeLegProgress, NavigationRoute navigationRoute, long j) {
        this.currentSpeed = f;
        this.expectedSpeed = f2;
        this.currentCongestion = num;
        this.expectedCongestion = i;
        this.legProgress = routeLegProgress;
        this.route = navigationRoute;
        this.resultElapsedMilliseconds = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedAnalysisResult$LowSpeedDetected)) {
            return false;
        }
        SpeedAnalysisResult$LowSpeedDetected speedAnalysisResult$LowSpeedDetected = (SpeedAnalysisResult$LowSpeedDetected) obj;
        if (!MetersPerSecond.m4783equalsimpl0(this.currentSpeed, speedAnalysisResult$LowSpeedDetected.currentSpeed) || !MetersPerSecond.m4783equalsimpl0(this.expectedSpeed, speedAnalysisResult$LowSpeedDetected.expectedSpeed)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currentCongestion, speedAnalysisResult$LowSpeedDetected.currentCongestion}, getCieXyz.write())).booleanValue() || this.expectedCongestion != speedAnalysisResult$LowSpeedDetected.expectedCongestion || !this.legProgress.equals(speedAnalysisResult$LowSpeedDetected.legProgress)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, speedAnalysisResult$LowSpeedDetected.route}, getCieXyz.write())).booleanValue() && this.resultElapsedMilliseconds == speedAnalysisResult$LowSpeedDetected.resultElapsedMilliseconds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LowSpeedDetected(currentSpeed=");
        sb.append((Object) MetersPerSecond.m4784toStringimpl(this.currentSpeed));
        sb.append(", expectedSpeed=");
        sb.append((Object) MetersPerSecond.m4784toStringimpl(this.expectedSpeed));
        sb.append(", currentCongestion=");
        sb.append(this.currentCongestion);
        sb.append(", expectedCongestion=");
        sb.append(this.expectedCongestion);
        sb.append(", legProgress=");
        sb.append(this.legProgress);
        sb.append(", route=");
        sb.append(this.route);
        sb.append(", resultElapsedMilliseconds=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.resultElapsedMilliseconds, ')');
    }
}
