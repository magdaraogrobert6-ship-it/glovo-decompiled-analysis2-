package com.sentiance.sdk;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class SdkStatus implements Cloneable {
    public boolean canDetect;
    public DetectionStatus detectionStatus;
    public QuotaStatus diskQuotaStatus;
    public boolean isAccelPresent;
    public boolean isActivityRecognitionPermGranted;
    public boolean isAirplaneModeEnabled;
    public boolean isBackgroundProcessingRestricted;
    public boolean isBatteryOptimizationEnabled;
    public boolean isBatterySavingEnabled;
    public boolean isGooglePlayServicesMissing;
    public boolean isGpsPresent;
    public boolean isGyroPresent;
    public boolean isLocationAvailable;
    public boolean isPreciseLocationPermGranted;
    public boolean isRemoteEnabled;
    public boolean isSchedulingExactAlarmsPermitted;
    public LocationPermission locationPermission;
    public LocationSetting locationSetting;
    public QuotaStatus mobileQuotaStatus;
    public StartStatus startStatus;
    public boolean userExists;
    public QuotaStatus wifiQuotaStatus;

    @DontObfuscate
    public enum LocationPermission {
        ALWAYS,
        ONLY_WHILE_IN_USE,
        NEVER
    }

    @DontObfuscate
    public enum LocationSetting {
        OK,
        DISABLED,
        BATTERY_SAVING,
        DEVICE_ONLY
    }

    @DontObfuscate
    public enum QuotaStatus {
        OK,
        WARNING,
        EXCEEDED
    }

    @Deprecated
    @DontObfuscate
    public enum StartStatus {
        NOT_STARTED,
        PENDING,
        STARTED,
        START_EXPIRED
    }

    public int hashCode() {
        int iHashCode = this.startStatus.hashCode();
        boolean z = this.canDetect;
        boolean z2 = this.isRemoteEnabled;
        boolean z3 = this.isPreciseLocationPermGranted;
        boolean z4 = this.isActivityRecognitionPermGranted;
        int iHashCode2 = this.locationSetting.hashCode();
        boolean z5 = this.isAirplaneModeEnabled;
        boolean z6 = this.isLocationAvailable;
        boolean z7 = this.isAccelPresent;
        boolean z8 = this.isGyroPresent;
        boolean z9 = this.isGpsPresent;
        boolean z10 = this.isGooglePlayServicesMissing;
        boolean z11 = this.isBatteryOptimizationEnabled;
        boolean z12 = this.isBatterySavingEnabled;
        boolean z13 = this.isBackgroundProcessingRestricted;
        boolean z14 = this.isSchedulingExactAlarmsPermitted;
        boolean z15 = this.userExists;
        int iHashCode3 = this.wifiQuotaStatus.hashCode();
        int iHashCode4 = this.mobileQuotaStatus.hashCode();
        return this.locationPermission.hashCode() + ((this.diskQuotaStatus.hashCode() + ((iHashCode4 + ((iHashCode3 + ((((((((((((((((((((((((iHashCode2 + (((((((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31)) * 31) + (z5 ? 1 : 0)) * 31) + (z6 ? 1 : 0)) * 31) + (z7 ? 1 : 0)) * 31) + (z8 ? 1 : 0)) * 31) + (z9 ? 1 : 0)) * 31) + (z10 ? 1 : 0)) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + (z13 ? 1 : 0)) * 31) + (z14 ? 1 : 0)) * 31) + (z15 ? 1 : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public SdkStatus(StartStatus startStatus, boolean z, boolean z2, boolean z3, boolean z4, LocationSetting locationSetting, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, QuotaStatus quotaStatus, QuotaStatus quotaStatus2, QuotaStatus quotaStatus3, LocationPermission locationPermission, boolean z11, boolean z12) {
        this.startStatus = startStatus;
        this.canDetect = z;
        this.isRemoteEnabled = z2;
        this.isPreciseLocationPermGranted = z3;
        this.isActivityRecognitionPermGranted = z4;
        this.isAirplaneModeEnabled = z5;
        this.isLocationAvailable = z6;
        this.locationSetting = locationSetting;
        this.isAccelPresent = z7;
        this.isGyroPresent = z8;
        this.isGpsPresent = z9;
        this.isGooglePlayServicesMissing = z10;
        this.wifiQuotaStatus = quotaStatus;
        this.mobileQuotaStatus = quotaStatus2;
        this.diskQuotaStatus = quotaStatus3;
        this.locationPermission = locationPermission;
        this.isSchedulingExactAlarmsPermitted = z11;
        this.userExists = z12;
        this.detectionStatus = DetectionStatus.fromSdkStatus(startStatus);
    }

    private SdkStatus cloneInternal() {
        SdkStatus sdkStatus = new SdkStatus(this.startStatus, this.canDetect, this.isRemoteEnabled, this.isPreciseLocationPermGranted, this.isActivityRecognitionPermGranted, this.locationSetting, this.isAirplaneModeEnabled, this.isLocationAvailable, this.isAccelPresent, this.isGyroPresent, this.isGpsPresent, this.isGooglePlayServicesMissing, this.wifiQuotaStatus, this.mobileQuotaStatus, this.diskQuotaStatus, this.locationPermission, this.isSchedulingExactAlarmsPermitted, this.userExists);
        sdkStatus.isBackgroundProcessingRestricted = this.isBackgroundProcessingRestricted;
        sdkStatus.isBatteryOptimizationEnabled = this.isBatteryOptimizationEnabled;
        sdkStatus.isBatterySavingEnabled = this.isBatterySavingEnabled;
        return sdkStatus;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SdkStatus m5084clone() {
        try {
            return (SdkStatus) super.clone();
        } catch (CloneNotSupportedException unused) {
            return cloneInternal();
        }
    }

    public String toString() {
        return "SdkStatus{startStatus=" + this.startStatus + ", canDetect=" + this.canDetect + ", isRemoteEnabled=" + this.isRemoteEnabled + ", isPreciseLocationPermGranted=" + this.isPreciseLocationPermGranted + ", isActivityRecognitionPermGranted=" + this.isActivityRecognitionPermGranted + ", isAirplaneModeEnabled=" + this.isAirplaneModeEnabled + ", isLocationAvailable=" + this.isLocationAvailable + ", locationSetting=" + this.locationSetting + ", isAccelPresent=" + this.isAccelPresent + ", isGyroPresent=" + this.isGyroPresent + ", isGpsPresent=" + this.isGpsPresent + ", isGooglePlayServicesMissing=" + this.isGooglePlayServicesMissing + ", wifiQuotaStatus=" + this.wifiQuotaStatus + ", mobileQuotaStatus=" + this.mobileQuotaStatus + ", diskQuotaStatus=" + this.diskQuotaStatus + ", isBatteryOptimizationEnabled=" + this.isBatteryOptimizationEnabled + ", isBatterySavingEnabled=" + this.isBatterySavingEnabled + ", isBackgroundProcessingRestricted=" + this.isBackgroundProcessingRestricted + ", locationPermission=" + this.locationPermission + ", isSchedulingExactAlarmsPermitted=" + this.isSchedulingExactAlarmsPermitted + ", userExists=" + this.userExists + ", detectionStatus=" + this.detectionStatus.name() + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SdkStatus sdkStatus = (SdkStatus) obj;
            if (this.canDetect == sdkStatus.canDetect && this.isRemoteEnabled == sdkStatus.isRemoteEnabled && this.isPreciseLocationPermGranted == sdkStatus.isPreciseLocationPermGranted && this.isActivityRecognitionPermGranted == sdkStatus.isActivityRecognitionPermGranted && this.isAirplaneModeEnabled == sdkStatus.isAirplaneModeEnabled && this.isLocationAvailable == sdkStatus.isLocationAvailable && this.isAccelPresent == sdkStatus.isAccelPresent && this.isGyroPresent == sdkStatus.isGyroPresent && this.isGpsPresent == sdkStatus.isGpsPresent && this.isGooglePlayServicesMissing == sdkStatus.isGooglePlayServicesMissing && this.startStatus == sdkStatus.startStatus && this.locationSetting == sdkStatus.locationSetting && this.wifiQuotaStatus == sdkStatus.wifiQuotaStatus && this.mobileQuotaStatus == sdkStatus.mobileQuotaStatus && this.isBatteryOptimizationEnabled == sdkStatus.isBatteryOptimizationEnabled && this.isBatterySavingEnabled == sdkStatus.isBatterySavingEnabled && this.isBackgroundProcessingRestricted == sdkStatus.isBackgroundProcessingRestricted && this.locationPermission == sdkStatus.locationPermission && this.isSchedulingExactAlarmsPermitted == sdkStatus.isSchedulingExactAlarmsPermitted && this.userExists == sdkStatus.userExists && this.diskQuotaStatus == sdkStatus.diskQuotaStatus) {
                return true;
            }
        }
        return false;
    }
}
