package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import com.sentiance.okhttp3.u$a;
import java.util.Iterator;
import o.setThumbTintList;

/* JADX INFO: loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks$WrapInfo {
    public boolean IconCompatParcelizer;
    public final boolean serializer;

    public FlowLayoutBuildingBlocks$WrapInfo(u$a u_a, int i) {
        boolean z = false;
        if (i == 2) {
            this.IconCompatParcelizer = false;
            this.serializer = u_a.read(AutoFlashUnderExposedQuirk.class) != null;
            return;
        }
        if (i != 3) {
            this.serializer = u_a.RemoteActionCompatParcelizer(ImageCaptureFailWithAutoFlashQuirk.class);
            this.IconCompatParcelizer = setThumbTintList.RemoteActionCompatParcelizer.read(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
            return;
        }
        Iterator it = u_a.serializer(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).IconCompatParcelizer()) {
                z = true;
                break;
            }
        }
        this.serializer = z;
        this.IconCompatParcelizer = u_a.RemoteActionCompatParcelizer(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public FlowLayoutBuildingBlocks$WrapInfo(boolean z, boolean z2) {
        this.serializer = z;
        this.IconCompatParcelizer = z2;
    }
}
