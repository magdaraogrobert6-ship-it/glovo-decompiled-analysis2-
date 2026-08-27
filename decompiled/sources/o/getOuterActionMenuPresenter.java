package o;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class getOuterActionMenuPresenter implements StreamSharingExternalSyntheticLambda0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final CameraProviderInitRetryPolicy read;

    @Override // o.StreamSharingExternalSyntheticLambda0
    public ImageUtilCodecFailedException RemoteActionCompatParcelizer() {
        return new put(CameraRepository.serializer(this.read));
    }

    public static getOuterActionMenuPresenter IconCompatParcelizer(InitializationException initializationException) {
        getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(2);
        initializationException.IconCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(getouteractionmenupresenter, 0, initializationException));
        return getouteractionmenupresenter;
    }

    public void read(CaptureRequest.Key key, Object obj, play playVar) {
        this.read.IconCompatParcelizer(access701.serializer(key), playVar, obj);
    }

    public getOuterActionMenuPresenter(int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 1) {
            this.read = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            return;
        }
        if (i == 2) {
            this.read = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            return;
        }
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        this.read = cameraProviderInitRetryPolicyRemoteActionCompatParcelizer;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getPreviewStreamState.MediaSessionCompatResultReceiverWrapper;
        Class cls = (Class) cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.read(jpegCaptureDownsizingQuirk, null);
        if (cls != null && !cls.equals(getCurrentContentInsetRight.class)) {
            getOffVariationName.read("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk, getCurrentContentInsetRight.class);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = getPreviewStreamState.PlaybackStateCompat;
        if (cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.read(jpegCaptureDownsizingQuirk2, null) == null) {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, getCurrentContentInsetRight.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // o.getTitleMarginTop
    public CameraProviderInitRetryPolicy serializer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1 || i == 2) {
            throw null;
        }
        return this.read;
    }

    public getOuterActionMenuPresenter(CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy) {
        this.RemoteActionCompatParcelizer = 3;
        this.read = cameraProviderInitRetryPolicy;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getPreviewStreamState.MediaSessionCompatResultReceiverWrapper;
        Class cls = (Class) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk, null);
        if (cls != null && !cls.equals(LruCache.class)) {
            getOffVariationName.read("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        cameraProviderInitRetryPolicy.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, VideoCapture.STREAM_SHARING);
        cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk, LruCache.class);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = getPreviewStreamState.PlaybackStateCompat;
        if (cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk2, null) == null) {
            cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, LruCache.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
