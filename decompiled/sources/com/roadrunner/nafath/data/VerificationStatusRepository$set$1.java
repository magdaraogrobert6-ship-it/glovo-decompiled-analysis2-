package com.roadrunner.nafath.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationStatusRepository$set$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ VerificationStatusRepository serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationStatusRepository$set$1(VerificationStatusRepository verificationStatusRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = verificationStatusRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r1 = new o.onItemDismiss(r5);
        r5 = com.roadrunner.nafath.data.VerificationStatusRepository$set$1.RemoteActionCompatParcelizer + 79;
        com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.nafath.data.VerificationStatusRepository$set$1.RemoteActionCompatParcelizer;
        r2 = r1 + 31;
        com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
        r1 = r1 + 85;
        com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository$set$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            if (r1 != 0) goto L27
            r4.write = r5
            int r5 = r4.IconCompatParcelizer
            r5 = r5 | r2
            r4.IconCompatParcelizer = r5
            com.roadrunner.nafath.data.VerificationStatusRepository r5 = r4.serializer
            java.lang.Object r5 = r5.m4992setgIAlus(r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 96
            int r2 = r2 / 0
            if (r5 != r1) goto L49
            goto L38
        L27:
            r4.write = r5
            int r5 = r4.IconCompatParcelizer
            r5 = r5 | r2
            r4.IconCompatParcelizer = r5
            com.roadrunner.nafath.data.VerificationStatusRepository r5 = r4.serializer
            java.lang.Object r5 = r5.m4992setgIAlus(r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L49
        L38:
            int r1 = com.roadrunner.nafath.data.VerificationStatusRepository$set$1.RemoteActionCompatParcelizer
            int r2 = r1 + 31
            int r3 = r2 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read = r3
            int r2 = r2 % r0
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read = r2
            int r1 = r1 % r0
            return r5
        L49:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r5)
            int r5 = com.roadrunner.nafath.data.VerificationStatusRepository$set$1.RemoteActionCompatParcelizer
            int r5 = r5 + 79
            int r2 = r5 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository$set$1.read = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L5a
            return r1
        L5a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.nafath.data.VerificationStatusRepository$set$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
