package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.extensions;

import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsd;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ContextExtensionsKt$getCameraProvider$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 35;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object cameraProvider = zzsd.getCameraProvider(null, this);
        if (cameraProvider != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(cameraProvider);
        }
        int i4 = read + 17;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return cameraProvider;
    }

    public ContextExtensionsKt$getCameraProvider$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
