package com.roadrunner.home.state;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createInAppMessageEventSubscriber;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class RetryExecuteApiRequest$invoke$1 extends ContinuationImpl {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public createInAppMessageEventSubscriber MediaSessionCompatQueueItem;
    public final /* synthetic */ RetryExecuteApiRequest MediaSessionCompatToken;
    public /* synthetic */ Object RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryExecuteApiRequest$invoke$1(RetryExecuteApiRequest retryExecuteApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatToken = retryExecuteApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RatingCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        Object objM4969invoke0E7RQCE = this.MediaSessionCompatToken.m4969invoke0E7RQCE(0, null, this);
        if (objM4969invoke0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = PlaybackStateCompat + 113;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return objM4969invoke0E7RQCE;
            }
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4969invoke0E7RQCE);
        int i3 = PlaybackStateCompatCustomAction + 81;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
