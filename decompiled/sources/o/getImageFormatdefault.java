package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface getImageFormatdefault extends DeferrableSurfaces {
    public static final JpegCaptureDownsizingQuirk c_;
    public static final JpegCaptureDownsizingQuirk d_;
    public static final JpegCaptureDownsizingQuirk e_;
    public static final JpegCaptureDownsizingQuirk f_;
    public static final JpegCaptureDownsizingQuirk g_;
    public static final JpegCaptureDownsizingQuirk h_;
    public static final JpegCaptureDownsizingQuirk i_;
    public static final JpegCaptureDownsizingQuirk j_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.targetAspectRatio", ensureMenuView.class, null);
    public static final JpegCaptureDownsizingQuirk k_;
    public static final JpegCaptureDownsizingQuirk l_;

    static void read(getImageFormatdefault getimageformatdefault) {
        boolean z = getimageformatdefault.read(j_);
        boolean z2 = ((android.util.Size) getimageformatdefault.read(k_, null)) != null;
        if (z && z2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((setUseCompatPadding) getimageformatdefault.read(h_, null)) != null) {
            if (z || z2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int write(int i) {
        return ((Integer) read(l_, Integer.valueOf(i))).intValue();
    }

    static {
        Class cls = Integer.TYPE;
        l_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.targetRotation", cls, null);
        c_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.appTargetRotation", cls, null);
        g_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.mirrorMode", cls, null);
        k_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.targetResolution", android.util.Size.class, null);
        e_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.defaultResolution", android.util.Size.class, null);
        f_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.maxResolution", android.util.Size.class, null);
        i_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.supportedResolutions", List.class, null);
        h_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.resolutionSelector", setUseCompatPadding.class, null);
        d_ = new JpegCaptureDownsizingQuirk("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }
}
