package com.mapbox.common;

import android.content.Context;
import androidx.sqlite.SQLite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxSDKCommonInitializerImpl implements copyColorMatrixgBh15pIdefault {
    private final void initTileStoreServiceIfAvailable(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        try {
            Method declaredMethod = Class.forName("com.mapbox.common.tilestore.TileStoreServiceInitializer").getDeclaredMethod("init", Context.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, context);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public List<Class<? extends copyColorMatrixgBh15pIdefault>> dependencies() {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{CoreInitializer.class}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public MapboxSDKCommon create(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        context.getClass();
        initTileStoreServiceIfAvailable(context);
        return MapboxSDKCommon.INSTANCE;
    }
}
