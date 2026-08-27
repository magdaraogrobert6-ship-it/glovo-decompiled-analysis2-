package com.roadrunner.instant.shifts.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAvailableInstantShiftsUseCase$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ RouterLogger write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableInstantShiftsUseCase$invoke$1(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m4990invokeIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4990invokeIoAF18A = this.write.m4990invokeIoAF18A(this);
        if (objM4990invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4990invokeIoAF18A);
        }
        int i3 = serializer + 37;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM4990invokeIoAF18A;
    }
}
