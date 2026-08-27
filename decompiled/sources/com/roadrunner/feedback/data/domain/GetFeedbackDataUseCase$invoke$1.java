package com.roadrunner.feedback.data.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFeedbackDataUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public String IconCompatParcelizer;
    public final /* synthetic */ GetFeedbackDataUseCase MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeedbackDataUseCase$invoke$1(GetFeedbackDataUseCase getFeedbackDataUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = getFeedbackDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        Object objM4963invokeIoAF18A = this.MediaBrowserCompatMediaItem.m4963invokeIoAF18A(this);
        if (objM4963invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4963invokeIoAF18A);
        }
        int i4 = RatingCompat + 107;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4963invokeIoAF18A;
    }
}
