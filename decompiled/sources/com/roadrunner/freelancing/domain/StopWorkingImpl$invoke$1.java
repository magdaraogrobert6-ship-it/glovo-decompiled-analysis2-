package com.roadrunner.freelancing.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class StopWorkingImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ StopWorkingImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopWorkingImpl$invoke$1(StopWorkingImpl stopWorkingImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = stopWorkingImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return new o.onItemDismiss(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r1 = com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.IconCompatParcelizer + 41;
        com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.read
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L26
            r3.write = r4
            int r4 = r3.RemoteActionCompatParcelizer
            r4 = r4 | r2
            r3.RemoteActionCompatParcelizer = r4
            com.roadrunner.freelancing.domain.StopWorkingImpl r4 = r3.serializer
            java.lang.Object r4 = r4.m4964invokeIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 83
            int r2 = r2 / 0
            if (r4 != r1) goto L41
            goto L37
        L26:
            r3.write = r4
            int r4 = r3.RemoteActionCompatParcelizer
            r4 = r4 | r2
            r3.RemoteActionCompatParcelizer = r4
            com.roadrunner.freelancing.domain.StopWorkingImpl r4 = r3.serializer
            java.lang.Object r4 = r4.m4964invokeIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L41
        L37:
            int r1 = com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.IconCompatParcelizer
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.read = r2
            int r1 = r1 % r0
            return r4
        L41:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.freelancing.domain.StopWorkingImpl$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
