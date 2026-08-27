package com.mapbox.navigation.core.internal;

import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationSDKInitializer extends BaseMapboxInitializer<MapboxNavigationSDK> {
    public final Class initializerClass = MapboxNavigationSDKInitializerImpl.class;

    @Override // com.mapbox.common.BaseMapboxInitializer
    public final Class getInitializerClass() {
        return this.initializerClass;
    }
}
