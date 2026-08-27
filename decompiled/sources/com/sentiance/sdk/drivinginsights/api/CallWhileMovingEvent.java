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
@Deprecated(since = "6.20.0")
public class CallWhileMovingEvent extends DrivingEvent {
    private final Float maxTraveledSpeedInMps;
    private final Float minTraveledSpeedInMps;

    public Float getMaxTraveledSpeedInMps() {
        return this.maxTraveledSpeedInMps;
    }

    public Float getMinTraveledSpeedInMps() {
        return this.minTraveledSpeedInMps;
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public String toString() {
        StringBuilder sb = new StringBuilder("CallWhileMovingEvent{maxTraveledSpeedInMps=");
        sb.append(this.maxTraveledSpeedInMps);
        sb.append(", minTraveledSpeedInMps=");
        sb.append(this.minTraveledSpeedInMps);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", waypoints=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.waypoints, '}');
    }

    public CallWhileMovingEvent(DateTime dateTime, DateTime dateTime2, Float f, Float f2) {
        this(dateTime, dateTime2, f, f2, Collections.EMPTY_LIST);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CallWhileMovingEvent callWhileMovingEvent = (CallWhileMovingEvent) obj;
        return Objects.equals(this.maxTraveledSpeedInMps, callWhileMovingEvent.maxTraveledSpeedInMps) && Objects.equals(this.minTraveledSpeedInMps, callWhileMovingEvent.minTraveledSpeedInMps);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public int hashCode() {
        int iHashCode = super.hashCode();
        return Objects.hash(Integer.valueOf(iHashCode), this.maxTraveledSpeedInMps, this.minTraveledSpeedInMps);
    }

    public CallWhileMovingEvent(DateTime dateTime, DateTime dateTime2, Float f, Float f2, List<Waypoint> list) {
        super(dateTime, dateTime2, list);
        this.maxTraveledSpeedInMps = f;
        this.minTraveledSpeedInMps = f2;
    }
}
