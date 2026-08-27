package androidx.compose.ui.spatial;

import android.annotation.SuppressLint;
import androidx.compose.ui.node.ModifierNodeElement;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint
final class RectListDebuggerModifierElement extends ModifierNodeElement<RectListDebuggerModifierNode> {
    public static final RectListDebuggerModifierElement INSTANCE = new RectListDebuggerModifierElement();

    private RectListDebuggerModifierElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 123;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RectListDebuggerModifierNode rectListDebuggerModifierNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RectListDebuggerModifierNode create() {
        return new RectListDebuggerModifierNode();
    }
}
