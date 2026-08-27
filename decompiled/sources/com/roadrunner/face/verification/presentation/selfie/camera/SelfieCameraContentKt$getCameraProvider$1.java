package com.roadrunner.face.verification.presentation.selfie.camera;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieCameraContentKt$getCameraProvider$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            SelfieCameraContentKt.access$getCameraProvider(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$getCameraProvider = SelfieCameraContentKt.access$getCameraProvider(null, this);
        if (objAccess$getCameraProvider == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objAccess$getCameraProvider;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objAccess$getCameraProvider);
        int i3 = IconCompatParcelizer + 63;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }

    public SelfieCameraContentKt$getCameraProvider$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
