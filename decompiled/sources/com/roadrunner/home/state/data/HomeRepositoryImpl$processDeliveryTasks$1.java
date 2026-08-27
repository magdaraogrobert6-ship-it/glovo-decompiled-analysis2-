package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$processDeliveryTasks$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ HomeRepositoryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$processDeliveryTasks$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4972processDeliveryTasksgIAlus = this.write.m4972processDeliveryTasksgIAlus(null, this);
        if (objM4972processDeliveryTasksgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = serializer + 121;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4972processDeliveryTasksgIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4972processDeliveryTasksgIAlus);
        int i4 = serializer + 75;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
