package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getSelectableGroup;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyTwoFaUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public String IconCompatParcelizer;
    public final /* synthetic */ VerifyTwoFaUseCaseImpl MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public int RatingCompat;
    public getSelectableGroup RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyTwoFaUseCaseImpl$invoke$1(VerifyTwoFaUseCaseImpl verifyTwoFaUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = verifyTwoFaUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        Object objM4870invokeyxL6bBk = this.MediaDescriptionCompat.m4870invokeyxL6bBk(null, null, null, null, this);
        if (objM4870invokeyxL6bBk != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4870invokeyxL6bBk);
        }
        int i4 = MediaSessionCompatQueueItem + 93;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4870invokeyxL6bBk;
    }
}
