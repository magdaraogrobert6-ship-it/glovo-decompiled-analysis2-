package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$initiatePostApiCall$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ConfirmationRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationRepository$initiatePostApiCall$1(ConfirmationRepository confirmationRepository, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = confirmationRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return new o.onItemDismiss(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.serializer + 45;
        r2 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.read = r2;
        r1 = r1 % 2;
        r2 = r2 + 99;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.serializer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.read
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.serializer = r2
            int r1 = r1 % r0
            r2 = 45
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r1 != 0) goto L27
            r5.IconCompatParcelizer = r6
            int r6 = r5.RemoteActionCompatParcelizer
            r6 = r6 | r3
            r5.RemoteActionCompatParcelizer = r6
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r6 = r5.write
            java.lang.Object r6 = r6.m4925initiatePostApiCall0E7RQCE(r4, r4, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r2 / 0
            if (r6 != r1) goto L4e
            goto L38
        L27:
            r5.IconCompatParcelizer = r6
            int r6 = r5.RemoteActionCompatParcelizer
            r6 = r6 | r3
            r5.RemoteActionCompatParcelizer = r6
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r6 = r5.write
            java.lang.Object r6 = r6.m4925initiatePostApiCall0E7RQCE(r4, r4, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r1) goto L4e
        L38:
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.serializer
            int r1 = r1 + r2
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.read = r2
            int r1 = r1 % r0
            int r2 = r2 + 99
            int r1 = r2 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.serializer = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L4a
            return r6
        L4a:
            r4.hashCode()
            throw r4
        L4e:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePostApiCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
