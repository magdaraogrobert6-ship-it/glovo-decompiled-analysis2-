package com.roadrunner.nafath.data;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.resetTransientState;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationStatusRepository {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final SharedFlowImpl read;
    public final resetTransientState write;

    public VerificationStatusRepository(resetTransientState resettransientstate) {
        resettransientstate.getClass();
        this.write = resettransientstate;
        this.read = SharedFlowKt.RemoteActionCompatParcelizer(0, 0, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r10.emit(null, r1) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r10.emit(r9, r1) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        r9 = com.roadrunner.nafath.data.VerificationStatusRepository.IconCompatParcelizer + 79;
        com.roadrunner.nafath.data.VerificationStatusRepository.serializer = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: set-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4992setgIAlus(o.getMaxFlingVelocity r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof com.roadrunner.nafath.data.VerificationStatusRepository$set$1
            if (r1 == 0) goto L1f
            r1 = r10
            com.roadrunner.nafath.data.VerificationStatusRepository$set$1 r1 = (com.roadrunner.nafath.data.VerificationStatusRepository$set$1) r1
            int r2 = r1.IconCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.IconCompatParcelizer = r2
            int r10 = com.roadrunner.nafath.data.VerificationStatusRepository.serializer
            int r10 = r10 + 123
            int r2 = r10 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository.IconCompatParcelizer = r2
            int r10 = r10 % r0
            goto L24
        L1f:
            com.roadrunner.nafath.data.VerificationStatusRepository$set$1 r1 = new com.roadrunner.nafath.data.VerificationStatusRepository$set$1
            r1.<init>(r8, r10)
        L24:
            java.lang.Object r10 = r1.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.IconCompatParcelizer
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            r5 = 0
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L4c
            if (r3 == r6) goto L48
            int r9 = com.roadrunner.nafath.data.VerificationStatusRepository.IconCompatParcelizer
            int r9 = r9 + 87
            int r1 = r9 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository.serializer = r1
            int r9 = r9 % r0
            if (r3 != r0) goto L42
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            return r4
        L42:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r5
        L48:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            return r4
        L4c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            kotlinx.coroutines.flow.SharedFlowImpl r10 = r8.read
            if (r9 != 0) goto L65
            timber.log.Timber$Forest r9 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r7 = "Verification status cleared"
            r9.IconCompatParcelizer(r7, r3)
            r1.IconCompatParcelizer = r6
            java.lang.Object r9 = r10.emit(r5, r1)
            if (r9 != r2) goto L8d
            goto L8c
        L65:
            o.resetTransientState r3 = r8.write     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            o.SwipeDismissTouchListenerVerticalDismissDirection r9 = r9.jsonBody     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            r3.getClass()     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            com.roadrunner.nafath.VerificationStatus$Companion r5 = o.q1.Companion     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            o.setGraphicModalMaxWidthDp r5 = r5.serializer()     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            r6 = r5
            o.setGraphicModalMaxWidthDp r6 = (o.setGraphicModalMaxWidthDp) r6     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            java.lang.Object r9 = r3.IconCompatParcelizer(r5, r9)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            o.q1 r9 = (o.q1) r9     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            timber.log.Timber$Forest r3 = timber.log.Timber.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            java.lang.String r6 = "Verification status updated"
            r3.IconCompatParcelizer(r6, r5)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            r1.IconCompatParcelizer = r0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            java.lang.Object r9 = r10.emit(r9, r1)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> La7
            if (r9 != r2) goto L8d
        L8c:
            return r2
        L8d:
            int r9 = com.roadrunner.nafath.data.VerificationStatusRepository.IconCompatParcelizer
            int r9 = r9 + 79
            int r10 = r9 % 128
            com.roadrunner.nafath.data.VerificationStatusRepository.serializer = r10
            int r9 = r9 % r0
            return r4
        L97:
            r9 = move-exception
            timber.log.Timber$Forest r10 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = "Failed to parse verification status from home response"
            r10.RemoteActionCompatParcelizer(r9, r1, r0)
            o.isItemDismissable r10 = new o.isItemDismissable
            r10.<init>(r9)
            return r10
        La7:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.nafath.data.VerificationStatusRepository.m4992setgIAlus(o.getMaxFlingVelocity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
