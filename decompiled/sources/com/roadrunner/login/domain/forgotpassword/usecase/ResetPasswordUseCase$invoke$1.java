package com.roadrunner.login.domain.forgotpassword.usecase;

import androidx.lifecycle.BlockRunner;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetPasswordUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public String IconCompatParcelizer;
    public final /* synthetic */ BlockRunner RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordUseCase$invoke$1(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = blockRunner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.MediaSessionCompatQueueItem + 125;
        com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.MediaSessionCompatQueueItem
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            if (r1 != 0) goto L24
            r4.read = r5
            int r5 = r4.serializer
            r5 = r5 | r2
            r4.serializer = r5
            androidx.lifecycle.BlockRunner r5 = r4.RatingCompat
            r1 = 1
            java.lang.Object r5 = r5.m3947invoke0E7RQCE(r3, r1, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L43
            goto L36
        L24:
            r4.read = r5
            int r5 = r4.serializer
            r5 = r5 | r2
            r4.serializer = r5
            androidx.lifecycle.BlockRunner r5 = r4.RatingCompat
            r1 = 0
            java.lang.Object r5 = r5.m3947invoke0E7RQCE(r3, r1, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L43
        L36:
            int r1 = com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.MediaSessionCompatQueueItem
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L42
            return r5
        L42:
            throw r3
        L43:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
