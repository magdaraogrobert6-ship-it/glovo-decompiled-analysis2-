package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo2218localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        return mo2219localPositionOfS_NoaFU(layoutCoordinates, j, true);
    }

    /* JADX INFO: renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m2240getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m481minusMKHz9U(mo2218localPositionOfR5De75A(coordinates, companion.m493getZeroF1C5BW0()), getCoordinator().mo2218localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m493getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo2217getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m3839constructorimpl((((long) lookaheadDelegate.getWidth()) << 32) | (((long) lookaheadDelegate.getHeight()) & 4294967295L));
    }

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo2220localToRootMKHz9U(long j) {
        return getCoordinator().mo2220localToRootMKHz9U(Offset.m482plusMKHz9U(j, m2240getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo2221localToScreenMKHz9U(long j) {
        return getCoordinator().mo2221localToScreenMKHz9U(Offset.m482plusMKHz9U(j, m2240getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo2222localToWindowMKHz9U(long j) {
        return getCoordinator().mo2222localToWindowMKHz9U(Offset.m482plusMKHz9U(j, m2240getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo2223screenToLocalMKHz9U(long j) {
        return Offset.m482plusMKHz9U(getCoordinator().mo2223screenToLocalMKHz9U(j), m2240getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo2224transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo2224transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo2225transformToScreen58bKbWc(float[] fArr) {
        getCoordinator().mo2225transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo2226windowToLocalMKHz9U(long j) {
        return Offset.m482plusMKHz9U(getCoordinator().mo2226windowToLocalMKHz9U(j), m2240getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui = getCoordinator().getWrappedBy$ui();
        if (wrappedBy$ui == null || (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui = getCoordinator().getLayoutNode().getOuterCoordinator$ui().getWrappedBy$ui();
        if (wrappedBy$ui == null || (lookaheadDelegate = wrappedBy$ui.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo2219localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jMo2219localPositionOfS_NoaFU = mo2219localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j, z);
            long jMo2467getPositionnOccac = rootLookaheadDelegate.mo2467getPositionnOccac();
            long jM481minusMKHz9U = Offset.m481minusMKHz9U(jMo2219localPositionOfS_NoaFU, Offset.m469constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jMo2467getPositionnOccac)))) | (((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(jMo2467getPositionnOccac))) << 32)));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m482plusMKHz9U(jM481minusMKHz9U, parentCoordinates.mo2219localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m493getZeroF1C5BW0(), z));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            boolean z2 = !z;
            long jM3804minusqkQi6aY = IntOffset.m3804minusqkQi6aY(IntOffset.m3805plusqkQi6aY(lookaheadDelegate.m2479positionIniSbpLlY$ui(lookaheadDelegate2, z2), IntOffsetKt.m3818roundk4lQ0M(j)), this.lookaheadDelegate.m2479positionIniSbpLlY$ui(lookaheadDelegate2, z2));
            return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(jM3804minusqkQi6aY))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jM3804minusqkQi6aY))) & 4294967295L));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        boolean z3 = !z;
        long jM3805plusqkQi6aY = IntOffset.m3805plusqkQi6aY(IntOffset.m3805plusqkQi6aY(lookaheadDelegate.m2479positionIniSbpLlY$ui(rootLookaheadDelegate2, z3), rootLookaheadDelegate2.mo2467getPositionnOccac()), IntOffsetKt.m3818roundk4lQ0M(j));
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long jM3804minusqkQi6aY2 = IntOffset.m3804minusqkQi6aY(jM3805plusqkQi6aY, IntOffset.m3805plusqkQi6aY(this.lookaheadDelegate.m2479positionIniSbpLlY$ui(rootLookaheadDelegate3, z3), rootLookaheadDelegate3.mo2467getPositionnOccac()));
        float fM3801getXimpl = IntOffset.m3801getXimpl(jM3804minusqkQi6aY2);
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jM3804minusqkQi6aY2))) & 4294967295L) | (Float.floatToRawIntBits(fM3801getXimpl) << 32));
        NodeCoordinator wrappedBy$ui = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui();
        wrappedBy$ui.getClass();
        NodeCoordinator wrappedBy$ui2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui();
        wrappedBy$ui2.getClass();
        return wrappedBy$ui.mo2219localPositionOfS_NoaFU(wrappedBy$ui2, jM469constructorimpl, z);
    }
}
