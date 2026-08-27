package com.roadrunner.rider.safety.authentication.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetSentianceAuthCodeUseCase$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetSentianceAuthCodeUseCase serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSentianceAuthCodeUseCase$invoke$1(GetSentianceAuthCodeUseCase getSentianceAuthCodeUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getSentianceAuthCodeUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 75;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.m5024invokeIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5024invokeIoAF18A = this.serializer.m5024invokeIoAF18A(this);
        if (objM5024invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5024invokeIoAF18A);
        }
        int i3 = write + 121;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM5024invokeIoAF18A;
    }
}
