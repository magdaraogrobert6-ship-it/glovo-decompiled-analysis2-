package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;

/* JADX INFO: loaded from: classes4.dex */
final class ScrollCaptureCandidate {
    private final LayoutCoordinates coordinates;
    private final int depth;
    private final SemanticsNode node;
    private final IntRect viewportBoundsInWindow;

    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final SemanticsNode getNode() {
        return this.node;
    }

    public final IntRect getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, IntRect intRect, LayoutCoordinates layoutCoordinates) {
        this.node = semanticsNode;
        this.depth = i;
        this.viewportBoundsInWindow = intRect;
        this.coordinates = layoutCoordinates;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
