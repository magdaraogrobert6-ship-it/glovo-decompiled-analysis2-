package androidx.compose.ui.graphics.layer.view;

import android.graphics.Rect;
import android.view.HardwareCanvas;
import android.view.RenderNode;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaceholderHardwareCanvas extends HardwareCanvas {
    public static final int $stable = 8;

    public int drawRenderNode(RenderNode renderNode, Rect rect, int i) {
        return 0;
    }

    public boolean isHardwareAccelerated() {
        return true;
    }
}
