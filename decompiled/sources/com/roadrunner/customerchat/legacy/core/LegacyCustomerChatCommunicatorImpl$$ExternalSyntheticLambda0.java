package com.roadrunner.customerchat.legacy.core;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ LegacyCustomerChatCommunicatorImpl serializer;

    public /* synthetic */ LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0(LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = legacyCustomerChatCommunicatorImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5.getClass();
        r0 = new io.reactivex.internal.operators.completable.CompletableOnErrorComplete(new io.reactivex.internal.operators.completable.CompletableFromAction(new com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3(r5, 14, r2)));
        r1 = io.reactivex.Flowable.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        return new io.reactivex.internal.operators.mixed.CompletableAndThenPublisher(r0, new io.reactivex.internal.operators.flowable.FlowableJust(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r5.getClass();
        r1 = new io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3(r2, 6, r5);
        r5 = io.reactivex.Flowable.write;
        r5 = new io.reactivex.internal.operators.flowable.FlowableFromCallable(r1);
        r1 = com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.IconCompatParcelizer + 63;
        com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.IconCompatParcelizer
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.read = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            int r1 = r4.RemoteActionCompatParcelizer
            com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl r2 = r4.serializer
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r3 = 89
            int r3 = r3 / 0
            if (r1 == 0) goto L3d
            goto L23
        L1b:
            int r1 = r4.RemoteActionCompatParcelizer
            com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl r2 = r4.serializer
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r1 == 0) goto L3d
        L23:
            r5.getClass()
            io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3 r1 = new io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3
            r3 = 6
            r1.<init>(r2, r3, r5)
            int r5 = io.reactivex.Flowable.write
            io.reactivex.internal.operators.flowable.FlowableFromCallable r5 = new io.reactivex.internal.operators.flowable.FlowableFromCallable
            r5.<init>(r1)
            int r1 = com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.IconCompatParcelizer
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.read = r2
            int r1 = r1 % r0
            return r5
        L3d:
            r5.getClass()
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3 r0 = new com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3
            r1 = 14
            r0.<init>(r5, r1, r2)
            io.reactivex.internal.operators.completable.CompletableFromAction r1 = new io.reactivex.internal.operators.completable.CompletableFromAction
            r1.<init>(r0)
            io.reactivex.internal.operators.completable.CompletableOnErrorComplete r0 = new io.reactivex.internal.operators.completable.CompletableOnErrorComplete
            r0.<init>(r1)
            int r1 = io.reactivex.Flowable.write
            io.reactivex.internal.operators.flowable.FlowableJust r1 = new io.reactivex.internal.operators.flowable.FlowableJust
            r1.<init>(r5)
            io.reactivex.internal.operators.mixed.CompletableAndThenPublisher r5 = new io.reactivex.internal.operators.mixed.CompletableAndThenPublisher
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0.invoke(java.lang.Object):java.lang.Object");
    }
}
