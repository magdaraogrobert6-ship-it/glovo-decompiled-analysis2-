package com.sentiance.sdk.feature;

import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import o.getCartId;
import o.getQuantity;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes5.dex */
public final class DrivingInsightsFeature implements Feature {
    @Override // com.sentiance.sdk.feature.Feature
    public FeatureType getType() {
        return FeatureType.DRIVING_INSIGHTS;
    }

    @Override // com.sentiance.sdk.feature.Feature
    public List<getCartId> getModules() {
        getCartId[] getcartidArr = {new getQuantity()};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{getcartidArr}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
    }
}
