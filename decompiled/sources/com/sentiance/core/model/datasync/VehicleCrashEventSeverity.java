package com.sentiance.core.model.datasync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.clearSharedPreferencesDatalambda0;
import o.clearSharedPreferencesDatalambda10;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes5.dex */
public enum VehicleCrashEventSeverity implements IEventSubscriber {
    VEHICLE_CRASH_EVENT_SEVERITY_UNSPECIFIED(0),
    VEHICLE_CRASH_EVENT_SEVERITY_LOW(1),
    VEHICLE_CRASH_EVENT_SEVERITY_MEDIUM(2),
    VEHICLE_CRASH_EVENT_SEVERITY_HIGH(3),
    UNRECOGNIZED(-1);

    public static final int VEHICLE_CRASH_EVENT_SEVERITY_HIGH_VALUE = 3;
    public static final int VEHICLE_CRASH_EVENT_SEVERITY_LOW_VALUE = 1;
    public static final int VEHICLE_CRASH_EVENT_SEVERITY_MEDIUM_VALUE = 2;
    public static final int VEHICLE_CRASH_EVENT_SEVERITY_UNSPECIFIED_VALUE = 0;
    private static final getFeatureFlags internalValueMap = new clearSharedPreferencesDatalambda0(5);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return clearSharedPreferencesDatalambda10.RatingCompat;
    }

    VehicleCrashEventSeverity(int i) {
        this.value = i;
    }

    @Override // o.IEventSubscriber
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static VehicleCrashEventSeverity valueOf(int i) {
        return forNumber(i);
    }

    public static VehicleCrashEventSeverity forNumber(int i) {
        if (i == 0) {
            return VEHICLE_CRASH_EVENT_SEVERITY_UNSPECIFIED;
        }
        if (i == 1) {
            return VEHICLE_CRASH_EVENT_SEVERITY_LOW;
        }
        if (i == 2) {
            return VEHICLE_CRASH_EVENT_SEVERITY_MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return VEHICLE_CRASH_EVENT_SEVERITY_HIGH;
    }
}
