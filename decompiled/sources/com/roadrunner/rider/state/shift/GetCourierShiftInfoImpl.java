package com.roadrunner.rider.state.shift;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidUiFrameClock;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCourierShiftInfoImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final GetShiftInfoImpl write;

    public GetCourierShiftInfoImpl(GetShiftInfoImpl getShiftInfoImpl, AndroidUiFrameClock androidUiFrameClock, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = getShiftInfoImpl;
    }

    public final Flow IconCompatParcelizer() {
        int i = 2 % 2;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(this.write.write(), this, 12);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(getMapScope$invoke$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
        int i2 = read + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flowRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
