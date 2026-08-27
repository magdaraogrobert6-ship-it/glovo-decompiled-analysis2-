package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes.dex */
public final class ParentDataModifierNodeKt {
    public static final void invalidateParentData(ParentDataModifierNode parentDataModifierNode) {
        DelegatableNodeKt.requireLayoutNode(parentDataModifierNode).invalidateParentData$ui();
    }
}
