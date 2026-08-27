package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class RouterViewModel$handleMobileServices$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterViewModel read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel$handleMobileServices$1(RouterViewModel routerViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = routerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4991access$handleMobileServicesIoAF18A = RouterViewModel.m4991access$handleMobileServicesIoAF18A(this.read, this);
        if (objM4991access$handleMobileServicesIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = serializer + 61;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM4991access$handleMobileServicesIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4991access$handleMobileServicesIoAF18A);
        int i6 = IconCompatParcelizer + 31;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 31 / 0;
        }
        return onitemdismiss;
    }
}
