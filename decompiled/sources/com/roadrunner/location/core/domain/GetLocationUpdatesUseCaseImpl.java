package com.roadrunner.location.core.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.addRearDisplayPresentationStatusListener;
import o.getPresentationContext;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s;

/* JADX INFO: loaded from: classes3.dex */
public final class GetLocationUpdatesUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s read;
    public final getPresentationContext write;

    public GetLocationUpdatesUseCaseImpl(getPresentationContext getpresentationcontext, isOpenInternalroom_runtime isopeninternalroom_runtime, r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s r8lambdajfsws2prwmphriytrv9qwrow8s) {
        getpresentationcontext.getClass();
        isopeninternalroom_runtime.getClass();
        r8lambdajfsws2prwmphriytrv9qwrow8s.getClass();
        this.write = getpresentationcontext;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.read = r8lambdajfsws2prwmphriytrv9qwrow8s;
    }

    public final Flow serializer(addRearDisplayPresentationStatusListener addreardisplaypresentationstatuslistener) {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.write(new AsyncImagePainter$launchJob$1(this, addreardisplaypresentationstatuslistener, shortNewsContentCardView, 21)), this.read.IconCompatParcelizer.RemoteActionCompatParcelizer, new GetRiderStateImpl$invoke$1(3, 5, shortNewsContentCardView));
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, MainDispatcherLoader.read);
        int i2 = serializer + 105;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return flowRemoteActionCompatParcelizer;
    }
}
