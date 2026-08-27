package com.sentiance.core.model.datasync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.clearSharedPreferencesDatalambda0;
import o.clearSharedPreferencesDatalambda10;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes5.dex */
public enum TransportMode implements IEventSubscriber {
    TRANSPORT_MODE_UNSPECIFIED(0),
    TRANSPORT_MODE_UNKNOWN(1),
    TRANSPORT_MODE_BICYCLE(2),
    TRANSPORT_MODE_WALKING(3),
    TRANSPORT_MODE_RUNNING(4),
    TRANSPORT_MODE_TRAM(5),
    TRANSPORT_MODE_TRAIN(6),
    TRANSPORT_MODE_CAR(7),
    TRANSPORT_MODE_BUS(8),
    TRANSPORT_MODE_MOTORCYCLE(9),
    TRANSPORT_MODE_RAIL(10),
    TRANSPORT_MODE_ON_FOOT(11),
    TRANSPORT_MODE_VEHICLE(12),
    TRANSPORT_MODE_IDLE(13),
    UNRECOGNIZED(-1);

    public static final int TRANSPORT_MODE_BICYCLE_VALUE = 2;
    public static final int TRANSPORT_MODE_BUS_VALUE = 8;
    public static final int TRANSPORT_MODE_CAR_VALUE = 7;
    public static final int TRANSPORT_MODE_IDLE_VALUE = 13;
    public static final int TRANSPORT_MODE_MOTORCYCLE_VALUE = 9;
    public static final int TRANSPORT_MODE_ON_FOOT_VALUE = 11;
    public static final int TRANSPORT_MODE_RAIL_VALUE = 10;
    public static final int TRANSPORT_MODE_RUNNING_VALUE = 4;
    public static final int TRANSPORT_MODE_TRAIN_VALUE = 6;
    public static final int TRANSPORT_MODE_TRAM_VALUE = 5;
    public static final int TRANSPORT_MODE_UNKNOWN_VALUE = 1;
    public static final int TRANSPORT_MODE_UNSPECIFIED_VALUE = 0;
    public static final int TRANSPORT_MODE_VEHICLE_VALUE = 12;
    public static final int TRANSPORT_MODE_WALKING_VALUE = 3;
    private static final getFeatureFlags internalValueMap = new clearSharedPreferencesDatalambda0(3);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return clearSharedPreferencesDatalambda10.RemoteActionCompatParcelizer;
    }

    TransportMode(int i) {
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

    public static TransportMode forNumber(int i) {
        switch (i) {
            case 0:
                return TRANSPORT_MODE_UNSPECIFIED;
            case 1:
                return TRANSPORT_MODE_UNKNOWN;
            case 2:
                return TRANSPORT_MODE_BICYCLE;
            case 3:
                return TRANSPORT_MODE_WALKING;
            case 4:
                return TRANSPORT_MODE_RUNNING;
            case 5:
                return TRANSPORT_MODE_TRAM;
            case 6:
                return TRANSPORT_MODE_TRAIN;
            case 7:
                return TRANSPORT_MODE_CAR;
            case 8:
                return TRANSPORT_MODE_BUS;
            case 9:
                return TRANSPORT_MODE_MOTORCYCLE;
            case 10:
                return TRANSPORT_MODE_RAIL;
            case 11:
                return TRANSPORT_MODE_ON_FOOT;
            case 12:
                return TRANSPORT_MODE_VEHICLE;
            case 13:
                return TRANSPORT_MODE_IDLE;
            default:
                return null;
        }
    }

    @Deprecated
    public static TransportMode valueOf(int i) {
        return forNumber(i);
    }
}
