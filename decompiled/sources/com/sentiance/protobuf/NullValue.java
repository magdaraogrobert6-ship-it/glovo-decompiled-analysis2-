package com.sentiance.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.BannersUpdatedEventCompanion;
import o.BrazeNetworkFailureEvent;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes3.dex */
public enum NullValue implements IEventSubscriber {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final getFeatureFlags internalValueMap = new BrazeNetworkFailureEvent(3);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return BannersUpdatedEventCompanion.RemoteActionCompatParcelizer;
    }

    NullValue(int i) {
        this.value = i;
    }

    public static NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
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
    public static NullValue valueOf(int i) {
        return forNumber(i);
    }
}
