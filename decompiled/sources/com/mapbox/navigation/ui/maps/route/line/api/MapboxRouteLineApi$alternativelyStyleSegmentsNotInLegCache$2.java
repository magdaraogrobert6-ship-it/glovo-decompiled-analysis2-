package com.mapbox.navigation.ui.maps.route.line.api;

import android.util.LruCache;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2 INSTANCE;
    public static final MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 0;
        INSTANCE = new MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2(i, i);
        INSTANCE$1 = new MapboxRouteLineApi$alternativelyStyleSegmentsNotInLegCache$2(i, 1);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return this.$r8$classId != 0 ? createFromParcel.INSTANCE : new LruCache(4);
    }
}
