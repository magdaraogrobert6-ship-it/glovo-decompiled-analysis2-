package com.mapbox.common.experimental;

import com.mapbox.directions.route.DirectionsRouteContext;
import com.mapbox.directions.route.DirectionsRouteResponse;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MapboxSupport$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ MapboxSupport$$ExternalSyntheticLambda0(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        if (i == 0) {
            MapboxSupport.setPeer$lambda$0(this.f$0);
        } else if (i != 1) {
            DirectionsRouteResponse.setPeer$lambda$0(this.f$0);
        } else {
            DirectionsRouteContext.setPeer$lambda$0(this.f$0);
        }
    }
}
