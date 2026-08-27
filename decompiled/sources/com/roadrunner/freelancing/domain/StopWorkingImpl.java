package com.roadrunner.freelancing.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class StopWorkingImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final Parser.Pair read;

    public StopWorkingImpl(Parser.Pair pair) {
        this.read = pair;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4964invokeIoAF18A(ContinuationImpl continuationImpl) {
        StopWorkingImpl$invoke$1 stopWorkingImpl$invoke$1;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 75;
        int i4 = i3 % Fields.SpotShadowColor;
        serializer = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = continuationImpl instanceof StopWorkingImpl$invoke$1;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof StopWorkingImpl$invoke$1) {
            int i5 = i4 + 23;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((StopWorkingImpl$invoke$1) continuationImpl).RemoteActionCompatParcelizer;
                throw null;
            }
            stopWorkingImpl$invoke$1 = (StopWorkingImpl$invoke$1) continuationImpl;
            int i7 = stopWorkingImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                stopWorkingImpl$invoke$1.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                stopWorkingImpl$invoke$1 = new StopWorkingImpl$invoke$1(this, continuationImpl);
                i = serializer + 121;
                IconCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i8 = 5 / 3;
                }
            }
        } else {
            stopWorkingImpl$invoke$1 = new StopWorkingImpl$invoke$1(this, continuationImpl);
            i = serializer + 121;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i9 = 5 / 3;
            }
        }
        Object obj2 = stopWorkingImpl$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = stopWorkingImpl$invoke$1.RemoteActionCompatParcelizer;
        if (i10 != 0) {
            if (i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return ((onItemDismiss) obj2).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i11 = IconCompatParcelizer + 55;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        stopWorkingImpl$invoke$1.RemoteActionCompatParcelizer = 1;
        Object objM4502stopWorkingIoAF18A = this.read.m4502stopWorkingIoAF18A(stopWorkingImpl$invoke$1);
        if (objM4502stopWorkingIoAF18A != coroutineSingletons) {
            return objM4502stopWorkingIoAF18A;
        }
        int i12 = serializer + 121;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return coroutineSingletons;
    }
}
