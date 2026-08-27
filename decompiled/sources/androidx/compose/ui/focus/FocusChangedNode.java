package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onFocusChanged;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public final void setOnFocusChanged(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onFocusChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        Object[] objArr = {this.focusState, focusState};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public FocusChangedNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onFocusChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
