package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain;

import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class NotifyUtccTimerStartedUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ InitiateTransferChangeUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyUtccTimerStartedUseCase$invoke$1(InitiateTransferChangeUseCase initiateTransferChangeUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = initiateTransferChangeUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.IconCompatParcelizer + 35;
        com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.RemoteActionCompatParcelizer
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L27
            r4.serializer = r5
            int r5 = r4.read
            r5 = r5 | r3
            r4.read = r5
            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase r5 = r4.write
            java.lang.Object r5 = r5.m4930invokegIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 34
            int r2 = r2 / 0
            if (r5 != r1) goto L42
            goto L38
        L27:
            r4.serializer = r5
            int r5 = r4.read
            r5 = r5 | r3
            r4.read = r5
            com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase r5 = r4.write
            java.lang.Object r5 = r5.m4930invokegIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L42
        L38:
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.IconCompatParcelizer
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r5
        L42:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
