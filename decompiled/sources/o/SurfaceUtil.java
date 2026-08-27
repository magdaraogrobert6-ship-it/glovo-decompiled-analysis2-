package o;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceUtil implements Runnable {
    public static final Object write = new Object();
    public final Executor IconCompatParcelizer;
    public final CameraValidatorCameraIdListIncorrectException MediaBrowserCompatMediaItem;
    public final AtomicReference MediaSessionCompatQueueItem;
    public final AtomicBoolean serializer = new AtomicBoolean(true);
    public Object read = write;
    public int RemoteActionCompatParcelizer = -1;
    public boolean RatingCompat = false;

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            if (!this.serializer.get()) {
                this.RatingCompat = false;
                return;
            }
            Object obj = this.MediaSessionCompatQueueItem.get();
            int i = this.RemoteActionCompatParcelizer;
            while (true) {
                if (!Objects.equals(this.read, obj)) {
                    this.read = obj;
                    boolean z = obj instanceof PreviewUnderExposureQuirk;
                    CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException = this.MediaBrowserCompatMediaItem;
                    if (z) {
                        cameraValidatorCameraIdListIncorrectException.IconCompatParcelizer((Throwable) null);
                    } else {
                        cameraValidatorCameraIdListIncorrectException.IconCompatParcelizer(obj);
                    }
                }
                synchronized (this) {
                    if (i == this.RemoteActionCompatParcelizer || !this.serializer.get()) {
                        break;
                        break;
                    } else {
                        obj = this.MediaSessionCompatQueueItem.get();
                        i = this.RemoteActionCompatParcelizer;
                    }
                }
            }
            this.RatingCompat = false;
        }
    }

    public final void write(int i) {
        synchronized (this) {
            if (this.serializer.get()) {
                if (i <= this.RemoteActionCompatParcelizer) {
                    return;
                }
                this.RemoteActionCompatParcelizer = i;
                if (this.RatingCompat) {
                    return;
                }
                this.RatingCompat = true;
                try {
                    this.IconCompatParcelizer.execute(this);
                } catch (Throwable unused) {
                    synchronized (this) {
                        this.RatingCompat = false;
                    }
                }
            }
        }
    }

    public SurfaceUtil(AtomicReference atomicReference, Executor executor, CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        this.MediaSessionCompatQueueItem = atomicReference;
        this.IconCompatParcelizer = executor;
        this.MediaBrowserCompatMediaItem = cameraValidatorCameraIdListIncorrectException;
    }
}
