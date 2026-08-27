package o;

/* JADX INFO: loaded from: classes.dex */
public interface getFeatureGroupUseCaseType extends DeferrableSurfaces {
    public static final JpegCaptureDownsizingQuirk ParcelableVolumeInfo;
    public static final JpegCaptureDownsizingQuirk a_;
    public static final JpegCaptureDownsizingQuirk b_;

    default getNavigationIcon IconCompatParcelizer() {
        getNavigationIcon getnavigationicon = (getNavigationIcon) read(a_, getNavigationIcon.MediaMetadataCompat);
        getnavigationicon.getClass();
        return getnavigationicon;
    }

    default int RemoteActionCompatParcelizer() {
        return ((Integer) write(b_)).intValue();
    }

    static {
        Class cls = Integer.TYPE;
        b_ = new JpegCaptureDownsizingQuirk("camerax.core.imageInput.inputFormat", cls, null);
        ParcelableVolumeInfo = new JpegCaptureDownsizingQuirk("camerax.core.imageInput.secondaryInputFormat", cls, null);
        a_ = new JpegCaptureDownsizingQuirk("camerax.core.imageInput.inputDynamicRange", getNavigationIcon.class, null);
    }
}
