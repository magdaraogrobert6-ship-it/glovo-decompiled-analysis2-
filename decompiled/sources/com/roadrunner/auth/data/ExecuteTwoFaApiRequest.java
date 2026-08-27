package com.roadrunner.auth.data;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AccessibilityKey;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.withRect;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteTwoFaApiRequest {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final AccessibilityKey RemoteActionCompatParcelizer;
    public final withRect read;
    public final isOpenInternalroom_runtime serializer;

    public ExecuteTwoFaApiRequest(AccessibilityKey accessibilityKey, isOpenInternalroom_runtime isopeninternalroom_runtime, withRect withrect) {
        accessibilityKey.getClass();
        isopeninternalroom_runtime.getClass();
        withrect.getClass();
        this.RemoteActionCompatParcelizer = accessibilityKey;
        this.serializer = isopeninternalroom_runtime;
        this.read = withrect;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4863invokegIAlus(TooltipStateImpl.AnonymousClass2 anonymousClass2, ContinuationImpl continuationImpl) {
        ExecuteTwoFaApiRequest$invoke$1 executeTwoFaApiRequest$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ExecuteTwoFaApiRequest$invoke$1) {
            executeTwoFaApiRequest$invoke$1 = (ExecuteTwoFaApiRequest$invoke$1) continuationImpl;
            int i2 = executeTwoFaApiRequest$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                executeTwoFaApiRequest$invoke$1.write = i2 - Integer.MIN_VALUE;
            } else {
                executeTwoFaApiRequest$invoke$1 = new ExecuteTwoFaApiRequest$invoke$1(this, continuationImpl);
            }
        } else {
            executeTwoFaApiRequest$invoke$1 = new ExecuteTwoFaApiRequest$invoke$1(this, continuationImpl);
        }
        Object objWithContext = executeTwoFaApiRequest$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = executeTwoFaApiRequest$invoke$1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.serializer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$1 = new RealImageLoader$execute$2$job$1(anonymousClass2, this, shortNewsContentCardView, 24);
            executeTwoFaApiRequest$invoke$1.write = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, realImageLoader$execute$2$job$1, executeTwoFaApiRequest$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i4 = IconCompatParcelizer + 5;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i6 = IconCompatParcelizer + 47;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return null;
            }
            int i8 = IconCompatParcelizer + 21;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                int i9 = 99 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
