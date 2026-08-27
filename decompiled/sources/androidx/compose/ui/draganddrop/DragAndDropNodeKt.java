package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import o.createInAppMessageEventSubscriber;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class DragAndDropNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @onItemDismisslambda0
    public static final DragAndDropModifierNode DragAndDropModifierNode(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropModifierNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
                if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(dragAndDropEvent)).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        }, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropSourceModifierNode DragAndDropSourceModifierNode(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new DragAndDropNode(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropTargetModifierNode DragAndDropTargetModifierNode(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropTargetModifierNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
                if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(dragAndDropEvent)).booleanValue()) {
                    return dragAndDropTarget;
                }
                return null;
            }
        }, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m229containsUv8p0NA(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jPositionInRoot >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jPositionInRoot & 4294967295L));
        float fM223getSizeYbymL2g$ui = (int) (dragAndDropNode.m223getSizeYbymL2g$ui() >> 32);
        float fM223getSizeYbymL2g$ui2 = (int) (dragAndDropNode.m223getSizeYbymL2g$ui() & 4294967295L);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fM223getSizeYbymL2g$ui + fIntBitsToFloat) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fM223getSizeYbymL2g$ui2 + fIntBitsToFloat2) {
                return true;
            }
        }
        return false;
    }

    private static final <T extends TraversableNode> T firstDescendantOrNull(T t, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!t.getNode().isAttached()) {
            return null;
        }
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        TraversableNodeKt.traverseDescendants(t, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNodeKt.firstDescendantOrNull.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction; */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode)).booleanValue()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                createinappmessageeventsubscriber.IconCompatParcelizer = traversableNode;
                return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
            }
        });
        return (T) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> void traverseSelfAndDescendants(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t) != TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        TraversableNodeKt.traverseDescendants(t, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @onItemDismisslambda0
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }
}
