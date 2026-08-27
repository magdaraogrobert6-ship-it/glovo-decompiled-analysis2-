package com.sentiance.sdk.drivinginsights.api;

import android.content.Context;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.event.TransportEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class DrivingInsights {
    public static int serializer;
    public static int write;
    private final SafetyScores safetyScores;
    private final TransportEvent transportEvent;

    public SafetyScores getSafetyScores() {
        return this.safetyScores;
    }

    public TransportEvent getTransportEvent() {
        return this.transportEvent;
    }

    public int hashCode() {
        return Objects.hash(this.transportEvent, this.safetyScores);
    }

    public DrivingInsights(TransportEvent transportEvent, SafetyScores safetyScores) {
        this.transportEvent = transportEvent;
        this.safetyScores = safetyScores;
    }

    public String toString() {
        return "DrivingInsights{transportEvent=" + this.transportEvent + ", safetyScores=" + this.safetyScores + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrivingInsights drivingInsights = (DrivingInsights) obj;
        return Objects.equals(this.transportEvent, drivingInsights.transportEvent) && Objects.equals(this.safetyScores, drivingInsights.safetyScores);
    }

    public static int serializer() {
        int i = write;
        int i2 = i % 9486206;
        write = i + 1;
        if (i2 != 0) {
            return serializer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        serializer = i3;
        return i3;
    }
}
