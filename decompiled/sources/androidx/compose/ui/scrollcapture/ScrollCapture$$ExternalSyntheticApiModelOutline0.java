package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ScrollCapture$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ ScrollCaptureTarget m(View view, Rect rect, Point point, ComposeScrollCaptureCallback composeScrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, composeScrollCaptureCallback);
    }
}
