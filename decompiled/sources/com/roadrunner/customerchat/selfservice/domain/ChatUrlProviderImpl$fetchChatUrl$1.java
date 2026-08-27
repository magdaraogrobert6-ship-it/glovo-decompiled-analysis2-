package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatUrlProviderImpl$fetchChatUrl$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public String IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public String serializer;
    public final /* synthetic */ ChatUrlProviderImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatUrlProviderImpl$fetchChatUrl$1(ChatUrlProviderImpl chatUrlProviderImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = chatUrlProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Serializable serializableM4888fetchChatUrlgIAlus = this.write.m4888fetchChatUrlgIAlus(null, this);
        if (serializableM4888fetchChatUrlgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(serializableM4888fetchChatUrlgIAlus);
        }
        int i4 = MediaSessionCompatQueueItem + 77;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return serializableM4888fetchChatUrlgIAlus;
        }
        throw null;
    }
}
