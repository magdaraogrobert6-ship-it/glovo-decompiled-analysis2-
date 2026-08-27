package o;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class JpegHalCorruptImageQuirk implements ImageCapture1 {
    public final ImageCapture1 IconCompatParcelizer;
    public final InvalidVideoProfilesQuirk read;
    public final ImageCaptureWashedOutImageQuirk serializer;

    @Override // o.ImageCapture1
    public final FocusMeteringAction MediaMetadataCompat() {
        return this.read;
    }

    @Override // o.ImageCapture1
    public final ImageCaptureMetadata MediaSessionCompatQueueItem() {
        return this.serializer;
    }

    @Override // o.ImageCapture1, o.getContentInsetStart
    public final FocusMeteringAction ResultReceiver() {
        return this.read;
    }

    @Override // o.ImageCapture1, o.getContentInsetStart
    public final ImageCaptureMetadata r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.serializer;
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void IconCompatParcelizer(androidx.camera.core.UseCase useCase) {
        this.IconCompatParcelizer.IconCompatParcelizer(useCase);
    }

    @Override // o.ImageCapture1
    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.IconCompatParcelizer(z);
    }

    @Override // o.ImageCapture1
    public final CameraControlOperationCanceledException MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // o.ImageCapture1
    public final DeferrableSurfaceSurfaceUnavailableException MediaDescriptionCompat() {
        return this.IconCompatParcelizer.MediaDescriptionCompat();
    }

    @Override // o.ImageCapture1
    public final DrawModifierNodeKt ParcelableVolumeInfo() {
        return this.IconCompatParcelizer.ParcelableVolumeInfo();
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void RemoteActionCompatParcelizer(androidx.camera.core.UseCase useCase) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(useCase);
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(arrayList);
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(Collection collection) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(collection);
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(z);
    }

    @Override // o.ImageCapture1
    public final boolean c_() {
        return this.IconCompatParcelizer.c_();
    }

    @Override // o.ImageCapture1
    public final boolean d_() {
        return this.IconCompatParcelizer.d_();
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void read(androidx.camera.core.UseCase useCase) {
        this.IconCompatParcelizer.read(useCase);
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void serializer(androidx.camera.core.UseCase useCase) {
        this.IconCompatParcelizer.serializer(useCase);
    }

    @Override // o.ImageCapture1
    public final void write(CameraControlOperationCanceledException cameraControlOperationCanceledException) {
        this.IconCompatParcelizer.write(cameraControlOperationCanceledException);
    }

    public JpegHalCorruptImageQuirk(ImageCapture1 imageCapture1, InvalidVideoProfilesQuirk invalidVideoProfilesQuirk) {
        this.IconCompatParcelizer = imageCapture1;
        this.read = invalidVideoProfilesQuirk;
        CameraControlOperationCanceledException cameraControlOperationCanceledException = invalidVideoProfilesQuirk.IconCompatParcelizer;
        ImageCaptureMetadata imageCaptureMetadataMediaSessionCompatQueueItem = imageCapture1.MediaSessionCompatQueueItem();
        cameraControlOperationCanceledException.RemoteActionCompatParcelizer();
        this.serializer = new ImageCaptureWashedOutImageQuirk(imageCaptureMetadataMediaSessionCompatQueueItem);
    }
}
