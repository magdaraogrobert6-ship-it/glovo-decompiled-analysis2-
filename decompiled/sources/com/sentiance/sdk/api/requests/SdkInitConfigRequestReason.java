package com.sentiance.sdk.api.requests;

import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.BrazeInternalLocationApiCompanion;

/* JADX INFO: loaded from: classes3.dex */
public enum SdkInitConfigRequestReason {
    NORMAL,
    SDK_DETECTED,
    APP_REPORTED;

    public final String toJsonValue() {
        int i = BrazeInternalLocationApiCompanion.IconCompatParcelizer[ordinal()];
        if (i == 1) {
            return Constants.NORMAL;
        }
        if (i == 2) {
            return "sdk_detected";
        }
        if (i == 3) {
            return "app_reported";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
