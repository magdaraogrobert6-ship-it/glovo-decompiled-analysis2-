package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda5 implements QueryFeatureStateCallback, Expected.Action {
    public final /* synthetic */ FeatureStateCallback f$0;
    public final /* synthetic */ FeaturesetFeature f$1;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda5(FeaturesetFeature featuresetFeature, FeatureStateCallback featureStateCallback) {
        this.f$0 = featureStateCallback;
        this.f$1 = featuresetFeature;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$32$lambda$31$lambda$30(this.f$0, this.f$1, (Value) obj);
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$32$lambda$31(this.f$0, this.f$1, expected);
    }
}
