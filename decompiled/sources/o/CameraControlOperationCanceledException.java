package o;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControlOperationCanceledException extends DeferrableSurfaces {
    public static final JpegCaptureDownsizingQuirk serializer = new JpegCaptureDownsizingQuirk("camerax.core.camera.useCaseConfigFactory", Recorder3.class, null);
    public static final JpegCaptureDownsizingQuirk IconCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final JpegCaptureDownsizingQuirk write = new JpegCaptureDownsizingQuirk("camerax.core.camera.SessionProcessor", CameraUseCaseAdapterCameraException.class, null);
    public static final JpegCaptureDownsizingQuirk RemoteActionCompatParcelizer = new JpegCaptureDownsizingQuirk("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final JpegCaptureDownsizingQuirk read = new JpegCaptureDownsizingQuirk("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void RemoteActionCompatParcelizer() {
        if (read(write, null) == null) {
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }
}
