package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getDividerDrawable extends CameraCaptureSession.CaptureCallback {
    public final Object read;
    public Object serializer;
    public final /* synthetic */ int write;

    public void serializer() {
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.serializer;
        if (ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
            this.serializer = null;
        }
    }

    public void serializer(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.read;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    public List write(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.read).get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public getDividerDrawable(int i) {
        this.write = i;
        if (i != 2) {
            this.serializer = null;
            this.read = new HashMap();
            return;
        }
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.serializer = ondrawwithcontent;
            ondrawwithcontent.RemoteActionCompatParcelizer = "RequestCompleteListener[" + this + "]";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.read = ondrawbehind;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        if (this.write != 0) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
            return;
        }
        Iterator it = write(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i = this.write;
        if (i == 0) {
            Iterator it = write(captureRequest).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        } else if (i != 1) {
            serializer();
        } else {
            ((PreviewFreezeAfterHighSpeedRecordingQuirk) this.serializer).execute(new CameraX$$ExternalSyntheticLambda2(this, 4, totalCaptureResult));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        int i = this.write;
        if (i == 0) {
            Iterator it = write(captureRequest).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        } else if (i != 2) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        } else {
            serializer();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        if (this.write != 0) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            return;
        }
        Iterator it = write(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        int i2 = this.write;
        if (i2 != 0) {
            if (i2 != 2) {
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                return;
            } else {
                serializer();
                return;
            }
        }
        Iterator it = ((HashMap) this.read).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        getShowDividers getshowdividers = (getShowDividers) this.serializer;
        if (getshowdividers != null) {
            getshowdividers.RemoteActionCompatParcelizer();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        int i2 = this.write;
        if (i2 != 0) {
            if (i2 != 2) {
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                return;
            } else {
                serializer();
                return;
            }
        }
        Iterator it = ((HashMap) this.read).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        getShowDividers getshowdividers = (getShowDividers) this.serializer;
        if (getshowdividers != null) {
            getshowdividers.RemoteActionCompatParcelizer();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        int i = this.write;
        if (i == 0) {
            Iterator it = write(captureRequest).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
            }
        } else if (i != 2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        } else {
            serializer();
        }
    }

    public getDividerDrawable(PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        this.write = 1;
        this.read = new HashSet();
        this.serializer = previewFreezeAfterHighSpeedRecordingQuirk;
    }
}
