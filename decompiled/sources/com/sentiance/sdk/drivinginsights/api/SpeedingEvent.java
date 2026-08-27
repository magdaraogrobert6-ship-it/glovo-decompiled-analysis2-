package com.sentiance.sdk.drivinginsights.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class SpeedingEvent extends DrivingEvent {
    public SpeedingEvent(DateTime dateTime, DateTime dateTime2, List<Waypoint> list) {
        super(dateTime, dateTime2, list);
    }

    @Override // com.sentiance.sdk.drivinginsights.api.DrivingEvent
    public String toString() {
        StringBuilder sb = new StringBuilder("SpeedingEvent{startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", waypoints=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.waypoints, '}');
    }
}
