package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    private final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY approachMeasure;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM isMeasurementApproachInProgress;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 isPlacementApproachInProgress;

    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY getApproachMeasure() {
        return this.approachMeasure;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ApproachLayoutModifierNodeImpl create() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.approachMeasure.hashCode();
        return this.isPlacementApproachInProgress.hashCode() + ((this.isMeasurementApproachInProgress.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.setMeasureBlock(this.approachMeasure);
        approachLayoutModifierNodeImpl.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        approachLayoutModifierNodeImpl.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    public /* synthetic */ ApproachLayoutElement(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (i & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return this.approachMeasure == approachLayoutElement.approachMeasure && this.isMeasurementApproachInProgress == approachLayoutElement.isMeasurementApproachInProgress && this.isPlacementApproachInProgress == approachLayoutElement.isPlacementApproachInProgress;
    }

    public ApproachLayoutElement(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.approachMeasure = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.isMeasurementApproachInProgress = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.isPlacementApproachInProgress = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
