package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetTaskByTypeAndIdUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ GetTaskByTypeAndIdUseCaseImpl MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public Class read;
    public String serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaskByTypeAndIdUseCaseImpl$invoke$1(GetTaskByTypeAndIdUseCaseImpl getTaskByTypeAndIdUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = getTaskByTypeAndIdUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.MediaMetadataCompat = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4940invokeyxL6bBk = this.MediaSessionCompatQueueItem.m4940invokeyxL6bBk(0L, null, null, null, this);
        if (objM4940invokeyxL6bBk != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4940invokeyxL6bBk);
        }
        int i2 = MediaDescriptionCompat + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 33;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4940invokeyxL6bBk;
        }
        obj2.hashCode();
        throw null;
    }
}
