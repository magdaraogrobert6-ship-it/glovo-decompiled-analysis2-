package com.roadrunner.delivery.pickupdropoff.confirmbutton.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.PreviewLogger_androidKt;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmDeliveryUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public long IconCompatParcelizer;
    public final /* synthetic */ ConfirmDeliveryUseCaseImpl MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaMetadataCompat;
    public PreviewLogger_androidKt RemoteActionCompatParcelizer;
    public int read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmDeliveryUseCaseImpl$invoke$1(ConfirmDeliveryUseCaseImpl confirmDeliveryUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = confirmDeliveryUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.MediaMetadataCompat = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4922invokeyxL6bBk = this.MediaBrowserCompatMediaItem.m4922invokeyxL6bBk(0L, null, null, null, this);
        if (objM4922invokeyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = MediaDescriptionCompat + 109;
            int i3 = i2 % Fields.SpotShadowColor;
            RatingCompat = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objM4922invokeyxL6bBk;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4922invokeyxL6bBk);
        int i7 = RatingCompat + 83;
        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return onitemdismiss;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
