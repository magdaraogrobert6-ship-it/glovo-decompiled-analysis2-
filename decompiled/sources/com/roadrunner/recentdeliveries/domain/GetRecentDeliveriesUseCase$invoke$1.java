package com.roadrunner.recentdeliveries.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRecentDeliveriesUseCase$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetAppStateImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecentDeliveriesUseCase$invoke$1(GetAppStateImpl getAppStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getAppStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5008invokeIoAF18A = this.serializer.m5008invokeIoAF18A(this);
        if (objM5008invokeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5008invokeIoAF18A);
        }
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 9;
        read = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = i2 + 55;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM5008invokeIoAF18A;
        }
        obj2.hashCode();
        throw null;
    }
}
