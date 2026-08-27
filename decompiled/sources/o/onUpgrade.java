package o;

import com.roadrunner.liveness.api.recording.CameraImage;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class onUpgrade {
    private static int read = 0;
    private static int write = 1;
    public CameraImage serializer;

    public final CameraImage RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.RemoteActionCompatParcelizer.getClass();
        CameraImage cameraImage = this.serializer;
        int i4 = write + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return cameraImage;
    }
}
