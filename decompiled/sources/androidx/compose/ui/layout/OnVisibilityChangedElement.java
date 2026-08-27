package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class OnVisibilityChangedElement extends ModifierNodeElement<OnVisibilityChangedNode> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;
    private final long minDurationMs;
    private final float minFractionVisible;
    private final LayoutBoundsHolder viewportBounds;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
        return this.callback;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnVisibilityChangedNode create() {
        return new OnVisibilityChangedNode(this.minDurationMs, this.minFractionVisible, this.viewportBounds, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.minFractionVisible, Long.hashCode(this.minDurationMs) * 31, 31);
        LayoutBoundsHolder layoutBoundsHolder = this.viewportBounds;
        return this.callback.hashCode() + ((iM + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnVisibilityChangedNode onVisibilityChangedNode) {
        onVisibilityChangedNode.setMinDurationMs(this.minDurationMs);
        onVisibilityChangedNode.setMinFractionVisible(this.minFractionVisible);
        onVisibilityChangedNode.setCallback(this.callback);
        onVisibilityChangedNode.setViewportBounds(this.viewportBounds);
        onVisibilityChangedNode.forceUpdate();
    }

    public OnVisibilityChangedElement(long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.viewportBounds = layoutBoundsHolder;
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onViewportVisibilityChanged");
        inspectorInfo.getProperties().set("minDurationMs", Long.valueOf(this.minDurationMs));
        inspectorInfo.getProperties().set("minFractionVisible", Float.valueOf(this.minFractionVisible));
        inspectorInfo.getProperties().set("viewportRef", this.viewportBounds);
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OnVisibilityChangedElement.class == obj.getClass()) {
            OnVisibilityChangedElement onVisibilityChangedElement = (OnVisibilityChangedElement) obj;
            if (this.minDurationMs == onVisibilityChangedElement.minDurationMs && this.minFractionVisible == onVisibilityChangedElement.minFractionVisible) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.viewportBounds, onVisibilityChangedElement.viewportBounds}, getCieXyz.write())).booleanValue() && this.callback == onVisibilityChangedElement.callback;
            }
        }
        return false;
    }
}
