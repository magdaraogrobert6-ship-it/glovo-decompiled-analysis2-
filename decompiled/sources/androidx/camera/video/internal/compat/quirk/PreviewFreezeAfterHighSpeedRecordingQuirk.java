package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import com.adjust.sdk.Constants;
import o.CameraUpdateException;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements CameraUpdateException {
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk IconCompatParcelizer = new PreviewFreezeAfterHighSpeedRecordingQuirk();
    public static final boolean read;

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    static {
        boolean z;
        if (setCarryoverInAppMessage.serializer(Build.BRAND, Constants.REFERRER_API_GOOGLE, true)) {
            String str = Build.MODEL;
            str.getClass();
            z = setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "Pixel", true);
        }
        read = z;
    }
}
