package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates, boolean z) {
        return LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).localBoundingBoxOf(layoutCoordinates, z);
    }

    public static final Rect effectiveBoundsInRoot(Modifier.Node node, boolean z, boolean z2) {
        if (node.getNode().isAttached()) {
            return !z ? boundsInRoot(DelegatableNodeKt.m2391requireCoordinator64DMado(node, NodeKind.m2551constructorimpl(8)), z2) : DelegatableNodeKt.m2391requireCoordinator64DMado(node, NodeKind.m2551constructorimpl(8)).touchBoundsInRoot();
        }
        return Rect.Companion.getZero();
    }

    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui();
    }
}
