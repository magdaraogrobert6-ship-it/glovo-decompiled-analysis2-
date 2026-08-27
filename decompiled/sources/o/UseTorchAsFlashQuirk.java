package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UseTorchAsFlashQuirk extends StillCaptureFlashStopRepeatingQuirk {
    public final ArrayList serializer = new ArrayList();

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public final void IconCompatParcelizer(int i) {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((StillCaptureFlashStopRepeatingQuirk) it.next()).IconCompatParcelizer(i);
        }
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public final void RemoteActionCompatParcelizer(int i) {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((StillCaptureFlashStopRepeatingQuirk) it.next()).RemoteActionCompatParcelizer(i);
        }
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public final void RemoteActionCompatParcelizer(int i, androidx.camera.view.PendingValue pendingValue) {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((StillCaptureFlashStopRepeatingQuirk) it.next()).RemoteActionCompatParcelizer(i, pendingValue);
        }
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public final void serializer(int i, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((StillCaptureFlashStopRepeatingQuirk) it.next()).serializer(i, cameraXExternalSyntheticLambda0);
        }
    }

    public UseTorchAsFlashQuirk(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk = (StillCaptureFlashStopRepeatingQuirk) it.next();
            if (!(stillCaptureFlashStopRepeatingQuirk instanceof TextureViewIsClosedQuirk)) {
                this.serializer.add(stillCaptureFlashStopRepeatingQuirk);
            }
        }
    }
}
