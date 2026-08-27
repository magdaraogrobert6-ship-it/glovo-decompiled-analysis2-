package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.ui.graphics.Fields;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createInAppMessageEventSubscriber;
import o.getMaxFlingVelocity;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$validateAndSaveDeliveryConfirmation$1 extends ContinuationImpl {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompatCustomAction;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public getMaxFlingVelocity MediaMetadataCompat;
    public final /* synthetic */ ConfirmationRepository MediaSessionCompatQueueItem;
    public /* synthetic */ Object RatingCompat;
    public long RemoteActionCompatParcelizer;
    public Iterator read;
    public List serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationRepository$validateAndSaveDeliveryConfirmation$1(ConfirmationRepository confirmationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = confirmationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RatingCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4927validateAndSaveDeliveryConfirmationgIAlus = this.MediaSessionCompatQueueItem.m4927validateAndSaveDeliveryConfirmationgIAlus(null, this);
        if (objM4927validateAndSaveDeliveryConfirmationgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4927validateAndSaveDeliveryConfirmationgIAlus);
            int i2 = PlaybackStateCompatCustomAction + 89;
            ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 30 / 0;
            }
            return onitemdismiss;
        }
        int i4 = PlaybackStateCompatCustomAction + 71;
        int i5 = i4 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i5;
        if (i4 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i6 = i5 + 109;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return objM4927validateAndSaveDeliveryConfirmationgIAlus;
    }
}
