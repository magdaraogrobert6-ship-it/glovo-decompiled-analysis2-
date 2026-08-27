package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.divider.ObserveDivider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateNestComponentUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ObserveDivider write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateNestComponentUseCaseImpl$invoke$1(ObserveDivider observeDivider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = observeDivider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.write.m4968invokeIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4968invokeIoAF18A = this.write.m4968invokeIoAF18A(this);
        if (objM4968invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4968invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4968invokeIoAF18A);
        int i3 = read + 61;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
