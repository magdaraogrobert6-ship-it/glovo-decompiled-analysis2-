package o;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class Animatable extends StillCaptureFlashStopRepeatingQuirk {
    public final /* synthetic */ AtomicBoolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer = true;
    public final /* synthetic */ onDrawWithContent read;
    public final /* synthetic */ UseCaseAdditionSimulator serializer;

    public Animatable(AtomicBoolean atomicBoolean, onDrawWithContent ondrawwithcontent, UseCaseAdditionSimulator useCaseAdditionSimulator) {
        this.IconCompatParcelizer = atomicBoolean;
        this.read = ondrawwithcontent;
        this.serializer = useCaseAdditionSimulator;
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public final void serializer(int i, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
        Object obj;
        if (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            cameraXExternalSyntheticLambda0.RatingCompat();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
            setInflatedId.IconCompatParcelizer(3, "VideoCapture");
        }
        AtomicBoolean atomicBoolean = this.IconCompatParcelizer;
        if (atomicBoolean.get() || (obj = cameraXExternalSyntheticLambda0.MediaBrowserCompatMediaItem().IconCompatParcelizer.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        onDrawWithContent ondrawwithcontent = this.read;
        if (iIntValue == ondrawwithcontent.hashCode() && ondrawwithcontent.RemoteActionCompatParcelizer(null) && !atomicBoolean.getAndSet(true)) {
            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new Crossfade(this, 15, this.serializer));
        }
    }
}
