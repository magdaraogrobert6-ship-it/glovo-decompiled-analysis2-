package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class WrongWayDrivingEvent extends DrivingEvent {
    public WrongWayDrivingEvent(DateTime dateTime, DateTime dateTime2) {
        this(dateTime, dateTime2, Collections.EMPTY_LIST);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public String toString() {
        return "WrongWayDrivingEvent{waypoints=" + this.waypoints + ", endTime=" + this.endTime + ", startTime=" + this.startTime + '}';
    }

    public WrongWayDrivingEvent(DateTime dateTime, DateTime dateTime2, List<Waypoint> list) {
        super(dateTime, dateTime2, list);
    }
}
