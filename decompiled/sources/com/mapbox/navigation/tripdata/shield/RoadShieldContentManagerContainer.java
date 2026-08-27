package com.mapbox.navigation.tripdata.shield;

import o.isAdapterPositionOnScreen;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class RoadShieldContentManagerContainer implements RoadShieldContentManager {
    public static final RoadShieldContentManagerContainer INSTANCE = new RoadShieldContentManagerContainer();
    public static final isAdapterPositionOnScreen contentManager$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.tripdata.shield.RoadShieldContentManagerContainer$contentManager$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            return new RoadShieldContentManagerImpl();
        }
    });

    @Override // com.mapbox.navigation.tripdata.shield.RoadShieldContentManager
    public final void cancelAll() {
        ((RoadShieldContentManager) contentManager$delegate.MediaSessionCompatResultReceiverWrapper()).cancelAll();
    }
}
