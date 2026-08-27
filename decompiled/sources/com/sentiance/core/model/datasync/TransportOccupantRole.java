package com.sentiance.core.model.datasync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.clearSharedPreferencesDatalambda0;
import o.clearSharedPreferencesDatalambda10;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes5.dex */
public enum TransportOccupantRole implements IEventSubscriber {
    TRANSPORT_OCCUPANT_ROLE_UNSPECIFIED(0),
    TRANSPORT_OCCUPANT_ROLE_DRIVER(1),
    TRANSPORT_OCCUPANT_ROLE_PASSENGER(2),
    TRANSPORT_OCCUPANT_ROLE_UNAVAILABLE(3),
    UNRECOGNIZED(-1);

    public static final int TRANSPORT_OCCUPANT_ROLE_DRIVER_VALUE = 1;
    public static final int TRANSPORT_OCCUPANT_ROLE_PASSENGER_VALUE = 2;
    public static final int TRANSPORT_OCCUPANT_ROLE_UNAVAILABLE_VALUE = 3;
    public static final int TRANSPORT_OCCUPANT_ROLE_UNSPECIFIED_VALUE = 0;
    private static final getFeatureFlags internalValueMap = new clearSharedPreferencesDatalambda0(4);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return clearSharedPreferencesDatalambda10.IconCompatParcelizer;
    }

    TransportOccupantRole(int i) {
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
    public static TransportOccupantRole valueOf(int i) {
        return forNumber(i);
    }

    public static TransportOccupantRole forNumber(int i) {
        if (i == 0) {
            return TRANSPORT_OCCUPANT_ROLE_UNSPECIFIED;
        }
        if (i == 1) {
            return TRANSPORT_OCCUPANT_ROLE_DRIVER;
        }
        if (i == 2) {
            return TRANSPORT_OCCUPANT_ROLE_PASSENGER;
        }
        if (i != 3) {
            return null;
        }
        return TRANSPORT_OCCUPANT_ROLE_UNAVAILABLE;
    }
}
