package androidx.compose.ui.node;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo2209measureBRTryo0(long j) {
            m2279setMeasurementConstraintsBRTryo0(j);
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i = oncreatevirtualviewtranslationrequests.read;
            for (int i2 = 0; i2 < i; i2++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui = ((LayoutNode) objArr[i2]).getLookaheadPassDelegate$ui();
                lookaheadPassDelegate$ui.getClass();
                lookaheadPassDelegate$ui.setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo6measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui(), j));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().write(iIntValue, alignmentLine);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return getLayoutNode().minLookaheadIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return getLayoutNode().minLookaheadIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        public void placeChildren() {
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLayoutNode().getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            lookaheadPassDelegate$ui.onNodePlaced$ui();
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        private Companion() {
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo598setColor8_81llA(Color.Companion.m756getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo602setStylek9PVt8s(PaintingStyle.Companion.m1007getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2277placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        super.mo2277placeAtf8xVGno(j, f, graphicsLayer);
        onAfterPlaceAt();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[EDGE_INSN: B:35:0x009f->B:31:0x009f BREAK  A[LOOP:0: B:16:0x005e->B:30:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    public void mo2437hitTestChildqzLsGqo(NodeCoordinator.HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        boolean z2;
        Object[] objArr;
        int i2;
        LayoutNode layoutNode;
        boolean zHasHit;
        boolean z3 = false;
        if (hitTestSource.shouldHitTestChildren(getLayoutNode())) {
            if (!m2540withinLayerBoundsk4lQ0M(j)) {
                if (!PointerType.m2146equalsimpl0(i, PointerType.Companion.m2153getTouchT8wyACA()) || (Float.floatToRawIntBits(m2528distanceInMinimumTouchTargettz77jQw(j, m2531getMinimumTouchTargetSizeNHjbRc())) & Integer.MAX_VALUE) >= 2139095040) {
                }
                if (z3) {
                    int i3 = hitTestResult.hitDepth;
                    onCreateVirtualViewTranslationRequests zSortedChildren = getLayoutNode().getZSortedChildren();
                    objArr = zSortedChildren.write;
                    for (i2 = zSortedChildren.read - 1; i2 >= 0; i2--) {
                        layoutNode = (LayoutNode) objArr[i2];
                        if (layoutNode.isPlaced()) {
                            hitTestSource.mo2541childHitTestqzLsGqo(layoutNode, j, hitTestResult, i, z2);
                            zHasHit = hitTestResult.hasHit();
                            if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                                if (!zHasHit && !hitTestSource.shareWithSiblings(hitTestResult, layoutNode)) {
                                    break;
                                }
                            } else if (zHasHit) {
                                continue;
                            } else if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                                break;
                            } else {
                                hitTestResult.acceptHits();
                            }
                        }
                    }
                    hitTestResult.hitDepth = i3;
                }
            }
            z3 = z;
            z2 = z3;
            z3 = true;
            if (z3) {
                int i4 = hitTestResult.hitDepth;
                onCreateVirtualViewTranslationRequests zSortedChildren2 = getLayoutNode().getZSortedChildren();
                objArr = zSortedChildren2.write;
                while (i2 >= 0) {
                    layoutNode = (LayoutNode) objArr[i2];
                    if (layoutNode.isPlaced()) {
                        hitTestSource.mo2541childHitTestqzLsGqo(layoutNode, j, hitTestResult, i, z2);
                        zHasHit = hitTestResult.hasHit();
                        if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                            if (zHasHit) {
                                if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                                    break;
                                    break;
                                }
                                hitTestResult.acceptHits();
                            } else {
                                continue;
                            }
                        } else if (!zHasHit) {
                            continue;
                        }
                    }
                }
                hitTestResult.hitDepth = i4;
            }
        }
        z2 = z;
        if (z3) {
            int i5 = hitTestResult.hitDepth;
            onCreateVirtualViewTranslationRequests zSortedChildren3 = getLayoutNode().getZSortedChildren();
            objArr = zSortedChildren3.write;
            while (i2 >= 0) {
                layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.isPlaced()) {
                    hitTestSource.mo2541childHitTestqzLsGqo(layoutNode, j, hitTestResult, i, z2);
                    zHasHit = hitTestResult.hasHit();
                    if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                        if (zHasHit) {
                            if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                                break;
                                break;
                            }
                            hitTestResult.acceptHits();
                        } else {
                            continue;
                        }
                    } else if (!zHasHit) {
                        continue;
                    }
                }
            }
            hitTestResult.hitDepth = i5;
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        return getLayoutNode().maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        return getLayoutNode().maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        return getLayoutNode().minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        return getLayoutNode().minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) throws Throwable {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        onCreateVirtualViewTranslationRequests zSortedChildren = getLayoutNode().getZSortedChildren();
        Object[] objArr = zSortedChildren.write;
        int i = zSortedChildren.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.isPlaced()) {
                layoutNode.draw$ui(canvas, graphicsLayer);
            }
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui() != null ? new LookaheadDelegateImpl() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2209measureBRTryo0(long j) {
        if (getForceMeasureWithLookaheadConstraints$ui()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            j = lookaheadDelegate.m2475getConstraintsmsEJaDk$ui();
        }
        m2279setMeasurementConstraintsBRTryo0(j);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = getLayoutNode().get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).getMeasurePassDelegate$ui().setMeasuredByParent$ui(LayoutNode.UsageByParent.NotUsed);
        }
        setMeasureResult$ui(getLayoutNode().getMeasurePolicy().mo6measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui(), j));
        onMeasured();
        return this;
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui()) {
            return;
        }
        getLayoutNode().getMeasurePassDelegate$ui().onNodePlaced$ui();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super.mo2210placeAtf8xVGno(j, f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }
}
