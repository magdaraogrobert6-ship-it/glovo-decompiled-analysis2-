package com.roadrunner.customerchat.selfservice.data.remote.service;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteHelpCenterApiRequest {
    private static int read = 0;
    private static int write = 1;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;

    public ExecuteHelpCenterApiRequest(isOpenInternalroom_runtime isopeninternalroom_runtime) {
        isopeninternalroom_runtime.getClass();
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4882invokegIAlus(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        ExecuteHelpCenterApiRequest$invoke$1 executeHelpCenterApiRequest$invoke$1;
        int i = 2 % 2;
        if (!(continuationImpl instanceof ExecuteHelpCenterApiRequest$invoke$1)) {
            executeHelpCenterApiRequest$invoke$1 = new ExecuteHelpCenterApiRequest$invoke$1(this, continuationImpl);
        } else {
            executeHelpCenterApiRequest$invoke$1 = (ExecuteHelpCenterApiRequest$invoke$1) continuationImpl;
            int i2 = executeHelpCenterApiRequest$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                executeHelpCenterApiRequest$invoke$1.write = i2 - Integer.MIN_VALUE;
            } else {
                executeHelpCenterApiRequest$invoke$1 = new ExecuteHelpCenterApiRequest$invoke$1(this, continuationImpl);
            }
        }
        Object objWithContext = executeHelpCenterApiRequest$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = executeHelpCenterApiRequest$invoke$1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            int i4 = write + 95;
            int i5 = i4 % Fields.SpotShadowColor;
            read = i5;
            int i6 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = i5 + 29;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            ExecuteDatabaseRequest$invoke$2 executeDatabaseRequest$invoke$2 = new ExecuteDatabaseRequest$invoke$2(4, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            executeHelpCenterApiRequest$invoke$1.write = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, executeDatabaseRequest$invoke$2, executeHelpCenterApiRequest$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i8 = read + 117;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
