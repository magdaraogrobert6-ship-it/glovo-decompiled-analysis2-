package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.PreviewActivityExternalSyntheticLambda4;
import o.getEmptyBox;
import o.onItemDismiss;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class TasksRepository$getStateResult$1 extends ContinuationImpl {
    private static int ResultReceiver = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public PreviewActivityExternalSyntheticLambda4 MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public setCustomInAppMessageAnimationFactorylambda0 MediaSessionCompatQueueItem;
    public final /* synthetic */ TasksRepository MediaSessionCompatResultReceiverWrapper;
    public /* synthetic */ Object MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public getEmptyBox PlaybackStateCompatCustomAction;
    public r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksRepository$getStateResult$1(TasksRepository tasksRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatResultReceiverWrapper = tasksRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        this.MediaSessionCompatToken = obj;
        this.ParcelableVolumeInfo |= Integer.MIN_VALUE;
        Object objM4935getStateResultBWLJW6A = this.MediaSessionCompatResultReceiverWrapper.m4935getStateResultBWLJW6A(0L, null, false, this);
        if (objM4935getStateResultBWLJW6A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4935getStateResultBWLJW6A);
        }
        int i2 = ResultReceiver;
        int i3 = i2 + 55;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objM4935getStateResultBWLJW6A;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
