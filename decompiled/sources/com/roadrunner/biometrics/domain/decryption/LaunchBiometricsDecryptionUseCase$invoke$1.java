package com.roadrunner.biometrics.domain.decryption;

import androidx.lifecycle.BlockRunner;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LaunchBiometricsDecryptionUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ BlockRunner write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchBiometricsDecryptionUseCase$invoke$1(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = blockRunner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r1 = new o.onItemDismiss(r5);
        r5 = com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.IconCompatParcelizer + 89;
        com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.serializer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        return r5;
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
            int r1 = com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.IconCompatParcelizer
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.serializer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            if (r1 == 0) goto L27
            r4.RemoteActionCompatParcelizer = r5
            int r5 = r4.read
            r5 = r5 | r2
            r4.read = r5
            androidx.lifecycle.BlockRunner r5 = r4.write
            java.lang.Object r5 = r5.m3949invokegIAlus(r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 55
            int r2 = r2 / 0
            if (r5 != r1) goto L39
            goto L38
        L27:
            r4.RemoteActionCompatParcelizer = r5
            int r5 = r4.read
            r5 = r5 | r2
            r4.read = r5
            androidx.lifecycle.BlockRunner r5 = r4.write
            java.lang.Object r5 = r5.m3949invokegIAlus(r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L39
        L38:
            return r5
        L39:
            o.onItemDismiss r1 = new o.onItemDismiss
            r1.<init>(r5)
            int r5 = com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.IconCompatParcelizer
            int r5 = r5 + 89
            int r2 = r5 % 128
            com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.serializer = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L4a
            return r1
        L4a:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
