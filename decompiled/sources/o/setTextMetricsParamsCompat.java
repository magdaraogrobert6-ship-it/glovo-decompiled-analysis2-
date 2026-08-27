package o;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hmf.tasks.a.i$d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class setTextMetricsParamsCompat extends CameraDevice.StateCallback {
    public ScheduledFuture IconCompatParcelizer;
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl RatingCompat;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk RemoteActionCompatParcelizer;
    public toImageConfig read;
    public final io.sentry.android.core.MediaSessionCompatResultReceiverWrapper serializer;
    public final ReportedVideoQualityNotSupportedQuirk write;

    public setTextMetricsParamsCompat(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, long j) {
        this.RatingCompat = camera2CameraImpl;
        this.RemoteActionCompatParcelizer = previewFreezeAfterHighSpeedRecordingQuirk;
        this.write = reportedVideoQualityNotSupportedQuirk;
        this.serializer = new io.sentry.android.core.MediaSessionCompatResultReceiverWrapper(this, j);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) throws Throwable {
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.RatingCompat;
        camera2CameraImpl.write = cameraDevice;
        camera2CameraImpl.MediaBrowserCompatMediaItem = i;
        i$d i_d = camera2CameraImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ((androidx.camera.camera2.internal.Camera2CameraImpl) i_d.read).write("Camera receive onErrorCallback");
        i_d.read();
        int iOrdinal = this.RatingCompat._init_lambda1.ordinal();
        if (iOrdinal != 1) {
            switch (iOrdinal) {
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    cameraDevice.getId();
                    this.RatingCompat._init_lambda1.name();
                    int i2 = 3;
                    setInflatedId.IconCompatParcelizer(3, "Camera2CameraImpl");
                    coil3.util.UtilsKt.RemoteActionCompatParcelizer("Attempt to handle open error from non open state: " + this.RatingCompat._init_lambda1, this.RatingCompat._init_lambda1 == setTextFuture.OPENING || this.RatingCompat._init_lambda1 == setTextFuture.OPENED || this.RatingCompat._init_lambda1 == setTextFuture.CONFIGURED || this.RatingCompat._init_lambda1 == setTextFuture.REOPENING || this.RatingCompat._init_lambda1 == setTextFuture.REOPENING_QUIRK);
                    if (i == 1 || i == 2 || i == 4) {
                        cameraDevice.getId();
                        setInflatedId.IconCompatParcelizer(3, "Camera2CameraImpl");
                        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = this.RatingCompat;
                        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Can only reopen camera device after error if the camera device is actually in an error state.", camera2CameraImpl2.MediaBrowserCompatMediaItem != 0);
                        if (i == 1) {
                            i2 = 2;
                        } else if (i == 2) {
                            i2 = 1;
                        }
                        camera2CameraImpl2.serializer(setTextFuture.REOPENING, new Toolbar(i2, null), true);
                        camera2CameraImpl2.write();
                    } else {
                        setInflatedId.serializer("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + androidx.camera.camera2.internal.Camera2CameraImpl.RemoteActionCompatParcelizer(i) + " closing camera.");
                        this.RatingCompat.serializer(setTextFuture.CLOSING, new Toolbar(i == 3 ? 5 : 6, null), true);
                        this.RatingCompat.write();
                    }
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.RatingCompat._init_lambda1, "onError() should not be possible from state: ");
                    break;
            }
            return;
        }
        String id = cameraDevice.getId();
        String strRemoteActionCompatParcelizer = androidx.camera.camera2.internal.Camera2CameraImpl.RemoteActionCompatParcelizer(i);
        String strName = this.RatingCompat._init_lambda1.name();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CameraDevice.onError(): ", id, " failed with ", strRemoteActionCompatParcelizer, " while in ");
        sbM.append(strName);
        sbM.append(" state. Will finish closing camera.");
        setInflatedId.serializer("Camera2CameraImpl", sbM.toString());
        this.RatingCompat.write();
    }

    public final boolean serializer() {
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.RatingCompat;
        if (!camera2CameraImpl.ComponentActivity) {
            return false;
        }
        int i = camera2CameraImpl.MediaBrowserCompatMediaItem;
        return i == 1 || i == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) throws Throwable {
        this.RatingCompat.write("CameraDevice.onClosed()");
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Unexpected onClose callback on camera device: " + cameraDevice, this.RatingCompat.write == null);
        int iOrdinal = this.RatingCompat._init_lambda1.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, this.RatingCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
            this.RatingCompat.IconCompatParcelizer();
            return;
        }
        if (iOrdinal != 6 && iOrdinal != 7) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.RatingCompat._init_lambda1, "Camera closed while in state: ");
            return;
        }
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.RatingCompat;
        int i = camera2CameraImpl.MediaBrowserCompatMediaItem;
        if (i == 0) {
            camera2CameraImpl.serializer(false);
        } else {
            camera2CameraImpl.write("Camera closed due to error: ".concat(androidx.camera.camera2.internal.Camera2CameraImpl.RemoteActionCompatParcelizer(i)));
            IconCompatParcelizer();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) throws Throwable {
        this.RatingCompat.write("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) throws Throwable {
        this.RatingCompat.write("CameraDevice.onOpened()");
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.RatingCompat;
        camera2CameraImpl.write = cameraDevice;
        camera2CameraImpl.MediaBrowserCompatMediaItem = 0;
        this.serializer.write = -1L;
        int iOrdinal = camera2CameraImpl._init_lambda1.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, this.RatingCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
            this.RatingCompat.write.close();
            this.RatingCompat.write = null;
        } else {
            if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.RatingCompat._init_lambda1, "onOpened() should not be possible from state: ");
                return;
            }
            this.RatingCompat.read(setTextFuture.OPENED);
            nativeWriteJpegToSurface nativewritejpegtosurface = this.RatingCompat.MediaSessionCompatQueueItem;
            String id = cameraDevice.getId();
            androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl2 = this.RatingCompat;
            if (nativewritejpegtosurface.RemoteActionCompatParcelizer(id, camera2CameraImpl2.RemoteActionCompatParcelizer.IconCompatParcelizer(camera2CameraImpl2.write.getId()))) {
                this.RatingCompat.MediaSessionCompatToken();
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            return false;
        }
        this.RatingCompat.write("Cancelling scheduled re-open: " + this.read);
        this.read.serializer = true;
        this.read = null;
        this.IconCompatParcelizer.cancel(false);
        this.IconCompatParcelizer = null;
        return true;
    }

    public final void IconCompatParcelizer() {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, this.read == null);
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, this.IconCompatParcelizer == null);
        io.sentry.android.core.MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = this.serializer;
        mediaSessionCompatResultReceiverWrapper.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (mediaSessionCompatResultReceiverWrapper.write == -1) {
            mediaSessionCompatResultReceiverWrapper.write = jUptimeMillis;
        }
        long j = mediaSessionCompatResultReceiverWrapper.write;
        long jSerializer = mediaSessionCompatResultReceiverWrapper.serializer();
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.RatingCompat;
        if (jUptimeMillis - j >= jSerializer) {
            mediaSessionCompatResultReceiverWrapper.write = -1L;
            setInflatedId.serializer("Camera2CameraImpl", "Camera reopening attempted for " + mediaSessionCompatResultReceiverWrapper.serializer() + "ms without success.");
            camera2CameraImpl.serializer(setTextFuture.PENDING_OPEN, null, false);
            return;
        }
        this.read = new toImageConfig(this, this.RemoteActionCompatParcelizer);
        camera2CameraImpl.write("Attempting camera re-open in " + mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer() + "ms: " + this.read + " activeResuming = " + camera2CameraImpl.ComponentActivity);
        this.IconCompatParcelizer = this.write.schedule(this.read, (long) mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(), TimeUnit.MILLISECONDS);
    }
}
