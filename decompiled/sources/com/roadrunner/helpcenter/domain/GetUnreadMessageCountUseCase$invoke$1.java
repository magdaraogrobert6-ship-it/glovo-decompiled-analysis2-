package com.roadrunner.helpcenter.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class GetUnreadMessageCountUseCase$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetUnreadMessageCountUseCase RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUnreadMessageCountUseCase$invoke$1(GetUnreadMessageCountUseCase getUnreadMessageCountUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getUnreadMessageCountUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.read + 77;
        com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.read
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.write = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            if (r1 != 0) goto L27
            r4.serializer = r5
            int r5 = r4.IconCompatParcelizer
            r5 = r5 | r2
            r4.IconCompatParcelizer = r5
            com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase r5 = r4.RemoteActionCompatParcelizer
            java.lang.Object r5 = r5.m4966invokegIAlus(r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 45
            int r2 = r2 / 0
            if (r5 != r1) goto L45
            goto L38
        L27:
            r4.serializer = r5
            int r5 = r4.IconCompatParcelizer
            r5 = r5 | r2
            r4.IconCompatParcelizer = r5
            com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase r5 = r4.RemoteActionCompatParcelizer
            java.lang.Object r5 = r5.m4966invokegIAlus(r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L45
        L38:
            int r1 = com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.read
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L44
            return r5
        L44:
            throw r3
        L45:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.helpcenter.domain.GetUnreadMessageCountUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
