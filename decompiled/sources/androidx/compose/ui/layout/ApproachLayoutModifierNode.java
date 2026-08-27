package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    /* JADX INFO: renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    MeasureResult mo2185approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j);

    /* JADX INFO: renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    boolean mo2186isMeasurementApproachInProgressozmzZPI(long j);

    default boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int maxApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo2187measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo2185approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    default int maxApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.maxApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo2187measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo2185approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    default MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    default int minApproachIntrinsicHeight(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicHeight.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo2187measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo2185approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    default int minApproachIntrinsicWidth(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        NodeCoordinator coordinator$ui = getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        LookaheadDelegate lookaheadDelegate = coordinator$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode.minApproachIntrinsicWidth.1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo2187measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j) {
                return ApproachLayoutModifierNode.this.mo2185approachMeasure3p2s80s(approachMeasureScope, measurable, j);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }
}
