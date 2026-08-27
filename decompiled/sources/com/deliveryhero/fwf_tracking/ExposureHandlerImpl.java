package com.deliveryhero.fwf_tracking;

import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import com.deliveryhero.fwf_tracking.model.FwFTrackingCallback;
import com.deliveryhero.fwf_tracking.model.TrackingEvent;
import com.deliveryhero.fwf_util.FwFSerializer;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class ExposureHandlerImpl implements ExposureHandler {
    private final FwFTrackingCallback callback;
    private final FwFSerializer serializer;

    @Override // com.deliveryhero.fwf_tracking.ExposureHandler
    public Object shutdown(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return createFromParcel.INSTANCE;
    }

    public ExposureHandlerImpl(FwFTrackingCallback fwFTrackingCallback, FwFSerializer fwFSerializer) {
        fwFTrackingCallback.getClass();
        fwFSerializer.getClass();
        this.callback = fwFTrackingCallback;
        this.serializer = fwFSerializer;
    }

    @Override // com.deliveryhero.fwf_tracking.ExposureHandler
    public Object sendExposureData(FwFEventValue fwFEventValue, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        this.callback.onEventReadyForTracking(new TrackingEvent(fwFEventValue.getEventAction(), fwFEventValue.toMap(this.serializer)));
        return createFromParcel.INSTANCE;
    }
}
