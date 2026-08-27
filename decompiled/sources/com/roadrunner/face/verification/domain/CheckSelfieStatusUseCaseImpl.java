package com.roadrunner.face.verification.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.data.SelfieFlowRepository;
import com.roadrunner.face.verification.data.SelfieStatusResponse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.isItemDismissable;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckSelfieStatusUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final SelfieFlowRepository write;

    public CheckSelfieStatusUseCaseImpl(SelfieFlowRepository selfieFlowRepository) {
        selfieFlowRepository.getClass();
        this.write = selfieFlowRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4960invokeIoAF18A(ContinuationImpl continuationImpl) {
        CheckSelfieStatusUseCaseImpl$invoke$1 checkSelfieStatusUseCaseImpl$invoke$1;
        Object objM4958checkSelfieStatusIoAF18A;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof CheckSelfieStatusUseCaseImpl$invoke$1) {
            int i2 = IconCompatParcelizer + 59;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((CheckSelfieStatusUseCaseImpl$invoke$1) continuationImpl).read;
                obj.hashCode();
                throw null;
            }
            checkSelfieStatusUseCaseImpl$invoke$1 = (CheckSelfieStatusUseCaseImpl$invoke$1) continuationImpl;
            int i4 = checkSelfieStatusUseCaseImpl$invoke$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                checkSelfieStatusUseCaseImpl$invoke$1.read = i4 - Integer.MIN_VALUE;
            } else {
                checkSelfieStatusUseCaseImpl$invoke$1 = new CheckSelfieStatusUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            checkSelfieStatusUseCaseImpl$invoke$1 = new CheckSelfieStatusUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj2 = checkSelfieStatusUseCaseImpl$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = checkSelfieStatusUseCaseImpl$invoke$1.read;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            checkSelfieStatusUseCaseImpl$invoke$1.read = 1;
            objM4958checkSelfieStatusIoAF18A = this.write.m4958checkSelfieStatusIoAF18A(checkSelfieStatusUseCaseImpl$invoke$1);
            if (objM4958checkSelfieStatusIoAF18A == coroutineSingletons) {
                int i6 = read + 67;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = IconCompatParcelizer + 77;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4958checkSelfieStatusIoAF18A = ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        return !(objM4958checkSelfieStatusIoAF18A instanceof isItemDismissable) ? Boolean.valueOf(((SelfieStatusResponse) objM4958checkSelfieStatusIoAF18A).isSelfieRequired()) : objM4958checkSelfieStatusIoAF18A;
    }
}
