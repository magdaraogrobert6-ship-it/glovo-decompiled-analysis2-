package com.roadrunner.rider.state.provider.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import dagger.Lazy;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.isOpenInternalroom_runtime;
import o.onSessionTrackingFailed;
import o.prepareForActivityTransitionCarryover;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class GetShiftInfoImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final Lazy RemoteActionCompatParcelizer;

    public GetShiftInfoImpl(Lazy lazy, Path$Companion path$Companion, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        lazy.getClass();
        this.RemoteActionCompatParcelizer = lazy;
    }

    public final Flow write() {
        int i = 2 % 2;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(FlowKt.RemoteActionCompatParcelizer(onSessionTrackingFailed.write, FlowKt.read(new SaveShiftInfo$invoke$2(this, null, 18))), this, 10);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(getMapScope$invoke$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
        int i2 = IconCompatParcelizer + 81;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flowRemoteActionCompatParcelizer;
    }
}
