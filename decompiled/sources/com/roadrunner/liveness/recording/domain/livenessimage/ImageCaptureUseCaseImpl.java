package com.roadrunner.liveness.recording.domain.livenessimage;

import android.net.Uri;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import com.roadrunner.liveness.api.recording.CameraImage;
import com.roadrunner.liveness.domain.CreateEmptyCameraImageUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.grpc.LoadBalancer$Helper;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onUpgrade;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setNavigationOnClickListener;
import o.setSizeuvyYCjk;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.valueOf;
import o.wa;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCaptureUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final CreateEmptyCameraImageUseCaseImpl RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final onUpgrade serializer;
    public final transferSessionPackageI write;

    public ImageCaptureUseCaseImpl(onUpgrade onupgrade, CreateEmptyCameraImageUseCaseImpl createEmptyCameraImageUseCaseImpl, transferSessionPackageI transfersessionpackagei) {
        onupgrade.getClass();
        createEmptyCameraImageUseCaseImpl.getClass();
        transfersessionpackagei.getClass();
        this.serializer = onupgrade;
        this.RemoteActionCompatParcelizer = createEmptyCameraImageUseCaseImpl;
        this.write = transfersessionpackagei;
        this.read = new isAdapterPositionOnScreen(new wa(1));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: takePicture-0E7RQCE, reason: not valid java name */
    public final Object m4986takePicture0E7RQCE(setNavigationOnClickListener setnavigationonclicklistener, CameraImage cameraImage, ContinuationImpl continuationImpl) {
        ImageCaptureUseCaseImpl$takePicture$1 imageCaptureUseCaseImpl$takePicture$1;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 7;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof ImageCaptureUseCaseImpl$takePicture$1;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof ImageCaptureUseCaseImpl$takePicture$1) {
            imageCaptureUseCaseImpl$takePicture$1 = (ImageCaptureUseCaseImpl$takePicture$1) continuationImpl;
            int i3 = imageCaptureUseCaseImpl$takePicture$1.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IconCompatParcelizer + 97;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                imageCaptureUseCaseImpl$takePicture$1.read = i3 - Integer.MIN_VALUE;
            } else {
                imageCaptureUseCaseImpl$takePicture$1 = new ImageCaptureUseCaseImpl$takePicture$1(this, continuationImpl);
            }
        } else {
            imageCaptureUseCaseImpl$takePicture$1 = new ImageCaptureUseCaseImpl$takePicture$1(this, continuationImpl);
        }
        Object result = imageCaptureUseCaseImpl$takePicture$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = imageCaptureUseCaseImpl$takePicture$1.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            imageCaptureUseCaseImpl$takePicture$1.read = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(imageCaptureUseCaseImpl$takePicture$1));
            cancellableContinuationImpl.read();
            File file = new File(cameraImage.read);
            ImageCapture$Metadata imageCapture$Metadata = new ImageCapture$Metadata(0);
            imageCapture$Metadata.IconCompatParcelizer = true;
            valueOf valueof = new valueOf(file, imageCapture$Metadata);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
            firebaseRemoteConfigImpl.getClass();
            boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LIVENESS_IMAGE_CAPTURE_EXECUTOR_FIX_ENABLED);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            if (zIconCompatParcelizer) {
                cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new setSizeuvyYCjk(8, executorServiceNewSingleThreadExecutor));
            }
            setnavigationonclicklistener.serializer(valueof, executorServiceNewSingleThreadExecutor, new ut(zIconCompatParcelizer, executorServiceNewSingleThreadExecutor, cancellableContinuationImpl, 14));
            result = cancellableContinuationImpl.getResult();
            if (result == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = MediaSessionCompatQueueItem + 31;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(result);
        }
        return ((onItemDismiss) result).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: captureImage-IoAF18A, reason: not valid java name */
    public final Object m4985captureImageIoAF18A(ContinuationImpl continuationImpl) {
        ImageCaptureUseCaseImpl$captureImage$1 imageCaptureUseCaseImpl$captureImage$1;
        Object objM4986takePicture0E7RQCE;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 43;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof ImageCaptureUseCaseImpl$captureImage$1) {
            imageCaptureUseCaseImpl$captureImage$1 = (ImageCaptureUseCaseImpl$captureImage$1) continuationImpl;
            int i4 = imageCaptureUseCaseImpl$captureImage$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                imageCaptureUseCaseImpl$captureImage$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                imageCaptureUseCaseImpl$captureImage$1 = new ImageCaptureUseCaseImpl$captureImage$1(this, continuationImpl);
            }
        } else {
            imageCaptureUseCaseImpl$captureImage$1 = new ImageCaptureUseCaseImpl$captureImage$1(this, continuationImpl);
        }
        Object obj = imageCaptureUseCaseImpl$captureImage$1.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = imageCaptureUseCaseImpl$captureImage$1.RemoteActionCompatParcelizer;
        onUpgrade onupgrade = this.serializer;
        Object obj3 = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object objMediaSessionCompatResultReceiverWrapper = this.read.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) objMediaSessionCompatResultReceiverWrapper;
            CameraImage cameraImageRemoteActionCompatParcelizer = onupgrade.RemoteActionCompatParcelizer();
            if (cameraImageRemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                cameraImageRemoteActionCompatParcelizer = onupgrade.RemoteActionCompatParcelizer();
            }
            if (cameraImageRemoteActionCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("camera image should be not null");
                return null;
            }
            imageCaptureUseCaseImpl$captureImage$1.RemoteActionCompatParcelizer = 1;
            objM4986takePicture0E7RQCE = m4986takePicture0E7RQCE(setnavigationonclicklistener, cameraImageRemoteActionCompatParcelizer, imageCaptureUseCaseImpl$captureImage$1);
            if (objM4986takePicture0E7RQCE == obj2) {
                int i6 = MediaSessionCompatQueueItem + 51;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return obj2;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4986takePicture0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (objM4986takePicture0E7RQCE instanceof isItemDismissable) {
            return objM4986takePicture0E7RQCE;
        }
        onupgrade.getClass();
        Timber.RemoteActionCompatParcelizer.getClass();
        CameraImage cameraImage = onupgrade.serializer;
        if (cameraImage == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("camera image should be not null when the save image function is invoked");
            int i8 = MediaSessionCompatQueueItem + 101;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return null;
            }
            obj3.hashCode();
            throw null;
        }
        String str = cameraImage.RemoteActionCompatParcelizer;
        Uri uri = cameraImage.serializer;
        String str2 = cameraImage.read;
        str.getClass();
        uri.getClass();
        str2.getClass();
        onupgrade.serializer = new CameraImage(str, uri, str2, true);
        return objM4986takePicture0E7RQCE;
    }
}
