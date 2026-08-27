package o;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getThumbPosition extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object read;

    public getThumbPosition(List list) {
        this.IconCompatParcelizer = 1;
        this.read = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof getDividerWidth)) {
                ((ArrayList) this.read).add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
            }
        } else {
            if (i != 2) {
                super.onActive(cameraCaptureSession);
                return;
            }
            getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) obj;
            getthumbscrollrange.serializer(cameraCaptureSession);
            getthumbscrollrange.serializer(getthumbscrollrange);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
            }
        } else {
            if (i != 2) {
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
            }
            getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) obj;
            getthumbscrollrange.serializer(cameraCaptureSession);
            getthumbscrollrange.IconCompatParcelizer(getthumbscrollrange);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
            }
        } else {
            if (i != 2) {
                super.onClosed(cameraCaptureSession);
                return;
            }
            getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) obj;
            getthumbscrollrange.serializer(cameraCaptureSession);
            getthumbscrollrange.RemoteActionCompatParcelizer(getthumbscrollrange);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
            }
        } else {
            if (i != 2) {
                super.onReady(cameraCaptureSession);
                return;
            }
            getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) obj;
            getthumbscrollrange.serializer(cameraCaptureSession);
            getthumbscrollrange.RatingCompat(getthumbscrollrange);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i == 1) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
            }
        } else {
            if (i != 2) {
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
            }
            getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) obj;
            getthumbscrollrange.serializer(cameraCaptureSession);
            getthumbscrollrange.write(getthumbscrollrange, surface);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        onDrawWithContent ondrawwithcontent;
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            if (i == 1) {
                Iterator it = ((ArrayList) this.read).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            }
            try {
                ((getThumbScrollRange) this.read).serializer(cameraCaptureSession);
                getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) this.read;
                getthumbscrollrange.write(getthumbscrollrange);
                synchronized (((getThumbScrollRange) this.read).MediaSessionCompatToken) {
                    coil3.util.UtilsKt.IconCompatParcelizer(((getThumbScrollRange) this.read).PlaybackStateCompatCustomAction, "OpenCaptureSession completer should not null");
                    getThumbScrollRange getthumbscrollrange2 = (getThumbScrollRange) this.read;
                    ondrawwithcontent = getthumbscrollrange2.PlaybackStateCompatCustomAction;
                    getthumbscrollrange2.PlaybackStateCompatCustomAction = null;
                }
            } finally {
                synchronized (((getThumbScrollRange) this.read).MediaSessionCompatToken) {
                    coil3.util.UtilsKt.IconCompatParcelizer(((getThumbScrollRange) this.read).PlaybackStateCompatCustomAction, "OpenCaptureSession completer should not null");
                    getThumbScrollRange getthumbscrollrange3 = (getThumbScrollRange) this.read;
                    ondrawwithcontent = getthumbscrollrange3.PlaybackStateCompatCustomAction;
                    getthumbscrollrange3.PlaybackStateCompatCustomAction = null;
                    ondrawwithcontent.serializer(new IllegalStateException("onConfigureFailed"));
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        onDrawWithContent ondrawwithcontent;
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                androidx.navigation.NavArgsLazy navArgsLazy = (androidx.navigation.NavArgsLazy) this.read;
                ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1);
                if (((AtomicBoolean) navArgsLazy.read).get()) {
                    if (((ImageWriter) navArgsLazy.MediaSessionCompatQueueItem) != null) {
                        setInflatedId.read("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                        ((ImageWriter) navArgsLazy.MediaSessionCompatQueueItem).close();
                    }
                    navArgsLazy.MediaSessionCompatQueueItem = imageWriterNewInstance;
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            Iterator it = ((ArrayList) this.read).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
            }
            return;
        }
        try {
            ((getThumbScrollRange) this.read).serializer(cameraCaptureSession);
            getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) this.read;
            getthumbscrollrange.read(getthumbscrollrange);
            synchronized (((getThumbScrollRange) this.read).MediaSessionCompatToken) {
                coil3.util.UtilsKt.IconCompatParcelizer(((getThumbScrollRange) this.read).PlaybackStateCompatCustomAction, "OpenCaptureSession completer should not null");
                getThumbScrollRange getthumbscrollrange2 = (getThumbScrollRange) this.read;
                ondrawwithcontent = getthumbscrollrange2.PlaybackStateCompatCustomAction;
                getthumbscrollrange2.PlaybackStateCompatCustomAction = null;
            }
        } finally {
            synchronized (((getThumbScrollRange) this.read).MediaSessionCompatToken) {
                coil3.util.UtilsKt.IconCompatParcelizer(((getThumbScrollRange) this.read).PlaybackStateCompatCustomAction, "OpenCaptureSession completer should not null");
                getThumbScrollRange getthumbscrollrange3 = (getThumbScrollRange) this.read;
                ondrawwithcontent = getthumbscrollrange3.PlaybackStateCompatCustomAction;
                getthumbscrollrange3.PlaybackStateCompatCustomAction = null;
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
            }
        }
    }

    public /* synthetic */ getThumbPosition(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }
}
