package com.roadrunner.order.history.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryApiRequest$getHistory$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ HistoryApiRequest RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryApiRequest$getHistory$1(HistoryApiRequest historyApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = historyApiRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r0 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return new o.onItemDismiss(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r7 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r7 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.serializer + 9;
        com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.IconCompatParcelizer
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L25
            r6.read = r7
            int r7 = r6.write
            r7 = r7 | r5
            r6.write = r7
            com.roadrunner.order.history.data.network.HistoryApiRequest r7 = r6.RemoteActionCompatParcelizer
            java.lang.Object r7 = r7.m4998getHistory0E7RQCE(r3, r2, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r1) goto L46
            goto L36
        L25:
            r6.read = r7
            int r7 = r6.write
            r7 = r7 | r5
            r6.write = r7
            com.roadrunner.order.history.data.network.HistoryApiRequest r7 = r6.RemoteActionCompatParcelizer
            java.lang.Object r7 = r7.m4998getHistory0E7RQCE(r3, r2, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r1) goto L46
        L36:
            int r1 = com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.serializer
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L45
            r0 = 90
            int r0 = r0 / 0
        L45:
            return r7
        L46:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
