package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda12 implements QueryRenderedFeaturesCallback, Expected.Action {
    public final /* synthetic */ QueryRenderedFeaturesetFeaturesCallback f$0;
    public final /* synthetic */ TypedFeaturesetDescriptor f$1;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda12(TypedFeaturesetDescriptor typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback) {
        this.f$0 = queryRenderedFeaturesetFeaturesCallback;
        this.f$1 = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.queryRenderedFeatures$lambda$46$lambda$45(this.f$0, this.f$1, (List) obj);
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        MapboxMap.queryRenderedFeatures$lambda$46(this.f$0, this.f$1, expected);
    }
}
