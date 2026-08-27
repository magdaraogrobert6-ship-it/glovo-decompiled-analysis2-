package androidx.compose.ui.node;

import java.util.Comparator;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int iSerializer = removeNodeAtDepth.serializer(layoutNode.getDepth$ui(), layoutNode2.getDepth$ui());
            return iSerializer != 0 ? iSerializer : removeNodeAtDepth.serializer(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    };
}
