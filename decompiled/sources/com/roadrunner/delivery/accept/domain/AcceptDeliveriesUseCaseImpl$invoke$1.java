package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidView_androidKtupdateViewHolderParams2;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AcceptDeliveriesUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Collection MediaDescriptionCompat;
    public final /* synthetic */ AcceptDeliveriesUseCaseImpl MediaMetadataCompat;
    public AndroidView_androidKtupdateViewHolderParams2 MediaSessionCompatQueueItem;
    public /* synthetic */ Object RatingCompat;
    public Collection RemoteActionCompatParcelizer;
    public int read;
    public Iterator serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptDeliveriesUseCaseImpl$invoke$1(AcceptDeliveriesUseCaseImpl acceptDeliveriesUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = acceptDeliveriesUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 15;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        Object objM4898invokegIAlus = this.MediaMetadataCompat.m4898invokegIAlus(null, this);
        if (objM4898invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4898invokegIAlus);
        }
        int i4 = PlaybackStateCompat + 75;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4898invokegIAlus;
    }
}
