package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import bo.app.af$$ExternalSyntheticOutline1;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class OnFirstVisibleElement extends ModifierNodeElement<OnFirstVisibleNode> {
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 callback;
    private final long minDurationMs;
    private final float minFractionVisible;
    private final LayoutBoundsHolder viewportBounds;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getCallback() {
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
    public OnFirstVisibleNode create() {
        return new OnFirstVisibleNode(this.minDurationMs, this.minFractionVisible, this.viewportBounds, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.minFractionVisible, Long.hashCode(this.minDurationMs) * 31, 31);
        LayoutBoundsHolder layoutBoundsHolder = this.viewportBounds;
        return this.callback.hashCode() + ((iM + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnFirstVisibleNode onFirstVisibleNode) {
        onFirstVisibleNode.setMinDurationMs(this.minDurationMs);
        onFirstVisibleNode.setMinFractionVisible(this.minFractionVisible);
        onFirstVisibleNode.setCallback(this.callback);
        onFirstVisibleNode.setViewportBounds(this.viewportBounds);
        onFirstVisibleNode.forceUpdate();
    }

    public OnFirstVisibleElement(long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.viewportBounds = layoutBoundsHolder;
        this.callback = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFirstVisible");
        inspectorInfo.getProperties().set("minDurationMs", Long.valueOf(this.minDurationMs));
        inspectorInfo.getProperties().set("minFractionVisible", Float.valueOf(this.minFractionVisible));
        inspectorInfo.getProperties().set("viewportBounds", this.viewportBounds);
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OnFirstVisibleElement.class == obj.getClass()) {
            OnFirstVisibleElement onFirstVisibleElement = (OnFirstVisibleElement) obj;
            if (this.minDurationMs == onFirstVisibleElement.minDurationMs && this.minFractionVisible == onFirstVisibleElement.minFractionVisible) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.viewportBounds, onFirstVisibleElement.viewportBounds}, getCieXyz.write())).booleanValue() && this.callback == onFirstVisibleElement.callback;
            }
        }
        return false;
    }
}
