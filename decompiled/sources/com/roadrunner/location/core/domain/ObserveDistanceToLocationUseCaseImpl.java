package com.roadrunner.location.core.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.UriKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.startingarea.domain.GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.addRearDisplayPresentationStatusListener;
import o.endRearDisplaySession;
import o.getActionViewIntentlambda0;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveDistanceToLocationUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final getActionViewIntentlambda0 IconCompatParcelizer;
    public final isOpenInternalroom_runtime serializer;
    public final GetLocationUpdatesUseCaseImpl write;

    public ObserveDistanceToLocationUseCaseImpl(GetLocationUpdatesUseCaseImpl getLocationUpdatesUseCaseImpl, getActionViewIntentlambda0 getactionviewintentlambda0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        getLocationUpdatesUseCaseImpl.getClass();
        getactionviewintentlambda0.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = getLocationUpdatesUseCaseImpl;
        this.IconCompatParcelizer = getactionviewintentlambda0;
        this.serializer = isopeninternalroom_runtime;
    }

    public final Flow RemoteActionCompatParcelizer(double d, double d2) {
        int i = 2 % 2;
        Flow flowSerializer = this.write.serializer(new addRearDisplayPresentationStatusListener(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, endRearDisplaySession.PRIORITY_BALANCED_POWER_ACCURACY));
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1 getStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1 = new GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1(FlowKt.serializer(flowSerializer, DelayKt.serializer(UriKt.IconCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, setUnregisteredInAppMessage.MILLISECONDS))), this, d, d2, 1);
        ((inCompatibilityMode) this.serializer).getClass();
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(getStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
        int i2 = read + 117;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowRemoteActionCompatParcelizer;
        }
        throw null;
    }
}
