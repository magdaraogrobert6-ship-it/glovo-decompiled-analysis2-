package com.roadrunner.rider.state.searchshifts.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickSessionsRepository$assign$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ QuickSessionsRepository IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickSessionsRepository$assign$1(QuickSessionsRepository quickSessionsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = quickSessionsRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r8 = null;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return new o.onItemDismiss(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r8 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r8 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r1 = com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.read + 21;
        com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.read
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L27
            r7.serializer = r8
            int r8 = r7.write
            r8 = r8 | r2
            r7.write = r8
            com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository r1 = r7.IconCompatParcelizer
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = r7
            java.lang.Object r8 = r1.m5032assignyxL6bBk(r2, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r1) goto L4e
            goto L3d
        L27:
            r7.serializer = r8
            int r8 = r7.write
            r8 = r8 | r2
            r7.write = r8
            com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository r1 = r7.IconCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r7
            java.lang.Object r8 = r1.m5032assignyxL6bBk(r2, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r1) goto L4e
        L3d:
            int r1 = com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.read
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L49
            return r8
        L49:
            r8 = 0
            r8.hashCode()
            throw r8
        L4e:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.searchshifts.data.QuickSessionsRepository$assign$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
