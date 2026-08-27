package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.fastFilterNotNull;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCustomerUnavailableArgsUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterLogger read;
    public fastFilterNotNull serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerUnavailableArgsUseCase$invoke$1(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4990invokeIoAF18A = this.read.m4990invokeIoAF18A(this);
        if (objM4990invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4990invokeIoAF18A);
        }
        int i4 = IconCompatParcelizer + 111;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return objM4990invokeIoAF18A;
    }
}
