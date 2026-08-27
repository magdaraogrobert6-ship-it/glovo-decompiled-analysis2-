package androidx.compose.ui.layout;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class OnGlobalLayoutListenerKt {
    public static final DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(DelegatableNode delegatableNode, long j, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnGlobalLayoutCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j, j2, delegatableNode.getNode(), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
