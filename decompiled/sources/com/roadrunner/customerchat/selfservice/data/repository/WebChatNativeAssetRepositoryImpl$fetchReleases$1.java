package com.roadrunner.customerchat.selfservice.data.repository;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatNativeAssetRepositoryImpl$fetchReleases$1 extends ContinuationImpl {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public setCustomInAppMessageAnimationFactorylambda0 MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final /* synthetic */ WebChatNativeAssetRepositoryImpl MediaSessionCompatToken;
    public /* synthetic */ Object ParcelableVolumeInfo;
    public String RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatNativeAssetRepositoryImpl$fetchReleases$1(WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatToken = webChatNativeAssetRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 109;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.ParcelableVolumeInfo = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        Object objM4884fetchReleaseseH_QyT8 = this.MediaSessionCompatToken.m4884fetchReleaseseH_QyT8(null, null, null, null, null, null, null, this);
        if (objM4884fetchReleaseseH_QyT8 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4884fetchReleaseseH_QyT8;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4884fetchReleaseseH_QyT8);
        int i4 = MediaSessionCompatResultReceiverWrapper + 7;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return onitemdismiss;
    }
}
