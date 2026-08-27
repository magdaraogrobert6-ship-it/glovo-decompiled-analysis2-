package com.roadrunner.startworking.domain.stopworking;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class StopWorkingUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final OkHttpCall$1 IconCompatParcelizer;

    public StopWorkingUseCaseImpl(OkHttpCall$1 okHttpCall$1) {
        okHttpCall$1.getClass();
        this.IconCompatParcelizer = okHttpCall$1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m5071invokeIoAF18A(ContinuationImpl continuationImpl) {
        StopWorkingUseCaseImpl$invoke$1 stopWorkingUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof StopWorkingUseCaseImpl$invoke$1) {
            int i2 = serializer + 75;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            stopWorkingUseCaseImpl$invoke$1 = (StopWorkingUseCaseImpl$invoke$1) continuationImpl;
            int i4 = stopWorkingUseCaseImpl$invoke$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = serializer + 21;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    stopWorkingUseCaseImpl$invoke$1.IconCompatParcelizer = i4 << Integer.MIN_VALUE;
                } else {
                    stopWorkingUseCaseImpl$invoke$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
                }
            } else {
                stopWorkingUseCaseImpl$invoke$1 = new StopWorkingUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            stopWorkingUseCaseImpl$invoke$1 = new StopWorkingUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = stopWorkingUseCaseImpl$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = stopWorkingUseCaseImpl$invoke$1.IconCompatParcelizer;
        Object obj2 = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            stopWorkingUseCaseImpl$invoke$1.IconCompatParcelizer = 1;
            Object objM5200stopWorkingIoAF18A = this.IconCompatParcelizer.m5200stopWorkingIoAF18A(stopWorkingUseCaseImpl$invoke$1);
            if (objM5200stopWorkingIoAF18A != coroutineSingletons) {
                return objM5200stopWorkingIoAF18A;
            }
            int i7 = serializer + 71;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i8 = serializer + 69;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }
}
