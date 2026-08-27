package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import com.adjust.sdk.Constants;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean RemoteActionCompatParcelizer;
    public static final boolean serializer;

    static {
        String str = Build.BRAND;
        RemoteActionCompatParcelizer = setCarryoverInAppMessage.serializer(str, "motorola", true) && setCarryoverInAppMessage.serializer(Build.MODEL, "motorola edge 20 fusion", true);
        serializer = setCarryoverInAppMessage.serializer(str, Constants.REFERRER_API_SAMSUNG, true) && setCarryoverInAppMessage.serializer(Build.MODEL, "sm-t580", true);
    }
}
