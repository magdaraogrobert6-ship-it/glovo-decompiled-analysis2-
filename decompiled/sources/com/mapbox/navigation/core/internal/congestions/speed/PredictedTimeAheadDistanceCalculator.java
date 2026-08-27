package com.mapbox.navigation.core.internal.congestions.speed;

import coil3.UriKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class PredictedTimeAheadDistanceCalculator {
    public static final long DEFAULT_TIME;
    public final long aheadTime = DEFAULT_TIME;

    static {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        DEFAULT_TIME = UriKt.RemoteActionCompatParcelizer(2, setUnregisteredInAppMessage.MINUTES);
    }
}
