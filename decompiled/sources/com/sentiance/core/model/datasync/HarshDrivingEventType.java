package com.sentiance.core.model.datasync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.clearSharedPreferencesDatalambda0;
import o.clearSharedPreferencesDatalambda10;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes5.dex */
public enum HarshDrivingEventType implements IEventSubscriber {
    HARSH_DRIVING_EVENT_TYPE_UNSPECIFIED(0),
    HARSH_DRIVING_EVENT_TYPE_NO_EVENT(1),
    HARSH_DRIVING_EVENT_TYPE_ACCELERATING(2),
    HARSH_DRIVING_EVENT_TYPE_BRAKING(3),
    HARSH_DRIVING_EVENT_TYPE_TURN(4),
    UNRECOGNIZED(-1);

    public static final int HARSH_DRIVING_EVENT_TYPE_ACCELERATING_VALUE = 2;
    public static final int HARSH_DRIVING_EVENT_TYPE_BRAKING_VALUE = 3;
    public static final int HARSH_DRIVING_EVENT_TYPE_NO_EVENT_VALUE = 1;
    public static final int HARSH_DRIVING_EVENT_TYPE_TURN_VALUE = 4;
    public static final int HARSH_DRIVING_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    private static final getFeatureFlags internalValueMap = new clearSharedPreferencesDatalambda0(2);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return clearSharedPreferencesDatalambda10.write;
    }

    HarshDrivingEventType(int i) {
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
    public static HarshDrivingEventType valueOf(int i) {
        return forNumber(i);
    }

    public static HarshDrivingEventType forNumber(int i) {
        if (i == 0) {
            return HARSH_DRIVING_EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return HARSH_DRIVING_EVENT_TYPE_NO_EVENT;
        }
        if (i == 2) {
            return HARSH_DRIVING_EVENT_TYPE_ACCELERATING;
        }
        if (i == 3) {
            return HARSH_DRIVING_EVENT_TYPE_BRAKING;
        }
        if (i != 4) {
            return null;
        }
        return HARSH_DRIVING_EVENT_TYPE_TURN;
    }
}
