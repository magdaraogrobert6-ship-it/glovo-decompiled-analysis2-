package com.google.android.gms.internal.mlkit_vision_face;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.navigation.core.accounts.BillingControllerKt$WhenMappings;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdr {
    public static final String access$getPublicName(SessionSKUIdentifier sessionSKUIdentifier) {
        switch (BillingControllerKt$WhenMappings.$EnumSwitchMapping$0[sessionSKUIdentifier.ordinal()]) {
            case 1:
                return "Core Active Guidance Trip Session";
            case 2:
                return "Core Free Drive Trip Session";
            case 3:
                return "UX Active Guidance Trip Session";
            case 4:
                return "UX Free Drive Trip Session";
            case 5:
                return "v2 Active Guidance Trip Session";
            case 6:
                return "v2 Free Drive Trip Session";
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }
}
