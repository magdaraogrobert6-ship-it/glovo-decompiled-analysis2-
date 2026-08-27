package com.roadrunner.custom.password.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatePasswordUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public String IconCompatParcelizer;
    public final /* synthetic */ BlockRunner MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public String serializer;
    public insertOrUpdateTransformedNodeSubhierarchy write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePasswordUseCase$invoke$1(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM3951invokeyxL6bBk = this.MediaDescriptionCompat.m3951invokeyxL6bBk(null, null, false, null, this);
        if (objM3951invokeyxL6bBk != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM3951invokeyxL6bBk);
        }
        int i4 = MediaBrowserCompatMediaItem + 63;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM3951invokeyxL6bBk;
    }
}
