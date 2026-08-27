package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    private final IntRect adjustedBounds;
    private final SemanticsNode semanticsNode;

    public final IntRect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, IntRect intRect) {
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = intRect;
    }
}
