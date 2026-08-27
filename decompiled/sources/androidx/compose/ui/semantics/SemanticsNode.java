package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNode {
    public static final int $stable = 8;
    private SemanticsNode fakeNodeParent;
    private final int id;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final Modifier.Node outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    public final int getId() {
        return this.id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final LayoutNode getLayoutNode$ui() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final Modifier.Node getOuterSemanticsNode$ui() {
        return this.outerSemanticsNode;
    }

    public final SemanticsConfiguration getUnmergedConfig$ui() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui() {
        return this.fakeNodeParent != null;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m2823fakeSemanticsNodeypyhhiA(Role role, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final SemanticsModifierNode findSemanticsModifierNodeToGetBounds() {
        ?? Pop;
        boolean z;
        ?? r3;
        boolean zIsMergingSemanticsOfDescendants = this.unmergedConfig.isMergingSemanticsOfDescendants();
        LayoutNode layoutNode = this.layoutNode;
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        r6 = 0;
        if (!zIsMergingSemanticsOfDescendants) {
            NodeChain nodes$ui = layoutNode.getNodes$ui();
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(8);
            if ((nodes$ui.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
                loop3: for (Modifier.Node head$ui = nodes$ui.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                    if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        Pop = head$ui;
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        while (true) {
                            if (Pop != 0) {
                                if (Pop instanceof SemanticsModifierNode) {
                                    if (((SemanticsModifierNode) Pop).isImportantForBounds()) {
                                        r6 = Pop;
                                    }
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
                        }
                    }
                    if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                        break;
                    }
                }
            }
        } else {
            NodeChain nodes$ui2 = layoutNode.getNodes$ui();
            int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(8);
            if ((nodes$ui2.getAggregateChildKindSet() & iM2551constructorimpl2) != 0) {
                Modifier.Node head$ui2 = nodes$ui2.getHead$ui();
                Pop = 0;
                while (head$ui2 != null) {
                    if ((head$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                        Modifier.Node nodePop = head$ui2;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof SemanticsModifierNode) {
                                SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) nodePop;
                                if (semanticsModifierNode.isImportantForBounds()) {
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        r3 = Pop;
                                        r3 = Pop;
                                        return semanticsModifierNode;
                                    }
                                    if (Pop == 0) {
                                        r3 = semanticsModifierNode;
                                    }
                                }
                                r3 = Pop;
                                z = false;
                                Pop = r3;
                            } else {
                                z = true;
                            }
                            if (z) {
                                Pop = Pop;
                                if ((nodePop.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui2;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                Pop = Pop;
                            }
                            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                        }
                    }
                    if ((head$ui2.getAggregateChildKindSet$ui() & iM2551constructorimpl2) == 0) {
                        break;
                    }
                    head$ui2 = head$ui2.getChild$ui();
                    Pop = Pop;
                }
                r6 = Pop;
            }
        }
        return (SemanticsModifierNode) r6;
    }

    private final void mergeConfig(List<SemanticsNode> list, SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.isClearingSemantics()) {
            return;
        }
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = list.get(size2);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                semanticsConfiguration.mergeChild$ui(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(list, semanticsConfiguration);
            }
        }
    }

    public final SemanticsNode copyWithMergingEnabled$ui() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final List<SemanticsNode> getChildren$ui(boolean z, boolean z2, boolean z3) {
        if (!z && this.unmergedConfig.isClearingSemantics()) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        return isMergingSemanticsOfDescendants() ? findOneLayerOfMergingSemanticsNodes$default(this, arrayList, null, 2, null) : unmergedChildren$ui(arrayList, z2, z3);
    }

    public final RootForTest getRoot() {
        Owner owner$ui = this.layoutNode.getOwner$ui();
        if (owner$ui != null) {
            return owner$ui.getRootForTest();
        }
        return null;
    }

    public SemanticsNode(Modifier.Node node, boolean z, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list, boolean z) {
        onCreateVirtualViewTranslationRequests zSortedChildren = layoutNode.getZSortedChildren();
        Object[] objArr = zSortedChildren.write;
        int i = zSortedChildren.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.isAttached() && (z || !layoutNode2.isDeactivated())) {
                if (layoutNode2.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
                    list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                } else {
                    fillOneLayerOfSemanticsWrappers(layoutNode2, list, z);
                }
            }
        }
    }

    public static /* synthetic */ List getChildren$ui$default(SemanticsNode semanticsNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !semanticsNode.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.getChildren$ui(z, z2, z3);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.isMergingSemanticsOfDescendants();
    }

    public final SemanticsConfiguration getConfig() {
        boolean zIsMergingSemanticsOfDescendants = isMergingSemanticsOfDescendants();
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        if (!zIsMergingSemanticsOfDescendants) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration semanticsConfigurationCopy = semanticsConfiguration.copy();
        mergeConfig(new ArrayList(), semanticsConfigurationCopy);
        return semanticsConfigurationCopy;
    }

    public final SemanticsNode getParent() {
        LayoutNode parent$ui;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (!this.mergingEnabled) {
            parent$ui = null;
            break;
        }
        parent$ui = this.layoutNode.getParent$ui();
        while (true) {
            if (parent$ui != null) {
                SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                    break;
                }
                parent$ui = parent$ui.getParent$ui();
            } else {
                parent$ui = null;
                break;
            }
        }
        if (parent$ui == null) {
            parent$ui = this.layoutNode.getParent$ui();
            while (parent$ui != null) {
                if (!parent$ui.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            parent$ui = null;
        }
        if (parent$ui == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(parent$ui, this.mergingEnabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final Rect boundsInImportantForBoundsAncestor(LayoutCoordinates layoutCoordinates) {
        ?? Pop;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.Companion.getZero();
        }
        NodeChain nodes$ui = parent.layoutNode.getNodes$ui();
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(8);
        if ((nodes$ui.getAggregateChildKindSet() & iM2551constructorimpl) == 0) {
            Pop = 0;
            break;
        }
        Modifier.Node head$ui = nodes$ui.getHead$ui();
        loop0: while (true) {
            if (head$ui != null) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    Pop = head$ui;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof SemanticsModifierNode) {
                            if (((SemanticsModifierNode) Pop).isImportantForBounds()) {
                                break loop0;
                            }
                        } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                            int i = 0;
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                    }
                }
                if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                    head$ui = head$ui.getChild$ui();
                }
            }
            Pop = 0;
            break;
        }
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) Pop;
        NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado = semanticsModifierNode != null ? DelegatableNodeKt.m2391requireCoordinator64DMado(semanticsModifierNode, NodeKind.m2551constructorimpl(8)) : null;
        return nodeCoordinatorM2391requireCoordinator64DMado == null ? parent.boundsInImportantForBoundsAncestor(layoutCoordinates) : LayoutCoordinates.localBoundingBoxOf$default(nodeCoordinatorM2391requireCoordinator64DMado, layoutCoordinates, false, 2, null);
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        final Role role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && !list.isEmpty()) {
            list.add(m2823fakeSemanticsNodeypyhhiA(role, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m2833setRolekuIjeqM(semanticsPropertyReceiver, role.m2813unboximpl());
                }

                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return createFromParcel.INSTANCE;
                }
            }));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && !list.isEmpty() && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            final String str = list2 != null ? (String) onContentCardDismissed.MediaMetadataCompat(list2) : null;
            if (str != null) {
                list.add(0, m2823fakeSemanticsNodeypyhhiA(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return createFromParcel.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List unmergedChildren$ui$default(SemanticsNode semanticsNode, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return semanticsNode.unmergedChildren$ui(list, z, z2);
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui() {
        NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado;
        if (!isFake$ui()) {
            SemanticsModifierNode semanticsModifierNodeFindSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
            return (semanticsModifierNodeFindSemanticsModifierNodeToGetBounds == null || (nodeCoordinatorM2391requireCoordinator64DMado = DelegatableNodeKt.m2391requireCoordinator64DMado(semanticsModifierNodeFindSemanticsModifierNodeToGetBounds, NodeKind.m2551constructorimpl(8))) == null) ? this.layoutNode.getInnerCoordinator$ui() : nodeCoordinatorM2391requireCoordinator64DMado;
        }
        SemanticsNode parent = getParent();
        if (parent != null) {
            return parent.findCoordinatorToGetBounds$ui();
        }
        return null;
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine) {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final Rect getBoundsInParent$ui() {
        LayoutCoordinates coordinates;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null && (coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui.getCoordinates()) != null) {
                return boundsInImportantForBoundsAncestor(coordinates);
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInRoot() {
        Rect rectBoundsInRoot;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null && (rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui)) != null) {
                return rectBoundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInWindow() {
        Rect rectBoundsInWindow$default;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null && (rectBoundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(nodeCoordinatorFindCoordinatorToGetBounds$ui, false, 1, null)) != null) {
                return rectBoundsInWindow$default;
            }
        }
        return Rect.Companion.getZero();
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren$ui$default(this, false, false, false, 7, null);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m2824getPositionInRootF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui);
            }
        }
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m2825getPositionInWindowF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionInWindow(nodeCoordinatorFindCoordinatorToGetBounds$ui);
            }
        }
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m2826getPositionOnScreenF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionOnScreen(nodeCoordinatorFindCoordinatorToGetBounds$ui);
            }
        }
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    public final List<SemanticsNode> getReplacedChildren$ui() {
        return getChildren$ui$default(this, false, true, false, 4, null);
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m2827getSizeYbymL2g() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        return nodeCoordinatorFindCoordinatorToGetBounds$ui != null ? nodeCoordinatorFindCoordinatorToGetBounds$ui.mo2217getSizeYbymL2g() : IntSize.Companion.m3849getZeroYbymL2g();
    }

    public final Rect getTouchBoundsInRoot() {
        SemanticsModifierNode semanticsModifierNodeFindSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        return semanticsModifierNodeFindSemanticsModifierNodeToGetBounds == null ? this.layoutNode.getInnerCoordinator$ui().touchBoundsInRoot() : SemanticsModifierNodeKt.effectiveBoundsInRoot(semanticsModifierNodeFindSemanticsModifierNodeToGetBounds.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig), true);
    }

    public final boolean isTransparent$ui() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui.isTransparent();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean isUnmergedLeafNode$ui() {
        if (isFake$ui() || !getReplacedChildren$ui().isEmpty()) {
            return false;
        }
        LayoutNode parent$ui = this.layoutNode.getParent$ui();
        while (parent$ui != null) {
            SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                if (parent$ui == null) {
                    return true;
                }
                return false;
            }
            parent$ui = parent$ui.getParent$ui();
        }
        parent$ui = null;
        if (parent$ui == null) {
            return true;
        }
        return false;
    }

    public final List<SemanticsNode> unmergedChildren$ui(List<SemanticsNode> list, boolean z, boolean z2) {
        if (isFake$ui()) {
            return instance_delegatelambda0.write;
        }
        fillOneLayerOfSemanticsWrappers(this.layoutNode, list, z2);
        if (z) {
            emitFakeNodes(list);
        }
        return list;
    }

    public final Rect getUnclippedBoundsInRoot$ui() {
        SemanticsModifierNode semanticsModifierNodeFindSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        return semanticsModifierNodeFindSemanticsModifierNodeToGetBounds == null ? SemanticsModifierNodeKt.boundsInRoot(this.layoutNode.getInnerCoordinator$ui(), false) : SemanticsModifierNodeKt.effectiveBoundsInRoot(semanticsModifierNodeFindSemanticsModifierNodeToGetBounds.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig), false);
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list, List<SemanticsNode> list2) {
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = list.get(size2);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list2.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list, list2);
            }
        }
        return list2;
    }

    private final void forEachUnmergedChild(List<SemanticsNode> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(size2));
        }
    }
}
