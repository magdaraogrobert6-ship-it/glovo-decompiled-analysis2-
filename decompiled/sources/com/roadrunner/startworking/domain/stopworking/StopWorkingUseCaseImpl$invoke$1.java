package com.roadrunner.startworking.domain.stopworking;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class StopWorkingUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ StopWorkingUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopWorkingUseCaseImpl$invoke$1(StopWorkingUseCaseImpl stopWorkingUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = stopWorkingUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5071invokeIoAF18A = this.write.m5071invokeIoAF18A(this);
        if (objM5071invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = RemoteActionCompatParcelizer + 67;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return objM5071invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5071invokeIoAF18A);
        int i4 = serializer + 3;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onitemdismiss;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
