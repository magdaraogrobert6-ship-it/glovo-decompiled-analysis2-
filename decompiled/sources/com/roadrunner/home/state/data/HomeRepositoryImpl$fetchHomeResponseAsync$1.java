package com.roadrunner.home.state.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$fetchHomeResponseAsync$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ HomeRepositoryImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$fetchHomeResponseAsync$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = homeRepositoryImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r2 = 22 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r1 = r1 + 69;
        com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return new o.onItemDismiss(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r1 = com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.write;
        r2 = r1 + 29;
        com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.RemoteActionCompatParcelizer
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.write = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L24
            r5.IconCompatParcelizer = r6
            int r6 = r5.read
            r6 = r6 | r2
            r5.read = r6
            com.roadrunner.home.state.data.HomeRepositoryImpl r6 = r5.serializer
            java.lang.Object r6 = r6.m4971fetchHomeResponseAsyncBWLJW6A(r4, r4, r5, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r1) goto L4b
            goto L35
        L24:
            r5.IconCompatParcelizer = r6
            int r6 = r5.read
            r6 = r6 | r2
            r5.read = r6
            com.roadrunner.home.state.data.HomeRepositoryImpl r6 = r5.serializer
            java.lang.Object r6 = r6.m4971fetchHomeResponseAsyncBWLJW6A(r4, r4, r5, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r1) goto L4b
        L35:
            int r1 = com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.write
            int r2 = r1 + 29
            int r4 = r2 % 128
            com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.RemoteActionCompatParcelizer = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L43
            r2 = 22
            int r2 = r2 / r3
        L43:
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r6
        L4b:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.state.data.HomeRepositoryImpl$fetchHomeResponseAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
