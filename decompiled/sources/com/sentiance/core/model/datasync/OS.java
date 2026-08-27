package com.sentiance.core.model.datasync;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FeatureFlagsUpdatedEventCompanion;
import o.IEventSubscriber;
import o.clearSharedPreferencesDatalambda0;
import o.clearSharedPreferencesDatalambda10;
import o.getFeatureFlags;

/* JADX INFO: loaded from: classes5.dex */
public enum OS implements IEventSubscriber {
    OS_UNSPECIFIED(0),
    OS_ANDROID(1),
    OS_IOS(2),
    UNRECOGNIZED(-1);

    public static final int OS_ANDROID_VALUE = 1;
    public static final int OS_IOS_VALUE = 2;
    public static final int OS_UNSPECIFIED_VALUE = 0;
    private static final getFeatureFlags internalValueMap = new clearSharedPreferencesDatalambda0(0);
    private final int value;

    public static getFeatureFlags internalGetValueMap() {
        return internalValueMap;
    }

    public static FeatureFlagsUpdatedEventCompanion internalGetVerifier() {
        return clearSharedPreferencesDatalambda10.read;
    }

    OS(int i) {
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
    public static OS valueOf(int i) {
        return forNumber(i);
    }

    public static OS forNumber(int i) {
        if (i == 0) {
            return OS_UNSPECIFIED;
        }
        if (i == 1) {
            return OS_ANDROID;
        }
        if (i != 2) {
            return null;
        }
        return OS_IOS;
    }
}
