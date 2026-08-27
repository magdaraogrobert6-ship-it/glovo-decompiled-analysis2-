package o;

import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface ImageUtilCodecFailedException extends getPreviewStreamState, getFeatureGroupUseCaseType {
    public static final JpegCaptureDownsizingQuirk ResultReceiver;
    public static final JpegCaptureDownsizingQuirk r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final JpegCaptureDownsizingQuirk r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public static final JpegCaptureDownsizingQuirk r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public static final JpegCaptureDownsizingQuirk r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public static final JpegCaptureDownsizingQuirk r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public static final JpegCaptureDownsizingQuirk r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public static final JpegCaptureDownsizingQuirk r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public static final JpegCaptureDownsizingQuirk r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public static final JpegCaptureDownsizingQuirk r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public static final JpegCaptureDownsizingQuirk r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public static final JpegCaptureDownsizingQuirk r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new JpegCaptureDownsizingQuirk("camerax.core.useCase.defaultSessionConfig", mapToBase.class, null);
    public static final JpegCaptureDownsizingQuirk r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new JpegCaptureDownsizingQuirk("camerax.core.useCase.defaultCaptureConfig", nativeGetYUVImageVUOff.class, null);
    public static final JpegCaptureDownsizingQuirk r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new JpegCaptureDownsizingQuirk("camerax.core.useCase.sessionConfigUnpacker", getBaselineAlignedChildIndex.class, null);
    public static final JpegCaptureDownsizingQuirk ComponentActivity = new JpegCaptureDownsizingQuirk("camerax.core.useCase.captureConfigUnpacker", setAllowStacking.class, null);

    default AeFpsRangeQuirk RatingCompat() {
        AeFpsRangeQuirk aeFpsRangeQuirk = (AeFpsRangeQuirk) read(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, AeFpsRangeQuirk.DEFAULT);
        Objects.requireNonNull(aeFpsRangeQuirk);
        return aeFpsRangeQuirk;
    }

    default VideoCapture write() {
        return (VideoCapture) write(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
    }

    default int MediaSessionCompatQueueItem() {
        return ((Integer) read(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 0)).intValue();
    }

    default int serializer() {
        return ((Integer) read(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 0)).intValue();
    }

    static {
        Class cls = Integer.TYPE;
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new JpegCaptureDownsizingQuirk("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new JpegCaptureDownsizingQuirk("camerax.core.useCase.sessionType", cls, null);
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new JpegCaptureDownsizingQuirk("camerax.core.useCase.targetFrameRate", Range.class, null);
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new JpegCaptureDownsizingQuirk("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Class cls2 = Boolean.TYPE;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new JpegCaptureDownsizingQuirk("camerax.core.useCase.zslDisabled", cls2, null);
        ResultReceiver = new JpegCaptureDownsizingQuirk("camerax.core.useCase.highResolutionDisabled", cls2, null);
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new JpegCaptureDownsizingQuirk("camerax.core.useCase.captureType", VideoCapture.class, null);
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new JpegCaptureDownsizingQuirk("camerax.core.useCase.previewStabilizationMode", cls, null);
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new JpegCaptureDownsizingQuirk("camerax.core.useCase.videoStabilizationMode", cls, null);
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new JpegCaptureDownsizingQuirk("camerax.core.useCase.takePictureManagerProvider", ImageUtil.class, null);
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new JpegCaptureDownsizingQuirk("camerax.core.useCase.streamUseCase", AeFpsRangeQuirk.class, null);
    }
}
