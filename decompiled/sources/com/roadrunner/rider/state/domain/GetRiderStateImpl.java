package com.roadrunner.rider.state.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRiderStateImpl {
    private static int read = 0;
    private static int write = 1;
    public final GetCourierShiftInfoImpl IconCompatParcelizer;
    public final GetRiderStatusImpl RemoteActionCompatParcelizer;

    public GetRiderStateImpl(GetCourierShiftInfoImpl getCourierShiftInfoImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, GetRiderStatusImpl getRiderStatusImpl) {
        this.IconCompatParcelizer = getCourierShiftInfoImpl;
        this.RemoteActionCompatParcelizer = getRiderStatusImpl;
    }

    public final Flow write() {
        int i = 2 % 2;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.IconCompatParcelizer.IconCompatParcelizer()), this.RemoteActionCompatParcelizer.IconCompatParcelizer(), new GetRiderStateImpl$invoke$1(3, 0, null));
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
        int i2 = read + 55;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowRemoteActionCompatParcelizer;
        }
        throw null;
    }
}
