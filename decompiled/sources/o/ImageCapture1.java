package o;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface ImageCapture1 extends getContentInsetStart, Camera2CapturePipelineScreenFlashTask {
    default void IconCompatParcelizer(boolean z) {
    }

    default CameraControlOperationCanceledException MediaBrowserCompatMediaItem() {
        return CameraXExternalSyntheticLambda2.write;
    }

    DeferrableSurfaceSurfaceUnavailableException MediaDescriptionCompat();

    FocusMeteringAction MediaMetadataCompat();

    ImageCaptureMetadata MediaSessionCompatQueueItem();

    default void MediaSessionCompatResultReceiverWrapper() {
    }

    DrawModifierNodeKt ParcelableVolumeInfo();

    void RemoteActionCompatParcelizer(ArrayList arrayList);

    void RemoteActionCompatParcelizer(Collection collection);

    default void RemoteActionCompatParcelizer(boolean z) {
    }

    @Override // o.getContentInsetStart
    default FocusMeteringAction ResultReceiver() {
        return MediaMetadataCompat();
    }

    default boolean c_() {
        return true;
    }

    @Override // o.getContentInsetStart
    default ImageCaptureMetadata r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return MediaSessionCompatQueueItem();
    }

    default void write(CameraControlOperationCanceledException cameraControlOperationCanceledException) {
    }

    default boolean d_() {
        return ResultReceiver().MediaBrowserCompatMediaItem() == 0;
    }
}
