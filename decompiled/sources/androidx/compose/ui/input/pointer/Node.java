package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContentInViewNode;
import o.ContextMenuSpec;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class Node extends NodeParent {
    public static final int $stable = 8;
    private LayoutCoordinates coordinates;
    private final Modifier.Node modifierNode;
    private PointerEvent pointerEvent;
    private boolean wasIn;
    private final PointerIdArray pointerIds = new PointerIdArray();
    private final ContextMenuSpec relevantChanges = new ContextMenuSpec(2);
    private boolean isIn = true;
    private boolean hasExited = true;

    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    public final PointerIdArray getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    private final void clearCache() {
        this.relevantChanges.RemoteActionCompatParcelizer();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode;
        if (this.relevantChanges.IconCompatParcelizer() == 0 || !this.modifierNode.isAttached() || (coordinator$ui = this.modifierNode.getCoordinator$ui()) == null || (layoutNode = coordinator$ui.getLayoutNode()) == null || !layoutNode.isPlaced()) {
            return false;
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (this.relevantChanges.IconCompatParcelizer() != 0 && this.modifierNode.isAttached() && (coordinator$ui = this.modifierNode.getCoordinator$ui()) != null && (layoutNode = coordinator$ui.getLayoutNode()) != null && layoutNode.isPlaced()) {
            PointerEvent pointerEvent = this.pointerEvent;
            pointerEvent.getClass();
            LayoutCoordinates layoutCoordinates = this.coordinates;
            layoutCoordinates.getClass();
            long jMo2217getSizeYbymL2g = layoutCoordinates.mo2217getSizeYbymL2g();
            ?? Pop = this.modifierNode;
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
            ?? oncreatevirtualviewtranslationrequests = 0;
            while (Pop != 0) {
                if (Pop instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) Pop).mo11onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Final, jMo2217getSizeYbymL2g);
                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                    int i = 0;
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                Pop = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == 0) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (Pop != 0) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                    Pop = 0;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        } else {
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        }
                        delegate$ui = delegate$ui.getChild$ui();
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    }
                    if (i == 1) {
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    } else {
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    }
                }
                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            }
            if (this.modifierNode.isAttached()) {
                onCreateVirtualViewTranslationRequests children = getChildren();
                Object[] objArr = children.write;
                int i2 = children.read;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((Node) objArr[i3]).dispatchFinalEventPass(internalPointerEvent);
                }
            }
            z = true;
        }
        cleanUpHits(internalPointerEvent);
        clearCache();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(ContextMenuSpec contextMenuSpec, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode;
        if (this.relevantChanges.IconCompatParcelizer() == 0 || !this.modifierNode.isAttached() || (coordinator$ui = this.modifierNode.getCoordinator$ui()) == null || (layoutNode = coordinator$ui.getLayoutNode()) == null || !layoutNode.isPlaced()) {
            return false;
        }
        PointerEvent pointerEvent = this.pointerEvent;
        pointerEvent.getClass();
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        layoutCoordinates2.getClass();
        long jMo2217getSizeYbymL2g = layoutCoordinates2.mo2217getSizeYbymL2g();
        ?? Pop = this.modifierNode;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
        ?? oncreatevirtualviewtranslationrequests = 0;
        while (Pop != 0) {
            if (Pop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) Pop).mo11onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Initial, jMo2217getSizeYbymL2g);
            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                int i = 0;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            Pop = delegate$ui;
                        } else {
                            if (oncreatevirtualviewtranslationrequests == 0) {
                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                            }
                            if (Pop != 0) {
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                Pop = 0;
                            }
                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                        }
                    } else {
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    Pop = Pop;
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                }
                if (i == 1) {
                    Pop = Pop;
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                } else {
                    Pop = Pop;
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                }
            }
            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
        }
        if (this.modifierNode.isAttached()) {
            onCreateVirtualViewTranslationRequests children = getChildren();
            Object[] objArr = children.write;
            int i2 = children.read;
            for (int i3 = 0; i3 < i2; i3++) {
                Node node = (Node) objArr[i3];
                ContextMenuSpec contextMenuSpec2 = this.relevantChanges;
                LayoutCoordinates layoutCoordinates3 = this.coordinates;
                layoutCoordinates3.getClass();
                node.dispatchMainEventPass(contextMenuSpec2, layoutCoordinates3, internalPointerEvent, z);
            }
        }
        if (this.modifierNode.isAttached()) {
            ?? Pop2 = this.modifierNode;
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(16);
            ?? oncreatevirtualviewtranslationrequests2 = 0;
            while (Pop2 != 0) {
                if (Pop2 instanceof PointerInputModifierNode) {
                    ((PointerInputModifierNode) Pop2).mo11onPointerEventH0pRuoY(pointerEvent, PointerEventPass.Main, jMo2217getSizeYbymL2g);
                } else if ((Pop2.getKindSet$ui() & iM2551constructorimpl2) != 0 && (Pop2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui2 = ((DelegatingNode) Pop2).getDelegate$ui();
                    int i4 = 0;
                    while (delegate$ui2 != null) {
                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                Pop2 = Pop2;
                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                Pop2 = delegate$ui2;
                            } else {
                                if (oncreatevirtualviewtranslationrequests2 == 0) {
                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (Pop2 != 0) {
                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(Pop2);
                                    Pop2 = 0;
                                }
                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                            }
                        } else {
                            oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                            Pop2 = Pop2;
                        }
                        delegate$ui2 = delegate$ui2.getChild$ui();
                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                        Pop2 = Pop2;
                    }
                    if (i4 == 1) {
                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                        Pop2 = Pop2;
                    } else {
                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                        Pop2 = Pop2;
                    }
                }
                Pop2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long j, ContentInViewNode contentInViewNode) {
        if (this.pointerIds.contains(j) && contentInViewNode.RemoteActionCompatParcelizer(this) < 0) {
            this.pointerIds.remove(j);
            this.relevantChanges.IconCompatParcelizer(j);
        }
        onCreateVirtualViewTranslationRequests children = getChildren();
        Object[] objArr = children.write;
        int i = children.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).removeInvalidPointerIdsAndChanges(j, contentInViewNode);
        }
    }

    public Node(Modifier.Node node) {
        this.modifierNode = node;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent, PointerEvent pointerEvent2) {
        if (pointerEvent == null || pointerEvent.getChanges().size() != pointerEvent2.getChanges().size()) {
            return true;
        }
        int size = pointerEvent2.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m474equalsimpl0(pointerEvent.getChanges().get(i).m2071getPositionF1C5BW0(), pointerEvent2.getChanges().get(i).m2071getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            boolean pressed = pointerInputChange.getPressed();
            boolean zM1976activeHoverEvent0FcD4WY = internalPointerEvent.m1976activeHoverEvent0FcD4WY(pointerInputChange.m2068getIdJ3iCeTQ());
            boolean z = this.isIn;
            if ((!pressed && !zM1976activeHoverEvent0FcD4WY) || (!pressed && !z)) {
                this.pointerIds.remove(pointerInputChange.m2068getIdJ3iCeTQ());
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), PointerEventType.Companion.m2016getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        onCreateVirtualViewTranslationRequests children = getChildren();
        Object[] objArr = children.write;
        int i = children.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).dispatchCancel();
        }
        ?? Pop = this.modifierNode;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
        ?? oncreatevirtualviewtranslationrequests = 0;
        while (Pop != 0) {
            if (Pop instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode) Pop).onCancelPointerInput();
            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                int i3 = 0;
                Pop = Pop;
                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        i3++;
                        if (i3 == 1) {
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            Pop = delegate$ui;
                        } else {
                            if (oncreatevirtualviewtranslationrequests == 0) {
                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                            }
                            if (Pop != 0) {
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                Pop = 0;
                            }
                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    Pop = Pop;
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                }
                if (i3 == 1) {
                }
            }
            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
        }
    }

    public String toString() {
        return "Node(modifierNode=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0261  */
    /* JADX WARN: Code duplicated, block: B:102:0x0269  */
    /* JADX WARN: Code duplicated, block: B:104:0x0279  */
    /* JADX WARN: Code duplicated, block: B:109:0x0289  */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:91:0x022c  */
    /* JADX WARN: Code duplicated, block: B:99:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(ContextMenuSpec contextMenuSpec, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        PointerInputChange pointerInputChange;
        boolean z2;
        boolean z3;
        int iM2004getType7fucELk;
        PointerEventType.Companion companion;
        int iM2004getType7fucELk2;
        PointerEventType.Companion companion2;
        int iM2016getExit7fucELk;
        boolean z4;
        int i;
        boolean zBuildCache = super.buildCache(contextMenuSpec, layoutCoordinates, internalPointerEvent, z);
        if (this.modifierNode.isAttached()) {
            ?? Pop = this.modifierNode;
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
            ?? oncreatevirtualviewtranslationrequests = 0;
            while (Pop != 0) {
                if (Pop instanceof PointerInputModifierNode) {
                    this.coordinates = PointerInputModifierNodeKt.getLayoutCoordinates((PointerInputModifierNode) Pop);
                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                    int i2 = 0;
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i2++;
                            if (i2 == 1) {
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                Pop = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == 0) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (Pop != 0) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                    Pop = 0;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        } else {
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        }
                        delegate$ui = delegate$ui.getChild$ui();
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    }
                    if (i2 == 1) {
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    } else {
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    }
                }
                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            }
            if (this.coordinates != null) {
                int iIconCompatParcelizer = contextMenuSpec.IconCompatParcelizer();
                int i3 = 0;
                while (i3 < iIconCompatParcelizer) {
                    long jIconCompatParcelizer = contextMenuSpec.IconCompatParcelizer(i3);
                    PointerInputChange pointerInputChange2 = (PointerInputChange) contextMenuSpec.write(i3);
                    if (this.pointerIds.contains(jIconCompatParcelizer)) {
                        long jM2072getPreviousPositionF1C5BW0 = pointerInputChange2.m2072getPreviousPositionF1C5BW0();
                        i = i3;
                        long jM2071getPositionF1C5BW0 = pointerInputChange2.m2071getPositionF1C5BW0();
                        if ((((jM2072getPreviousPositionF1C5BW0 & InlineClassHelperKt.DualUnsignedFloatMask) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0 && (((jM2071getPositionF1C5BW0 & InlineClassHelperKt.DualUnsignedFloatMask) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(pointerInputChange2.getHistorical().size());
                            List<HistoricalChange> historical = pointerInputChange2.getHistorical();
                            int size = historical.size();
                            int i4 = 0;
                            while (i4 < size) {
                                HistoricalChange historicalChange = historical.get(i4);
                                boolean z5 = zBuildCache;
                                long jM1970getPositionF1C5BW0 = historicalChange.m1970getPositionF1C5BW0();
                                if ((((jM1970getPositionF1C5BW0 & InlineClassHelperKt.DualUnsignedFloatMask) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0) {
                                    long uptimeMillis = historicalChange.getUptimeMillis();
                                    LayoutCoordinates layoutCoordinates2 = this.coordinates;
                                    layoutCoordinates2.getClass();
                                    arrayList.add(new HistoricalChange(uptimeMillis, layoutCoordinates2.mo2218localPositionOfR5De75A(layoutCoordinates, jM1970getPositionF1C5BW0), historicalChange.getScaleFactor(), historicalChange.m1969getPanOffsetF1C5BW0(), historicalChange.m1968getOriginalEventPositionF1C5BW0$ui(), (DefaultConstructorMarker) null));
                                }
                                i4++;
                                historical = historical;
                                zBuildCache = z5;
                            }
                            z4 = zBuildCache;
                            ContextMenuSpec contextMenuSpec2 = this.relevantChanges;
                            LayoutCoordinates layoutCoordinates3 = this.coordinates;
                            layoutCoordinates3.getClass();
                            long jMo2218localPositionOfR5De75A = layoutCoordinates3.mo2218localPositionOfR5De75A(layoutCoordinates, jM2072getPreviousPositionF1C5BW0);
                            LayoutCoordinates layoutCoordinates4 = this.coordinates;
                            layoutCoordinates4.getClass();
                            contextMenuSpec2.read(jIconCompatParcelizer, pointerInputChange2.m2064copyOHpmEuE((731 & 1) != 0 ? pointerInputChange2.id : 0L, (731 & 2) != 0 ? pointerInputChange2.uptimeMillis : 0L, (731 & 4) != 0 ? pointerInputChange2.position : layoutCoordinates4.mo2218localPositionOfR5De75A(layoutCoordinates, jM2071getPositionF1C5BW0), (731 & 8) != 0 ? pointerInputChange2.pressed : false, (731 & 16) != 0 ? pointerInputChange2.previousUptimeMillis : 0L, (731 & 32) != 0 ? pointerInputChange2.previousPosition : jMo2218localPositionOfR5De75A, (731 & 64) != 0 ? pointerInputChange2.previousPressed : false, (731 & Fields.SpotShadowColor) != 0 ? pointerInputChange2.type : 0, arrayList, (731 & Fields.RotationY) != 0 ? pointerInputChange2.scrollDelta : 0L));
                        } else {
                            z4 = zBuildCache;
                        }
                    } else {
                        z4 = zBuildCache;
                        i = i3;
                    }
                    i3 = i + 1;
                    iIconCompatParcelizer = iIconCompatParcelizer;
                    zBuildCache = z4;
                }
                boolean z6 = zBuildCache;
                boolean z7 = this.relevantChanges.IconCompatParcelizer() == 0;
                PointerIdArray pointerIdArray = this.pointerIds;
                if (z7) {
                    pointerIdArray.clear();
                    getChildren().RemoteActionCompatParcelizer();
                    return true;
                }
                for (int size2 = pointerIdArray.getSize() - 1; -1 < size2; size2--) {
                    if (contextMenuSpec.read(this.pointerIds.m2176get_I2yYro(size2)) < 0) {
                        this.pointerIds.removeAt(size2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.relevantChanges.IconCompatParcelizer());
                int iIconCompatParcelizer2 = this.relevantChanges.IconCompatParcelizer();
                for (int i5 = 0; i5 < iIconCompatParcelizer2; i5++) {
                    arrayList2.add(this.relevantChanges.write(i5));
                }
                PointerEvent pointerEvent = new PointerEvent(arrayList2, internalPointerEvent);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size3 = changes.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size3) {
                        pointerInputChange = null;
                        break;
                    }
                    PointerInputChange pointerInputChange3 = changes.get(i6);
                    if (internalPointerEvent.m1976activeHoverEvent0FcD4WY(pointerInputChange3.m2068getIdJ3iCeTQ())) {
                        pointerInputChange = pointerInputChange3;
                        break;
                    }
                    i6++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange;
                if (pointerInputChange4 != null) {
                    if (!z) {
                        z2 = false;
                        this.isIn = false;
                    } else {
                        z2 = false;
                        if (!this.isIn && (pointerInputChange4.getPressed() || pointerInputChange4.getPreviousPressed())) {
                            LayoutCoordinates layoutCoordinates5 = this.coordinates;
                            layoutCoordinates5.getClass();
                            z3 = true;
                            this.isIn = !PointerEventKt.m2006isOutOfBoundsO0kMr_c(pointerInputChange4, layoutCoordinates5.mo2217getSizeYbymL2g());
                        }
                        if (this.isIn != this.wasIn) {
                            iM2004getType7fucELk2 = pointerEvent.m2004getType7fucELk();
                            companion2 = PointerEventType.Companion;
                            if (!PointerEventType.m2011equalsimpl0(iM2004getType7fucELk2, companion2.m2017getMove7fucELk()) || PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion2.m2015getEnter7fucELk()) || PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion2.m2016getExit7fucELk())) {
                                if (this.isIn) {
                                    iM2016getExit7fucELk = companion2.m2015getEnter7fucELk();
                                } else {
                                    iM2016getExit7fucELk = companion2.m2016getExit7fucELk();
                                }
                                pointerEvent.m2005setTypeEhbLWgg$ui(iM2016getExit7fucELk);
                            } else {
                                iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
                                companion = PointerEventType.Companion;
                                if (!PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2015getEnter7fucELk()) && this.wasIn && !this.hasExited) {
                                    pointerEvent.m2005setTypeEhbLWgg$ui(companion.m2017getMove7fucELk());
                                } else if (PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2016getExit7fucELk()) && this.isIn && pointerInputChange4.getPressed()) {
                                    pointerEvent.m2005setTypeEhbLWgg$ui(companion.m2017getMove7fucELk());
                                }
                            }
                        } else {
                            iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
                            companion = PointerEventType.Companion;
                            if (!PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2015getEnter7fucELk())) {
                                if (PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2016getExit7fucELk())) {
                                    pointerEvent.m2005setTypeEhbLWgg$ui(companion.m2017getMove7fucELk());
                                }
                            } else if (PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2016getExit7fucELk())) {
                                pointerEvent.m2005setTypeEhbLWgg$ui(companion.m2017getMove7fucELk());
                            }
                        }
                    }
                    z3 = true;
                    if (this.isIn != this.wasIn) {
                        iM2004getType7fucELk2 = pointerEvent.m2004getType7fucELk();
                        companion2 = PointerEventType.Companion;
                        if (!PointerEventType.m2011equalsimpl0(iM2004getType7fucELk2, companion2.m2017getMove7fucELk())) {
                        }
                        if (this.isIn) {
                            iM2016getExit7fucELk = companion2.m2015getEnter7fucELk();
                        } else {
                            iM2016getExit7fucELk = companion2.m2016getExit7fucELk();
                        }
                        pointerEvent.m2005setTypeEhbLWgg$ui(iM2016getExit7fucELk);
                    } else {
                        iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
                        companion = PointerEventType.Companion;
                        if (!PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2015getEnter7fucELk())) {
                            if (PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2016getExit7fucELk())) {
                                pointerEvent.m2005setTypeEhbLWgg$ui(companion.m2017getMove7fucELk());
                            }
                        } else if (PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2016getExit7fucELk())) {
                            pointerEvent.m2005setTypeEhbLWgg$ui(companion.m2017getMove7fucELk());
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                boolean z8 = (z6 || !PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), PointerEventType.Companion.m2017getMove7fucELk()) || hasPositionChanged(this.pointerEvent, pointerEvent)) ? z3 : z2;
                this.pointerEvent = pointerEvent;
                return z8;
            }
        }
        return true;
    }
}
