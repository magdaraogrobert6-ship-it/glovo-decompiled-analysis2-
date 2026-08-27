package com.sentiance.sdk.feature;

import java.util.Collections;
import java.util.List;
import o.EcommerceProduct;
import o.getCartId;

/* JADX INFO: loaded from: classes5.dex */
public class EventTimelineFeature implements Feature {
    @Override // com.sentiance.sdk.feature.Feature
    public FeatureType getType() {
        return FeatureType.EVENT_TIMELINING;
    }

    @Override // com.sentiance.sdk.feature.Feature
    public List<getCartId> getModules() {
        return Collections.singletonList(new EcommerceProduct());
    }
}
