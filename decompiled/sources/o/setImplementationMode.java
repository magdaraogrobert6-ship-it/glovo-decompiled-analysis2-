package o;

import com.google.re2j.Machine$Queue;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class setImplementationMode extends Machine$Queue {
    public final void write(getInflatedId getinflatedid) {
        Object objRemoteActionCompatParcelizer;
        setTitleMarginStart settitlemarginstart = getinflatedid.read();
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = settitlemarginstart instanceof getDisplayManager ? ((getDisplayManager) settitlemarginstart).serializer : null;
        if (cameraXExternalSyntheticLambda0 == null || ((cameraXExternalSyntheticLambda0.serializer() != Camera2CameraControlExternalSyntheticLambda1.LOCKED_FOCUSED && cameraXExternalSyntheticLambda0.serializer() != Camera2CameraControlExternalSyntheticLambda1.PASSIVE_FOCUSED) || cameraXExternalSyntheticLambda0.write() != TorchIsClosedAfterImageCapturingQuirk.CONVERGED || cameraXExternalSyntheticLambda0.read() != CaptureRequestOptionsBuilderExternalSyntheticLambda0.CONVERGED)) {
            ((getTrackDrawable) this.write).getClass();
            getinflatedid.close();
            return;
        }
        synchronized (this.serializer) {
            objRemoteActionCompatParcelizer = ((ArrayDeque) this.IconCompatParcelizer).size() >= this.read ? RemoteActionCompatParcelizer() : null;
            ((ArrayDeque) this.IconCompatParcelizer).addFirst(getinflatedid);
        }
        if (((getTrackDrawable) this.write) == null || objRemoteActionCompatParcelizer == null) {
            return;
        }
        ((getInflatedId) objRemoteActionCompatParcelizer).close();
    }

    public setImplementationMode(int i, getTrackDrawable gettrackdrawable) {
        super(i, gettrackdrawable);
    }
}
