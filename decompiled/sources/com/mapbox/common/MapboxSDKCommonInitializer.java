package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSDKCommonInitializer extends BaseMapboxInitializer<MapboxSDKCommon> {
    private final Class<MapboxSDKCommonInitializerImpl> initializerClass = MapboxSDKCommonInitializerImpl.class;

    @Override // com.mapbox.common.BaseMapboxInitializer
    public Class<MapboxSDKCommonInitializerImpl> getInitializerClass() {
        return this.initializerClass;
    }
}
