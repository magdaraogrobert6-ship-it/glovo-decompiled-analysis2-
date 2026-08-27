package o;

import android.os.Handler;
import androidx.camera.camera2.Camera2Config$$ExternalSyntheticLambda1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getTitleMarginBottom implements getPreviewStreamState {
    public static final JpegCaptureDownsizingQuirk IconCompatParcelizer;
    public static final JpegCaptureDownsizingQuirk MediaBrowserCompatMediaItem;
    public static final JpegCaptureDownsizingQuirk MediaDescriptionCompat;
    public static final JpegCaptureDownsizingQuirk MediaMetadataCompat;
    public static final JpegCaptureDownsizingQuirk MediaSessionCompatQueueItem;
    public static final JpegCaptureDownsizingQuirk RemoteActionCompatParcelizer;
    public static final JpegCaptureDownsizingQuirk read;
    public final CameraRepository PlaybackStateCompatCustomAction;
    public static final JpegCaptureDownsizingQuirk serializer = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.cameraFactoryProvider", access1101.class, null);
    public static final JpegCaptureDownsizingQuirk RatingCompat = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.deviceSurfaceManagerProvider", Camera2Config$$ExternalSyntheticLambda1.class, null);
    public static final JpegCaptureDownsizingQuirk ParcelableVolumeInfo = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.useCaseConfigFactoryProvider", access301.class, null);
    public static final JpegCaptureDownsizingQuirk write = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final JpegCaptureDownsizingQuirk MediaSessionCompatToken = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    @Override // o.DeferrableSurfaces
    public final InitializationException read() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final access1101 IconCompatParcelizer() {
        return (access1101) this.PlaybackStateCompatCustomAction.read(serializer, null);
    }

    public final access301 MediaSessionCompatQueueItem() {
        return (access301) this.PlaybackStateCompatCustomAction.read(ParcelableVolumeInfo, null);
    }

    public final Camera2Config$$ExternalSyntheticLambda1 serializer() {
        return (Camera2Config$$ExternalSyntheticLambda1) this.PlaybackStateCompatCustomAction.read(RatingCompat, null);
    }

    public final getLogoDescription write() {
        return (getLogoDescription) this.PlaybackStateCompatCustomAction.read(read, null);
    }

    public getTitleMarginBottom(CameraRepository cameraRepository) {
        this.PlaybackStateCompatCustomAction = cameraRepository;
    }

    public final long RemoteActionCompatParcelizer() {
        return ((Long) this.PlaybackStateCompatCustomAction.read(RemoteActionCompatParcelizer, -1L)).longValue();
    }

    static {
        Class cls = Integer.TYPE;
        MediaBrowserCompatMediaItem = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.minimumLoggingLevel", cls, null);
        read = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.availableCamerasLimiter", getLogoDescription.class, null);
        RemoteActionCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        IconCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.cameraProviderInitRetryPolicy", newChildScope.class, null);
        MediaMetadataCompat = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.quirksSettings", getRelatedFixedSize.class, null);
        MediaDescriptionCompat = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.configImplType", cls, null);
        MediaSessionCompatQueueItem = new JpegCaptureDownsizingQuirk("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }
}
