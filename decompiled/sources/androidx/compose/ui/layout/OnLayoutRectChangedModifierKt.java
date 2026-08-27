package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class OnLayoutRectChangedModifierKt {
    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j, j2, delegatableNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final Modifier onLayoutRectChanged(Modifier modifier, long j, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new OnLayoutRectChangedElement(j, j2, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 64;
        }
        return onLayoutRectChanged(modifier, j3, j2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
