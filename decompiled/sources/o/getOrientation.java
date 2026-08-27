package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.ImageCapture$Metadata;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getOrientation extends CameraCaptureSession.CaptureCallback {
    public final Object read;
    public final /* synthetic */ int write;

    public getOrientation(List list) {
        this.write = 1;
        this.read = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof getFixedHeightMajor)) {
                ((ArrayList) this.read).add(captureCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        int i = this.write;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        } else {
            if (i != 2) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
            }
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            ((StillCaptureFlashStopRepeatingQuirk) obj).RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(captureRequest), new androidx.camera.view.PendingValue(3, TorchFlashRequiredFor3aUpdateQuirk.ERROR));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        int i = this.write;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        } else if (i != 2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        } else {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            ((StillCaptureFlashStopRepeatingQuirk) obj).IconCompatParcelizer(RemoteActionCompatParcelizer(captureRequest));
        }
    }

    public static int RemoteActionCompatParcelizer(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof OnePixelShiftQuirk) && (num = (Integer) ((OnePixelShiftQuirk) captureRequest.getTag()).IconCompatParcelizer.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        if (this.write != 1) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            return;
        }
        Iterator it = ((ArrayList) this.read).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        if (this.write != 1) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            return;
        }
        Iterator it = ((ArrayList) this.read).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        if (this.write != 1) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
            return;
        }
        Iterator it = ((ArrayList) this.read).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        if (this.write != 1) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            return;
        }
        Iterator it = ((ArrayList) this.read).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        OnePixelShiftQuirk onePixelShiftQuirk;
        int i = this.write;
        int i2 = 3;
        if (i == 0) {
            synchronized (((setBaselineAligned) this.read).MediaSessionCompatResultReceiverWrapper) {
                mapToBase maptobase = ((setBaselineAligned) this.read).PlaybackStateCompat;
                if (maptobase == null) {
                    return;
                }
                nativeGetYUVImageVUOff nativegetyuvimagevuoff = maptobase.MediaDescriptionCompat;
                setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                setBaselineAligned setbaselinealigned = (setBaselineAligned) this.read;
                setbaselinealigned.ComponentActivity.getClass();
                setbaselinealigned.IconCompatParcelizer(Collections.singletonList(ImageCapture$Metadata.IconCompatParcelizer(nativegetyuvimagevuoff)));
                return;
            }
        }
        if (i == 1) {
            Iterator it = ((ArrayList) this.read).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
            return;
        }
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            coil3.util.UtilsKt.IconCompatParcelizer("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof OnePixelShiftQuirk);
            onePixelShiftQuirk = (OnePixelShiftQuirk) tag;
        } else {
            onePixelShiftQuirk = OnePixelShiftQuirk.read;
        }
        ((StillCaptureFlashStopRepeatingQuirk) this.read).serializer(RemoteActionCompatParcelizer(captureRequest), new accessgetGreencp(onePixelShiftQuirk, i2, totalCaptureResult));
    }

    public getOrientation(StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk) {
        this.write = 2;
        if (stillCaptureFlashStopRepeatingQuirk != null) {
            this.read = stillCaptureFlashStopRepeatingQuirk;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("cameraCaptureCallback is null");
            throw null;
        }
    }

    public getOrientation(setBaselineAligned setbaselinealigned) {
        this.write = 0;
        this.read = setbaselinealigned;
    }
}
