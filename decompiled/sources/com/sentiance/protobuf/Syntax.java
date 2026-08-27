package com.sentiance.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.BannersUpdatedEventCompanion;
import o.BrazeNetworkFailureEvent;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes3.dex */
public enum Syntax implements IEventSubscriber {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final getFeatureFlags internalValueMap = new BrazeNetworkFailureEvent(0);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return BannersUpdatedEventCompanion.write;
    }

    Syntax(int i) {
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
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i == 1) {
            return SYNTAX_PROTO3;
        }
        if (i != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }
}
