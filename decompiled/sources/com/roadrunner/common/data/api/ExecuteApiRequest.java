package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.withRect;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteApiRequest {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final MapApiError RemoteActionCompatParcelizer;
    public final withRect serializer;

    public ExecuteApiRequest(MapApiError mapApiError, isOpenInternalroom_runtime isopeninternalroom_runtime, withRect withrect) {
        this.RemoteActionCompatParcelizer = mapApiError;
        this.serializer = withrect;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4875invokegIAlus(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        ExecuteApiRequest$invoke$1 executeApiRequest$invoke$1;
        int i = 2 % 2;
        if (!(continuationImpl instanceof ExecuteApiRequest$invoke$1)) {
            executeApiRequest$invoke$1 = new ExecuteApiRequest$invoke$1(this, continuationImpl);
        } else {
            int i2 = IconCompatParcelizer + 67;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            executeApiRequest$invoke$1 = (ExecuteApiRequest$invoke$1) continuationImpl;
            int i4 = executeApiRequest$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 49;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    executeApiRequest$invoke$1.read = i4 >> Integer.MIN_VALUE;
                } else {
                    executeApiRequest$invoke$1.read = i4 - Integer.MIN_VALUE;
                }
            } else {
                executeApiRequest$invoke$1 = new ExecuteApiRequest$invoke$1(this, continuationImpl);
            }
        }
        Object obj = executeApiRequest$invoke$1.write;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = executeApiRequest$invoke$1.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            executeApiRequest$invoke$1.read = 1;
            Object objM4874invoke0E7RQCE = m4874invoke0E7RQCE(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, executeApiRequest$invoke$1);
            return objM4874invoke0E7RQCE == obj2 ? obj2 : objM4874invoke0E7RQCE;
        }
        if (i6 == 1) {
            int i7 = read + 123;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i9 = IconCompatParcelizer + 91;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 8 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    public final Object m4874invoke0E7RQCE(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ContinuationImpl continuationImpl) throws Throwable {
        ExecuteApiRequest$invoke$2 executeApiRequest$invoke$2;
        int i = 2 % 2;
        if (continuationImpl instanceof ExecuteApiRequest$invoke$2) {
            int i2 = IconCompatParcelizer + 95;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((ExecuteApiRequest$invoke$2) continuationImpl).serializer;
                throw null;
            }
            executeApiRequest$invoke$2 = (ExecuteApiRequest$invoke$2) continuationImpl;
            int i4 = executeApiRequest$invoke$2.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                executeApiRequest$invoke$2.serializer = i4 - Integer.MIN_VALUE;
                int i5 = read + 13;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                executeApiRequest$invoke$2 = new ExecuteApiRequest$invoke$2(this, continuationImpl);
            }
        } else {
            executeApiRequest$invoke$2 = new ExecuteApiRequest$invoke$2(this, continuationImpl);
        }
        Object objWithContext = executeApiRequest$invoke$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = executeApiRequest$invoke$2.serializer;
        if (i7 != 0) {
            int i8 = read + 21;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i9 = read + 19;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, null, 17);
            executeApiRequest$invoke$2.serializer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, asyncImagePainter$launchJob$1, executeApiRequest$invoke$2);
            if (objWithContext == coroutineSingletons) {
                int i11 = read + 31;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 49 / 0;
                }
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
