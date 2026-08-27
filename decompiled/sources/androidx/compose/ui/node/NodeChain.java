package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class NodeChain {
    public static final int $stable = 8;
    private onCreateVirtualViewTranslationRequests buffer;
    private Differ cachedDiffer;
    private onCreateVirtualViewTranslationRequests current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final NodeChain$sentinelHead$1 sentinelHead;
    private final onCreateVirtualViewTranslationRequests stack;
    private final Modifier.Node tail;

    public final class Differ implements DiffCallback {
        private onCreateVirtualViewTranslationRequests after;
        private onCreateVirtualViewTranslationRequests before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public final onCreateVirtualViewTranslationRequests getAfter() {
            return this.after;
        }

        public final onCreateVirtualViewTranslationRequests getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        public final void setAfter(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
            this.after = oncreatevirtualviewtranslationrequests;
        }

        public final void setBefore(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
            this.before = oncreatevirtualviewtranslationrequests;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final void setShouldAttachOnInsert(boolean z) {
            this.shouldAttachOnInsert = z;
        }

        public Differ(Modifier.Node node, int i, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2, boolean z) {
            this.node = node;
            this.offset = i;
            this.before = oncreatevirtualviewtranslationrequests;
            this.after = oncreatevirtualviewtranslationrequests2;
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i, int i2) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.before;
            int i3 = this.offset;
            return NodeChainKt.actionForModifiers((Modifier.Element) oncreatevirtualviewtranslationrequests.write[i + i3], (Modifier.Element) this.after.write[i3 + i2]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i, int i2) {
            Modifier.Node child$ui = this.node.getChild$ui();
            child$ui.getClass();
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeRemoved(i2, (Modifier.Element) this.before.write[this.offset + i2], child$ui);
            }
            if ((NodeKind.m2551constructorimpl(2) & child$ui.getKindSet$ui()) != 0) {
                NodeCoordinator coordinator$ui = child$ui.getCoordinator$ui();
                coordinator$ui.getClass();
                NodeCoordinator wrappedBy$ui = coordinator$ui.getWrappedBy$ui();
                NodeCoordinator wrapped$ui = coordinator$ui.getWrapped$ui();
                wrapped$ui.getClass();
                if (wrappedBy$ui != null) {
                    wrappedBy$ui.setWrapped$ui(wrapped$ui);
                }
                wrapped$ui.setWrappedBy$ui(wrappedBy$ui);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i, int i2) {
            Modifier.Node child$ui = this.node.getChild$ui();
            child$ui.getClass();
            this.node = child$ui;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.before;
            int i3 = this.offset;
            Modifier.Element element = (Modifier.Element) oncreatevirtualviewtranslationrequests.write[i3 + i];
            Modifier.Element element2 = (Modifier.Element) this.after.write[i3 + i2];
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{element, element2}, iWrite3)).booleanValue();
            NodeChain nodeChain = NodeChain.this;
            if (zBooleanValue) {
                Logger logger = nodeChain.logger;
                if (logger != null) {
                    int i4 = this.offset;
                    logger.nodeReused(i4 + i, i4 + i2, element, element2, this.node);
                    return;
                }
                return;
            }
            nodeChain.updateNode(element, element2, this.node);
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i5 = this.offset;
                logger2.nodeUpdated(i5 + i, i5 + i2, element, element2, this.node);
            }
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i) {
            int i2 = this.offset + i;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild((Modifier.Element) this.after.write[i2], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i2, i2, (Modifier.Element) this.after.write[i2], node, this.node);
            }
            boolean z = this.shouldAttachOnInsert;
            Modifier.Node node2 = this.node;
            if (!z) {
                node2.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
            Modifier.Node child$ui = node2.getChild$ui();
            child$ui.getClass();
            NodeCoordinator coordinator$ui = child$ui.getCoordinator$ui();
            coordinator$ui.getClass();
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                this.node.updateCoordinator$ui(layoutModifierNodeCoordinator);
                NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrappedBy$ui(coordinator$ui.getWrappedBy$ui());
                layoutModifierNodeCoordinator.setWrapped$ui(coordinator$ui);
                coordinator$ui.setWrappedBy$ui(layoutModifierNodeCoordinator);
            } else {
                this.node.updateCoordinator$ui(coordinator$ui);
            }
            this.node.markAsAttached$ui();
            this.node.runAttachLifecycle$ui();
            NodeKindKt.autoInvalidateInsertedNode(this.node);
        }
    }

    public interface Logger {
        void linearDiffAborted(int i, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i, int i2, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i, int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i, int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    public final Modifier.Node getHead$ui() {
        return this.head;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final NodeCoordinator getOuterCoordinator$ui() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui() {
        return this.tail;
    }

    public final boolean has$ui(int i) {
        return (i & getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: has-H91voCI$ui, reason: not valid java name */
    public final boolean m2506hasH91voCI$ui(int i) {
        return (i & getAggregateChildKindSet()) != 0;
    }

    public final void useLogger$ui(Logger logger) {
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui();
    }

    private final Modifier.Node padChain() {
        if (this.head == this.sentinelHead) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.setParent$ui(this.sentinelHead);
        setChild$ui(node);
        return this.sentinelHead;
    }

    private final void syncAggregateChildKindSet() {
        int kindSet$ui = 0;
        for (Modifier.Node parent$ui = this.tail.getParent$ui(); parent$ui != null && parent$ui != this.sentinelHead; parent$ui = parent$ui.getParent$ui()) {
            kindSet$ui |= parent$ui.getKindSet$ui();
            parent$ui.setAggregateChildKindSet$ui(kindSet$ui);
        }
    }

    public final boolean isUpdating$ui() {
        return getChild$ui() != null;
    }

    public final void syncCoordinators() {
        NodeCoordinator nodeCoordinator;
        NodeCoordinator nodeCoordinator2 = this.innerCoordinator;
        for (Modifier.Node parent$ui = this.tail.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent$ui.getCoordinator$ui() != null) {
                    NodeCoordinator coordinator$ui = parent$ui.getCoordinator$ui();
                    coordinator$ui.getClass();
                    nodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui;
                    LayoutModifierNode layoutModifierNode = nodeCoordinator.getLayoutModifierNode();
                    nodeCoordinator.setLayoutModifierNode$ui(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent$ui) {
                        nodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent$ui.updateCoordinator$ui(layoutModifierNodeCoordinator);
                    nodeCoordinator = layoutModifierNodeCoordinator;
                }
                nodeCoordinator2.setWrappedBy$ui(nodeCoordinator);
                nodeCoordinator.setWrapped$ui(nodeCoordinator2);
                nodeCoordinator2 = nodeCoordinator;
            } else {
                parent$ui.updateCoordinator$ui(nodeCoordinator2);
            }
        }
        LayoutNode parent$ui2 = this.layoutNode.getParent$ui();
        nodeCoordinator2.setWrappedBy$ui(parent$ui2 != null ? parent$ui2.getInnerCoordinator$ui() : null);
        this.outerCoordinator = nodeCoordinator2;
    }

    public final void updateFrom$ui(Modifier modifier) {
        Logger logger;
        Modifier.Node nodePadChain = padChain();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.current;
        int i = 0;
        int i2 = oncreatevirtualviewtranslationrequests != null ? oncreatevirtualviewtranslationrequests.read : 0;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this.buffer;
        if (oncreatevirtualviewtranslationrequests2 == null) {
            oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Element[16]);
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequestsFillVector = NodeChainKt.fillVector(modifier, oncreatevirtualviewtranslationrequests2, this.stack);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = null;
        if (oncreatevirtualviewtranslationrequestsFillVector.read == i2) {
            Modifier.Node child$ui = nodePadChain.getChild$ui();
            int i3 = 0;
            while (child$ui != null && i3 < i2) {
                if (oncreatevirtualviewtranslationrequests == null) {
                    throw c8$$ExternalSyntheticOutline0.m("expected prior modifier list to be non-empty");
                }
                Modifier.Element element = (Modifier.Element) oncreatevirtualviewtranslationrequests.write[i3];
                Modifier.Element element2 = (Modifier.Element) oncreatevirtualviewtranslationrequestsFillVector.write[i3];
                int iActionForModifiers = NodeChainKt.actionForModifiers(element, element2);
                if (iActionForModifiers == 0) {
                    Logger logger2 = this.logger;
                    if (logger2 != null) {
                        logger2.linearDiffAborted(i3, element, element2, child$ui);
                    }
                    child$ui = child$ui.getParent$ui();
                    break;
                }
                if (iActionForModifiers == 1) {
                    updateNode(element, element2, child$ui);
                    Logger logger3 = this.logger;
                    if (logger3 != null) {
                        logger3.nodeUpdated(i3, i3, element, element2, child$ui);
                    }
                } else if (iActionForModifiers == 2 && (logger = this.logger) != null) {
                    logger.nodeReused(i3, i3, element, element2, child$ui);
                }
                child$ui = child$ui.getChild$ui();
                i3++;
            }
            Modifier.Node node = child$ui;
            if (i3 < i2) {
                if (oncreatevirtualviewtranslationrequests == null) {
                    throw c8$$ExternalSyntheticOutline0.m("expected prior modifier list to be non-empty");
                }
                if (node == null) {
                    throw c8$$ExternalSyntheticOutline0.m("structuralUpdate requires a non-null tail");
                }
                structuralUpdate(i3, oncreatevirtualviewtranslationrequests, oncreatevirtualviewtranslationrequestsFillVector, node, !this.layoutNode.getApplyingModifierOnAttach$ui());
                i = 1;
            }
        } else {
            if (this.layoutNode.getApplyingModifierOnAttach$ui() && i2 == 0) {
                Modifier.Node node2 = nodePadChain;
                while (i < oncreatevirtualviewtranslationrequestsFillVector.read) {
                    Modifier.Element element3 = (Modifier.Element) oncreatevirtualviewtranslationrequestsFillVector.write[i];
                    Modifier.Node nodeCreateAndInsertNodeAsChild = createAndInsertNodeAsChild(element3, node2);
                    Logger logger4 = this.logger;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, i, element3, node2, nodeCreateAndInsertNodeAsChild);
                    }
                    i++;
                    node2 = nodeCreateAndInsertNodeAsChild;
                }
                syncAggregateChildKindSet();
            } else if (oncreatevirtualviewtranslationrequestsFillVector.read != 0) {
                if (oncreatevirtualviewtranslationrequests == null) {
                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Element[16]);
                }
                structuralUpdate(0, oncreatevirtualviewtranslationrequests, oncreatevirtualviewtranslationrequestsFillVector, nodePadChain, !this.layoutNode.getApplyingModifierOnAttach$ui());
            } else {
                if (oncreatevirtualviewtranslationrequests == null) {
                    throw c8$$ExternalSyntheticOutline0.m("expected prior modifier list to be non-empty");
                }
                Modifier.Node child$ui2 = nodePadChain.getChild$ui();
                for (int i4 = 0; child$ui2 != null && i4 < oncreatevirtualviewtranslationrequests.read; i4++) {
                    Logger logger5 = this.logger;
                    if (logger5 != null) {
                        logger5.nodeRemoved(i4, (Modifier.Element) oncreatevirtualviewtranslationrequests.write[i4], child$ui2);
                    }
                    child$ui2 = detachAndRemoveNode(child$ui2).getChild$ui();
                }
                InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
                LayoutNode parent$ui = this.layoutNode.getParent$ui();
                innerNodeCoordinator.setWrappedBy$ui(parent$ui != null ? parent$ui.getInnerCoordinator$ui() : null);
                this.outerCoordinator = this.innerCoordinator;
            }
            i = 1;
        }
        this.current = oncreatevirtualviewtranslationrequestsFillVector;
        if (oncreatevirtualviewtranslationrequests != null) {
            oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer();
            oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests;
        }
        this.buffer = oncreatevirtualviewtranslationrequests3;
        this.head = trimChain(nodePadChain);
        if (i != 0) {
            syncCoordinators();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChain$sentinelHead$1] */
    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        ?? r0 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChain$sentinelHead$1
            public String toString() {
                return "<Head>";
            }
        };
        r0.setAggregateChildKindSet$ui(-1);
        this.sentinelHead = r0;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
        this.stack = new onCreateVirtualViewTranslationRequests(new Modifier[16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        return insertChild(backwardsCompatNode, node);
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui = node.getChild$ui();
        Modifier.Node parent$ui = node.getParent$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(parent$ui);
            node.setChild$ui(null);
        }
        if (parent$ui != null) {
            parent$ui.setChild$ui(child$ui);
            node.setParent$ui(null);
        }
        parent$ui.getClass();
        return parent$ui;
    }

    public final List<ModifierInfo> getModifierInfo() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.current;
        if (oncreatevirtualviewtranslationrequests == null) {
            return instance_delegatelambda0.write;
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new ModifierInfo[oncreatevirtualviewtranslationrequests.read]);
        Modifier.Node head$ui = getHead$ui();
        int i = 0;
        while (head$ui != null && head$ui != getTail$ui()) {
            NodeCoordinator coordinator$ui = head$ui.getCoordinator$ui();
            OwnedLayer ownedLayer = null;
            if (coordinator$ui == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("getModifierInfo called on node with no coordinator");
                return null;
            }
            OwnedLayer layer = coordinator$ui.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child$ui = head$ui.getChild$ui();
            if (child$ui == this.tail && head$ui.getCoordinator$ui() != child$ui.getCoordinator$ui()) {
                ownedLayer = layer2;
            }
            if (layer == null) {
                layer = ownedLayer;
            }
            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(new ModifierInfo((Modifier) oncreatevirtualviewtranslationrequests.write[i], coordinator$ui, layer));
            head$ui = head$ui.getChild$ui();
            i++;
        }
        return oncreatevirtualviewtranslationrequests2.read();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            for (Modifier.Node head$ui = getHead$ui(); head$ui != null && head$ui != getTail$ui(); head$ui = head$ui.getChild$ui()) {
                sb.append(String.valueOf(head$ui));
                if (head$ui.getChild$ui() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private final void structuralUpdate(int i, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2, Modifier.Node node, boolean z) {
        MyersDiffKt.executeDiff(oncreatevirtualviewtranslationrequests.read - i, oncreatevirtualviewtranslationrequests2.read - i, getDiffer(node, i, oncreatevirtualviewtranslationrequests, oncreatevirtualviewtranslationrequests2, z));
        syncAggregateChildKindSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).setElement(element2);
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui();
            node.markAsDetached$ui();
        }
        return removeNode(node);
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui = node2.getChild$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(node);
            node.setChild$ui(child$ui);
        }
        node2.setChild$ui(node);
        node.setParent$ui(node2);
        return node;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        for (Modifier.Node parent$ui = node.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (parent$ui == this.sentinelHead) {
                LayoutNode parent$ui2 = this.layoutNode.getParent$ui();
                nodeCoordinator.setWrappedBy$ui(parent$ui2 != null ? parent$ui2.getInnerCoordinator$ui() : null);
                this.outerCoordinator = nodeCoordinator;
                return;
            } else {
                if ((NodeKind.m2551constructorimpl(2) & parent$ui.getKindSet$ui()) != 0) {
                    return;
                }
                parent$ui.updateCoordinator$ui(nodeCoordinator);
            }
        }
    }

    public final void headToTailExclusive$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null && head$ui != getTail$ui(); head$ui = head$ui.getChild$ui()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(head$ui);
        }
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            head$ui.markAsAttached$ui();
        }
    }

    public final void markAsDetached$ui() {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if (tail$ui.isAttached()) {
                tail$ui.markAsDetached$ui();
            }
        }
    }

    public final void resetState$ui() {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if (tail$ui.isAttached()) {
                tail$ui.reset$ui();
            }
        }
        runDetachLifecycle$ui();
        markAsDetached$ui();
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            head$ui.runAttachLifecycle$ui();
            if (head$ui.getInsertedNodeAwaitingAttachForInvalidation$ui()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui);
            }
            if (head$ui.getUpdatedNodeAwaitingAttachForInvalidation$ui()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui);
            }
            head$ui.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            head$ui.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    public final void runDetachLifecycle$ui() {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if (tail$ui.isAttached()) {
                tail$ui.runDetachLifecycle$ui();
            }
        }
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui, reason: not valid java name */
    public final <T> void m2508headToTailaLcG6gQ$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
                if ((head$ui.getAggregateChildKindSet$ui() & i) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui, reason: not valid java name */
    public final <T> void m2510tailToHeadaLcG6gQ$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
                if ((tail$ui.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui, reason: not valid java name */
    public final <T> T m2505firstFromHeadaLcG6gQ$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
                if ((head$ui.getAggregateChildKindSet$ui() & i) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui, reason: not valid java name */
    public final <T> T m2507headH91voCI$ui(int i) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
                if ((head$ui.getAggregateChildKindSet$ui() & i) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final void headToTail$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return;
        }
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            if ((head$ui.getKindSet$ui() & i) != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(head$ui);
            }
            if ((head$ui.getAggregateChildKindSet$ui() & i) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui, reason: not valid java name */
    public final <T> T m2509tailH91voCI$ui(int i) {
        if ((getAggregateChildKindSet() & i) != 0) {
            for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
                if ((tail$ui.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void tailToHead$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if ((getAggregateChildKindSet() & i) == 0) {
            return;
        }
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if ((tail$ui.getKindSet$ui() & i) != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(tail$ui);
            }
        }
    }

    private final Differ getDiffer(Modifier.Node node, int i, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2, boolean z) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i, oncreatevirtualviewtranslationrequests, oncreatevirtualviewtranslationrequests2, z);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i);
        differ.setBefore(oncreatevirtualviewtranslationrequests);
        differ.setAfter(oncreatevirtualviewtranslationrequests2);
        differ.setShouldAttachOnInsert(z);
        return differ;
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        if (node != this.sentinelHead) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Modifier.Node child$ui = getChild$ui();
        if (child$ui == null) {
            child$ui = this.tail;
        }
        child$ui.setParent$ui(null);
        setChild$ui(null);
        setAggregateChildKindSet$ui(-1);
        updateCoordinator$ui(null);
        if (child$ui == this.sentinelHead) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui;
    }

    public final void tailToHead$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(tail$ui);
        }
    }

    public final void headToTail$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(head$ui);
        }
    }
}
