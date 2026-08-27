package com.roadrunner.remoteconfig.firebase;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRemoteConfigUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ FetchRemoteConfigUseCaseImpl read;
    public boolean serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRemoteConfigUseCaseImpl$invoke$1(FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = fetchRemoteConfigUseCaseImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r1 = new o.onItemDismiss(r4);
        r4 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.IconCompatParcelizer + 39;
        com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r1 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.IconCompatParcelizer + 31;
        com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L23
            r3.write = r4
            int r4 = r3.RemoteActionCompatParcelizer
            r4 = r4 | r2
            r3.RemoteActionCompatParcelizer = r4
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl r4 = r3.read
            r1 = 1
            java.lang.Object r4 = r4.m5013invokegIAlus(r1, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L3f
            goto L35
        L23:
            r3.write = r4
            int r4 = r3.RemoteActionCompatParcelizer
            r4 = r4 | r2
            r3.RemoteActionCompatParcelizer = r4
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl r4 = r3.read
            r1 = 0
            java.lang.Object r4 = r4.m5013invokegIAlus(r1, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L3f
        L35:
            int r1 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.IconCompatParcelizer
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            return r4
        L3f:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r4)
            int r4 = com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.IconCompatParcelizer
            int r4 = r4 + 39
            int r2 = r4 % 128
            com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L50
            return r1
        L50:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
