package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onPreRotaryScrollEvent;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRotaryScrollEvent;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }

    public RotaryInputElement(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.onRotaryScrollEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.onPreRotaryScrollEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return this.onRotaryScrollEvent == rotaryInputElement.onRotaryScrollEvent && this.onPreRotaryScrollEvent == rotaryInputElement.onPreRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onRotaryScrollEvent;
        int iHashCode = r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode() : 0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.onPreRotaryScrollEvent;
        return (iHashCode * 31) + (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onRotaryScrollEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.onPreRotaryScrollEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }
    }
}
