package androidx.camera.camera2.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import o.CameraUpdateException;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class PreviewUnderExposureQuirk implements CameraUpdateException {
    public static final PreviewUnderExposureQuirk IconCompatParcelizer = new PreviewUnderExposureQuirk();
    public static final boolean serializer = setCarryoverInAppMessage.serializer(Build.BRAND, "TCL", true);
}
