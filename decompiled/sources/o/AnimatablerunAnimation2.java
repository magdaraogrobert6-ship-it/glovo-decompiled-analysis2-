package o;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatablerunAnimation2 implements CameraValidatorCameraIdListIncorrectException {
    public ImageCaptureMetadata RemoteActionCompatParcelizer;
    public boolean write;

    @Override // o.CameraValidatorCameraIdListIncorrectException
    public final void IconCompatParcelizer(Object obj) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("SourceStreamRequirementObserver can be updated from main thread only", PrematureEndOfStreamVideoQuirk.read());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.write == zEquals) {
            return;
        }
        this.write = zEquals;
        ImageCaptureMetadata imageCaptureMetadata = this.RemoteActionCompatParcelizer;
        if (imageCaptureMetadata == null) {
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        } else if (zEquals) {
            imageCaptureMetadata.MediaDescriptionCompat();
        } else {
            imageCaptureMetadata.read();
        }
    }

    @Override // o.CameraValidatorCameraIdListIncorrectException
    public final void IconCompatParcelizer(Throwable th) {
        setInflatedId.RemoteActionCompatParcelizer("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }

    public final void read() {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("SourceStreamRequirementObserver can be closed from main thread only", PrematureEndOfStreamVideoQuirk.read());
        setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        ImageCaptureMetadata imageCaptureMetadata = this.RemoteActionCompatParcelizer;
        if (imageCaptureMetadata == null) {
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
            return;
        }
        if (this.write) {
            this.write = false;
            if (imageCaptureMetadata != null) {
                imageCaptureMetadata.read();
            } else {
                setInflatedId.IconCompatParcelizer(3, "VideoCapture");
            }
        }
        this.RemoteActionCompatParcelizer = null;
    }
}
