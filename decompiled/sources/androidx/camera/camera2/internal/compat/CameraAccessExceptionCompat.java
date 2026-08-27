package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import com.huawei.location.router.dispatch.IDispatchExceptionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {
    public static final Set IconCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public final int read;

    /* JADX WARN: Illegal instructions before constructor call */
    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        Integer numValueOf = Integer.valueOf(IDispatchExceptionListener.API_TASK_EMPTY);
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", numValueOf, str), assertionError);
        this.read = IDispatchExceptionListener.API_TASK_EMPTY;
        if (IconCompatParcelizer.contains(numValueOf)) {
            new CameraAccessException(IDispatchExceptionListener.API_TASK_EMPTY, str, assertionError);
        }
    }

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(IDispatchExceptionListener.API_NOT_EXIST), Integer.valueOf(IDispatchExceptionListener.API_TASK_EMPTY))));
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.read = IDispatchExceptionListener.API_NOT_EXIST;
        if (IconCompatParcelizer.contains(Integer.valueOf(IDispatchExceptionListener.API_NOT_EXIST))) {
            new CameraAccessException(IDispatchExceptionListener.API_NOT_EXIST, null, runtimeException);
        }
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.read = cameraAccessException.getReason();
    }
}
