package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    private DragAndDropNode lastChildDragAndDropModifierNode;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onDropTargetValidate;
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 onStartTransfer;
    private long size;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m223getSizeYbymL2g$ui() {
        return this.size;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo28onRemeasuredozmzZPI(long j) {
        this.size = j;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI$ui, reason: not valid java name */
    public final void m225setSizeozmzZPI$ui(long j) {
        this.size = j;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(final DragAndDropEvent dragAndDropEvent) {
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode.acceptDragAndDropTransfer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                if (dragAndDropNode.thisDragAndDropTarget != null) {
                    InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = dragAndDropNode.onDropTargetValidate;
                dragAndDropNode.thisDragAndDropTarget = r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? (DragAndDropTarget) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(dragAndDropEvent) : null;
                boolean z = true;
                boolean z2 = dragAndDropNode.thisDragAndDropTarget != null;
                if (z2) {
                    this.getDragAndDropManager().registerTargetInterest(dragAndDropNode);
                }
                cancelPendingWebViewPause cancelpendingwebviewpause2 = cancelpendingwebviewpause;
                if (!cancelpendingwebviewpause2.IconCompatParcelizer && !z2) {
                    z = false;
                }
                cancelpendingwebviewpause2.IconCompatParcelizer = z;
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
        return cancelpendingwebviewpause.IconCompatParcelizer;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(final DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode.onEnded.1
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.getNode().isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
                if (dragAndDropTarget != null) {
                    dragAndDropTarget.onEnded(dragAndDropEvent);
                }
                dragAndDropNode.thisDragAndDropTarget = null;
                dragAndDropNode.lastChildDragAndDropModifierNode = null;
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    public static final class Companion {

        public static final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DragAndDropNode(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onStartTransfer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.onDropTargetValidate = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.Companion.m3849getZeroYbymL2g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    public final boolean hasEligibleDropTarget() {
        return (this.lastChildDragAndDropModifierNode == null && this.thisDragAndDropTarget == null) ? false : true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onChanged(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onChanged(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.onDrop(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(dragAndDropEvent);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onMoved(final DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.m229containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent))) {
            if (getNode().isAttached()) {
                final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                TraversableNodeKt.traverseDescendants(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode3) {
                        DragAndDropNode dragAndDropNode4 = dragAndDropNode3;
                        if (!this.getDragAndDropManager().isInterestedTarget(dragAndDropNode4) || !DragAndDropNodeKt.m229containsUv8p0NA(dragAndDropNode4, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent))) {
                            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                        }
                        createinappmessageeventsubscriber.IconCompatParcelizer = dragAndDropNode3;
                        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                traversableNode = (TraversableNode) createinappmessageeventsubscriber.IconCompatParcelizer;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(dragAndDropEvent);
            }
        } else if (dragAndDropNode != null || dragAndDropNode2 == null) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{dragAndDropNode, dragAndDropNode2}, iWrite3)).booleanValue()) {
                if (dragAndDropNode != null) {
                    DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
                }
                if (dragAndDropNode2 != null) {
                    dragAndDropNode2.onExited(dragAndDropEvent);
                }
            } else if (dragAndDropNode != null) {
                dragAndDropNode.onMoved(dragAndDropEvent);
            } else {
                DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
                if (dragAndDropTarget2 != null) {
                    dragAndDropTarget2.onMoved(dragAndDropEvent);
                }
            }
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropTarget3, dragAndDropEvent);
            }
            dragAndDropNode2.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onStarted(dragAndDropEvent);
        }
    }

    /* JADX INFO: renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m226startDragAndDropTransferd4ec7I(final DragAndDropStartTransferScope dragAndDropStartTransferScope, final long j, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        final LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(this).getCoordinates();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                if (!dragAndDropNode.isAttached()) {
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = dragAndDropNode.onStartTransfer;
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                    return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                long j2 = j;
                Offset.Companion companion = Offset.Companion;
                if (Offset.m474equalsimpl0(j2, companion.m492getUnspecifiedF1C5BW0())) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(dragAndDropStartTransferScope, Offset.m466boximpl(companion.m492getUnspecifiedF1C5BW0()));
                } else {
                    long jMo2218localPositionOfR5De75A = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo2218localPositionOfR5De75A(coordinates, j);
                    if (!SizeKt.m567toRectuvyYCjk(IntSizeKt.m3856toSizeozmzZPI(dragAndDropNode.m223getSizeYbymL2g$ui())).m503containsk4lQ0M(jMo2218localPositionOfR5De75A)) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(dragAndDropStartTransferScope, Offset.m466boximpl(jMo2218localPositionOfR5De75A));
                }
                return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    @onItemDismisslambda0
    /* JADX INFO: renamed from: drag-12SF9DM */
    public void mo222drag12SF9DM(final DragAndDropTransferData dragAndDropTransferData, final long j, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.onStartTransfer != null) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.onStartTransfer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$drag$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                m227invokeUv8p0NA((DragAndDropStartTransferScope) obj, ((Offset) obj2).m487unboximpl());
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m227invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2) {
                dragAndDropStartTransferScope.mo221startDragAndDropTransfer12SF9DM(dragAndDropTransferData, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        };
        getDragAndDropManager().mo220requestDragAndDropTransferUv8p0NA(this, Offset.Companion.m492getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* JADX INFO: renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public void mo224requestDragAndDropTransferk4lQ0M(long j) {
        if (this.onStartTransfer == null) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getDragAndDropManager().mo220requestDragAndDropTransferUv8p0NA(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DragAndDropNode(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (i & 2) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
