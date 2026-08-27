package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    public final void updateModifier(Modifier modifier) {
        this.node.setModifier(modifier);
    }

    public TestModifierUpdater(LayoutNode layoutNode) {
        this.node = layoutNode;
    }
}
