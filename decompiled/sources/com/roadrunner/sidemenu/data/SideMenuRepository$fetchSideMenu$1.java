package com.roadrunner.sidemenu.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuRepository$fetchSideMenu$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SideMenuRepository serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideMenuRepository$fetchSideMenu$1(SideMenuRepository sideMenuRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = sideMenuRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 79;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5068fetchSideMenuIoAF18A = this.serializer.m5068fetchSideMenuIoAF18A(this);
        if (objM5068fetchSideMenuIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5068fetchSideMenuIoAF18A);
        }
        int i4 = IconCompatParcelizer + 79;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM5068fetchSideMenuIoAF18A;
        }
        throw null;
    }
}
