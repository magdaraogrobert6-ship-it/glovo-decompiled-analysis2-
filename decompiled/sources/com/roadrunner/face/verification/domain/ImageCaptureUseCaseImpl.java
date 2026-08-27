package com.roadrunner.face.verification.domain;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.sentiance.core.model.events.H$b;
import io.grpc.LoadBalancer$Helper;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ComposableSingletonsAndroidDialog_androidKtlambda2101488961;
import o.applyToInternal;
import o.fastFilteredMap;
import o.isAdapterPositionOnScreen;
import o.setNavigationOnClickListener;
import o.setWidgetBaseline;
import o.valueOf;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCaptureUseCaseImpl implements setWidgetBaseline {
    private static int serializer = 1;
    private static int write;
    public final isAdapterPositionOnScreen IconCompatParcelizer;

    public ImageCaptureUseCaseImpl(int i) {
        if (i == 1) {
            this.IconCompatParcelizer = new isAdapterPositionOnScreen(new StateV3Response$$ExternalSyntheticLambda0(29));
        } else if (i != 2) {
            this.IconCompatParcelizer = new isAdapterPositionOnScreen(new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(25));
        } else {
            this.IconCompatParcelizer = new isAdapterPositionOnScreen(new fastFilteredMap(4));
        }
    }

    public Object serializer(Context context, CameraImage cameraImage, MutatorMutex$mutate$2 mutatorMutex$mutate$2) {
        int i = 2 % 2;
        Object objMediaSessionCompatResultReceiverWrapper = this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        Executor mainExecutor = context.getMainExecutor();
        mainExecutor.getClass();
        Size size = applyToInternal.IconCompatParcelizer;
        SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(mutatorMutex$mutate$2), CoroutineSingletons.UNDECIDED);
        File file = new File(cameraImage.read);
        ImageCapture$Metadata imageCapture$Metadata = new ImageCapture$Metadata(0);
        imageCapture$Metadata.IconCompatParcelizer = true;
        ((setNavigationOnClickListener) objMediaSessionCompatResultReceiverWrapper).serializer(new valueOf(file, imageCapture$Metadata), mainExecutor, new H$b(safeContinuation, 16, cameraImage));
        Object orThrow = safeContinuation.getOrThrow();
        int i2 = write + 125;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return orThrow;
    }
}
