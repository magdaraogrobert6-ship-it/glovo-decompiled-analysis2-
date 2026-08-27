package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class HarshDrivingEvent extends DrivingEvent {
    private final int confidence;
    private final double magnitude;
    private final Type type;

    @DontObfuscate
    public enum Type {
        ACCELERATION,
        BRAKING,
        TURN
    }

    public int getConfidence() {
        return this.confidence;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public Type getType() {
        return this.type;
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public String toString() {
        StringBuilder sb = new StringBuilder("HarshDrivingEvent{type=");
        sb.append(this.type);
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", magnitude=");
        sb.append(this.magnitude);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
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
        HarshDrivingEvent harshDrivingEvent = (HarshDrivingEvent) obj;
        return this.confidence == harshDrivingEvent.confidence && Double.compare(this.magnitude, harshDrivingEvent.magnitude) == 0 && this.type == harshDrivingEvent.type && Objects.equals(this.waypoints, harshDrivingEvent.waypoints);
    }

    public HarshDrivingEvent(DateTime dateTime, DateTime dateTime2, Type type, int i, double d) {
        this(dateTime, dateTime2, type, i, d, Collections.EMPTY_LIST);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public int hashCode() {
        int iHashCode = super.hashCode();
        Type type = this.type;
        int i = this.confidence;
        double d = this.magnitude;
        return Objects.hash(Integer.valueOf(iHashCode), type, Integer.valueOf(i), Double.valueOf(d), this.waypoints);
    }

    public HarshDrivingEvent(DateTime dateTime, DateTime dateTime2, Type type, int i, double d, List<Waypoint> list) {
        super(dateTime, dateTime2, list);
        this.type = type;
        this.confidence = i;
        this.magnitude = d;
    }
}
