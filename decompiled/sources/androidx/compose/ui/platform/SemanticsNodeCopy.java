package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import o.StretchOverscrollNode;
import o.drag;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNodeCopy {
    public static final int $stable = 8;
    private final drag children;
    private final SemanticsConfiguration unmergedConfig;

    public final drag getChildren() {
        return this.children;
    }

    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public SemanticsNodeCopy(SemanticsNode semanticsNode, StretchOverscrollNode stretchOverscrollNode) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig$ui();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        this.children = new drag(replacedChildren$ui.size());
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (stretchOverscrollNode.RemoteActionCompatParcelizer(semanticsNode2.getId())) {
                this.children.RemoteActionCompatParcelizer(semanticsNode2.getId());
            }
        }
    }
}
