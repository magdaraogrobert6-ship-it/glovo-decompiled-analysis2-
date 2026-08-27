package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.getItemDecorInsetsForChild;
import o.onItemDismiss;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$validateAndSaveResponseLock$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ HomeRepositoryImpl MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public setCustomInAppMessageAnimationFactorylambda0 read;
    public int serializer;
    public getItemDecorInsetsForChild write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$validateAndSaveResponseLock$1(HomeRepositoryImpl homeRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4970access$validateAndSaveResponseLockgIAlus = HomeRepositoryImpl.m4970access$validateAndSaveResponseLockgIAlus(this.MediaSessionCompatQueueItem, null, this);
        if (objM4970access$validateAndSaveResponseLockgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4970access$validateAndSaveResponseLockgIAlus);
        }
        int i4 = MediaBrowserCompatMediaItem + 17;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4970access$validateAndSaveResponseLockgIAlus;
    }
}
