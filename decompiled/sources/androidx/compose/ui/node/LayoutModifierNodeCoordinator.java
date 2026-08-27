package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint modifierBoundsPaint;
    private ApproachMeasureScopeImpl approachMeasureScope;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo2209measureBRTryo0(long j) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            m2279setMeasurementConstraintsBRTryo0(j);
            layoutModifierNodeCoordinator.m2440setLookaheadConstraints_Sx5XlM$ui(Constraints.m3613boximpl(j));
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            set_measureResult(layoutModifierNode.mo7measure3p2s80s(this, lookaheadDelegate, j));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            lookaheadDelegate.getClass();
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int iCalculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().write(iCalculateAlignmentAndPlaceChildAsNeeded, alignmentLine);
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* JADX INFO: renamed from: getLookaheadConstraints-DWUhwKw$ui, reason: not valid java name */
    public final Constraints m2439getLookaheadConstraintsDWUhwKw$ui() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-_Sx5XlM$ui, reason: not valid java name */
    public final void m2440setLookaheadConstraints_Sx5XlM$ui(Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final void setLayoutModifierNode$ui(LayoutModifierNode layoutModifierNode) {
        Object[] objArr = {layoutModifierNode, this.layoutModifierNode};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Modifier.Node node = layoutModifierNode.getNode();
            if ((node.getKindSet$ui() & NodeKind.m2551constructorimpl(Fields.RotationY)) != 0) {
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        private Companion() {
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo598setColor8_81llA(Color.Companion.m749getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo602setStylek9PVt8s(PaintingStyle.Companion.m1007getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        this.approachMeasureScope = (layoutModifierNode.getNode().getKindSet$ui() & NodeKind.m2551constructorimpl(Fields.RotationY)) != 0 ? new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode) : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2277placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        super.mo2277placeAtf8xVGno(j, f, graphicsLayer);
        onAfterPlaceAt();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui = getWrapped$ui();
        wrapped$ui.getClass();
        return wrapped$ui;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i) : this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator wrapped$ui;
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (!LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds() || (wrapped$ui = getWrapped$ui()) == null) {
            return;
        }
        if (IntSize.m3842equalsimpl0(mo2217getSizeYbymL2g(), wrapped$ui.mo2217getSizeYbymL2g()) && IntOffset.m3800equalsimpl0(wrapped$ui.mo2467getPositionnOccac(), IntOffset.Companion.m3812getZeronOccac())) {
            return;
        }
        drawBorder(canvas, modifierBoundsPaint);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui(alignmentLine) : LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    private final void onAfterPlaceAt() {
        boolean z;
        if (isShallowPlacing$ui()) {
            return;
        }
        onPlaced();
        NodeCoordinator wrappedNonNull = getWrappedNonNull();
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            Placeable.PlacementScope placementScope = getPlacementScope();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            if (approachNode.isPlacementApproachInProgress(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) || approachMeasureScopeImpl.getApproachMeasureRequired$ui()) {
                z = false;
            } else {
                long jMo2217getSizeYbymL2g = mo2217getSizeYbymL2g();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                if (IntSize.m3841equalsimpl(jMo2217getSizeYbymL2g, lookaheadDelegate2 != null ? IntSize.m3836boximpl(lookaheadDelegate2.m2476getSizeYbymL2g$ui()) : null)) {
                    long jMo2217getSizeYbymL2g2 = wrappedNonNull.mo2217getSizeYbymL2g();
                    LookaheadDelegate lookaheadDelegate3 = wrappedNonNull.getLookaheadDelegate();
                    if (IntSize.m3841equalsimpl(jMo2217getSizeYbymL2g2, lookaheadDelegate3 != null ? IntSize.m3836boximpl(lookaheadDelegate3.m2476getSizeYbymL2g$ui()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(z);
        }
        wrappedNonNull.setPlacingForAlignment$ui(isPlacingForAlignment$ui());
        getMeasureResult$ui().placeChildren();
        wrappedNonNull.setPlacingForAlignment$ui(false);
        wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(false);
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0 */
    public Placeable mo2209measureBRTryo0(long j) {
        final MeasureResult measureResultMo7measure3p2s80s;
        if (getForceMeasureWithLookaheadConstraints$ui()) {
            Constraints constraints = this.lookaheadConstraints;
            if (constraints == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = constraints.m3632unboximpl();
        }
        m2279setMeasurementConstraintsBRTryo0(j);
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            boolean z = false;
            approachMeasureScopeImpl.setApproachMeasureRequired$ui(approachNode.mo2186isMeasurementApproachInProgressozmzZPI(approachMeasureScopeImpl.mo2184getLookaheadSizeYbymL2g()) || !Constraints.m3618equalsimpl(j, m2439getLookaheadConstraintsDWUhwKw$ui()));
            if (!approachMeasureScopeImpl.getApproachMeasureRequired$ui()) {
                getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui(true);
            }
            measureResultMo7measure3p2s80s = approachNode.mo2185approachMeasure3p2s80s(approachMeasureScopeImpl, getWrappedNonNull(), j);
            getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui(false);
            int width = measureResultMo7measure3p2s80s.getWidth();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            if (width == lookaheadDelegate.getWidth()) {
                int height = measureResultMo7measure3p2s80s.getHeight();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                lookaheadDelegate2.getClass();
                if (height == lookaheadDelegate2.getHeight()) {
                    z = true;
                }
            }
            if (!approachMeasureScopeImpl.getApproachMeasureRequired$ui()) {
                long jMo2217getSizeYbymL2g = getWrappedNonNull().mo2217getSizeYbymL2g();
                LookaheadDelegate lookaheadDelegate3 = getWrappedNonNull().getLookaheadDelegate();
                if (IntSize.m3841equalsimpl(jMo2217getSizeYbymL2g, lookaheadDelegate3 != null ? IntSize.m3836boximpl(lookaheadDelegate3.m2476getSizeYbymL2g$ui()) : null) && !z) {
                    measureResultMo7measure3p2s80s = new MeasureResult(this) { // from class: androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
                        private final int height;
                        private final int width;

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return this.height;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return this.width;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return this.$$delegate_0.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
                            return this.$$delegate_0.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            this.$$delegate_0.placeChildren();
                        }

                        {
                            LookaheadDelegate lookaheadDelegate4 = this.getLookaheadDelegate();
                            lookaheadDelegate4.getClass();
                            this.width = lookaheadDelegate4.getWidth();
                            LookaheadDelegate lookaheadDelegate5 = this.getLookaheadDelegate();
                            lookaheadDelegate5.getClass();
                            this.height = lookaheadDelegate5.getHeight();
                        }
                    };
                }
            }
        } else {
            measureResultMo7measure3p2s80s = getLayoutModifierNode().mo7measure3p2s80s(this, getWrappedNonNull(), j);
        }
        setMeasureResult$ui(measureResultMo7measure3p2s80s);
        onMeasured();
        return this;
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
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }
}
