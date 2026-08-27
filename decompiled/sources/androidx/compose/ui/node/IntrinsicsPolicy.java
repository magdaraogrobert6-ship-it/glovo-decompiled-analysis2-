package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.layout.MeasurePolicy;
import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicsPolicy {
    public static final int $stable = 8;
    private final LayoutNode layoutNode;
    private final PopulateViewStructure_androidKtpopulate7 measurePolicyState$delegate;

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final void updateFrom(MeasurePolicy measurePolicy) {
        setMeasurePolicyState(measurePolicy);
    }

    private final MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) this.measurePolicyState$delegate.getValue();
    }

    private final void setMeasurePolicyState(MeasurePolicy measurePolicy) {
        this.measurePolicyState$delegate.setValue(measurePolicy);
    }

    public IntrinsicsPolicy(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.layoutNode = layoutNode;
        this.measurePolicyState$delegate = CompositionKt.RemoteActionCompatParcelizer(measurePolicy);
    }

    public final int maxIntrinsicHeight(int i) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int maxIntrinsicWidth(int i) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final int minIntrinsicHeight(int i) {
        return getMeasurePolicyState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int minIntrinsicWidth(int i) {
        return getMeasurePolicyState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return getMeasurePolicyState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return getMeasurePolicyState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i);
    }
}
