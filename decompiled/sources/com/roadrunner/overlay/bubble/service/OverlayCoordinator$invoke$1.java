package com.roadrunner.overlay.bubble.service;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayCoordinator$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ OverlayCoordinator write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayCoordinator$invoke$1(OverlayCoordinator overlayCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = overlayCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5001invokegIAlus = this.write.m5001invokegIAlus(null, this);
        if (objM5001invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5001invokegIAlus);
        }
        int i4 = read + 49;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM5001invokegIAlus;
    }
}
