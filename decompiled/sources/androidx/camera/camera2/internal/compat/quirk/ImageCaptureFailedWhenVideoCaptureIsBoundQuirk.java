package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import com.adjust.sdk.Constants;
import o.dispatchRotaryEvent;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    public static boolean RemoteActionCompatParcelizer() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean read() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean MediaBrowserCompatMediaItem() {
        return Constants.REFERRER_API_VIVO.equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean serializer() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean write() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean IconCompatParcelizer() {
        return read() || RemoteActionCompatParcelizer() || MediaBrowserCompatMediaItem() || serializer();
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean RatingCompat() {
        if (read() || RemoteActionCompatParcelizer() || MediaBrowserCompatMediaItem() || serializer()) {
            return true;
        }
        String str = Build.MODEL;
        if ("pixel 4 xl".equalsIgnoreCase(str) && Build.VERSION.SDK_INT == 29) {
            return true;
        }
        return ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(str)) || write() || dispatchRotaryEvent.IconCompatParcelizer();
    }
}
