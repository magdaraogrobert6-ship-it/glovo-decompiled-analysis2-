package o;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class create implements ImageCapture1 {
    public final ImageCapture1 IconCompatParcelizer;
    public final safeSizeOf RemoteActionCompatParcelizer;
    public final get read;
    public final ImageCaptureWashedOutImageQuirk serializer;

    @Override // o.ImageCapture1
    public final FocusMeteringAction MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.ImageCapture1
    public final ImageCaptureMetadata MediaSessionCompatQueueItem() {
        return this.serializer;
    }

    @Override // o.ImageCapture1
    public final boolean c_() {
        return false;
    }

    @Override // o.ImageCapture1
    public final DeferrableSurfaceSurfaceUnavailableException MediaDescriptionCompat() {
        return this.IconCompatParcelizer.MediaDescriptionCompat();
    }

    public create(ImageCapture1 imageCapture1, get getVar, StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0) {
        this.IconCompatParcelizer = imageCapture1;
        this.read = getVar;
        this.serializer = new ImageCaptureWashedOutImageQuirk(imageCapture1.MediaSessionCompatQueueItem(), streamSharing$$ExternalSyntheticLambda0);
        this.RemoteActionCompatParcelizer = new safeSizeOf(imageCapture1.MediaMetadataCompat());
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void IconCompatParcelizer(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        this.read.IconCompatParcelizer(useCase);
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void RemoteActionCompatParcelizer(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        this.read.RemoteActionCompatParcelizer(useCase);
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void read(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        this.read.read(useCase);
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void serializer(androidx.camera.core.UseCase useCase) {
        PrematureEndOfStreamVideoQuirk.write();
        this.read.serializer(useCase);
    }

    @Override // o.ImageCapture1
    public final DrawModifierNodeKt ParcelableVolumeInfo() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
