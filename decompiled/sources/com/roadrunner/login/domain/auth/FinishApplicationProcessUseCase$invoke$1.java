package com.roadrunner.login.domain.auth;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FinishApplicationProcessUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public String RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ FinishApplicationProcessUseCase serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishApplicationProcessUseCase$invoke$1(FinishApplicationProcessUseCase finishApplicationProcessUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = finishApplicationProcessUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.m4987invokeIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4987invokeIoAF18A = this.serializer.m4987invokeIoAF18A(this);
        if (objM4987invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4987invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4987invokeIoAF18A);
        int i3 = IconCompatParcelizer + 31;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
