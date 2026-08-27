package com.roadrunner.delivery.accept.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptDataRepository$ackOrderSeen$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public String IconCompatParcelizer;
    public final /* synthetic */ DeliveryAcceptDataRepository RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptDataRepository$ackOrderSeen$1(DeliveryAcceptDataRepository deliveryAcceptDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = deliveryAcceptDataRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r1 = new o.onItemDismiss(r9);
        r9 = com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.MediaDescriptionCompat + 67;
        com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.write = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r9 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r9 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        return r9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.MediaDescriptionCompat
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.write = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L28
            r8.read = r9
            int r9 = r8.serializer
            r9 = r9 | r2
            r8.serializer = r9
            com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository r1 = r8.RemoteActionCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = r8
            java.lang.Object r9 = r1.m4909ackOrderSeenyxL6bBk(r2, r3, r4, r5, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r9 != r1) goto L40
            goto L3f
        L28:
            r8.read = r9
            int r9 = r8.serializer
            r9 = r9 | r2
            r8.serializer = r9
            com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository r1 = r8.RemoteActionCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = r8
            java.lang.Object r9 = r1.m4909ackOrderSeenyxL6bBk(r2, r3, r4, r5, r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r9 != r1) goto L40
        L3f:
            return r9
        L40:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r9)
            int r9 = com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.MediaDescriptionCompat
            int r9 = r9 + 67
            int r2 = r9 % 128
            com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.write = r2
            int r9 = r9 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository$ackOrderSeen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
