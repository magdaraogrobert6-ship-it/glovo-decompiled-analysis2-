package com.roadrunner.sidemenu.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuApiRequest$getSideMenu$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SideMenuApiRequest RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideMenuApiRequest$getSideMenu$1(SideMenuApiRequest sideMenuApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = sideMenuApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 81;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5067getSideMenuIoAF18A = this.RemoteActionCompatParcelizer.m5067getSideMenuIoAF18A(this);
        if (objM5067getSideMenuIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5067getSideMenuIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5067getSideMenuIoAF18A);
        int i4 = write + 63;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return onitemdismiss;
    }
}
