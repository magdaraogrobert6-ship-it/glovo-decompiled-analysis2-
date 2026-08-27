package o;

import android.hardware.camera2.TotalCaptureResult;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getLastBaselineToBottomHeight implements Runnable {
    public final /* synthetic */ onDrawWithContent IconCompatParcelizer;
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraControlImpl read;
    public final /* synthetic */ int write;

    public /* synthetic */ getLastBaselineToBottomHeight(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, onDrawWithContent ondrawwithcontent, int i) {
        this.write = i;
        this.read = camera2CameraControlImpl;
        this.IconCompatParcelizer = ondrawwithcontent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
        androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.read;
        if (i != 0) {
            ondrawwithcontent.RemoteActionCompatParcelizer(Boolean.valueOf(camera2CameraControlImpl.MediaSessionCompatResultReceiverWrapper));
            return;
        }
        final long jMediaSessionCompatQueueItem = camera2CameraControlImpl.MediaSessionCompatQueueItem();
        final onDrawWithContent ondrawwithcontent2 = new onDrawWithContent();
        ondrawwithcontent2.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent2);
        ondrawwithcontent2.read = ondrawbehind;
        ondrawwithcontent2.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            camera2CameraControlImpl.write(new onDetachedFromWindow() { // from class: o.setAutoSizeTextTypeUniformWithConfiguration
                @Override // o.onDetachedFromWindow
                public final boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult) {
                    if (!androidx.camera.camera2.internal.Camera2CameraControlImpl.serializer(totalCaptureResult, jMediaSessionCompatQueueItem)) {
                        return false;
                    }
                    ondrawwithcontent2.RemoteActionCompatParcelizer(null);
                    return true;
                }
            });
            ondrawwithcontent2.RemoteActionCompatParcelizer = "waitForSessionUpdateId:" + jMediaSessionCompatQueueItem;
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        VideoQualityQuirk.write(ondrawbehind, ondrawwithcontent);
    }
}
