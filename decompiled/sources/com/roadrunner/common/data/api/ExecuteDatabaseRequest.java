package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteDatabaseRequest {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public ExecuteDatabaseRequest(isOpenInternalroom_runtime isopeninternalroom_runtime) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4876invokegIAlus(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        ExecuteDatabaseRequest$invoke$1 executeDatabaseRequest$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof ExecuteDatabaseRequest$invoke$1) {
            executeDatabaseRequest$invoke$1 = (ExecuteDatabaseRequest$invoke$1) continuationImpl;
            int i2 = executeDatabaseRequest$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                executeDatabaseRequest$invoke$1.write = i2 - Integer.MIN_VALUE;
                int i3 = IconCompatParcelizer + 1;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                executeDatabaseRequest$invoke$1 = new ExecuteDatabaseRequest$invoke$1(this, continuationImpl);
                int i5 = IconCompatParcelizer + 81;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            executeDatabaseRequest$invoke$1 = new ExecuteDatabaseRequest$invoke$1(this, continuationImpl);
            int i7 = IconCompatParcelizer + 81;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object objWithContext = executeDatabaseRequest$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = executeDatabaseRequest$invoke$1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            ExecuteDatabaseRequest$invoke$2 executeDatabaseRequest$invoke$2 = new ExecuteDatabaseRequest$invoke$2(0, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            executeDatabaseRequest$invoke$1.write = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, executeDatabaseRequest$invoke$2, executeDatabaseRequest$invoke$1);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = read + 109;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
