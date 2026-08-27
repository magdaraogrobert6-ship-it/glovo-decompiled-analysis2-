package com.roadrunner.remoteconfig.firebase.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ FirebaseRemoteConfigProvider write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1(FirebaseRemoteConfigProvider firebaseRemoteConfigProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = firebaseRemoteConfigProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r1 = new o.onItemDismiss(r4);
        r4 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.read + 37;
        com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.serializer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
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
            int r1 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.serializer
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.read = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L24
            r3.RemoteActionCompatParcelizer = r4
            int r4 = r3.IconCompatParcelizer
            r4 = r4 | r2
            r3.IconCompatParcelizer = r4
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider r4 = r3.write
            java.lang.Object r4 = r4.m5015resetAndSyncRemoteConfigIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0 / 0
            if (r4 != r1) goto L36
            goto L35
        L24:
            r3.RemoteActionCompatParcelizer = r4
            int r4 = r3.IconCompatParcelizer
            r4 = r4 | r2
            r3.IconCompatParcelizer = r4
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider r4 = r3.write
            java.lang.Object r4 = r4.m5015resetAndSyncRemoteConfigIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L36
        L35:
            return r4
        L36:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r4)
            int r4 = com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.read
            int r4 = r4 + 37
            int r2 = r4 % 128
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.serializer = r2
            int r4 = r4 % r0
            if (r4 == 0) goto L47
            return r1
        L47:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider$resetAndSyncRemoteConfig$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
