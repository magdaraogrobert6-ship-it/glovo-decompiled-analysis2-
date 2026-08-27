package androidx.compose.ui.platform;

import android.content.ClipDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class ClipMetadata {
    public static final int $stable = 8;
    private final ClipDescription clipDescription;

    public final ClipDescription getClipDescription() {
        return this.clipDescription;
    }

    public ClipMetadata(ClipDescription clipDescription) {
        this.clipDescription = clipDescription;
    }
}
