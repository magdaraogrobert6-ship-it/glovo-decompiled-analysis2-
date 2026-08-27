package com.roadrunner.auth.domain.magiclink;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.copyTextdefault;
import o.dismiss;
import o.getTextSelectionRange;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMagicLinkUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public copyTextdefault IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final /* synthetic */ VerifyMagicLinkUseCaseImpl RatingCompat;
    public getTextSelectionRange RemoteActionCompatParcelizer;
    public boolean read;
    public int serializer;
    public dismiss write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMagicLinkUseCaseImpl$invoke$1(VerifyMagicLinkUseCaseImpl verifyMagicLinkUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = verifyMagicLinkUseCaseImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return new o.onItemDismiss(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r5 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem + 31;
        com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.MediaSessionCompatQueueItem
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            if (r1 == 0) goto L27
            r4.MediaDescriptionCompat = r5
            int r5 = r4.MediaMetadataCompat
            r5 = r5 | r2
            r4.MediaMetadataCompat = r5
            com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl r5 = r4.RatingCompat
            java.lang.Object r5 = r5.m4872invoke0E7RQCE(r3, r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 68
            int r2 = r2 / 0
            if (r5 != r1) goto L45
            goto L38
        L27:
            r4.MediaDescriptionCompat = r5
            int r5 = r4.MediaMetadataCompat
            r5 = r5 | r2
            r4.MediaMetadataCompat = r5
            com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl r5 = r4.RatingCompat
            java.lang.Object r5 = r5.m4872invoke0E7RQCE(r3, r3, r4)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r1) goto L45
        L38:
            int r1 = com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L44
            return r5
        L44:
            throw r3
        L45:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
