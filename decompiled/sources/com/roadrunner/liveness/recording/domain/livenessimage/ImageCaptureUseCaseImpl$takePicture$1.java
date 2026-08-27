package com.roadrunner.liveness.recording.domain.livenessimage;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCaptureUseCaseImpl$takePicture$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ ImageCaptureUseCaseImpl IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCaptureUseCaseImpl$takePicture$1(ImageCaptureUseCaseImpl imageCaptureUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = imageCaptureUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.m4986takePicture0E7RQCE(null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4986takePicture0E7RQCE = this.IconCompatParcelizer.m4986takePicture0E7RQCE(null, null, this);
        if (objM4986takePicture0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4986takePicture0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4986takePicture0E7RQCE);
        int i3 = serializer + 87;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
