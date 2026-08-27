package com.roadrunner.push.core.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PushServiceRepository$registerPushForRider$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ PushServiceRepository RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushServiceRepository$registerPushForRider$1(PushServiceRepository pushServiceRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = pushServiceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM5004registerPushForRidergIAlus = this.RemoteActionCompatParcelizer.m5004registerPushForRidergIAlus(null, this);
        if (objM5004registerPushForRidergIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = IconCompatParcelizer + 15;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 31 / 0;
            }
            return objM5004registerPushForRidergIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5004registerPushForRidergIAlus);
        int i4 = serializer + 45;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
