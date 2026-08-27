package com.mapbox.search.core;

import android.content.Context;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import java.util.ArrayList;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;

/* JADX INFO: loaded from: classes3.dex */
public class MapboxSearchCoreInitializerImpl implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load("SearchCore");
        return Boolean.TRUE;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MapboxSDKCommonInitializerImpl.class);
        return arrayList;
    }
}
