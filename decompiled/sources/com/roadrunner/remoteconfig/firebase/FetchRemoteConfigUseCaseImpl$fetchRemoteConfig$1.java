package com.roadrunner.remoteconfig.firebase;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ FetchRemoteConfigUseCaseImpl read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1(FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = fetchRemoteConfigUseCaseImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r1 = new o.onItemDismiss(r4);
        r4 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.RemoteActionCompatParcelizer + 123;
        com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.serializer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
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
            int r1 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.serializer
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L25
            r3.IconCompatParcelizer = r4
            int r4 = r3.write
            r4 = r4 | r2
            r3.write = r4
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl r4 = r3.read
            java.lang.Object r4 = r4.m5012fetchRemoteConfigIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 1
            int r2 = r2 / 0
            if (r4 != r1) goto L37
            goto L36
        L25:
            r3.IconCompatParcelizer = r4
            int r4 = r3.write
            r4 = r4 | r2
            r3.write = r4
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl r4 = r3.read
            java.lang.Object r4 = r4.m5012fetchRemoteConfigIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L37
        L36:
            return r4
        L37:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r4)
            int r4 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.RemoteActionCompatParcelizer
            int r4 = r4 + 123
            int r2 = r4 % 128
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.serializer = r2
            int r4 = r4 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
