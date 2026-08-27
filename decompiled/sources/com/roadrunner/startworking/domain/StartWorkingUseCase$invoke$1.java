package com.roadrunner.startworking.domain;

import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class StartWorkingUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object IconCompatParcelizer;
    public Object read;
    public int serializer;
    public final /* synthetic */ C$b write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartWorkingUseCase$invoke$1(C$b c$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = c$b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r0 = 79 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.MediaSessionCompatQueueItem + 37;
        com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.RemoteActionCompatParcelizer
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L27
            r4.IconCompatParcelizer = r5
            int r5 = r4.serializer
            r5 = r5 | r3
            r4.serializer = r5
            com.sentiance.core.model.events.C$b r5 = r4.write
            java.lang.Object r5 = r5.m5075invokegIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 75
            int r2 = r2 / 0
            if (r5 != r1) goto L48
            goto L38
        L27:
            r4.IconCompatParcelizer = r5
            int r5 = r4.serializer
            r5 = r5 | r3
            r4.serializer = r5
            com.sentiance.core.model.events.C$b r5 = r4.write
            java.lang.Object r5 = r5.m5075invokegIAlus(r2, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L48
        L38:
            int r1 = com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.MediaSessionCompatQueueItem
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L47
            r0 = 79
            int r0 = r0 / 0
        L47:
            return r5
        L48:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.startworking.domain.StartWorkingUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
