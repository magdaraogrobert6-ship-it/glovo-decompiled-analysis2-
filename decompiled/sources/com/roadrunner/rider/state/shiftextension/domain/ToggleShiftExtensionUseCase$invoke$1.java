package com.roadrunner.rider.state.shiftextension.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ToggleShiftExtensionUseCase$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ ToggleShiftExtensionUseCase IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleShiftExtensionUseCase$invoke$1(ToggleShiftExtensionUseCase toggleShiftExtensionUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = toggleShiftExtensionUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return new o.onItemDismiss(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r1 = com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.RemoteActionCompatParcelizer + 105;
        com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.read
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L23
            r3.serializer = r4
            int r4 = r3.write
            r4 = r4 | r2
            r3.write = r4
            com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase r4 = r3.IconCompatParcelizer
            r1 = 1
            java.lang.Object r4 = r4.m5033invokegIAlus(r1, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L3f
            goto L35
        L23:
            r3.serializer = r4
            int r4 = r3.write
            r4 = r4 | r2
            r3.write = r4
            com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase r4 = r3.IconCompatParcelizer
            r1 = 0
            java.lang.Object r4 = r4.m5033invokegIAlus(r1, r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L3f
        L35:
            int r1 = com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.RemoteActionCompatParcelizer
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.read = r2
            int r1 = r1 % r0
            return r4
        L3f:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.shiftextension.domain.ToggleShiftExtensionUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
