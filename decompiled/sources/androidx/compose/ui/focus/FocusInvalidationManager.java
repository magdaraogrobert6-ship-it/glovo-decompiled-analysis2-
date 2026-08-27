package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.awaitLongPressOrCancellationrnUCldI;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.relocationOffsetfbGrOKE;

/* JADX INFO: loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final relocationOffsetfbGrOKE focusEventNodes;
    private final FocusOwner focusOwner;
    private final relocationOffsetfbGrOKE focusTargetNodes;
    private boolean isInvalidationScheduled;
    private final Owner owner;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidation$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m363invoke() {
            ((FocusInvalidationManager) this.MediaMetadataCompat).invalidateNodes();
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m363invoke();
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(Object obj) {
            super(0, 0, FocusInvalidationManager.class, obj, "invalidateNodes", "invalidateNodes()V");
        }
    }

    public final boolean hasPendingInvalidation() {
        return this.isInvalidationScheduled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[LOOP:0: B:7:0x0020->B:17:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148 A[EDGE_INSN: B:72:0x0148->B:70:0x0148 BREAK  A[LOOP:0: B:7:0x0020->B:17:0x0055], SYNTHETIC] */
    public final void invalidateNodes() {
        NodeChain nodes$ui;
        FocusTargetNode activeFocusTargetNode = this.focusOwner.getActiveFocusTargetNode();
        char c = 7;
        long j = -9187201950435737472L;
        long j2 = 255;
        if (activeFocusTargetNode == null) {
            relocationOffsetfbGrOKE relocationoffsetfbgroke = this.focusEventNodes;
            Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
            long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j3 & j2) < 128) {
                                ((FocusEventModifierNode) objArr[(i << 3) + i3]).onFocusEvent(FocusStateImpl.Inactive);
                            }
                            j3 >>= 8;
                            i3++;
                            j2 = 255;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                        j2 = 255;
                    } else if (i != length) {
                        break;
                        break;
                    } else {
                        i++;
                        j2 = 255;
                    }
                }
            }
        } else if (activeFocusTargetNode.isAttached()) {
            if (this.focusTargetNodes.MediaBrowserCompatMediaItem(activeFocusTargetNode)) {
                activeFocusTargetNode.invalidateFocus$ui();
            }
            FocusStateImpl focusState = activeFocusTargetNode.getFocusState();
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ) | NodeKind.m2551constructorimpl(Fields.TransformOrigin);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = activeFocusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            int i4 = 0;
            while (layoutNodeRequireLayoutNode != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            if ((NodeKind.m2551constructorimpl(Fields.RotationZ) & node.getKindSet$ui()) != 0) {
                                i4++;
                            }
                            if ((node instanceof FocusEventModifierNode) && this.focusEventNodes.MediaBrowserCompatMediaItem(node)) {
                                if (i4 <= 1) {
                                    ((FocusEventModifierNode) node).onFocusEvent(focusState);
                                } else {
                                    ((FocusEventModifierNode) node).onFocusEvent(FocusStateImpl.ActiveParent);
                                }
                                this.focusEventNodes.write(node);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = this.focusEventNodes;
            Object[] objArr2 = relocationoffsetfbgroke2.RemoteActionCompatParcelizer;
            long[] jArr2 = relocationoffsetfbgroke2.IconCompatParcelizer;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << c) & j4 & j) != j) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                ((FocusEventModifierNode) objArr2[(i5 << 3) + i7]).onFocusEvent(FocusStateImpl.Inactive);
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    }
                    i5++;
                    c = 7;
                    j = -9187201950435737472L;
                }
            }
        }
        invalidateOwnerFocusState();
        this.focusTargetNodes.serializer();
        this.focusEventNodes.serializer();
        this.isInvalidationScheduled = false;
    }

    private final void invalidateOwnerFocusState() {
        if (this.focusOwner.getActiveFocusTargetNode() == null || this.focusOwner.getRootState() == FocusStateImpl.Inactive) {
            this.focusOwner.clearOwnerFocus();
        }
    }

    public FocusInvalidationManager(FocusOwner focusOwner, Owner owner) {
        this.focusOwner = focusOwner;
        this.owner = owner;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.focusTargetNodes = new relocationOffsetfbGrOKE();
        this.focusEventNodes = new relocationOffsetfbGrOKE();
    }

    public final void scheduleInvalidation() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.owner.registerOnEndApplyChangesListener(new AnonymousClass1(this));
        this.isInvalidationScheduled = true;
    }

    public final void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        if (this.focusEventNodes.serializer(focusEventModifierNode)) {
            scheduleInvalidation();
        }
    }

    public final void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        if (this.focusTargetNodes.serializer(focusTargetNode)) {
            scheduleInvalidation();
        }
    }
}
