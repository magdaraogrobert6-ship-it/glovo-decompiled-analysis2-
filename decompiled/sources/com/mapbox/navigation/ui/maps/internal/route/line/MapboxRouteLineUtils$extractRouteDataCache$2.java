package com.mapbox.navigation.ui.maps.internal.route.line;

import android.util.LruCache;
import com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteRestrictionData;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineUtils$extractRouteDataCache$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MapboxRouteLineUtils$extractRouteDataCache$2 INSTANCE;
    public static final MapboxRouteLineUtils$extractRouteDataCache$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRouteLineUtils$extractRouteDataCache$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 0;
        INSTANCE = new MapboxRouteLineUtils$extractRouteDataCache$2(i, i);
        INSTANCE$1 = new MapboxRouteLineUtils$extractRouteDataCache$2(i, 1);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i != 0) {
            return i != 1 ? new ExtractedRouteRestrictionData(0, 0.0d, false) : new LruCache(3);
        }
        return new LruCache(3);
    }
}
