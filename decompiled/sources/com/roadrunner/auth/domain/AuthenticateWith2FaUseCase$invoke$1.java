package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.AuthRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticateWith2FaUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public final /* synthetic */ AuthenticateWith2FaUseCase PlaybackStateCompat;
    public int RatingCompat;
    public String RemoteActionCompatParcelizer;
    public AuthRepository read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticateWith2FaUseCase$invoke$1(AuthenticateWith2FaUseCase authenticateWith2FaUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.PlaybackStateCompat = authenticateWith2FaUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        this.MediaDescriptionCompat = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        Object objM4868invoke0E7RQCE = this.PlaybackStateCompat.m4868invoke0E7RQCE(null, null, this);
        if (objM4868invoke0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = ParcelableVolumeInfo + 61;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
            }
            return objM4868invoke0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4868invoke0E7RQCE);
        int i4 = ParcelableVolumeInfo + 69;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
