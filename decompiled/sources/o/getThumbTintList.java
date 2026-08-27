package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.i$d;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getThumbTintList {
    public final HashMap IconCompatParcelizer = new HashMap();
    public androidx.navigation.NavArgsLazy RemoteActionCompatParcelizer = null;
    public final ImageCapture$1 read;
    public final String serializer;

    public final boolean RemoteActionCompatParcelizer() {
        Boolean bool = (Boolean) write(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    public final Object write(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.read.MediaSessionCompatQueueItem).get(key);
        }
        synchronized (this) {
            Object obj = this.IconCompatParcelizer.get(key);
            if (obj != null) {
                return obj;
            }
            Object obj2 = ((CameraCharacteristics) this.read.MediaSessionCompatQueueItem).get(key);
            if (obj2 != null) {
                this.IconCompatParcelizer.put(key, obj2);
            }
            return obj2;
        }
    }

    public getThumbTintList(CameraCharacteristics cameraCharacteristics, String str) {
        this.read = new ImageCapture$1(12, cameraCharacteristics);
        this.serializer = str;
    }

    public final androidx.navigation.NavArgsLazy serializer() {
        if (this.RemoteActionCompatParcelizer == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) write(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("StreamConfigurationMap is null!");
                    return null;
                }
                this.RemoteActionCompatParcelizer = new androidx.navigation.NavArgsLazy(streamConfigurationMap, new i$d(this.serializer));
            } catch (AssertionError | NullPointerException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(e.getMessage());
                return null;
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        int i;
        if (!RemoteActionCompatParcelizer() || (i = Build.VERSION.SDK_INT) < 35) {
            return false;
        }
        Integer num = (!RemoteActionCompatParcelizer() || i < 35) ? null : (Integer) write(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        return num != null && num.intValue() > 1;
    }

    public final int write() {
        Integer num = (!RemoteActionCompatParcelizer() || Build.VERSION.SDK_INT < 35) ? null : (Integer) write(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean read() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) this.read.MediaSessionCompatQueueItem).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
