package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraContentKt$getCameraProvider$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$getCameraProvider = CameraContentKt.access$getCameraProvider(null, this);
        if (objAccess$getCameraProvider != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objAccess$getCameraProvider);
        }
        int i2 = write + 101;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 55;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return objAccess$getCameraProvider;
    }

    public CameraContentKt$getCameraProvider$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
