package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import o.ContentInViewNode;
import o.StretchOverscrollNode;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final ContentInViewNode listeners = new ContentInViewNode(2);
    private final StretchOverscrollNode nodes;
    private final EmptySemanticsModifier outerSemanticsNode;
    private final LayoutNode rootNode;

    public final ContentInViewNode getListeners$ui() {
        return this.listeners;
    }

    public final SemanticsInfo getRootInfo$ui() {
        return this.rootNode;
    }

    public final SemanticsInfo get$ui(int i) {
        return (SemanticsInfo) this.nodes.serializer(i);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new SemanticsConfiguration());
    }

    public final void notifySemanticsChange$ui(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        ContentInViewNode contentInViewNode = this.listeners;
        Object[] objArr = contentInViewNode.read;
        int i = contentInViewNode.IconCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            ((SemanticsListener) objArr[i2]).onSemanticsChanged(semanticsInfo, semanticsConfiguration);
        }
    }

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, StretchOverscrollNode stretchOverscrollNode) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = emptySemanticsModifier;
        this.nodes = stretchOverscrollNode;
    }

    public final SemanticsNode getRootSemanticsNode() {
        return SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }
}
