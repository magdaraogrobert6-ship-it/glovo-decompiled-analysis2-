package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.AuthRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class WebRefreshAccessTokenUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public String IconCompatParcelizer;
    public final /* synthetic */ WebRefreshAccessTokenUseCaseImpl MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public Object serializer;
    public AuthRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRefreshAccessTokenUseCaseImpl$invoke$1(WebRefreshAccessTokenUseCaseImpl webRefreshAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = webRefreshAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 71;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.MediaMetadataCompat = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            this.MediaBrowserCompatMediaItem.m4871invokegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.MediaMetadataCompat = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        Object objM4871invokegIAlus = this.MediaBrowserCompatMediaItem.m4871invokegIAlus(null, this);
        if (objM4871invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4871invokegIAlus);
        }
        int i3 = MediaSessionCompatQueueItem + 79;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
        return objM4871invokegIAlus;
    }
}
