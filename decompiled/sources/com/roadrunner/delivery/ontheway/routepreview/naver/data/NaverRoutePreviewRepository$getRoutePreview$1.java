package com.roadrunner.delivery.ontheway.routepreview.naver.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class NaverRoutePreviewRepository$getRoutePreview$1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ InitializeAppStartupItemsImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaverRoutePreviewRepository$getRoutePreview$1(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4857getRoutePreviewBWLJW6A = this.IconCompatParcelizer.m4857getRoutePreviewBWLJW6A(false, null, null, this);
        if (objM4857getRoutePreviewBWLJW6A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4857getRoutePreviewBWLJW6A);
        }
        int i4 = read + 77;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4857getRoutePreviewBWLJW6A;
    }
}
