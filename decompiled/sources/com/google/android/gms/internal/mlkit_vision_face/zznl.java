package com.google.android.gms.internal.mlkit_vision_face;

import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zznl {
    public static final CongestionNumericOverride getOverriddenTrafficForProgress(NavigationRoute navigationRoute, RouteLegProgress routeLegProgress) {
        int i;
        int i2;
        navigationRoute.getClass();
        CongestionNumericOverride congestionNumericOverride = navigationRoute.overriddenTraffic;
        if (congestionNumericOverride == null || congestionNumericOverride.legIndex != routeLegProgress.legIndex || (i = routeLegProgress.geometryIndex) < (i2 = congestionNumericOverride.startIndex) || i >= i2 + congestionNumericOverride.length || congestionNumericOverride.originalCongestionNumeric == null) {
            return null;
        }
        return congestionNumericOverride;
    }
}
