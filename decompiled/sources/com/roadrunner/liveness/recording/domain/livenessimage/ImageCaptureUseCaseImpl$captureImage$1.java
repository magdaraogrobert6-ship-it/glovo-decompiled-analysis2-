package com.roadrunner.liveness.recording.domain.livenessimage;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCaptureUseCaseImpl$captureImage$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ImageCaptureUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCaptureUseCaseImpl$captureImage$1(ImageCaptureUseCaseImpl imageCaptureUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = imageCaptureUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 33;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4985captureImageIoAF18A = this.write.m4985captureImageIoAF18A(this);
        if (objM4985captureImageIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4985captureImageIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4985captureImageIoAF18A);
        int i4 = serializer + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
