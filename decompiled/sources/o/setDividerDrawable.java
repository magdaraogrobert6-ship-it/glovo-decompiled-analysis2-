package o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setDividerDrawable extends getThumbOffset {
    public final /* synthetic */ int read;
    public final Object write;

    @Override // o.getThumbOffset
    public void IconCompatParcelizer(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        Object obj = this.write;
        if (i == 1) {
            ((CameraCaptureSession.StateCallback) obj).onCaptureQueueEmpty((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem);
        } else {
            if (i != 2) {
                return;
            }
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).IconCompatParcelizer(getthumbscrollrange);
            }
        }
    }

    @Override // o.getThumbOffset
    public void RemoteActionCompatParcelizer(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        Object obj = this.write;
        if (i == 1) {
            ((CameraCaptureSession.StateCallback) obj).onClosed((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem);
        } else {
            if (i != 2) {
                return;
            }
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).RemoteActionCompatParcelizer(getthumbscrollrange);
            }
        }
    }

    @Override // o.getThumbOffset
    public void serializer(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        Object obj = this.write;
        if (i == 1) {
            ((CameraCaptureSession.StateCallback) obj).onActive((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem);
        } else {
            if (i != 2) {
                return;
            }
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).serializer(getthumbscrollrange);
            }
        }
    }

    @Override // o.getThumbOffset
    public void write(getThumbScrollRange getthumbscrollrange, Surface surface) {
        int i = this.read;
        Object obj = this.write;
        if (i == 1) {
            ((CameraCaptureSession.StateCallback) obj).onSurfacePrepared((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem, surface);
        } else {
            if (i != 2) {
                return;
            }
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).write(getthumbscrollrange, surface);
            }
        }
    }

    public setDividerDrawable(List list, int i) {
        this.read = i;
        if (i != 2) {
            this.write = list.isEmpty() ? new getDividerWidth() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new getThumbPosition(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.write = arrayList;
        arrayList.addAll(list);
    }

    @Override // o.getThumbOffset
    public final void MediaBrowserCompatMediaItem(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        if (i != 0) {
            if (i != 1) {
                Iterator it = ((ArrayList) this.write).iterator();
                while (it.hasNext()) {
                    ((getThumbOffset) it.next()).MediaBrowserCompatMediaItem(getthumbscrollrange);
                }
                return;
            }
            return;
        }
        synchronized (((setBaselineAligned) this.write).MediaSessionCompatResultReceiverWrapper) {
            if (((setBaselineAligned) this.write).MediaSessionCompatToken == setHorizontalGravity.UNINITIALIZED) {
                throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((setBaselineAligned) this.write).MediaSessionCompatToken);
            }
            setInflatedId.IconCompatParcelizer(3, "CaptureSession");
            ((setBaselineAligned) this.write).write();
        }
    }

    @Override // o.getThumbOffset
    public final void RatingCompat(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        if (i != 0) {
            if (i == 1) {
                ((CameraCaptureSession.StateCallback) this.write).onReady((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem);
                return;
            }
            Iterator it = ((ArrayList) this.write).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).RatingCompat(getthumbscrollrange);
            }
            return;
        }
        synchronized (((setBaselineAligned) this.write).MediaSessionCompatResultReceiverWrapper) {
            if (((setBaselineAligned) this.write).MediaSessionCompatToken.ordinal() == 0) {
                throw new IllegalStateException("onReady() should not be possible in state: " + ((setBaselineAligned) this.write).MediaSessionCompatToken);
            }
            Objects.toString(((setBaselineAligned) this.write).MediaSessionCompatToken);
            setInflatedId.IconCompatParcelizer(3, "CaptureSession");
        }
    }

    @Override // o.getThumbOffset
    public final void read(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        if (i != 0) {
            if (i == 1) {
                ((CameraCaptureSession.StateCallback) this.write).onConfigured((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem);
                return;
            }
            Iterator it = ((ArrayList) this.write).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).read(getthumbscrollrange);
            }
            return;
        }
        synchronized (((setBaselineAligned) this.write).MediaSessionCompatResultReceiverWrapper) {
            switch (((setBaselineAligned) this.write).MediaSessionCompatToken.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 7:
                    throw new IllegalStateException("onConfigured() should not be possible in state: " + ((setBaselineAligned) this.write).MediaSessionCompatToken);
                case 4:
                    getthumbscrollrange.write();
                    break;
                case 5:
                    ((setBaselineAligned) this.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getthumbscrollrange;
                    break;
                case 6:
                    ((setBaselineAligned) this.write).RemoteActionCompatParcelizer(setHorizontalGravity.OPENED);
                    ((setBaselineAligned) this.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getthumbscrollrange;
                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                    setBaselineAligned setbaselinealigned = (setBaselineAligned) this.write;
                    setbaselinealigned.write(setbaselinealigned.PlaybackStateCompat);
                    setBaselineAligned setbaselinealigned2 = (setBaselineAligned) this.write;
                    setbaselinealigned2.MediaBrowserCompatMediaItem.IconCompatParcelizer().RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(8, setbaselinealigned2), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                    break;
            }
            Objects.toString(((setBaselineAligned) this.write).MediaSessionCompatToken);
            setInflatedId.IconCompatParcelizer(3, "CaptureSession");
        }
    }

    @Override // o.getThumbOffset
    public final void write(getThumbScrollRange getthumbscrollrange) {
        int i = this.read;
        if (i != 0) {
            if (i == 1) {
                ((CameraCaptureSession.StateCallback) this.write).onConfigureFailed((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.read().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem);
                return;
            }
            Iterator it = ((ArrayList) this.write).iterator();
            while (it.hasNext()) {
                ((getThumbOffset) it.next()).write(getthumbscrollrange);
            }
            return;
        }
        synchronized (((setBaselineAligned) this.write).MediaSessionCompatResultReceiverWrapper) {
            switch (((setBaselineAligned) this.write).MediaSessionCompatToken.ordinal()) {
                case 0:
                case 2:
                case 3:
                case 7:
                    throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((setBaselineAligned) this.write).MediaSessionCompatToken);
                case 1:
                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                    break;
                case 4:
                case 5:
                case 6:
                    ((setBaselineAligned) this.write).write();
                    break;
            }
            setInflatedId.serializer("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((setBaselineAligned) this.write).MediaSessionCompatToken);
        }
    }

    public setDividerDrawable(setBaselineAligned setbaselinealigned) {
        this.read = 0;
        this.write = setbaselinealigned;
    }
}
