package com.deliveryhero.fwf_tracking;

import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public interface ExposureHandler {
    Object sendExposureData(FwFEventValue fwFEventValue, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView);

    Object shutdown(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView);
}
