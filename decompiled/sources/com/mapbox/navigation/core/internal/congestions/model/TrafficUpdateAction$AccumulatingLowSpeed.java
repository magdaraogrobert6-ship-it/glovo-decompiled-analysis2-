package com.mapbox.navigation.core.internal.congestions.model;

import bo.app.d$$ExternalSyntheticOutline0;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ignoreRemeasureRequests;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class TrafficUpdateAction$AccumulatingLowSpeed extends ignoreRemeasureRequests {
    public final long accumulationStart;
    public final SpeedAnalysisResult$LowSpeedDetected latestLowSpeedDetectedResult;
    public final long timeUntilUpdate;

    public final int hashCode() {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        return this.latestLowSpeedDetectedResult.hashCode() + d$$ExternalSyntheticOutline0.m(Long.hashCode(this.accumulationStart) * 31, 31, this.timeUntilUpdate);
    }

    public TrafficUpdateAction$AccumulatingLowSpeed(long j, long j2, SpeedAnalysisResult$LowSpeedDetected speedAnalysisResult$LowSpeedDetected) {
        this.accumulationStart = j;
        this.timeUntilUpdate = j2;
        this.latestLowSpeedDetectedResult = speedAnalysisResult$LowSpeedDetected;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficUpdateAction$AccumulatingLowSpeed)) {
            return false;
        }
        TrafficUpdateAction$AccumulatingLowSpeed trafficUpdateAction$AccumulatingLowSpeed = (TrafficUpdateAction$AccumulatingLowSpeed) obj;
        return BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(this.accumulationStart, trafficUpdateAction$AccumulatingLowSpeed.accumulationStart) && BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(this.timeUntilUpdate, trafficUpdateAction$AccumulatingLowSpeed.timeUntilUpdate) && this.latestLowSpeedDetectedResult.equals(trafficUpdateAction$AccumulatingLowSpeed.latestLowSpeedDetectedResult);
    }

    public final String toString() {
        return "AccumulatingLowSpeed(accumulationStart=" + ((Object) BrazeInAppMessageManagerExternalSyntheticLambda2.MediaBrowserCompatMediaItem(this.accumulationStart)) + ", timeUntilUpdate=" + ((Object) BrazeInAppMessageManagerExternalSyntheticLambda2.MediaBrowserCompatMediaItem(this.timeUntilUpdate)) + ", latestLowSpeedDetectedResult=" + this.latestLowSpeedDetectedResult + ')';
    }
}
