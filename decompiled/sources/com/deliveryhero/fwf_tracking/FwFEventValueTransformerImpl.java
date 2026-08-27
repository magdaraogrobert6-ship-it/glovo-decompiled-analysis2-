package com.deliveryhero.fwf_tracking;

import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import com.deliveryhero.fwf_tracking.model.FwFEventValueTransformer;
import com.deliveryhero.fwf_tracking.model.FwFTrackingConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFEventValueTransformerImpl implements FwFEventValueTransformer {
    private final FwFTrackingConfig trackingConfig;

    public FwFEventValueTransformerImpl(FwFTrackingConfig fwFTrackingConfig) {
        fwFTrackingConfig.getClass();
        this.trackingConfig = fwFTrackingConfig;
    }

    @Override // com.deliveryhero.fwf_tracking.model.FwFEventValueTransformer
    public FwFEventValue transform(FwFEventValue fwFEventValue) {
        fwFEventValue.getClass();
        fwFEventValue.setService(this.trackingConfig.getBrand() + "-android");
        return fwFEventValue;
    }
}
