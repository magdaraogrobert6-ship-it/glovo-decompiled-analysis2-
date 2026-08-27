package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSizeKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;
    private FocusStateImpl committedFocusState;
    private int focusability;
    private final boolean isInteropViewHost;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onDispatchEventsCompleted;
    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 onFocusChange;
    private Integer previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return new FocusTargetNode(0, false, null, null, 15, null);
        }
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return DelegatableNodeKt.findNearestBeyondBoundsLayoutAncestor(this);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: getFocusability-LCbbffg */
    public int mo383getFocusabilityLCbbffg() {
        return this.focusability;
    }

    public final Integer getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final boolean isInteropViewHost() {
        return this.isInteropViewHost;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateFocus$ui();
    }

    public final void setPreviouslyFocusedChildHash(Integer num) {
        this.previouslyFocusedChildHash = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final FocusProperties fetchFocusProperties$ui() {
        NodeChain nodes$ui;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(Focusability.m404canFocusimpl$ui(mo383getFocusabilityLCbbffg(), this));
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.CameraDistance);
        int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = getNode();
        int i = iM2551constructorimpl | iM2551constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? Pop = node2;
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            while (Pop != 0) {
                                if (Pop instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode) Pop).applyFocusProperties(focusPropertiesImpl);
                                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i2 = 0;
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return focusPropertiesImpl;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @onItemDismisslambda0
    public /* synthetic */ boolean requestFocus() {
        return mo384requestFocus3ESFkO8(FocusDirection.Companion.m354getEnterdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: requestFocus-3ESFkO8 */
    public boolean mo384requestFocus3ESFkO8(final int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return fetchFocusProperties$ui().getCanFocus() ? m389assignFocus3ESFkO8(i) : TwoDimensionalFocusSearchKt.m423findChildCorrespondingToFocusEnterOMvw8(this, i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.m389assignFocus3ESFkO8(i));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: setFocusability-josRg5g */
    public void mo385setFocusabilityjosRg5g(int i) {
        if (Focusability.m407equalsimpl0(this.focusability, i)) {
            return;
        }
        this.focusability = i;
        if (isAttached() && this == DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode() && !Focusability.m404canFocusimpl$ui(this.focusability, this)) {
            if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                FocusTransactionsKt.clearFocus(this, true, true);
                return;
            }
            if (FocusTransactionsKt.clearFocus(this, true, true)) {
                FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode();
                DelegatableNodeKt.requireOwner(this).getFocusOwner().setActiveFocusTargetNode(null);
                if (activeFocusTargetNode != null) {
                    activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            }
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Focusability.Companion.m411getAlwaysLCbbffg() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (i2 & 8) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: assignFocus-3ESFkO8, reason: not valid java name */
    public final boolean m389assignFocus3ESFkO8(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m397performCustomRequestFocusMxy_nc0(this, i).ordinal()];
        if (i2 == 1) {
            return FocusTransactionsKt.performRequestFocus(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void dispatchFocusCallbacks$ui(FocusState focusState, FocusState focusState2) {
        NodeChain nodes$ui;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{focusState, focusState2}, getCieXyz.write())).booleanValue() && (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.onFocusChange) != null) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(focusState, focusState2);
        }
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.TransformOrigin);
        int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = getNode();
        int i = iM2551constructorimpl | iM2551constructorimpl2;
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? Pop = node2;
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            while (Pop != 0) {
                                if (Pop instanceof FocusEventModifierNode) {
                                    FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) Pop;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(focusState2);
                                    }
                                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i2 = 0;
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onDispatchEventsCompleted;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
    }

    public final Rect fetchFocusRect$ui(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf;
        Rect focusRect = fetchFocusProperties$ui().getFocusRect();
        if (focusRect != FocusProperties.Companion.getUnsetFocusRect()) {
            return layoutCoordinates == null ? focusRect : focusRect.m514translatek4lQ0M(LayoutCoordinates.m2216localPositionOfS_NoaFU$default(layoutCoordinates, DelegatableNodeKt.requireLayoutCoordinates(this), 0L, false, 6, null));
        }
        return (layoutCoordinates == null || (rectLocalBoundingBoxOf = layoutCoordinates.localBoundingBoxOf(DelegatableNodeKt.requireLayoutCoordinates(this), false)) == null) ? RectKt.m517Recttz77jQw(Offset.Companion.m493getZeroF1C5BW0(), IntSizeKt.m3856toSizeozmzZPI(DelegatableNodeKt.requireLayoutCoordinates(this).mo2217getSizeYbymL2g())) : rectLocalBoundingBoxOf;
    }

    public final void invalidateFocus$ui() {
        int i = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        ObserverModifierNodeKt.observeReads(this, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m393invoke() {
                createinappmessageeventsubscriber.IconCompatParcelizer = this.fetchFocusProperties$ui();
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m393invoke();
                return createFromParcel.INSTANCE;
            }
        });
        Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj == null) {
            removeNodeAtDepth.serializer("focusProperties");
            throw null;
        }
        if (((FocusProperties) obj).getCanFocus()) {
            return;
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        int i = WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            focusOwner.mo366clearFocusI7lrPNg(true, true, false, FocusDirection.Companion.m355getExitdhqQ8s());
            if (this.isInteropViewHost) {
                focusOwner.mo371requestOwnerFocus7o62pno(null, null);
            }
            focusOwner.scheduleInvalidationForOwner();
        } else if (i == 3) {
            FocusOwner focusOwner2 = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this);
            if (focusTargetNodeFindActiveFocusNode != null && focusTargetNodeFindActiveFocusNode.isInteropViewHost) {
                focusOwner2.mo371requestOwnerFocus7o62pno(null, null);
                focusOwner2.scheduleInvalidationForOwner();
            }
        } else if (i != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        this.committedFocusState = null;
        this.previouslyFocusedChildHash = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        if (ComposeUiFlags.isInitialFocusOnFocusableAvailable) {
            DelegatableNodeKt.requireOwner(getNode()).getFocusOwner().focusTargetAvailable();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        if (getFocusState().isFocused()) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().mo366clearFocusI7lrPNg(true, true, true, FocusDirection.Companion.m355getExitdhqQ8s());
        }
    }

    public static /* synthetic */ Rect fetchFocusRect$ui$default(FocusTargetNode focusTargetNode, LayoutCoordinates layoutCoordinates, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutCoordinates = null;
        }
        return focusTargetNode.fetchFocusRect$ui(layoutCoordinates);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public FocusStateImpl getFocusState() {
        NodeChain nodes$ui;
        if (!isAttached()) {
            return FocusStateImpl.Inactive;
        }
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            return FocusStateImpl.Inactive;
        }
        if (this == activeFocusTargetNode) {
            return focusOwner.isFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active;
        }
        if (activeFocusTargetNode.isAttached()) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = activeFocusTargetNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) nodePop)) {
                                        return FocusStateImpl.ActiveParent;
                                    }
                                } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests == null) {
                                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX INFO: renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m390fetchCustomEnterOrExitULY8qGw(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        Object objFetchFocusProperties$ui = fetchFocusProperties$ui();
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(objFetchFocusProperties$ui, cancelIndicatingFocusBoundaryScope);
        FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
        if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusRequester.Companion.getCancel());
        } else {
            if (activeFocusTargetNode == activeFocusTargetNode2 || activeFocusTargetNode2 == null) {
                return;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusRequester.Companion.getRedirect$ui());
        }
    }

    /* JADX INFO: renamed from: fetchCustomEnter-aToIllA$ui, reason: not valid java name */
    public final void m391fetchCustomEnteraToIllA$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui = fetchFocusProperties$ui();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusRequester.Companion.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusRequester.Companion.getRedirect$ui());
            }
        } finally {
            this.isProcessingCustomEnter = false;
        }
    }

    /* JADX INFO: renamed from: fetchCustomExit-aToIllA$ui, reason: not valid java name */
    public final void m392fetchCustomExitaToIllA$ui(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            FocusProperties focusPropertiesFetchFocusProperties$ui = fetchFocusProperties$ui();
            CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
            FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            focusPropertiesFetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusRequester.Companion.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusRequester.Companion.getRedirect$ui());
            }
        } finally {
            this.isProcessingCustomExit = false;
        }
    }

    private FocusTargetNode(int i, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.isInteropViewHost = z;
        this.onFocusChange = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.onDispatchEventsCompleted = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.focusability = i;
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
