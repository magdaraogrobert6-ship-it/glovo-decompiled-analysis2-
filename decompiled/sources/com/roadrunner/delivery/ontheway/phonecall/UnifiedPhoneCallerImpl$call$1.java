package com.roadrunner.delivery.ontheway.phonecall;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedPhoneCallerImpl$call$1 extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ UnifiedPhoneCallerImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPhoneCallerImpl$call$1(UnifiedPhoneCallerImpl unifiedPhoneCallerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = unifiedPhoneCallerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r1 = new o.onItemDismiss(r5);
        r5 = com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.read + 101;
        com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        return r5;
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
            int r1 = com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.write
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.read = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L26
            r4.IconCompatParcelizer = r5
            int r5 = r4.RemoteActionCompatParcelizer
            r5 = r5 | r3
            r4.RemoteActionCompatParcelizer = r5
            com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl r5 = r4.serializer
            java.lang.Object r5 = r5.m4919callgIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 6
            int r2 = r2 / 0
            if (r5 != r1) goto L38
            goto L37
        L26:
            r4.IconCompatParcelizer = r5
            int r5 = r4.RemoteActionCompatParcelizer
            r5 = r5 | r3
            r4.RemoteActionCompatParcelizer = r5
            com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl r5 = r4.serializer
            java.lang.Object r5 = r5.m4919callgIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L38
        L37:
            return r5
        L38:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r5)
            int r5 = com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.read
            int r5 = r5 + 101
            int r2 = r5 % 128
            com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.write = r2
            int r5 = r5 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl$call$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
