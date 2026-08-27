package com.roadrunner.rider.recruitment.accountcreation.password_creation.domain;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.i$c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler22;
import o.ActivityHandler25;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInApplicantUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int PlaybackStateCompat = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final /* synthetic */ i$c RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public ActivityHandler22 serializer;
    public ActivityHandler25 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInApplicantUseCase$invoke$1(i$c i_c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = i_c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 25;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaDescriptionCompat = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        Object objM5082invoke0E7RQCE$implementation = this.RatingCompat.m5082invoke0E7RQCE$implementation(null, null, this);
        if (objM5082invoke0E7RQCE$implementation == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5082invoke0E7RQCE$implementation;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5082invoke0E7RQCE$implementation);
        int i4 = MediaBrowserCompatMediaItem + 9;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
