package o;

import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class VectorizedFloatDecaySpec {
    public PreviewGreenTintQuirk IconCompatParcelizer;
    public final seek RemoteActionCompatParcelizer;
    public final androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk read;
    public long serializer = -1;
    public final PreviewGreenTintQuirk write;

    public final long RemoteActionCompatParcelizer(long j) {
        boolean z;
        PreviewGreenTintQuirk previewGreenTintQuirk = this.IconCompatParcelizer;
        seek seekVar = this.RemoteActionCompatParcelizer;
        if (previewGreenTintQuirk == null) {
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = this.read;
            PreviewGreenTintQuirk previewGreenTintQuirk2 = this.write;
            if (cameraUseInconsistentTimebaseQuirk != null) {
                setInflatedId.read("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                z = seekVar.MediaDescriptionCompat() - seekVar.MediaSessionCompatQueueItem() > 3000000;
                this.IconCompatParcelizer = previewGreenTintQuirk2;
            }
            PreviewGreenTintQuirk previewGreenTintQuirk3 = Math.abs(j - seekVar.MediaDescriptionCompat()) < Math.abs(j - seekVar.MediaSessionCompatQueueItem()) ? PreviewGreenTintQuirk.REALTIME : PreviewGreenTintQuirk.UPTIME;
            if (!z || previewGreenTintQuirk3 == previewGreenTintQuirk2) {
                Objects.toString(previewGreenTintQuirk3);
                setInflatedId.IconCompatParcelizer(3, "VideoTimebaseConverter");
            } else {
                int i = Build.VERSION.SDK_INT;
                setInflatedId.serializer("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), i >= 31 ? ", SOC: " + Build.SOC_MODEL : "", this.write, previewGreenTintQuirk3));
            }
            previewGreenTintQuirk2 = previewGreenTintQuirk3;
            this.IconCompatParcelizer = previewGreenTintQuirk2;
        }
        int i2 = donePlaying.serializer[this.IconCompatParcelizer.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return j;
            }
            throw new AssertionError("Unknown timebase: " + this.IconCompatParcelizer);
        }
        if (this.serializer == -1) {
            long j2 = Long.MAX_VALUE;
            long j3 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                long jMediaSessionCompatQueueItem = seekVar.MediaSessionCompatQueueItem();
                long jMediaDescriptionCompat = seekVar.MediaDescriptionCompat();
                long jMediaSessionCompatQueueItem2 = seekVar.MediaSessionCompatQueueItem();
                long j4 = jMediaSessionCompatQueueItem2 - jMediaSessionCompatQueueItem;
                if (i3 == 0 || j4 < j2) {
                    j3 = jMediaDescriptionCompat - ((jMediaSessionCompatQueueItem + jMediaSessionCompatQueueItem2) >> 1);
                    j2 = j4;
                }
            }
            this.serializer = Math.max(0L, j3);
            setInflatedId.IconCompatParcelizer(3, "VideoTimebaseConverter");
        }
        return j - this.serializer;
    }

    public VectorizedFloatDecaySpec(accessgetGreencp accessgetgreencp, PreviewGreenTintQuirk previewGreenTintQuirk, androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.RemoteActionCompatParcelizer = accessgetgreencp;
        this.write = previewGreenTintQuirk;
        this.read = cameraUseInconsistentTimebaseQuirk;
    }
}
