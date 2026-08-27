package com.roadrunner.home.nest.divider;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.laststop.domain.UpdateNestComponentUseCaseImpl$invoke$1;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveDivider {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final NestComponentRepositoryImpl IconCompatParcelizer;

    public ObserveDivider(NestComponentRepositoryImpl nestComponentRepositoryImpl, int i) {
        if (i != 1) {
            nestComponentRepositoryImpl.getClass();
            this.IconCompatParcelizer = nestComponentRepositoryImpl;
        } else {
            this.IconCompatParcelizer = nestComponentRepositoryImpl;
        }
    }

    public ObserveDivider(NestComponentRepositoryImpl nestComponentRepositoryImpl, BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21) {
        this.IconCompatParcelizer = nestComponentRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public Object m4968invokeIoAF18A(ContinuationImpl continuationImpl) {
        UpdateNestComponentUseCaseImpl$invoke$1 updateNestComponentUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (continuationImpl instanceof UpdateNestComponentUseCaseImpl$invoke$1) {
            updateNestComponentUseCaseImpl$invoke$1 = (UpdateNestComponentUseCaseImpl$invoke$1) continuationImpl;
            int i2 = updateNestComponentUseCaseImpl$invoke$1.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateNestComponentUseCaseImpl$invoke$1.serializer = i2 - Integer.MIN_VALUE;
            } else {
                updateNestComponentUseCaseImpl$invoke$1 = new UpdateNestComponentUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            updateNestComponentUseCaseImpl$invoke$1 = new UpdateNestComponentUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj = updateNestComponentUseCaseImpl$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = updateNestComponentUseCaseImpl$invoke$1.serializer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            updateNestComponentUseCaseImpl$invoke$1.serializer = 1;
            Object objM4967loadIoAF18A = this.IconCompatParcelizer.m4967loadIoAF18A(updateNestComponentUseCaseImpl$invoke$1);
            return objM4967loadIoAF18A == coroutineSingletons ? coroutineSingletons : objM4967loadIoAF18A;
        }
        int i4 = RemoteActionCompatParcelizer + 37;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i6 = RemoteActionCompatParcelizer + 9;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
