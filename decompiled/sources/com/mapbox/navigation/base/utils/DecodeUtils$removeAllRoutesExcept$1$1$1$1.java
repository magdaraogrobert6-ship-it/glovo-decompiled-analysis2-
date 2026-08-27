package com.mapbox.navigation.base.utils;

import com.mapbox.api.directions.v5.models.DirectionsRoute;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class DecodeUtils$removeAllRoutesExcept$1$1$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final DecodeUtils$removeAllRoutesExcept$1$1$1$1 INSTANCE;
    public static final DecodeUtils$removeAllRoutesExcept$1$1$1$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DecodeUtils$removeAllRoutesExcept$1$1$1$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 1;
        INSTANCE = new DecodeUtils$removeAllRoutesExcept$1$1$1$1(i, 0);
        INSTANCE$1 = new DecodeUtils$removeAllRoutesExcept$1$1$1$1(i, i);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        if (this.$r8$classId != 0) {
            DirectionsRoute directionsRoute = (DirectionsRoute) obj;
            directionsRoute.getClass();
            DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$1 = DecodeUtils.completeGeometryDecodeCache;
            return DecodeUtils.routeIdForLogs(directionsRoute);
        }
        DecodeUtils.CachedRouteInfo cachedRouteInfo = (DecodeUtils.CachedRouteInfo) obj;
        cachedRouteInfo.getClass();
        DecodeUtils$stepsGeometryDecodeCache$1 decodeUtils$stepsGeometryDecodeCache$2 = DecodeUtils.completeGeometryDecodeCache;
        return DecodeUtils.routeIdForLogs(cachedRouteInfo.route);
    }
}
