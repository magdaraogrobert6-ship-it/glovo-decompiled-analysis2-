package com.roadrunner.overlay.bubble.service;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ContentPainterNode;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdattOPrCwQAZdC10c20qDtJUliAwE;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayCoordinator {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final ContentPainterNode read;
    public final ContentPainterNode serializer;
    public final UpdateStateUseCaseImpl write;

    public OverlayCoordinator(UpdateStateUseCaseImpl updateStateUseCaseImpl, ContentPainterNode contentPainterNode, ContentPainterNode contentPainterNode2, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        updateStateUseCaseImpl.getClass();
        contentPainterNode.getClass();
        contentPainterNode2.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = updateStateUseCaseImpl;
        this.read = contentPainterNode;
        this.serializer = contentPainterNode2;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5001invokegIAlus(r8lambdattOPrCwQAZdC10c20qDtJUliAwE r8lambdattoprcwqazdc10c20qdtjuliawe, ContinuationImpl continuationImpl) {
        OverlayCoordinator$invoke$1 overlayCoordinator$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof OverlayCoordinator$invoke$1) {
            int i2 = RemoteActionCompatParcelizer + 83;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            overlayCoordinator$invoke$1 = (OverlayCoordinator$invoke$1) continuationImpl;
            int i4 = overlayCoordinator$invoke$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                overlayCoordinator$invoke$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                overlayCoordinator$invoke$1 = new OverlayCoordinator$invoke$1(this, continuationImpl);
            }
        } else {
            overlayCoordinator$invoke$1 = new OverlayCoordinator$invoke$1(this, continuationImpl);
        }
        Object objWithContext = overlayCoordinator$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = overlayCoordinator$invoke$1.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.IconCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            ReconnectScheduler$schedule$1 reconnectScheduler$schedule$1 = new ReconnectScheduler$schedule$1(this, r8lambdattoprcwqazdc10c20qdtjuliawe, shortNewsContentCardView, 25);
            overlayCoordinator$invoke$1.serializer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, reconnectScheduler$schedule$1, overlayCoordinator$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i6 = RemoteActionCompatParcelizer + 29;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 76 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
