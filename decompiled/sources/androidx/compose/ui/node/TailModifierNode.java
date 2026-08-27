package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class TailModifierNode extends Modifier.Node {
    public static final int $stable = 8;
    private boolean attachHasBeenRun;

    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.attachHasBeenRun = false;
    }

    public final void setAttachHasBeenRun(boolean z) {
        this.attachHasBeenRun = z;
    }

    public String toString() {
        return "<tail>";
    }

    public TailModifierNode() {
        setAggregateChildKindSet$ui(0);
    }
}
