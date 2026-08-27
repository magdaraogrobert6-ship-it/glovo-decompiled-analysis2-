package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getItemDecorInsetsForChild;
import o.getMinFlingVelocity;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$validateAndSaveResponse$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public int IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ HomeRepositoryImpl MediaSessionCompatQueueItem;
    public onViewAttachedToWindowlambda0[] RatingCompat;
    public onViewAttachedToWindowlambda0[] RemoteActionCompatParcelizer;
    public int read;
    public getItemDecorInsetsForChild serializer;
    public getMinFlingVelocity write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$validateAndSaveResponse$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 69;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.MediaMetadataCompat = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            this.MediaSessionCompatQueueItem.m4979validateAndSaveResponsegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.MediaMetadataCompat = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        Object objM4979validateAndSaveResponsegIAlus = this.MediaSessionCompatQueueItem.m4979validateAndSaveResponsegIAlus(null, this);
        if (objM4979validateAndSaveResponsegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4979validateAndSaveResponsegIAlus);
        }
        int i3 = ParcelableVolumeInfo + 81;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objM4979validateAndSaveResponsegIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
