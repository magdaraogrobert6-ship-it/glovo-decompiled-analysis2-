package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM isMeasurementApproachInProgress;
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 isPlacementApproachInProgress;
    private r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY measureBlock;

    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY getMeasureBlock() {
        return this.measureBlock;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    public final void setMeasureBlock(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.measureBlock = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    public final void setMeasurementApproachInProgress(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.isMeasurementApproachInProgress = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setPlacementApproachInProgress(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.isPlacementApproachInProgress = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo2185approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
        return (MeasureResult) this.measureBlock.invoke(approachMeasureScope, measurable, Constraints.m3613boximpl(j));
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo2186isMeasurementApproachInProgressozmzZPI(long j) {
        return ((Boolean) this.isMeasurementApproachInProgress.invoke(IntSize.m3836boximpl(j))).booleanValue();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return ((Boolean) this.isPlacementApproachInProgress.invoke(placementScope, layoutCoordinates)).booleanValue();
    }

    public ApproachLayoutModifierNodeImpl(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.measureBlock = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.isMeasurementApproachInProgress = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.isPlacementApproachInProgress = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }
}
