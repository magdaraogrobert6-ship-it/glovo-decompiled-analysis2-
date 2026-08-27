package com.sentiance.sdk.feedback.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.publicapi.location.Coordinates;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@DontObfuscate
public class VehicleCrashDetectionFeedback {
    private final Coordinates crashLocation;
    private final Date eventDate;
    private final boolean wasCrashDetectedBySentiance;
    private final boolean wasRealCrash;

    public Coordinates getCrashLocation() {
        return this.crashLocation;
    }

    public Date getEventDate() {
        return this.eventDate;
    }

    public boolean wasCrashDetectedBySentiance() {
        return this.wasCrashDetectedBySentiance;
    }

    public boolean wasRealCrash() {
        return this.wasRealCrash;
    }

    public int hashCode() {
        Date date = this.eventDate;
        boolean z = this.wasRealCrash;
        boolean z2 = this.wasCrashDetectedBySentiance;
        return Objects.hash(date, Boolean.valueOf(z), Boolean.valueOf(z2), this.crashLocation);
    }

    private VehicleCrashDetectionFeedback(Date date, boolean z, boolean z2, Coordinates coordinates) {
        this.eventDate = date;
        this.wasRealCrash = z;
        this.wasCrashDetectedBySentiance = z2;
        this.crashLocation = coordinates;
    }

    public static VehicleCrashDetectionFeedback crash(Date date, boolean z, Coordinates coordinates) {
        return new VehicleCrashDetectionFeedback(date, true, z, coordinates);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback = (VehicleCrashDetectionFeedback) obj;
        return this.wasRealCrash == vehicleCrashDetectionFeedback.wasRealCrash && this.wasCrashDetectedBySentiance == vehicleCrashDetectionFeedback.wasCrashDetectedBySentiance && Objects.equals(this.eventDate, vehicleCrashDetectionFeedback.eventDate) && Objects.equals(this.crashLocation, vehicleCrashDetectionFeedback.crashLocation);
    }

    public static VehicleCrashDetectionFeedback noCrash(Date date) {
        return new VehicleCrashDetectionFeedback(date, false, true);
    }

    public String toString() {
        return "VehicleCrashDetectionFeedback{eventDate=" + this.eventDate + ", wasRealCrash=" + this.wasRealCrash + ", wasCrashDetectedBySentiance=" + this.wasCrashDetectedBySentiance + ", crashLocation=" + this.crashLocation + '}';
    }

    private VehicleCrashDetectionFeedback(Date date, boolean z, boolean z2) {
        this(date, z, z2, null);
    }
}
