package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getPositionannotations;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDeliveryAnalyticsUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetDeliveryAnalyticsUseCaseImpl MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public getPositionannotations RemoteActionCompatParcelizer;
    public String read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeliveryAnalyticsUseCaseImpl$invoke$1(GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = getDeliveryAnalyticsUseCaseImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return new o.onItemDismiss(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r6 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem + 49;
        com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.MediaMetadataCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
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
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L25
            r5.MediaSessionCompatQueueItem = r6
            int r6 = r5.RatingCompat
            r6 = r6 | r3
            r5.RatingCompat = r6
            com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl r6 = r5.MediaDescriptionCompat
            r3 = 1
            java.lang.Object r6 = r6.m4939invoke0E7RQCE(r3, r2, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r1) goto L42
            goto L38
        L25:
            r5.MediaSessionCompatQueueItem = r6
            int r6 = r5.RatingCompat
            r6 = r6 | r3
            r5.RatingCompat = r6
            com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl r6 = r5.MediaDescriptionCompat
            r3 = 0
            java.lang.Object r6 = r6.m4939invoke0E7RQCE(r3, r2, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r1) goto L42
        L38:
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.MediaBrowserCompatMediaItem
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.MediaMetadataCompat = r2
            int r1 = r1 % r0
            return r6
        L42:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
