package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class CallEvent extends DrivingEvent {
    private final HandsFreeState handsFreeState;
    private final Float maxTraveledSpeedInMps;
    private final Float minTraveledSpeedInMps;

    /* JADX INFO: loaded from: classes5.dex */
    public enum HandsFreeState {
        HANDS_FREE,
        HANDHELD,
        UNAVAILABLE
    }

    public HandsFreeState getHandsFreeState() {
        return this.handsFreeState;
    }

    public Float getMaxTraveledSpeedInMps() {
        return this.maxTraveledSpeedInMps;
    }

    public Float getMinTraveledSpeedInMps() {
        return this.minTraveledSpeedInMps;
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public String toString() {
        StringBuilder sb = new StringBuilder("CallEvent{maxTraveledSpeedInMps=");
        sb.append(this.maxTraveledSpeedInMps);
        sb.append(", minTraveledSpeedInMps=");
        sb.append(this.minTraveledSpeedInMps);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", handsFreeState=");
        sb.append(this.handsFreeState);
        sb.append(", waypoints=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.waypoints, '}');
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CallEvent callEvent = (CallEvent) obj;
        return Objects.equals(this.maxTraveledSpeedInMps, callEvent.maxTraveledSpeedInMps) && Objects.equals(this.minTraveledSpeedInMps, callEvent.minTraveledSpeedInMps) && Objects.equals(this.handsFreeState, callEvent.handsFreeState);
    }

    public CallEvent(DateTime dateTime, DateTime dateTime2, Float f, Float f2, HandsFreeState handsFreeState) {
        this(dateTime, dateTime2, f, f2, Collections.EMPTY_LIST, handsFreeState);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public int hashCode() {
        int iHashCode = super.hashCode();
        return Objects.hash(Integer.valueOf(iHashCode), this.maxTraveledSpeedInMps, this.minTraveledSpeedInMps, this.handsFreeState);
    }

    public CallEvent(DateTime dateTime, DateTime dateTime2, Float f, Float f2, List<Waypoint> list, HandsFreeState handsFreeState) {
        super(dateTime, dateTime2, list);
        this.maxTraveledSpeedInMps = f;
        this.minTraveledSpeedInMps = f2;
        this.handsFreeState = handsFreeState;
    }
}
