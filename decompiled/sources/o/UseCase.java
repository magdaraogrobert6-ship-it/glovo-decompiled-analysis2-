package o;

/* JADX INFO: loaded from: classes.dex */
public final class UseCase implements ImageUtilCodecFailedException, getImageFormatdefault, getController {
    public static final JpegCaptureDownsizingQuirk IconCompatParcelizer;
    public static final JpegCaptureDownsizingQuirk MediaBrowserCompatMediaItem;
    public static final JpegCaptureDownsizingQuirk MediaDescriptionCompat;
    public static final JpegCaptureDownsizingQuirk MediaMetadataCompat;
    public static final JpegCaptureDownsizingQuirk MediaSessionCompatQueueItem;
    public static final JpegCaptureDownsizingQuirk MediaSessionCompatToken;
    public static final JpegCaptureDownsizingQuirk RatingCompat;
    public static final JpegCaptureDownsizingQuirk RemoteActionCompatParcelizer;
    public static final JpegCaptureDownsizingQuirk read;
    public static final JpegCaptureDownsizingQuirk serializer;
    public static final JpegCaptureDownsizingQuirk write;
    public final CameraRepository PlaybackStateCompatCustomAction;

    @Override // o.DeferrableSurfaces
    public final InitializationException read() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.getFeatureGroupUseCaseType
    public final int RemoteActionCompatParcelizer() {
        return ((Integer) write(getFeatureGroupUseCaseType.b_)).intValue();
    }

    public UseCase(CameraRepository cameraRepository) {
        this.PlaybackStateCompatCustomAction = cameraRepository;
    }

    static {
        Class cls = Integer.TYPE;
        RemoteActionCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.captureMode", cls, null);
        write = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.flashMode", cls, null);
        serializer = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.captureBundle", getNavigationContentDescription.class, null);
        read = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        MediaMetadataCompat = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.outputFormat", Integer.class, null);
        MediaSessionCompatQueueItem = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.imageReaderProxyProvider", setTitleTextColor.class, null);
        MediaSessionCompatToken = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        IconCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.flashType", cls, null);
        MediaBrowserCompatMediaItem = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        MediaDescriptionCompat = new JpegCaptureDownsizingQuirk("camerax.core.imageCapture.screenFlash", setTitleMarginBottom.class, null);
        RatingCompat = new JpegCaptureDownsizingQuirk("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }
}
