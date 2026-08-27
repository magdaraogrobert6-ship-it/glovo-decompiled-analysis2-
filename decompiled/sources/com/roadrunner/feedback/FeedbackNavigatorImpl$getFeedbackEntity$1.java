package com.roadrunner.feedback;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackNavigatorImpl$getFeedbackEntity$1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterLogger read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackNavigatorImpl$getFeedbackEntity$1(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4988getFeedbackEntityIoAF18A = this.read.m4988getFeedbackEntityIoAF18A(this);
        if (objM4988getFeedbackEntityIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = serializer + 71;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM4988getFeedbackEntityIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4988getFeedbackEntityIoAF18A);
        int i6 = write + 45;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
        return onitemdismiss;
    }
}
