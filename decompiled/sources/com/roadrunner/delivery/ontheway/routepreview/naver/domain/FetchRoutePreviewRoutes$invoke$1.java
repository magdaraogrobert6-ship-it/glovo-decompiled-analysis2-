package com.roadrunner.delivery.ontheway.routepreview.naver.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRoutePreviewRoutes$invoke$1 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k IconCompatParcelizer;
    public final /* synthetic */ FetchRoutePreviewRoutes RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRoutePreviewRoutes$invoke$1(FetchRoutePreviewRoutes fetchRoutePreviewRoutes, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = fetchRoutePreviewRoutes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 117;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4920invokegIAlus = this.RemoteActionCompatParcelizer.m4920invokegIAlus(null, this);
        if (objM4920invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = MediaMetadataCompat + 97;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objM4920invokegIAlus;
            }
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4920invokegIAlus);
        int i5 = MediaMetadataCompat + 113;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onitemdismiss;
    }
}
