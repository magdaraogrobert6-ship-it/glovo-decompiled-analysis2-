package com.roadrunner.rider.state.provider.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ILogger;
import o.ImageHeaderParserImageType;
import o.asBinder;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRiderStatusImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final ImageHeaderParserImageType read;
    public final asBinder write;

    public GetRiderStatusImpl(asBinder asbinder, ImageHeaderParserImageType imageHeaderParserImageType) {
        this.write = asbinder;
        this.read = imageHeaderParserImageType;
    }

    public final GetMapScope$invoke$$inlined$map$1 IconCompatParcelizer() {
        int i = 2 % 2;
        FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 flowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1RemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(ILogger.IconCompatParcelizer, FlowKt.read(new SaveShiftInfo$invoke$2(this.write, null, 15)));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(FlowKt.RemoteActionCompatParcelizer(flowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1RemoteActionCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer)), this.read, 9);
        int i2 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getMapScope$invoke$$inlined$map$1;
        }
        throw null;
    }
}
