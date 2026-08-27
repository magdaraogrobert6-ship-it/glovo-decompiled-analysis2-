package o;

/* JADX INFO: loaded from: classes.dex */
public final class CameraManagerCompatApi30Impl {
    public static TorchControl read(ImageUtilCodecFailedException imageUtilCodecFailedException) {
        imageUtilCodecFailedException.getClass();
        int i = CameraAccessExceptionCompat.RemoteActionCompatParcelizer[imageUtilCodecFailedException.write().ordinal()];
        if (i == 1) {
            return TorchControl.IMAGE_CAPTURE;
        }
        if (i == 2) {
            return TorchControl.PREVIEW;
        }
        if (i != 3) {
            return i != 4 ? TorchControl.UNDEFINED : TorchControl.STREAM_SHARING;
        }
        return TorchControl.VIDEO_CAPTURE;
    }

    public static TorchControl RemoteActionCompatParcelizer(androidx.camera.core.UseCase useCase) {
        useCase.getClass();
        if (useCase instanceof AuthenticatorUtils) {
            return TorchControl.PREVIEW;
        }
        if (useCase instanceof setNavigationOnClickListener) {
            return TorchControl.IMAGE_CAPTURE;
        }
        if (androidx.camera.core.internal.CameraUseCaseAdapter.IconCompatParcelizer(useCase)) {
            return TorchControl.VIDEO_CAPTURE;
        }
        if (useCase instanceof LruCache) {
            return TorchControl.STREAM_SHARING;
        }
        return TorchControl.UNDEFINED;
    }
}
