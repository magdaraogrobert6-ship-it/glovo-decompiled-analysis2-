package com.roadrunner.rider.state.onpause.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class EndBreakUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final OkHttpCall$1 IconCompatParcelizer;

    public EndBreakUseCaseImpl(OkHttpCall$1 okHttpCall$1) {
        this.IconCompatParcelizer = okHttpCall$1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m5027invokeIoAF18A(ContinuationImpl continuationImpl) {
        EndBreakUseCaseImpl$invoke$1 endBreakUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof EndBreakUseCaseImpl$invoke$1) {
            endBreakUseCaseImpl$invoke$1 = (EndBreakUseCaseImpl$invoke$1) continuationImpl;
            int i2 = endBreakUseCaseImpl$invoke$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                endBreakUseCaseImpl$invoke$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                endBreakUseCaseImpl$invoke$1 = new EndBreakUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            endBreakUseCaseImpl$invoke$1 = new EndBreakUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = endBreakUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = endBreakUseCaseImpl$invoke$1.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            endBreakUseCaseImpl$invoke$1.serializer = 1;
            Object objM5199endBreakIoAF18A = this.IconCompatParcelizer.m5199endBreakIoAF18A(endBreakUseCaseImpl$invoke$1);
            if (objM5199endBreakIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i4 = write + 101;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM5199endBreakIoAF18A;
        }
        Object obj2 = null;
        if (i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i6 = write + 41;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        int i8 = RemoteActionCompatParcelizer + 13;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }
}
