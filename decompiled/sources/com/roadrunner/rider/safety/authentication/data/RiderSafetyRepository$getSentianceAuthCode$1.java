package com.roadrunner.rider.safety.authentication.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyRepository$getSentianceAuthCode$1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ RiderSafetyRepository IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderSafetyRepository$getSentianceAuthCode$1(RiderSafetyRepository riderSafetyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = riderSafetyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5023getSentianceAuthCodeIoAF18A = this.IconCompatParcelizer.m5023getSentianceAuthCodeIoAF18A(this);
        if (objM5023getSentianceAuthCodeIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5023getSentianceAuthCodeIoAF18A);
        }
        int i4 = write + 19;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM5023getSentianceAuthCodeIoAF18A;
    }
}
