package com.roadrunner.push.core.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateRiderPushToken$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ GetAppStateImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRiderPushToken$invoke$1(GetAppStateImpl getAppStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = getAppStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM5010invokegIAlus = this.write.m5010invokegIAlus(null, this);
        if (objM5010invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5010invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5010invokegIAlus);
        int i4 = read + 23;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
