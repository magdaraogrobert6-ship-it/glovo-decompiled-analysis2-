package com.roadrunner.rider.state.provider.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.IActivityHandler;
import o.IAttributionHandler;
import o.prepareForActivityTransitionCarryover;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetWorkOpportunitiesImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final OkHttpCall$1 RemoteActionCompatParcelizer;
    public final IActivityHandler serializer;

    public GetWorkOpportunitiesImpl(IActivityHandler iActivityHandler, OkHttpCall$1 okHttpCall$1) {
        this.serializer = iActivityHandler;
        this.RemoteActionCompatParcelizer = okHttpCall$1;
    }

    public final GetMapScope$invoke$$inlined$map$1 serializer() {
        int i = 2 % 2;
        FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 flowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1RemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(IAttributionHandler.RemoteActionCompatParcelizer, FlowKt.read(new SaveShiftInfo$invoke$2(this.serializer, null, 16)));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(FlowKt.RemoteActionCompatParcelizer(flowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1RemoteActionCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer), this, 11);
        int i2 = read + 81;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getMapScope$invoke$$inlined$map$1;
    }
}
