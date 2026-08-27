package com.roadrunner.order.history.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearHistoryDatabaseUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ClearHistoryDatabaseUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearHistoryDatabaseUseCaseImpl$invoke$1(ClearHistoryDatabaseUseCaseImpl clearHistoryDatabaseUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = clearHistoryDatabaseUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4999invokeIoAF18A = this.write.m4999invokeIoAF18A(this);
        if (objM4999invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4999invokeIoAF18A);
        }
        int i2 = read;
        int i3 = i2 + 69;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objM4999invokeIoAF18A;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
