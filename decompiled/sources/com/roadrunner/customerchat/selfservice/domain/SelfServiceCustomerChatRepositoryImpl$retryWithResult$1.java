package com.roadrunner.customerchat.selfservice.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$retryWithResult$1 extends ContinuationImpl {
    private static int PlaybackStateCompat = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public int IconCompatParcelizer;
    public createBrazeUserChangeEventSubscriberlambda0 MediaBrowserCompatMediaItem;
    public createInAppMessageEventSubscriber MediaDescriptionCompat;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public /* synthetic */ Object ParcelableVolumeInfo;
    public Object PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public double serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServiceCustomerChatRepositoryImpl$retryWithResult$1(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatResultReceiverWrapper = selfServiceCustomerChatRepositoryImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r0 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return new o.onItemDismiss(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        r1 = com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.PlaybackStateCompat + 1;
        com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.PlaybackStateCompat = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2b
            r11.ParcelableVolumeInfo = r12
            int r12 = r11.MediaSessionCompatToken
            r12 = r12 | r2
            r11.MediaSessionCompatToken = r12
            com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl r1 = r11.MediaSessionCompatResultReceiverWrapper
            r2 = 1
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = r11
            java.lang.Object r12 = r1.m4892retryWithResulthUnOzRk(r2, r3, r5, r7, r9, r10)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r12 != r1) goto L55
            goto L45
        L2b:
            r11.ParcelableVolumeInfo = r12
            int r12 = r11.MediaSessionCompatToken
            r12 = r12 | r2
            r11.MediaSessionCompatToken = r12
            com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl r1 = r11.MediaSessionCompatResultReceiverWrapper
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = r11
            java.lang.Object r12 = r1.m4892retryWithResulthUnOzRk(r2, r3, r5, r7, r9, r10)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r12 != r1) goto L55
        L45:
            int r1 = com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.PlaybackStateCompat
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L54
            r0 = 13
            int r0 = r0 / 0
        L54:
            return r12
        L55:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$retryWithResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
