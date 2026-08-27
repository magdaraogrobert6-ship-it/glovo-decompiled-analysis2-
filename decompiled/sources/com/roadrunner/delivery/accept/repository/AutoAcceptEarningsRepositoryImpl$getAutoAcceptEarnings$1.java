package com.roadrunner.delivery.accept.repository;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ InitializeAppStartupItemsImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.serializer + 107;
        com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
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
            int r1 = com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.serializer
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.write = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L27
            r4.RemoteActionCompatParcelizer = r5
            int r5 = r4.read
            r5 = r5 | r3
            r4.read = r5
            com.roadrunner.appinitialize.InitializeAppStartupItemsImpl r5 = r4.IconCompatParcelizer
            java.lang.Object r5 = r5.m4856getAutoAcceptEarningsgIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 17
            int r2 = r2 / 0
            if (r5 != r1) goto L42
            goto L38
        L27:
            r4.RemoteActionCompatParcelizer = r5
            int r5 = r4.read
            r5 = r5 | r3
            r4.read = r5
            com.roadrunner.appinitialize.InitializeAppStartupItemsImpl r5 = r4.IconCompatParcelizer
            java.lang.Object r5 = r5.m4856getAutoAcceptEarningsgIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L42
        L38:
            int r1 = com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.serializer
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.write = r2
            int r1 = r1 % r0
            return r5
        L42:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.repository.AutoAcceptEarningsRepositoryImpl$getAutoAcceptEarnings$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
