package o;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class onMenuItemSelected {
    public static String IconCompatParcelizer(onPictureInPictureUiStateChanged onpictureinpictureuistatechanged) {
        onpictureinpictureuistatechanged.getClass();
        if (onpictureinpictureuistatechanged instanceof onRequestPermissionsResult) {
            return "image/*";
        }
        if (onpictureinpictureuistatechanged instanceof onPreparePanel) {
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static boolean IconCompatParcelizer() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
