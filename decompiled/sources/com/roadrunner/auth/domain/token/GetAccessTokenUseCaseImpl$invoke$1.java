package com.roadrunner.auth.domain.token;

import androidx.compose.ui.graphics.Fields;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAccessTokenUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ GetAccessTokenUseCaseImpl RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccessTokenUseCaseImpl$invoke$1(GetAccessTokenUseCaseImpl getAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Serializable serializableM4873invokeIoAF18A = this.RemoteActionCompatParcelizer.m4873invokeIoAF18A(this);
        if (serializableM4873invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(serializableM4873invokeIoAF18A);
        }
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return serializableM4873invokeIoAF18A;
    }
}
