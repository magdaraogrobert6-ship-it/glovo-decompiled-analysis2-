package com.mapbox.maps.loader;

import android.content.Context;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.MapboxConstants;
import com.mapbox.maps.assets.AssetManagerProvider;
import java.util.ArrayList;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;

/* JADX INFO: loaded from: classes2.dex */
public class MapboxMapsInitializerImpl implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public MapboxMaps create(Context context) {
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(MapboxConstants.MAP_SHARED_LIBRARY_NAME);
        new AssetManagerProvider().initialize(context.getAssets());
        return MapboxMaps.INSTANCE;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public List<Class<? extends copyColorMatrixgBh15pIdefault>> dependencies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MapboxSDKCommonInitializerImpl.class);
        return arrayList;
    }
}
