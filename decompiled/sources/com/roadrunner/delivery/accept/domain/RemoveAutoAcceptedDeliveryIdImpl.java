package com.roadrunner.delivery.accept.domain;

import o.ShadowSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoveAutoAcceptedDeliveryIdImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final ShadowSpan IconCompatParcelizer;

    public /* synthetic */ RemoveAutoAcceptedDeliveryIdImpl(ShadowSpan shadowSpan) {
        this.IconCompatParcelizer = shadowSpan;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r10 == r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(long r8, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.LineBreakSaverlambda1
            if (r1 == 0) goto L16
            r1 = r10
            o.LineBreakSaverlambda1 r1 = (o.LineBreakSaverlambda1) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L1b
        L16:
            o.LineBreakSaverlambda1 r1 = new o.LineBreakSaverlambda1
            r1.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r1.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.RemoteActionCompatParcelizer
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L4d
            if (r3 == r5) goto L47
            if (r3 != r0) goto L41
            int r8 = com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl.RemoteActionCompatParcelizer
            int r8 = r8 + 101
            int r9 = r8 % 128
            com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl.serializer = r9
            int r8 = r8 % r0
            long r8 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            int r1 = com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl.RemoteActionCompatParcelizer
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl.serializer = r2
            int r1 = r1 % r0
            goto L74
        L41:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r4
        L47:
            long r8 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L67
        L4d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r1.IconCompatParcelizer = r8
            r1.RemoteActionCompatParcelizer = r5
            kotlinx.coroutines.scheduling.DefaultScheduler r10 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r10 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            o.ShadowSpan r3 = r7.IconCompatParcelizer
            com.roadrunner.map.container.maplayer.MapLayersUiModel$1 r5 = new com.roadrunner.map.container.maplayer.MapLayersUiModel$1
            r6 = 7
            r5.<init>(r3, r4, r6)
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r5, r1)
            if (r10 != r2) goto L67
            goto L73
        L67:
            kotlinx.coroutines.flow.Flow r10 = (kotlinx.coroutines.flow.Flow) r10
            r1.IconCompatParcelizer = r8
            r1.RemoteActionCompatParcelizer = r0
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r10, r1)
            if (r10 != r2) goto L74
        L73:
            return r2
        L74:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L7a
            o.instance_delegatelambda0 r10 = o.instance_delegatelambda0.write
        L7a:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            boolean r8 = r10.contains(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl.invoke(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
