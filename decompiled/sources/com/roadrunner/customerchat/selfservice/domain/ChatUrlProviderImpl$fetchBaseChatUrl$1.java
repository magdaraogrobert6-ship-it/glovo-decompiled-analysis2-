package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatUrlProviderImpl$fetchBaseChatUrl$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ChatUrlProviderImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatUrlProviderImpl$fetchBaseChatUrl$1(ChatUrlProviderImpl chatUrlProviderImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = chatUrlProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m4887fetchBaseChatUrlIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Serializable serializableM4887fetchBaseChatUrlIoAF18A = this.write.m4887fetchBaseChatUrlIoAF18A(this);
        if (serializableM4887fetchBaseChatUrlIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return serializableM4887fetchBaseChatUrlIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(serializableM4887fetchBaseChatUrlIoAF18A);
        int i3 = serializer + 27;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
