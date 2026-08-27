package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Map;
import o.DrawableTransformation;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 8;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlacedUnderMotionFrameOfReference;
    private GraphicsLayer lastExplicitLayer;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM lastLayerBlock;
    private float lastZIndex;
    private boolean layingOutChildren;
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private Constraints lookaheadConstraints;
    private boolean measuredOnce;
    private boolean onNodePlacedCalled;
    private boolean placedOnce;
    private boolean relayoutWithoutParentInProgress;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;
    private long lastPosition = IntOffset.Companion.m3812getZeronOccac();
    private PlacedState _placedState = PlacedState.IsNotPlaced;
    private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);
    private final onCreateVirtualViewTranslationRequests _childDelegates = new onCreateVirtualViewTranslationRequests(new LookaheadPassDelegate[16]);
    private boolean childDelegatesDirty = true;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 layoutChildrenBlock = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2485invoke() {
            this.this$0.clearPlaceOrder();
            this.this$0.forEachChildAlignmentLinesOwner(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui(false);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AlignmentLinesOwner) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            LookaheadDelegate lookaheadDelegate = this.this$0.getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                boolean zIsPlacingForAlignment$ui = lookaheadDelegate.isPlacingForAlignment$ui();
                List<LayoutNode> children$ui = this.this$0.getLayoutNode().getChildren$ui();
                int size = children$ui.size();
                for (int i = 0; i < size; i++) {
                    LookaheadDelegate lookaheadDelegate2 = children$ui.get(i).getOuterCoordinator$ui().getLookaheadDelegate();
                    if (lookaheadDelegate2 != null) {
                        lookaheadDelegate2.setPlacingForAlignment$ui(zIsPlacingForAlignment$ui);
                    }
                }
            }
            LookaheadDelegate lookaheadDelegate3 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
            lookaheadDelegate3.getClass();
            lookaheadDelegate3.getMeasureResult$ui().placeChildren();
            LookaheadDelegate lookaheadDelegate4 = this.this$0.getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate4 != null) {
                lookaheadDelegate4.isPlacingForAlignment$ui();
                List<LayoutNode> children$ui2 = this.this$0.getLayoutNode().getChildren$ui();
                int size2 = children$ui2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    LookaheadDelegate lookaheadDelegate5 = children$ui2.get(i2).getOuterCoordinator$ui().getLookaheadDelegate();
                    if (lookaheadDelegate5 != null) {
                        lookaheadDelegate5.setPlacingForAlignment$ui(false);
                    }
                }
            }
            this.this$0.checkChildrenPlaceOrderForUpdates();
            this.this$0.forEachChildAlignmentLinesOwner(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
                public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui());
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AlignmentLinesOwner) obj);
                    return createFromParcel.INSTANCE;
                }
            });
        }

        {
            super(0);
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2485invoke();
            return createFromParcel.INSTANCE;
        }
    };
    private boolean parentDataDirty = true;
    private Object parentData = getMeasurePassDelegate$ui().getParentData();
    private long performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 performMeasureBlock = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2487invoke() {
            LookaheadDelegate lookaheadDelegate = this.this$0.getOuterCoordinator().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            lookaheadDelegate.mo2209measureBRTryo0(this.this$0.performMeasureConstraints);
        }

        {
            super(0);
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2487invoke();
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 layoutModifierBlock = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2486invoke() {
            Placeable.PlacementScope placementScope;
            LookaheadDelegate lookaheadDelegate;
            if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.this$0.getLayoutNode()) || this.this$0.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui()) {
                NodeCoordinator wrappedBy$ui = this.this$0.getOuterCoordinator().getWrappedBy$ui();
                if (wrappedBy$ui != null) {
                    placementScope = wrappedBy$ui.getPlacementScope();
                } else {
                    placementScope = null;
                }
            } else {
                NodeCoordinator wrappedBy$ui2 = this.this$0.getOuterCoordinator().getWrappedBy$ui();
                if (wrappedBy$ui2 == null || (lookaheadDelegate = wrappedBy$ui2.getLookaheadDelegate()) == null) {
                    placementScope = null;
                } else {
                    placementScope = lookaheadDelegate.getPlacementScope();
                }
            }
            if (placementScope == null) {
                placementScope = LayoutNodeKt.requireOwner(this.this$0.getLayoutNode()).getPlacementScope();
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
            LookaheadDelegate lookaheadDelegate2 = lookaheadPassDelegate.getOuterCoordinator().getLookaheadDelegate();
            lookaheadDelegate2.getClass();
            Placeable.PlacementScope.m2280place70tqf50$default(placementScope2, lookaheadDelegate2, lookaheadPassDelegate.lastPosition, 0.0f, 2, null);
        }

        {
            super(0);
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2486invoke();
            return createFromParcel.INSTANCE;
        }
    };

    public enum PlacedState {
        IsPlacedInLookahead,
        IsPlacedInApproach,
        IsNotPlaced;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final boolean getChildDelegatesDirty$ui() {
        return this.childDelegatesDirty;
    }

    /* JADX INFO: renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m2482getLastConstraintsDWUhwKw() {
        return this.lookaheadConstraints;
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final LayoutNode.UsageByParent getMeasuredByParent$ui() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getPerformMeasureBlock$ui() {
        return this.performMeasureBlock;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public int getPlaceOrder() {
        return this.placeOrder;
    }

    public final boolean getPlacedOnce$ui() {
        return this.placedOnce;
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (getLayoutPending()) {
            onBeforeLayoutChildren();
        }
        LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        if (getLayoutPendingForAlignment() || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.isPlacingForAlignment$ui() && getLayoutPending())) {
            setLayoutPending(false);
            LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(LayoutNode.LayoutState.LookaheadLayingOut);
            this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringPlacement(false);
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
            LayoutNode layoutNode = getLayoutNode();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.layoutChildrenBlock;
            snapshotObserver.observer.serializer(layoutNode, snapshotObserver.onCommitAffectingLookahead, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            setLayoutState(layoutState);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui()) {
                requestLayout();
            }
            setLayoutPendingForAlignment(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout$ui()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui(true);
        }
        if (getAlignmentLines().getDirty$ui() && getAlignmentLines().getRequired$ui()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markLayoutPending$ui() {
        setLayoutPending(true);
        setLayoutPendingForAlignment(true);
    }

    public final void markMeasurePending$ui() {
        setMeasurePending(true);
    }

    public final void onNodePlaced$ui() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((this._placedState != PlacedState.IsPlacedInLookahead && !getDetachedFromParentLookaheadPlacement()) || (this._placedState != PlacedState.IsPlacedInApproach && getDetachedFromParentLookaheadPlacement())) {
            markNodeAndSubtreeAsPlaced();
            if (this.relayoutWithoutParentInProgress && parent$ui != null) {
                LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        if (parent$ui == null) {
            setPlaceOrder$ui(0);
        } else if (!this.relayoutWithoutParentInProgress && (parent$ui.getLayoutState$ui() == LayoutNode.LayoutState.LayingOut || parent$ui.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadLayingOut)) {
            if (getPlaceOrder() != Integer.MAX_VALUE) {
                InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
            }
            setPlaceOrder$ui(parent$ui.getLayoutDelegate$ui().getNextChildLookaheadPlaceOrder$ui());
            LayoutNodeLayoutDelegate layoutDelegate$ui = parent$ui.getLayoutDelegate$ui();
            layoutDelegate$ui.setNextChildLookaheadPlaceOrder$ui(layoutDelegate$ui.getNextChildLookaheadPlaceOrder$ui() + 1);
        }
        layoutChildren();
    }

    public final void setChildDelegatesDirty$ui(boolean z) {
        this.childDelegatesDirty = z;
    }

    public final void setMeasuredByParent$ui(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public void setPlaceOrder$ui(int i) {
        this.placeOrder = i;
    }

    public final void setPlacedOnce$ui(boolean z) {
        this.placedOnce = z;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    private final boolean getDetachedFromParentLookaheadPlacement() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement$ui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui();
    }

    private final boolean getLayoutPending() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending$ui();
    }

    private final boolean getLayoutPendingForAlignment() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment$ui();
    }

    private final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui();
    }

    private final boolean getMeasurePending() {
        return this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        PlacedState placedState = this._placedState;
        if (getDetachedFromParentLookaheadPlacement()) {
            this._placedState = PlacedState.IsPlacedInApproach;
        } else {
            this._placedState = PlacedState.IsPlacedInLookahead;
        }
        if (placedState != PlacedState.IsPlacedInLookahead && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending$ui()) {
            LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), true, false, false, 6, null);
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (lookaheadPassDelegate$ui.getPlaceOrder() != Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui.markNodeAndSubtreeAsPlaced();
                layoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode);
            }
        }
    }

    private final void setLayoutPending(boolean z) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPending$ui(z);
    }

    private final void setLayoutPendingForAlignment(boolean z) {
        this.layoutNodeLayoutDelegate.setLookaheadLayoutPendingForAlignment$ui(z);
    }

    private final void setLayoutState(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui(layoutState);
    }

    private final void setMeasurePending(boolean z) {
        this.layoutNodeLayoutDelegate.setLookaheadMeasurePending$ui(z);
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate$ui();
    }

    public final boolean isPlaced$ui() {
        return this._placedState != PlacedState.IsNotPlaced;
    }

    public final void markNodeAndSubtreeAsNotPlaced$ui(boolean z) {
        if (z && getNeedsToBePlacedInApproach()) {
            return;
        }
        if (z || getNeedsToBePlacedInApproach()) {
            this._placedState = PlacedState.IsNotPlaced;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i = oncreatevirtualviewtranslationrequests.read;
            for (int i2 = 0; i2 < i; i2++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = ((LayoutNode) objArr[i2]).getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                lookaheadPassDelegate$ui.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i = oncreatevirtualviewtranslationrequests.read;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutDelegate$ui = layoutNode.getLayoutDelegate$ui();
                if ((layoutDelegate$ui.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate$ui.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui.getLookaheadLayoutPending$ui()) {
                    LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutDelegate$ui.getLookaheadPassDelegate$ui();
                if (lookaheadPassDelegate$ui != null) {
                    lookaheadPassDelegate$ui.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
            }
        }
    }

    public final void onApproachPlacement$ui() {
        if (this._placedState != PlacedState.IsNotPlaced || LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            return;
        }
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui(true);
    }

    public final void onAttachedToNullParent() {
        this._placedState = PlacedState.IsPlacedInLookahead;
    }

    /* JADX INFO: renamed from: performMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m2483performMeasureBRTryo0$ui(long j) {
        setLayoutState(LayoutNode.LayoutState.LookaheadMeasuring);
        setMeasurePending(false);
        this.performMeasureConstraints = j;
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
        LayoutNode layoutNode = getLayoutNode();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.performMeasureBlock;
        snapshotObserver.observer.serializer(layoutNode, snapshotObserver.onCommitAffectingLookaheadMeasure, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        markLayoutPending$ui();
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            getMeasurePassDelegate$ui().markLayoutPending();
        } else {
            getMeasurePassDelegate$ui().markMeasurePending$ui();
        }
        setLayoutState(LayoutNode.LayoutState.Idle);
    }

    public final void replace() {
        LayoutNode parent$ui;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean zIsPlaced$ui = isPlaced$ui();
            m2481placeSelfMLgxB_4(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
            if (zIsPlaced$ui && !this.onNodePlacedCalled && (parent$ui = getLayoutNode().getParent$ui()) != null) {
                LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        } finally {
            this.relayoutWithoutParentInProgress = false;
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildLookaheadPlaceOrder$ui(0);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = ((LayoutNode) objArr[i2]).getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            lookaheadPassDelegate$ui.previousPlaceOrder = lookaheadPassDelegate$ui.getPlaceOrder();
            lookaheadPassDelegate$ui.setPlaceOrder$ui(Integer.MAX_VALUE);
            if (lookaheadPassDelegate$ui.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                lookaheadPassDelegate$ui.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        onIntrinsicsQueried();
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    public final void onNodeDetached() {
        setPlaceOrder$ui(Integer.MAX_VALUE);
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = PlacedState.IsNotPlaced;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkChildrenPlaceOrderForUpdates() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = ((LayoutNode) objArr[i2]).getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            if (lookaheadPassDelegate$ui.previousPlaceOrder != lookaheadPassDelegate$ui.getPlaceOrder() && lookaheadPassDelegate$ui.getPlaceOrder() == Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    private final void forEachChildDelegate(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = ((LayoutNode) objArr[i2]).getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lookaheadPassDelegate$ui);
        }
    }

    private final void onBeforeLayoutChildren() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.getLookaheadMeasurePending$ui() && layoutNode.getMeasuredByParentInLookahead$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                Constraints constraintsM2463getLastLookaheadConstraintsDWUhwKw = layoutNode.getLayoutDelegate$ui().m2463getLastLookaheadConstraintsDWUhwKw();
                constraintsM2463getLastLookaheadConstraintsDWUhwKw.getClass();
                if (lookaheadPassDelegate$ui.m2484remeasureBRTryo0(constraintsM2463getLastLookaheadConstraintsDWUhwKw.m3632unboximpl())) {
                    LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m2481placeSelfMLgxB_4(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, GraphicsLayer graphicsLayer) throws Throwable {
        LayoutNode layoutNode = getLayoutNode();
        try {
            LayoutNode parent$ui = getLayoutNode().getParent$ui();
            LayoutNode.LayoutState layoutState$ui = parent$ui != null ? parent$ui.getLayoutState$ui() : null;
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
            if (layoutState$ui == layoutState) {
                this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPlacement$ui(false);
            }
            if (getLayoutNode().isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            setLayoutState(layoutState);
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!IntOffset.m3800equalsimpl0(j, this.lastPosition)) {
                if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    setLayoutPending(true);
                }
                notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
            this.lastPosition = j;
            if (getLayoutPending() || !isPlaced$ui()) {
                this.layoutNodeLayoutDelegate.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui(false);
                OwnerSnapshotObserver snapshotObserver = ownerRequireOwner.getSnapshotObserver();
                snapshotObserver.observer.serializer(getLayoutNode(), snapshotObserver.onCommitAffectingLayoutModifierInLookahead, this.layoutModifierBlock);
            } else {
                LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
                lookaheadDelegate.getClass();
                lookaheadDelegate.m2478placeSelfApparentToRealOffsetgyyYBs$ui(j);
                onNodePlaced$ui();
            }
            this.lastZIndex = f;
            this.lastLayerBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            this.lastExplicitLayer = graphicsLayer;
            setLayoutState(LayoutNode.LayoutState.Idle);
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            DrawableTransformation.read();
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = ((LayoutNode) objArr[i2]).getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
            lookaheadAlignmentLinesOwner$ui.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(lookaheadAlignmentLinesOwner$ui);
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui(true);
        } else {
            LayoutNode parent$ui2 = getLayoutNode().getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.getLayoutState$ui() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        int i = lookaheadDelegate.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    public final List<LookaheadPassDelegate> getChildDelegates$ui() {
        getLayoutNode().getChildren$ui();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.read();
        }
        LayoutNode layoutNode = getLayoutNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this._childDelegates;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = layoutNode.get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
        int i = oncreatevirtualviewtranslationrequests2.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (oncreatevirtualviewtranslationrequests.read <= i2) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode2.getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(lookaheadPassDelegate$ui);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate$ui2 = layoutNode2.getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui2.getClass();
                oncreatevirtualviewtranslationrequests.write(i2, lookaheadPassDelegate$ui2);
            }
        }
        oncreatevirtualviewtranslationrequests.write(layoutNode.getChildren$ui().size(), oncreatevirtualviewtranslationrequests.read);
        this.childDelegatesDirty = false;
        return this._childDelegates.read();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasuredWidth();
    }

    public final boolean getNeedsToBePlacedInApproach() {
        return LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode()) || getDetachedFromParentLookaheadPlacement();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutDelegate$ui;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || (layoutDelegate$ui = parent$ui.getLayoutDelegate$ui()) == null) {
            return null;
        }
        return layoutDelegate$ui.getLookaheadAlignmentLinesOwner$ui();
    }

    public final void invalidateIntrinsicsParent(boolean z) {
        LayoutNode layoutNode;
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui = getLayoutNode().getIntrinsicsUsageByParent$ui();
        if (parent$ui == null || intrinsicsUsageByParent$ui == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = parent$ui;
            if (layoutNode.getIntrinsicsUsageByParent$ui() != intrinsicsUsageByParent$ui) {
                break;
            } else {
                parent$ui = layoutNode.getParent$ui();
            }
        } while (parent$ui != null);
        int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui.ordinal()];
        if (i == 1) {
            if (layoutNode.getLookaheadRoot$ui() != null) {
                LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, z, false, false, 6, null);
                return;
            } else {
                LayoutNode.requestRemeasure$ui$default(layoutNode, z, false, false, 6, null);
                return;
            }
        }
        if (i != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Intrinsics isn't used by the parent");
        } else if (layoutNode.getLookaheadRoot$ui() != null) {
            layoutNode.requestLookaheadRelayout$ui(z);
        } else {
            layoutNode.requestRelayout$ui(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2209measureBRTryo0(long j) throws Throwable {
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui(false);
        } else {
            LayoutNode parent$ui2 = getLayoutNode().getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.getLayoutState$ui() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui(false);
            }
        }
        trackLookaheadMeasurementByParent(getLayoutNode());
        if (getLayoutNode().getIntrinsicsUsageByParent$ui() == LayoutNode.UsageByParent.NotUsed) {
            getLayoutNode().clearSubtreeIntrinsicsUsage$ui();
        }
        m2484remeasureBRTryo0(j);
        return this;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadDelegate lookaheadDelegate;
        LookaheadDelegate lookaheadDelegate2 = getOuterCoordinator().getLookaheadDelegate();
        if (!Boolean.valueOf(z).equals(lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.isPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate()) != null) {
            lookaheadDelegate.setPlacedUnderMotionFrameOfReference(z);
        }
        setPlacedUnderMotionFrameOfReference(z);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (!this.duringAlignmentLinesQuery) {
            if (getLayoutState() == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui(true);
                if (getAlignmentLines().getDirty$ui()) {
                    this.layoutNodeLayoutDelegate.markLookaheadLayoutPending$ui();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui(true);
            }
        }
        LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.setPlacingForAlignment$ui(true);
        }
        layoutChildren();
        LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.setPlacingForAlignment$ui(false);
        }
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws Throwable {
        m2481placeSelfMLgxB_4(j, f, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
    }

    /* JADX INFO: renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m2484remeasureBRTryo0(long j) throws Throwable {
        Constraints constraints;
        LayoutNode layoutNode = getLayoutNode();
        try {
            if (getLayoutNode().isDeactivated()) {
                InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            LayoutNode parent$ui = getLayoutNode().getParent$ui();
            getLayoutNode().setCanMultiMeasure$ui(getLayoutNode().getCanMultiMeasure$ui() || (parent$ui != null && parent$ui.getCanMultiMeasure$ui()));
            if (!getLayoutNode().getLookaheadMeasurePending$ui() && (constraints = this.lookaheadConstraints) != null && Constraints.m3619equalsimpl0(constraints.m3632unboximpl(), j)) {
                Owner owner$ui = getLayoutNode().getOwner$ui();
                if (owner$ui != null) {
                    owner$ui.forceMeasureTheSubtree(getLayoutNode(), true);
                }
                getLayoutNode().resetSubtreeIntrinsicsUsage$ui();
                return false;
            }
            this.lookaheadConstraints = Constraints.m3613boximpl(j);
            m2279setMeasurementConstraintsBRTryo0(j);
            getAlignmentLines().setUsedByModifierMeasurement$ui(false);
            forEachChildAlignmentLinesOwner(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AlignmentLinesOwner) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            long jM2275getMeasuredSizeYbymL2g = this.measuredOnce ? m2275getMeasuredSizeYbymL2g() : IntSize.m3839constructorimpl(-9223372034707292160L);
            this.measuredOnce = true;
            LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate == null) {
                InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            this.layoutNodeLayoutDelegate.m2464performLookaheadMeasureBRTryo0$ui(j);
            m2278setMeasuredSizeozmzZPI(IntSize.m3839constructorimpl((((long) lookaheadDelegate.getHeight()) & 4294967295L) | (((long) lookaheadDelegate.getWidth()) << 32)));
            return (((int) (jM2275getMeasuredSizeYbymL2g >> 32)) == lookaheadDelegate.getWidth() && ((int) (jM2275getMeasuredSizeYbymL2g & 4294967295L)) == lookaheadDelegate.getHeight()) ? false : true;
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            DrawableTransformation.read();
            return false;
        }
    }

    private final void trackLookaheadMeasurementByParent(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui == null) {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            return;
        }
        if (this.measuredByParent != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui()) {
            InlineClassHelperKt.throwIllegalStateException(LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
        if (i == 1 || i == 2) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i != 3 && i != 4) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(parent$ui.getLayoutState$ui(), "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                return;
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestLookaheadRelayout$ui$default(getLayoutNode(), false, 1, null);
    }

    public final boolean updateParentData() {
        if (getParentData() == null) {
            LookaheadDelegate lookaheadDelegate = getOuterCoordinator().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            if (lookaheadDelegate.getParentData() == null) {
                return false;
            }
        }
        if (!this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        LookaheadDelegate lookaheadDelegate2 = getOuterCoordinator().getLookaheadDelegate();
        lookaheadDelegate2.getClass();
        this.parentData = lookaheadDelegate2.getParentData();
        return true;
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui;
        LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || getLayoutNode().getIntrinsicsUsageByParent$ui() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        int i = WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
        if (i != 2) {
            intrinsicsUsageByParent$ui = i != 3 ? parent$ui.getIntrinsicsUsageByParent$ui() : LayoutNode.UsageByParent.InLayoutBlock;
        } else {
            intrinsicsUsageByParent$ui = LayoutNode.UsageByParent.InMeasureBlock;
        }
        layoutNode.setIntrinsicsUsageByParent$ui(intrinsicsUsageByParent$ui);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2277placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) throws Throwable {
        m2481placeSelfMLgxB_4(j, f, null, graphicsLayer);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestLookaheadRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
    }
}
