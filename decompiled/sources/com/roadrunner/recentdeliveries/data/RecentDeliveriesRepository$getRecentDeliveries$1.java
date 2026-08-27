package com.roadrunner.recentdeliveries.data;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class RecentDeliveriesRepository$getRecentDeliveries$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ N$b RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDeliveriesRepository$getRecentDeliveries$1(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 41;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5079getRecentDeliveriesIoAF18A$implementation = this.RemoteActionCompatParcelizer.m5079getRecentDeliveriesIoAF18A$implementation(this);
        if (objM5079getRecentDeliveriesIoAF18A$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5079getRecentDeliveriesIoAF18A$implementation);
        }
        int i4 = write + 17;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM5079getRecentDeliveriesIoAF18A$implementation;
    }
}
