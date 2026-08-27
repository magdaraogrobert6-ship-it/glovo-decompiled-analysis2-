package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onFocusEvent;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnFocusEvent() {
        return this.onFocusEvent;
    }

    public final void setOnFocusEvent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onFocusEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public FocusEventNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onFocusEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
