package com.sentiance.sdk.feature;

import java.util.Collections;
import java.util.List;
import o.getCartId;
import o.getVariantId;

/* JADX INFO: loaded from: classes5.dex */
public class UserContextFeature implements Feature {
    @Override // com.sentiance.sdk.feature.Feature
    public FeatureType getType() {
        return FeatureType.USER_CONTEXT;
    }

    @Override // com.sentiance.sdk.feature.Feature
    public List<getCartId> getModules() {
        return Collections.singletonList(new getVariantId());
    }
}
