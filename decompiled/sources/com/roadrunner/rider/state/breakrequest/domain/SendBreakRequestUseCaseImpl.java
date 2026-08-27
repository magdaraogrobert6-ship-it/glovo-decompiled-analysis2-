package com.roadrunner.rider.state.breakrequest.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.startworking.data.StartWorkingRepository$startWorking$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SendBreakRequestUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final ExecuteApiRequest RemoteActionCompatParcelizer;
    public final SaveHeatmapUrlImpl serializer;

    public SendBreakRequestUseCaseImpl(SaveHeatmapUrlImpl saveHeatmapUrlImpl, ExecuteApiRequest executeApiRequest) {
        saveHeatmapUrlImpl.getClass();
        executeApiRequest.getClass();
        this.serializer = saveHeatmapUrlImpl;
        this.RemoteActionCompatParcelizer = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5025invokegIAlus(String str, ContinuationImpl continuationImpl) {
        SendBreakRequestUseCaseImpl$invoke$1 sendBreakRequestUseCaseImpl$invoke$1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof SendBreakRequestUseCaseImpl$invoke$1) {
            sendBreakRequestUseCaseImpl$invoke$1 = (SendBreakRequestUseCaseImpl$invoke$1) continuationImpl;
            int i4 = sendBreakRequestUseCaseImpl$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sendBreakRequestUseCaseImpl$invoke$1.read = i4 - Integer.MIN_VALUE;
            } else {
                sendBreakRequestUseCaseImpl$invoke$1 = new SendBreakRequestUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            sendBreakRequestUseCaseImpl$invoke$1 = new SendBreakRequestUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = sendBreakRequestUseCaseImpl$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = sendBreakRequestUseCaseImpl$invoke$1.read;
        int i6 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StartWorkingRepository$startWorking$2 startWorkingRepository$startWorking$2 = new StartWorkingRepository$startWorking$2(this, str, shortNewsContentCardView, i6);
            sendBreakRequestUseCaseImpl$invoke$1.read = 1;
            Object objM4875invokegIAlus = this.RemoteActionCompatParcelizer.m4875invokegIAlus(startWorkingRepository$startWorking$2, sendBreakRequestUseCaseImpl$invoke$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i7 = IconCompatParcelizer + 49;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return null;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i8 = write + 5;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i9 = 89 / 0;
        return obj2;
    }
}
