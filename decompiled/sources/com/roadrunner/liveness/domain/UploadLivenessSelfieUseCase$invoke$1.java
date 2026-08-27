package com.roadrunner.liveness.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.onItemDismiss;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadLivenessSelfieUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public boolean IconCompatParcelizer;
    public final /* synthetic */ BlockRunner MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public r8lambdaCTegLFIY2N5eeYL50pY32CICZRI RemoteActionCompatParcelizer;
    public RoomDatabaseExternalSyntheticLambda2 read;
    public RoomDatabaseperformClear11 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLivenessSelfieUseCase$invoke$1(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 105;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM3948invokeBWLJW6A = this.MediaDescriptionCompat.m3948invokeBWLJW6A(false, null, null, this);
        if (objM3948invokeBWLJW6A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM3948invokeBWLJW6A);
        }
        int i4 = MediaBrowserCompatMediaItem + 37;
        int i5 = i4 % Fields.SpotShadowColor;
        MediaMetadataCompat = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 47;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objM3948invokeBWLJW6A;
    }
}
