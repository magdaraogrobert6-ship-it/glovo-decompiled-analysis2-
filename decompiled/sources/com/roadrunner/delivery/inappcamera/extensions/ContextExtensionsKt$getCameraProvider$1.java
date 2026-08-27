package com.roadrunner.delivery.inappcamera.extensions;

import androidx.biometric.AuthenticatorUtils;
import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ContextExtensionsKt$getCameraProvider$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int serializer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object cameraProvider = AuthenticatorUtils.getCameraProvider(null, this);
        if (cameraProvider != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(cameraProvider);
        }
        int i4 = RemoteActionCompatParcelizer + 101;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return cameraProvider;
        }
        throw null;
    }

    public ContextExtensionsKt$getCameraProvider$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
