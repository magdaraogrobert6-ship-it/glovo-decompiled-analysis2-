package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$processRiderState$1 extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ HomeRepositoryImpl RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$processRiderState$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4975processRiderStategIAlus = this.RemoteActionCompatParcelizer.m4975processRiderStategIAlus(null, this);
        if (objM4975processRiderStategIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = read + 111;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4975processRiderStategIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4975processRiderStategIAlus);
        int i4 = write + 39;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
