package o;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNodeonPointerEvent1 extends StillCaptureFlashStopRepeatingQuirk {
    public Object read;
    public final /* synthetic */ int serializer = 1;
    public Object write;

    public AbstractClickableNodeonPointerEvent1(onDrawWithContent ondrawwithcontent, FocusMeteringAction focusMeteringAction) {
        this.read = ondrawwithcontent;
        this.write = focusMeteringAction;
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public final void serializer(int i, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
        if (this.serializer == 0) {
            ((onDrawWithContent) this.read).RemoteActionCompatParcelizer(null);
            ((FocusMeteringAction) this.write).RemoteActionCompatParcelizer(this);
            return;
        }
        for (StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk : (HashSet) this.read) {
            try {
                ((Executor) ((ArrayMap) this.write).get(stillCaptureFlashStopRepeatingQuirk)).execute(new renderUrlIntoViewlambda1(i, 4, stillCaptureFlashStopRepeatingQuirk, cameraXExternalSyntheticLambda0));
            } catch (RejectedExecutionException e) {
                setInflatedId.read("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
            }
        }
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public void RemoteActionCompatParcelizer(int i) {
        int i2 = 1;
        if (this.serializer != 1) {
            return;
        }
        for (StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk : (HashSet) this.read) {
            try {
                ((Executor) ((ArrayMap) this.write).get(stillCaptureFlashStopRepeatingQuirk)).execute(new brazelogdefault(stillCaptureFlashStopRepeatingQuirk, i, i2));
            } catch (RejectedExecutionException e) {
                setInflatedId.read("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
            }
        }
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public void RemoteActionCompatParcelizer(int i, androidx.camera.view.PendingValue pendingValue) {
        if (this.serializer != 1) {
            return;
        }
        for (StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk : (HashSet) this.read) {
            try {
                ((Executor) ((ArrayMap) this.write).get(stillCaptureFlashStopRepeatingQuirk)).execute(new renderUrlIntoViewlambda1(i, 3, stillCaptureFlashStopRepeatingQuirk, pendingValue));
            } catch (RejectedExecutionException e) {
                setInflatedId.read("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
            }
        }
    }

    public /* synthetic */ AbstractClickableNodeonPointerEvent1() {
    }
}
