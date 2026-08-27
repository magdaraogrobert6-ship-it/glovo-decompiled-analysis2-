package androidx.compose.ui;

import androidx.compose.ui.node.DelegatableNodeKt;

/* JADX INFO: loaded from: classes.dex */
final class KeepScreenOnNode extends Modifier.Node {
    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireOwner(this).incrementKeepScreenOnCount();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).decrementKeepScreenOnCount();
    }
}
