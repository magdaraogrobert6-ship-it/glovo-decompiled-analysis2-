package com.roadrunner.auth.domain;

import androidx.compose.ui.graphics.Fields;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.roadrunner.auth.data.AuthRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticateUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaSessionCompatToken = 0;
    private static int ParcelableVolumeInfo = 1;
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public final /* synthetic */ AuthenticateUseCase MediaSessionCompatResultReceiverWrapper;
    public /* synthetic */ Object PlaybackStateCompatCustomAction;
    public n0 RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public AuthRepository serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticateUseCase$invoke$1(AuthenticateUseCase authenticateUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatResultReceiverWrapper = authenticateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        this.PlaybackStateCompatCustomAction = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        Object objM4867invoke0E7RQCE = this.MediaSessionCompatResultReceiverWrapper.m4867invoke0E7RQCE(null, null, this);
        if (objM4867invoke0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4867invoke0E7RQCE);
        }
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 125;
        MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objM4867invoke0E7RQCE;
    }
}
