package com.roadrunner.home.state.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$waitForRiderHomeToComplete$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ HomeRepositoryImpl RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$waitForRiderHomeToComplete$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = homeRepositoryImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r1 = new o.onItemDismiss(r4);
        r4 = com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.write + 105;
        com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.serializer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        return r4;
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
            int r1 = com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.write
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.serializer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L26
            r3.IconCompatParcelizer = r4
            int r4 = r3.read
            r4 = r4 | r2
            r3.read = r4
            com.roadrunner.home.state.data.HomeRepositoryImpl r4 = r3.RemoteActionCompatParcelizer
            java.lang.Object r4 = r4.m4980waitForRiderHomeToCompleteIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 69
            int r2 = r2 / 0
            if (r4 != r1) goto L38
            goto L37
        L26:
            r3.IconCompatParcelizer = r4
            int r4 = r3.read
            r4 = r4 | r2
            r3.read = r4
            com.roadrunner.home.state.data.HomeRepositoryImpl r4 = r3.RemoteActionCompatParcelizer
            java.lang.Object r4 = r4.m4980waitForRiderHomeToCompleteIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L38
        L37:
            return r4
        L38:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r4)
            int r4 = com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.write
            int r4 = r4 + 105
            int r2 = r4 % 128
            com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.serializer = r2
            int r4 = r4 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.state.data.HomeRepositoryImpl$waitForRiderHomeToComplete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
