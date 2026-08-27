package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public abstract class DrivingEvent {
    protected final DateTime endTime;
    protected final DateTime startTime;
    protected final List<Waypoint> waypoints;

    public DateTime getEndTime() {
        return this.endTime;
    }

    public DateTime getStartTime() {
        return this.startTime;
    }

    public List<Waypoint> getWaypoints() {
        return this.waypoints;
    }

    public int hashCode() {
        return Objects.hash(this.startTime, this.endTime, this.waypoints);
    }

    public DrivingEvent(DateTime dateTime, DateTime dateTime2, List<Waypoint> list) {
        this.startTime = dateTime;
        this.endTime = dateTime2;
        this.waypoints = new ArrayList(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DrivingEvent{startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", waypoints=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.waypoints, '}');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrivingEvent drivingEvent = (DrivingEvent) obj;
        return Objects.equals(this.startTime, drivingEvent.startTime) && Objects.equals(this.endTime, drivingEvent.endTime) && Objects.equals(this.waypoints, drivingEvent.waypoints);
    }

    public DrivingEvent(DateTime dateTime, DateTime dateTime2) {
        this(dateTime, dateTime2, Collections.EMPTY_LIST);
    }
}
