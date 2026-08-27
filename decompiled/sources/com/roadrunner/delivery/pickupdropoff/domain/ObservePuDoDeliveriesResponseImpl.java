package com.roadrunner.delivery.pickupdropoff.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;

/* JADX INFO: loaded from: classes3.dex */
public final class ObservePuDoDeliveriesResponseImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final accessrequireViewFactoryHolder write;

    public ObservePuDoDeliveriesResponseImpl(accessrequireViewFactoryHolder accessrequireviewfactoryholder) {
        accessrequireviewfactoryholder.getClass();
        this.write = accessrequireviewfactoryholder;
    }

    public final HeatmapDataStore$get$$inlined$map$1 write() {
        int i = 2 % 2;
        HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1 = new HeatmapDataStore$get$$inlined$map$1(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) this.write)).MediaBrowserCompatMediaItem, 25), this, 19);
        int i2 = IconCompatParcelizer + 75;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return heatmapDataStore$get$$inlined$map$1;
        }
        throw null;
    }
}
