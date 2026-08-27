package com.sentiance.core.model.datasync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.clearSharedPreferencesDatalambda0;
import o.clearSharedPreferencesDatalambda10;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes5.dex */
public enum GeofenceEventType implements IEventSubscriber {
    GEOFENCE_EVENT_TYPE_UNSPECIFIED(0),
    GEOFENCE_EVENT_TYPE_ENTRY(1),
    GEOFENCE_EVENT_TYPE_EXIT(2),
    UNRECOGNIZED(-1);

    public static final int GEOFENCE_EVENT_TYPE_ENTRY_VALUE = 1;
    public static final int GEOFENCE_EVENT_TYPE_EXIT_VALUE = 2;
    public static final int GEOFENCE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    private static final getFeatureFlags internalValueMap = new clearSharedPreferencesDatalambda0(1);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return clearSharedPreferencesDatalambda10.serializer;
    }

    GeofenceEventType(int i) {
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
    public static GeofenceEventType valueOf(int i) {
        return forNumber(i);
    }

    public static GeofenceEventType forNumber(int i) {
        if (i == 0) {
            return GEOFENCE_EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return GEOFENCE_EVENT_TYPE_ENTRY;
        }
        if (i != 2) {
            return null;
        }
        return GEOFENCE_EVENT_TYPE_EXIT;
    }
}
