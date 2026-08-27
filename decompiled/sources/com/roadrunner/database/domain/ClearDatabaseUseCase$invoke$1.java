package com.roadrunner.database.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearDatabaseUseCase$invoke$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ ClearDatabaseUseCase RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearDatabaseUseCase$invoke$1(ClearDatabaseUseCase clearDatabaseUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = clearDatabaseUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4895invokeIoAF18A = this.RemoteActionCompatParcelizer.m4895invokeIoAF18A(this);
        if (objM4895invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4895invokeIoAF18A);
        }
        int i2 = write + 101;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = i3 + 15;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objM4895invokeIoAF18A;
    }
}
