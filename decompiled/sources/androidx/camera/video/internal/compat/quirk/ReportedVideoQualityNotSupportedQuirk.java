package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;
import o.AnimatedVisibilityKt;
import o.FocusMeteringAction;

/* JADX INFO: loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean IconCompatParcelizer() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean RemoteActionCompatParcelizer() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean read() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean write() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean RatingCompat() {
        return IconCompatParcelizer() || write() || RemoteActionCompatParcelizer() || read();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean read(FocusMeteringAction focusMeteringAction, AnimatedVisibilityKt animatedVisibilityKt) {
        if (IconCompatParcelizer() || write()) {
            if (animatedVisibilityKt != AnimatedVisibilityKt.RatingCompat) {
                return false;
            }
        } else if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            if (animatedVisibilityKt != AnimatedVisibilityKt.RemoteActionCompatParcelizer && animatedVisibilityKt != AnimatedVisibilityKt.read) {
                return false;
            }
        } else if (RemoteActionCompatParcelizer()) {
            if (focusMeteringAction.MediaBrowserCompatMediaItem() != 0) {
                return false;
            }
            if (animatedVisibilityKt != AnimatedVisibilityKt.read && animatedVisibilityKt != AnimatedVisibilityKt.RemoteActionCompatParcelizer) {
                return false;
            }
        } else if (!read() || focusMeteringAction.MediaBrowserCompatMediaItem() != 1 || animatedVisibilityKt != AnimatedVisibilityKt.RatingCompat) {
            return false;
        }
        return true;
    }
}
