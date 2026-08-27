package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onKeyEvent;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onPreKeyEvent;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }

    public SoftKeyboardInterceptionElement(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.onKeyEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.onPreKeyEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return this.onKeyEvent == softKeyboardInterceptionElement.onKeyEvent && this.onPreKeyEvent == softKeyboardInterceptionElement.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onKeyEvent;
        int iHashCode = r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode() : 0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.onPreKeyEvent;
        return (iHashCode * 31) + (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onKeyEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.onPreKeyEvent;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }
    }
}
