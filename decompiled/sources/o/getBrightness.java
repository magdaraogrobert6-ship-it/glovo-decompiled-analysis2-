package o;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getBrightness implements StopCodecAfterSurfaceRemovalCrashMediaServerQuirk {
    public final /* synthetic */ getContentInsetEndWithActions IconCompatParcelizer;
    public final /* synthetic */ getContentInsetEndWithActions RemoteActionCompatParcelizer;
    public final /* synthetic */ setBrightness read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SurfaceViewStretchedQuirk write;

    public /* synthetic */ getBrightness(setBrightness setbrightness, SurfaceViewStretchedQuirk surfaceViewStretchedQuirk, int i, getContentInsetEndWithActions getcontentinsetendwithactions, getContentInsetEndWithActions getcontentinsetendwithactions2) {
        this.read = setbrightness;
        this.write = surfaceViewStretchedQuirk;
        this.serializer = i;
        this.IconCompatParcelizer = getcontentinsetendwithactions;
        this.RemoteActionCompatParcelizer = getcontentinsetendwithactions2;
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public final DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = this.write;
        Surface surface = (Surface) obj;
        setBrightness setbrightness = this.read;
        setbrightness.getClass();
        surface.getClass();
        try {
            surfaceViewStretchedQuirk.read();
            SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = new SurfaceViewNotCroppedByParentQuirk(surface, this.serializer, setbrightness.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
            surfaceViewNotCroppedByParentQuirk.write.serializer.RemoteActionCompatParcelizer(new onAnimationEnd(surfaceViewStretchedQuirk, 0), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("Consumer can only be linked once.", surfaceViewStretchedQuirk.RemoteActionCompatParcelizer == null);
            surfaceViewStretchedQuirk.RemoteActionCompatParcelizer = surfaceViewNotCroppedByParentQuirk;
            return VideoQualityQuirk.read(surfaceViewNotCroppedByParentQuirk);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new EncoderImplMediaCodecCallback(0, e);
        }
    }
}
