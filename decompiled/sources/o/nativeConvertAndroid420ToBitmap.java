package o;

import android.os.SystemClock;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;

/* JADX INFO: loaded from: classes.dex */
public final class nativeConvertAndroid420ToBitmap {
    public final long IconCompatParcelizer;
    public final Throwable RemoteActionCompatParcelizer;
    public final int read;

    public nativeConvertAndroid420ToBitmap(Exception exc, long j) {
        this.IconCompatParcelizer = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.read = 2;
            this.RemoteActionCompatParcelizer = exc;
            return;
        }
        if (!(exc instanceof androidx.camera.core.InitializationException)) {
            this.read = 0;
            this.RemoteActionCompatParcelizer = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.RemoteActionCompatParcelizer = exc;
        if (exc instanceof androidx.camera.core.CameraUnavailableException) {
            this.read = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.read = 1;
        } else {
            this.read = 0;
        }
    }
}
