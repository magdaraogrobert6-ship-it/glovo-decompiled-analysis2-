package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnchoredDraggableState;
import o.ContentInViewNodeKt;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;
    private MeasureResult _measureResult;
    private final AnchoredDraggableState cachedAlignmentLinesMap;
    private final NodeCoordinator coordinator;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m3812getZeronOccac();
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);

    public final AnchoredDraggableState getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m2475getConstraintsmsEJaDk$ui() {
        return m2276getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo2467getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m2480setPositiongyyYBs(long j) {
        this.position = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m2278setMeasuredSizeozmzZPI(IntSize.m3839constructorimpl((((long) measureResult.getHeight()) & 4294967295L) | (((long) measureResult.getWidth()) << 32)));
        } else {
            m2278setMeasuredSizeozmzZPI(IntSize.Companion.m3849getZeroYbymL2g());
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this._measureResult, measureResult}, getCieXyz.write())).booleanValue() && measureResult != null && (((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{measureResult.getAlignmentLines(), this.oldAlignmentLines}, getCieXyz.write())).booleanValue()) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(measureResult.getAlignmentLines());
            }
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = this.coordinator.getLayoutNode().getLayoutDelegate$ui().getLookaheadAlignmentLinesOwner$ui();
        lookaheadAlignmentLinesOwner$ui.getClass();
        return lookaheadAlignmentLinesOwner$ui;
    }

    public final int getCachedAlignmentLine$ui(AlignmentLine alignmentLine) {
        AnchoredDraggableState anchoredDraggableState = this.cachedAlignmentLinesMap;
        int iSerializer = anchoredDraggableState.serializer(alignmentLine);
        if (iSerializer >= 0) {
            return anchoredDraggableState.MediaMetadataCompat[iSerializer];
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        if (wrapped$ui != null) {
            return wrapped$ui.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui = this.coordinator.getWrappedBy$ui();
        if (wrappedBy$ui != null) {
            return wrappedBy$ui.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    public int maxIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui = this.coordinator.getWrapped$ui();
        wrapped$ui.getClass();
        LookaheadDelegate lookaheadDelegate = wrapped$ui.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    /* JADX INFO: renamed from: positionIn-iSbpLlY$ui, reason: not valid java name */
    public final long m2479positionIniSbpLlY$ui(LookaheadDelegate lookaheadDelegate, boolean z) {
        long jM3812getZeronOccac = IntOffset.Companion.m3812getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!lookaheadDelegate2.equals(lookaheadDelegate)) {
            if (!lookaheadDelegate2.isPlacedUnderMotionFrameOfReference() || !z) {
                jM3812getZeronOccac = IntOffset.m3805plusqkQi6aY(jM3812getZeronOccac, lookaheadDelegate2.mo2467getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui = lookaheadDelegate2.coordinator.getWrappedBy$ui();
            wrappedBy$ui.getClass();
            lookaheadDelegate2 = wrappedBy$ui.getLookaheadDelegate();
            lookaheadDelegate2.getClass();
        }
        return jM3812getZeronOccac;
    }

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
        AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
        this.cachedAlignmentLinesMap = new AnchoredDraggableState();
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m2477performingMeasureK40F9xA(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        m2279setMeasurementConstraintsBRTryo0(j);
        set_measureResult((MeasureResult) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public final void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        m2474placeSelfgyyYBs(j);
        if (isShallowPlacing$ui()) {
            return;
        }
        placeChildren();
    }

    /* JADX INFO: renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m2474placeSelfgyyYBs(long j) {
        if (!IntOffset.m3800equalsimpl0(mo2467getPositionnOccac(), j)) {
            m2480setPositiongyyYBs(j);
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLayoutNode().getLayoutDelegate$ui().getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui != null) {
                lookaheadPassDelegate$ui.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (isPlacingForAlignment$ui()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m2476getSizeYbymL2g$ui() {
        return IntSize.m3839constructorimpl((((long) getHeight()) & 4294967295L) | (getWidth() << 32));
    }

    public void placeChildren() {
        getMeasureResult$ui().placeChildren();
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset--gyyYBs$ui, reason: not valid java name */
    public final void m2478placeSelfApparentToRealOffsetgyyYBs$ui(long j) {
        m2474placeSelfgyyYBs(IntOffset.m3805plusqkQi6aY(j, m2274getApparentToRealOffsetnOccac()));
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        mo2210placeAtf8xVGno(mo2467getPositionnOccac(), 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw c8$$ExternalSyntheticOutline0.m("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }
}
