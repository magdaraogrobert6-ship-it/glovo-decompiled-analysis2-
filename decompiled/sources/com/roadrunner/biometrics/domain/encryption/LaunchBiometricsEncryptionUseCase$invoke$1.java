package com.roadrunner.biometrics.domain.encryption;

import androidx.compose.ui.graphics.Fields;
import com.airbnb.lottie.parser.DropShadowEffect;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class LaunchBiometricsEncryptionUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ DropShadowEffect write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchBiometricsEncryptionUseCase$invoke$1(DropShadowEffect dropShadowEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = dropShadowEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4007invoke0E7RQCE = this.write.m4007invoke0E7RQCE(null, null, this);
        if (objM4007invoke0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4007invoke0E7RQCE);
        }
        int i4 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4007invoke0E7RQCE;
        }
        throw null;
    }
}
