package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public interface FocusTargetModifierNode extends DelegatableNode {
    FocusState getFocusState();

    /* JADX INFO: renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo383getFocusabilityLCbbffg();

    @onItemDismisslambda0
    /* synthetic */ boolean requestFocus();

    /* JADX INFO: renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo384requestFocus3ESFkO8(int i);

    /* JADX INFO: renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo385setFocusabilityjosRg5g(int i);

    /* JADX INFO: renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    static /* synthetic */ boolean m382requestFocus3ESFkO8$default(FocusTargetModifierNode focusTargetModifierNode, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = FocusDirection.Companion.m354getEnterdhqQ8s();
            }
            return focusTargetModifierNode.mo384requestFocus3ESFkO8(i);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        return false;
    }
}
