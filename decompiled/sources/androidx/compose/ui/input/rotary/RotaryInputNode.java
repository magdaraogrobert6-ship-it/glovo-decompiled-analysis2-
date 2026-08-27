package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onEvent;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onPreEvent;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnEvent() {
        return this.onEvent;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnPreEvent() {
        return this.onPreEvent;
    }

    public final void setOnEvent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setOnPreEvent(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onPreEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public RotaryInputNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.onEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.onPreEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onPreEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }
}
