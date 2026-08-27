package com.roadrunner.rider.state.shiftextension.data;

import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ShiftExtensionRepository$toggleShiftExtension$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ H$b IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftExtensionRepository$toggleShiftExtension$1(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = h$b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r1 = com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.read + 43;
        com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.read
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L23
            r4.serializer = r5
            int r5 = r4.write
            r5 = r5 | r3
            r4.write = r5
            com.sentiance.core.model.events.H$b r5 = r4.IconCompatParcelizer
            java.lang.Object r5 = r5.m5077toggleShiftExtensiongIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L3e
            goto L34
        L23:
            r4.serializer = r5
            int r5 = r4.write
            r5 = r5 | r3
            r4.write = r5
            com.sentiance.core.model.events.H$b r5 = r4.IconCompatParcelizer
            java.lang.Object r5 = r5.m5077toggleShiftExtensiongIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L3e
        L34:
            int r1 = com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.read
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r5
        L3e:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.shiftextension.data.ShiftExtensionRepository$toggleShiftExtension$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
