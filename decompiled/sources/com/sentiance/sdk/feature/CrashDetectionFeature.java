package com.sentiance.sdk.feature;

import java.util.Collections;
import java.util.List;
import o.CheckoutStartedEvent;
import o.getCartId;

/* JADX INFO: loaded from: classes5.dex */
public class CrashDetectionFeature implements Feature {
    @Override // com.sentiance.sdk.feature.Feature
    public FeatureType getType() {
        return FeatureType.CRASH_DETECTION;
    }

    @Override // com.sentiance.sdk.feature.Feature
    public List<getCartId> getModules() {
        return Collections.singletonList(new CheckoutStartedEvent());
    }
}
