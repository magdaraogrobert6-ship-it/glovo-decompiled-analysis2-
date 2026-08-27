package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.d$$ExternalSyntheticOutline0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;
    private final long debounceMillis;
    private final long throttleMillis;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnLayoutRectChangedNode create() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.callback.hashCode() + d$$ExternalSyntheticOutline0.m(Long.hashCode(this.throttleMillis) * 31, 31, this.debounceMillis);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnLayoutRectChangedNode onLayoutRectChangedNode) {
        onLayoutRectChangedNode.setThrottleMillis(this.throttleMillis);
        onLayoutRectChangedNode.setDebounceMillis(this.debounceMillis);
        onLayoutRectChangedNode.setCallback(this.callback);
        onLayoutRectChangedNode.disposeAndRegister();
    }

    public OnLayoutRectChangedElement(long j, long j2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.throttleMillis = j;
        this.debounceMillis = j2;
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && this.callback == onLayoutRectChangedElement.callback;
    }
}
