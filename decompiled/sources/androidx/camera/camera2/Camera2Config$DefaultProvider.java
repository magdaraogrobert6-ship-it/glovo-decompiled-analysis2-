package androidx.camera.camera2;

import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.JpegCaptureDownsizingQuirk;
import o.getOuterActionMenuPresenter;
import o.getSubtitleTextView;
import o.getTitleMarginBottom;

/* JADX INFO: loaded from: classes4.dex */
public final class Camera2Config$DefaultProvider implements getSubtitleTextView {
    @Override // o.getSubtitleTextView
    public getTitleMarginBottom getCameraXConfig() {
        Object obj = new Object() { // from class: o.access1101
        };
        Camera2Config$$ExternalSyntheticLambda1 camera2Config$$ExternalSyntheticLambda1 = new Camera2Config$$ExternalSyntheticLambda1();
        Object obj2 = new Object() { // from class: o.access301
        };
        getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(0);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getTitleMarginBottom.serializer;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy = getouteractionmenupresenter.read;
        cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk, obj);
        cameraProviderInitRetryPolicy.IconCompatParcelizer(getTitleMarginBottom.RatingCompat, camera2Config$$ExternalSyntheticLambda1);
        cameraProviderInitRetryPolicy.IconCompatParcelizer(getTitleMarginBottom.ParcelableVolumeInfo, obj2);
        cameraProviderInitRetryPolicy.IconCompatParcelizer(getTitleMarginBottom.MediaDescriptionCompat, 0);
        cameraProviderInitRetryPolicy.IconCompatParcelizer(getTitleMarginBottom.MediaSessionCompatQueueItem, Boolean.TRUE);
        return new getTitleMarginBottom(CameraRepository.serializer(cameraProviderInitRetryPolicy));
    }
}
