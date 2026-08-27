package androidx.camera.camera2.internal.compat.quirk;

import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends CameraUpdateException {
    default boolean IconCompatParcelizer() {
        return true;
    }
}
