package o;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public enum TorchControl {
    PREVIEW(SurfaceHolder.class, 34),
    IMAGE_CAPTURE(null, androidx.compose.ui.graphics.Fields.RotationX),
    VIDEO_CAPTURE(MediaCodec.class, 34),
    STREAM_SHARING(SurfaceTexture.class, 34),
    UNDEFINED(null, 34);

    private final int defaultImageFormat;
    private final Class<?> surfaceClass;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final CameraManagerCompatApi30Impl Companion = new CameraManagerCompatApi30Impl();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getDefaultImageFormat() {
        return this.defaultImageFormat;
    }

    public final Class<?> getSurfaceClass() {
        return this.surfaceClass;
    }

    public static final TorchControl getFeatureGroupUseCaseType(androidx.camera.core.UseCase useCase) {
        Companion.getClass();
        return CameraManagerCompatApi30Impl.RemoteActionCompatParcelizer(useCase);
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = CameraManagerCompat.read[ordinal()];
        if (i == 1) {
            return "Preview";
        }
        if (i == 2) {
            return "ImageCapture";
        }
        if (i == 3) {
            return "VideoCapture";
        }
        if (i == 4) {
            return "StreamSharing";
        }
        if (i == 5) {
            return "Undefined";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    TorchControl(Class cls, int i) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i;
    }

    public final int getImageFormat(Integer num) {
        return (this != IMAGE_CAPTURE || num == null) ? this.defaultImageFormat : num.intValue();
    }

    public static /* synthetic */ int getImageFormat$default(TorchControl torchControl, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            return torchControl.getImageFormat(num);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getImageFormat");
        return 0;
    }

    public static final TorchControl getFeatureGroupUseCaseType(ImageUtilCodecFailedException imageUtilCodecFailedException) {
        Companion.getClass();
        return CameraManagerCompatApi30Impl.read(imageUtilCodecFailedException);
    }
}
