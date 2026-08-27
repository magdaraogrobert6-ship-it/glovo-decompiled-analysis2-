package com.roadrunner.auth.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getSelectableGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository$verifyTwoFaCode$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public int IconCompatParcelizer;
    public getSelectableGroup RemoteActionCompatParcelizer;
    public final /* synthetic */ AuthRepository read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepository$verifyTwoFaCode$1(AuthRepository authRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = authRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r1 = com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.write + 83;
        com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.MediaSessionCompatQueueItem
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.write = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            if (r1 == 0) goto L26
            r4.serializer = r5
            int r5 = r4.IconCompatParcelizer
            r5 = r5 | r2
            r4.IconCompatParcelizer = r5
            com.roadrunner.auth.data.AuthRepository r5 = r4.read
            java.lang.Object r5 = r5.m4862verifyTwoFaCode0E7RQCE(r3, r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 5
            int r2 = r2 / 0
            if (r5 != r1) goto L47
            goto L37
        L26:
            r4.serializer = r5
            int r5 = r4.IconCompatParcelizer
            r5 = r5 | r2
            r4.IconCompatParcelizer = r5
            com.roadrunner.auth.data.AuthRepository r5 = r4.read
            java.lang.Object r5 = r5.m4862verifyTwoFaCode0E7RQCE(r3, r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L47
        L37:
            int r1 = com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.write
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L43
            return r5
        L43:
            r3.hashCode()
            throw r3
        L47:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.data.AuthRepository$verifyTwoFaCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
