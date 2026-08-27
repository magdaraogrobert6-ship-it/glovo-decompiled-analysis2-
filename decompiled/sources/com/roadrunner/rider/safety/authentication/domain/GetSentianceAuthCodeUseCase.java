package com.roadrunner.rider.safety.authentication.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.safety.authentication.data.RiderSafetyRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetSentianceAuthCodeUseCase {
    private static int read = 1;
    private static int serializer;
    public final RiderSafetyRepository write;

    public GetSentianceAuthCodeUseCase(RiderSafetyRepository riderSafetyRepository) {
        riderSafetyRepository.getClass();
        this.write = riderSafetyRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m5024invokeIoAF18A(ContinuationImpl continuationImpl) {
        GetSentianceAuthCodeUseCase$invoke$1 getSentianceAuthCodeUseCase$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof GetSentianceAuthCodeUseCase$invoke$1) {
            getSentianceAuthCodeUseCase$invoke$1 = (GetSentianceAuthCodeUseCase$invoke$1) continuationImpl;
            int i2 = getSentianceAuthCodeUseCase$invoke$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = serializer + 41;
                read = i3 % Fields.SpotShadowColor;
                getSentianceAuthCodeUseCase$invoke$1.IconCompatParcelizer = i3 % 2 == 0 ? i2 / Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                getSentianceAuthCodeUseCase$invoke$1 = new GetSentianceAuthCodeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getSentianceAuthCodeUseCase$invoke$1 = new GetSentianceAuthCodeUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getSentianceAuthCodeUseCase$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getSentianceAuthCodeUseCase$invoke$1.IconCompatParcelizer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getSentianceAuthCodeUseCase$invoke$1.IconCompatParcelizer = 1;
            Object objM5023getSentianceAuthCodeIoAF18A = this.write.m5023getSentianceAuthCodeIoAF18A(getSentianceAuthCodeUseCase$invoke$1);
            if (objM5023getSentianceAuthCodeIoAF18A != coroutineSingletons) {
                return objM5023getSentianceAuthCodeIoAF18A;
            }
            int i5 = read + 49;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return coroutineSingletons;
        }
        if (i4 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i7 = read + 77;
        serializer = i7 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }
}
