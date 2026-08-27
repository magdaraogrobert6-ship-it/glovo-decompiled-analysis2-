package com.mapbox.navigator;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxNavigationNativeInitializerImpl implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public List<Class<? extends copyColorMatrixgBh15pIdefault>> dependencies() {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{MapboxSDKCommonInitializerImpl.class}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public MapboxNavigationNative create(Context context) {
        context.getClass();
        MapboxNavigationNative mapboxNavigationNative = MapboxNavigationNative.INSTANCE;
        mapboxNavigationNative.initialize(context);
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load("navigator-android");
        return mapboxNavigationNative;
    }
}
