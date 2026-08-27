package com.mapbox.search.base;

import android.content.Context;
import androidx.sqlite.SQLite;
import com.mapbox.common.SdkInfoRegistryFactory;
import com.mapbox.common.SdkInformation;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.createFromParcel;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSearchSdkInitializerImpl implements copyColorMatrixgBh15pIdefault {
    public static Context appContext;

    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{MapboxSearchCoreInitializerImpl.class}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        appContext = applicationContext;
        SdkInfoRegistryFactory.getInstance().registerSdkInformation(new SdkInformation("search-sdk-android", "2.25.1", "com.mapbox.search"));
        return createFromParcel.INSTANCE;
    }
}
