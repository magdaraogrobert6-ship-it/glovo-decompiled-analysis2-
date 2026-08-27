package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import o.AnimatedVisibilityKt;
import o.FocusMeteringAction;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean read(FocusMeteringAction focusMeteringAction, AnimatedVisibilityKt animatedVisibilityKt) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && focusMeteringAction.MediaBrowserCompatMediaItem() == 0 && animatedVisibilityKt == AnimatedVisibilityKt.MediaBrowserCompatMediaItem;
    }
}
