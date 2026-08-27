package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class setGravity {
    public static void IconCompatParcelizer(android.view.inputmethod.InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static getNavigationIcon IconCompatParcelizer(getThumbTintList getthumbtintlist) {
        Long l = (Long) getthumbtintlist.write(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (getNavigationIcon) setEnforceSwitchWidth.read.get(l);
        }
        return null;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }
}
