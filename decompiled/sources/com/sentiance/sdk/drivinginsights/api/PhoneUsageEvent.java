package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class PhoneUsageEvent extends DrivingEvent {
    private final CallState callState;

    public enum CallState {
        UNAVAILABLE,
        NO_CALL,
        CALL_IN_PROGRESS
    }

    public CallState getCallState() {
        return this.callState;
    }

    public PhoneUsageEvent(DateTime dateTime, DateTime dateTime2) {
        this(dateTime, dateTime2, Collections.EMPTY_LIST, CallState.UNAVAILABLE);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public String toString() {
        return "PhoneUsageEvent{waypoints=" + this.waypoints + ", endTime=" + this.endTime + ", startTime=" + this.startTime + ", callState=" + this.callState + '}';
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return Objects.equals(this.callState, ((PhoneUsageEvent) obj).callState);
        }
        return false;
    }

    public PhoneUsageEvent(DateTime dateTime, DateTime dateTime2, List<Waypoint> list, CallState callState) {
        super(dateTime, dateTime2, list);
        this.callState = callState;
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public int hashCode() {
        int iHashCode = super.hashCode();
        return Objects.hash(Integer.valueOf(iHashCode), this.callState);
    }

    public PhoneUsageEvent(DateTime dateTime, DateTime dateTime2, List<Waypoint> list) {
        this(dateTime, dateTime2, list, CallState.UNAVAILABLE);
    }
}
