package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import o.getOuterActionMenuPresenter;
import o.getSwitchMinWidth;
import o.getThumbTintList;
import o.invalidateFocusProperties;
import o.onDrawWithContent;
import o.play;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidRZoomImpl implements getSwitchMinWidth {
    public final Range MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public onDrawWithContent read;
    public final getThumbTintList serializer;
    public float IconCompatParcelizer = 1.0f;
    public float write = 1.0f;

    @Override // o.getSwitchMinWidth
    public final float IconCompatParcelizer() {
        return ((Float) this.MediaSessionCompatQueueItem.getUpper()).floatValue();
    }

    @Override // o.getSwitchMinWidth
    public final float RemoteActionCompatParcelizer() {
        return ((Float) this.MediaSessionCompatQueueItem.getLower()).floatValue();
    }

    @Override // o.getSwitchMinWidth
    public final void serializer() {
        this.IconCompatParcelizer = 1.0f;
        onDrawWithContent ondrawwithcontent = this.read;
        if (ondrawwithcontent != null) {
            ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
            this.read = null;
        }
    }

    @Override // o.getSwitchMinWidth
    public final Rect write() {
        Rect rect = (Rect) this.serializer.write(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // o.getSwitchMinWidth
    public final void write(float f, onDrawWithContent ondrawwithcontent) {
        this.IconCompatParcelizer = f;
        onDrawWithContent ondrawwithcontent2 = this.read;
        if (ondrawwithcontent2 != null) {
            ondrawwithcontent2.serializer(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.write = this.IconCompatParcelizer;
        this.read = ondrawwithcontent;
    }

    @Override // o.getSwitchMinWidth
    public final void IconCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        if (this.read != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.write == f.floatValue()) {
                this.read.RemoteActionCompatParcelizer(null);
                this.read = null;
            }
        }
    }

    @Override // o.getSwitchMinWidth
    public final void IconCompatParcelizer(getOuterActionMenuPresenter getouteractionmenupresenter) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        float f = this.IconCompatParcelizer;
        play playVar = play.REQUIRED;
        getouteractionmenupresenter.read(key, Float.valueOf(f), playVar);
        if (this.RemoteActionCompatParcelizer) {
            invalidateFocusProperties.IconCompatParcelizer(getouteractionmenupresenter, playVar);
        }
    }

    public AndroidRZoomImpl(getThumbTintList getthumbtintlist) {
        this.RemoteActionCompatParcelizer = false;
        this.serializer = getthumbtintlist;
        this.MediaSessionCompatQueueItem = (Range) getthumbtintlist.write(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.RemoteActionCompatParcelizer = getthumbtintlist.read();
    }
}
