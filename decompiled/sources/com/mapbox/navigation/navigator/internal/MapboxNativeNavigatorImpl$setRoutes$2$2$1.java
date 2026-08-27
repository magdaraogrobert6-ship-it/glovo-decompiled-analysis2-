package com.mapbox.navigation.navigator.internal;

import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;

/* JADX INFO: loaded from: classes4.dex */
public final class MapboxNativeNavigatorImpl$setRoutes$2$2$1 implements Expected.Action {
    public final /* synthetic */ int $r8$classId;
    public static final MapboxNativeNavigatorImpl$setRoutes$2$2$1 INSTANCE$1 = new MapboxNativeNavigatorImpl$setRoutes$2$2$1(1);
    public static final MapboxNativeNavigatorImpl$setRoutes$2$2$1 INSTANCE = new MapboxNativeNavigatorImpl$setRoutes$2$2$1(0);

    public /* synthetic */ MapboxNativeNavigatorImpl$setRoutes$2$2$1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public final void run(Object obj) {
        if (this.$r8$classId != 0) {
            String str = (String) obj;
            str.getClass();
            LoggerProviderKt.logE("Failed to set alternative routes, alternatives will be ignored. Reason: ".concat(str), "MapboxNativeNavigatorImpl");
        } else {
            String str2 = (String) obj;
            str2.getClass();
            LoggerProviderKt.logE("Failed to set the primary route with alternatives, active guidance session will not function correctly. Reason: ".concat(str2), "MapboxNativeNavigatorImpl");
        }
    }
}
