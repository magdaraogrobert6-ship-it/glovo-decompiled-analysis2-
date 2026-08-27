package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import o.accessgetEvenOddcp;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    public float write;

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[PHI: r4
  0x004f: PHI (r4v14 long) = (r4v9 long), (r4v10 long), (r4v11 long) binds: [B:15:0x004d, B:18:0x005d, B:21:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long jM66tryMaxWidthJN0ABg = m66tryMaxWidthJN0ABg(j, true);
        IntSize.Companion companion = IntSize.Companion;
        if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg, companion.m3849getZeroYbymL2g())) {
            jM66tryMaxWidthJN0ABg = m65tryMaxHeightJN0ABg(j, true);
            if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg, companion.m3849getZeroYbymL2g())) {
                jM66tryMaxWidthJN0ABg = m68tryMinWidthJN0ABg(j, true);
                if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg, companion.m3849getZeroYbymL2g())) {
                    jM66tryMaxWidthJN0ABg = m67tryMinHeightJN0ABg(j, true);
                    if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg, companion.m3849getZeroYbymL2g())) {
                        long jM66tryMaxWidthJN0ABg2 = m66tryMaxWidthJN0ABg(j, false);
                        if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg2, companion.m3849getZeroYbymL2g())) {
                            jM66tryMaxWidthJN0ABg2 = m65tryMaxHeightJN0ABg(j, false);
                            if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg2, companion.m3849getZeroYbymL2g())) {
                                jM66tryMaxWidthJN0ABg2 = m68tryMinWidthJN0ABg(j, false);
                                if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg2, companion.m3849getZeroYbymL2g())) {
                                    jM66tryMaxWidthJN0ABg = m67tryMinHeightJN0ABg(j, false);
                                    if (IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg, companion.m3849getZeroYbymL2g())) {
                                        jM66tryMaxWidthJN0ABg = companion.m3849getZeroYbymL2g();
                                    }
                                } else {
                                    jM66tryMaxWidthJN0ABg = jM66tryMaxWidthJN0ABg2;
                                }
                            } else {
                                jM66tryMaxWidthJN0ABg = jM66tryMaxWidthJN0ABg2;
                            }
                        } else {
                            jM66tryMaxWidthJN0ABg = jM66tryMaxWidthJN0ABg2;
                        }
                    }
                }
            }
        }
        if (!IntSize.m3842equalsimpl0(jM66tryMaxWidthJN0ABg, companion.m3849getZeroYbymL2g())) {
            j = Constraints.Companion.m3636fixedJhjzzOo((int) (jM66tryMaxWidthJN0ABg >> 32), (int) (jM66tryMaxWidthJN0ABg & 4294967295L));
        }
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new accessgetEvenOddcp(placeableMo2209measureBRTryo0, 1), 4, null);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    public final long m67tryMinHeightJN0ABg(long j, boolean z) {
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
        int iRound = Math.round(iM3627getMinHeightimpl * this.write);
        return (iRound <= 0 || (z && !AspectRatioKt.serializer(iRound, iM3627getMinHeightimpl, j))) ? IntSize.Companion.m3849getZeroYbymL2g() : IntSize.m3839constructorimpl((((long) iRound) << 32) | (((long) iM3627getMinHeightimpl) & 4294967295L));
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    public final long m68tryMinWidthJN0ABg(long j, boolean z) {
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        int iRound = Math.round(iM3628getMinWidthimpl / this.write);
        if (iRound <= 0 || (z && !AspectRatioKt.serializer(iM3628getMinWidthimpl, iRound, j))) {
            return IntSize.Companion.m3849getZeroYbymL2g();
        }
        return IntSize.m3839constructorimpl((((long) iM3628getMinWidthimpl) << 32) | (((long) iRound) & 4294967295L));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.write);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.write);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.write);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.write);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    public final long m65tryMaxHeightJN0ABg(long j, boolean z) {
        int iRound;
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        return (iM3625getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM3625getMaxHeightimpl) * this.write)) <= 0 || (z && !AspectRatioKt.serializer(iRound, iM3625getMaxHeightimpl, j))) ? IntSize.Companion.m3849getZeroYbymL2g() : IntSize.m3839constructorimpl((((long) iRound) << 32) | (((long) iM3625getMaxHeightimpl) & 4294967295L));
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    public final long m66tryMaxWidthJN0ABg(long j, boolean z) {
        int iRound;
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        return (iM3626getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM3626getMaxWidthimpl) / this.write)) <= 0 || (z && !AspectRatioKt.serializer(iM3626getMaxWidthimpl, iRound, j))) ? IntSize.Companion.m3849getZeroYbymL2g() : IntSize.m3839constructorimpl((((long) iM3626getMaxWidthimpl) << 32) | (((long) iRound) & 4294967295L));
    }
}
