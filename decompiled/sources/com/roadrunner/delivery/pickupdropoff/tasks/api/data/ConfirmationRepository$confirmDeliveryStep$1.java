package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$confirmDeliveryStep$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ ConfirmationRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationRepository$confirmDeliveryStep$1(ConfirmationRepository confirmationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = confirmationRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r1 = new o.onItemDismiss(r8);
        r8 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.read + 95;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r8 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r8 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        return r8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.IconCompatParcelizer
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.read = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L2a
            r7.serializer = r8
            int r8 = r7.RemoteActionCompatParcelizer
            r8 = r8 | r2
            r7.RemoteActionCompatParcelizer = r8
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r1 = r7.write
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r7
            java.lang.Object r8 = r1.m4923confirmDeliveryStepyxL6bBk(r2, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 1
            int r2 = r2 / 0
            if (r8 != r1) goto L41
            goto L40
        L2a:
            r7.serializer = r8
            int r8 = r7.RemoteActionCompatParcelizer
            r8 = r8 | r2
            r7.RemoteActionCompatParcelizer = r8
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r1 = r7.write
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r7
            java.lang.Object r8 = r1.m4923confirmDeliveryStepyxL6bBk(r2, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r1) goto L41
        L40:
            return r8
        L41:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r8)
            int r8 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.read
            int r8 = r8 + 95
            int r2 = r8 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.IconCompatParcelizer = r2
            int r8 = r8 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$confirmDeliveryStep$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
