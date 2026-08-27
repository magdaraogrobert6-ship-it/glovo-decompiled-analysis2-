package com.roadrunner.delivery.pickupdropoff.tasks.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TasksRepository$getDeliveryAnalytics$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ TasksRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksRepository$getDeliveryAnalytics$1(TasksRepository tasksRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = tasksRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r1 = new o.onItemDismiss(r7);
        r7 = com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.write + 73;
        com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.RemoteActionCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if ((r7 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r7 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r7 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return r7;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.RemoteActionCompatParcelizer
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.write = r2
            int r1 = r1 % r0
            r2 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r1 != 0) goto L25
            r6.read = r7
            int r7 = r6.IconCompatParcelizer
            r7 = r7 | r4
            r6.IconCompatParcelizer = r7
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository r7 = r6.serializer
            java.lang.Object r7 = r7.m4933getDeliveryAnalytics0E7RQCE$implementation(r2, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r1) goto L37
            goto L36
        L25:
            r6.read = r7
            int r7 = r6.IconCompatParcelizer
            r7 = r7 | r4
            r6.IconCompatParcelizer = r7
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository r7 = r6.serializer
            java.lang.Object r7 = r7.m4933getDeliveryAnalytics0E7RQCE$implementation(r2, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r1) goto L37
        L36:
            return r7
        L37:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r7)
            int r7 = com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.write
            int r7 = r7 + 73
            int r2 = r7 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.RemoteActionCompatParcelizer = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L48
            return r1
        L48:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$getDeliveryAnalytics$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
