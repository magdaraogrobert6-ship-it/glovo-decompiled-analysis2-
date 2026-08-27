package com.roadrunner.delivery.accept.laststop.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopRepositoryImpl$removeLastStopAddress$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ LastStopRepositoryImpl IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastStopRepositoryImpl$removeLastStopAddress$1(LastStopRepositoryImpl lastStopRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = lastStopRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.m4903removeLastStopAddress0E7RQCE(null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4903removeLastStopAddress0E7RQCE = this.IconCompatParcelizer.m4903removeLastStopAddress0E7RQCE(null, null, this);
        if (objM4903removeLastStopAddress0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4903removeLastStopAddress0E7RQCE);
        }
        int i3 = RemoteActionCompatParcelizer + 109;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objM4903removeLastStopAddress0E7RQCE;
        }
        throw null;
    }
}
