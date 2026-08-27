package com.mapbox.navigation.core.internal.congestions.model;

import bo.app.af$$ExternalSyntheticOutline0;
import o.createNodeAt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedAnalysisResult$SpeedMatchesCongestionLevel extends createNodeAt {
    public final Integer congestion;
    public final float currentSpeed;
    public final int expectedCongestionForCurrentSpeed;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.expectedCongestionForCurrentSpeed, Float.hashCode(this.currentSpeed) * 31, 31);
        Integer num = this.congestion;
        return iM + (num == null ? 0 : num.hashCode());
    }

    public SpeedAnalysisResult$SpeedMatchesCongestionLevel(float f, int i, Integer num) {
        this.currentSpeed = f;
        this.expectedCongestionForCurrentSpeed = i;
        this.congestion = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedAnalysisResult$SpeedMatchesCongestionLevel)) {
            return false;
        }
        SpeedAnalysisResult$SpeedMatchesCongestionLevel speedAnalysisResult$SpeedMatchesCongestionLevel = (SpeedAnalysisResult$SpeedMatchesCongestionLevel) obj;
        if (!MetersPerSecond.m4783equalsimpl0(this.currentSpeed, speedAnalysisResult$SpeedMatchesCongestionLevel.currentSpeed) || this.expectedCongestionForCurrentSpeed != speedAnalysisResult$SpeedMatchesCongestionLevel.expectedCongestionForCurrentSpeed) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.congestion, speedAnalysisResult$SpeedMatchesCongestionLevel.congestion}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SpeedMatchesCongestionLevel(currentSpeed=" + ((Object) MetersPerSecond.m4784toStringimpl(this.currentSpeed)) + ", expectedCongestionForCurrentSpeed=" + this.expectedCongestionForCurrentSpeed + ", congestion=" + this.congestion + ')';
    }
}
