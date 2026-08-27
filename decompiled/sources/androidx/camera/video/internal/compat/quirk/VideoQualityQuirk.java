package androidx.camera.video.internal.compat.quirk;

import o.AnimatedVisibilityKt;
import o.CameraUpdateException;
import o.FocusMeteringAction;

/* JADX INFO: loaded from: classes.dex */
public interface VideoQualityQuirk extends CameraUpdateException {
    boolean read(FocusMeteringAction focusMeteringAction, AnimatedVisibilityKt animatedVisibilityKt);
}
