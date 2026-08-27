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
import androidx.compose.ui.unit.ConstraintsKt;
import o.OutlinedTextFieldDefaults;

/* JADX INFO: loaded from: classes.dex */
public final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    public float IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public boolean read;
    public float serializer;
    public float write;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    public final long m88getTargetConstraintsOenEA2s(IntrinsicMeasureScope intrinsicMeasureScope) {
        int iMo42roundToPx0680j_4;
        int iMo42roundToPx0680j_5;
        int iMo42roundToPx0680j_6;
        int i = 0;
        if (Float.isNaN(this.write)) {
            iMo42roundToPx0680j_4 = Integer.MAX_VALUE;
        } else {
            iMo42roundToPx0680j_4 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.write);
            if (iMo42roundToPx0680j_4 < 0) {
                iMo42roundToPx0680j_4 = 0;
            }
        }
        if (Float.isNaN(this.serializer)) {
            iMo42roundToPx0680j_5 = Integer.MAX_VALUE;
        } else {
            iMo42roundToPx0680j_5 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.serializer);
            if (iMo42roundToPx0680j_5 < 0) {
                iMo42roundToPx0680j_5 = 0;
            }
        }
        if (Float.isNaN(this.IconCompatParcelizer)) {
            iMo42roundToPx0680j_6 = 0;
        } else {
            iMo42roundToPx0680j_6 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer);
            if (iMo42roundToPx0680j_6 < 0) {
                iMo42roundToPx0680j_6 = 0;
            }
            if (iMo42roundToPx0680j_6 > iMo42roundToPx0680j_4) {
                iMo42roundToPx0680j_6 = iMo42roundToPx0680j_4;
            }
            if (iMo42roundToPx0680j_6 == Integer.MAX_VALUE) {
                iMo42roundToPx0680j_6 = 0;
            }
        }
        if (!Float.isNaN(this.RemoteActionCompatParcelizer)) {
            int iMo42roundToPx0680j_7 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer);
            if (iMo42roundToPx0680j_7 < 0) {
                iMo42roundToPx0680j_7 = 0;
            }
            if (iMo42roundToPx0680j_7 > iMo42roundToPx0680j_5) {
                iMo42roundToPx0680j_7 = iMo42roundToPx0680j_5;
            }
            if (iMo42roundToPx0680j_7 != Integer.MAX_VALUE) {
                i = iMo42roundToPx0680j_7;
            }
        }
        return ConstraintsKt.Constraints(iMo42roundToPx0680j_6, iMo42roundToPx0680j_4, i, iMo42roundToPx0680j_5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM88getTargetConstraintsOenEA2s = m88getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m3623getHasFixedHeightimpl(jM88getTargetConstraintsOenEA2s)) {
            return Constraints.m3625getMaxHeightimpl(jM88getTargetConstraintsOenEA2s);
        }
        if (!this.read) {
            i = ConstraintsKt.m3643constrainWidthK40F9xA(jM88getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m3642constrainHeightK40F9xA(jM88getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM88getTargetConstraintsOenEA2s = m88getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m3624getHasFixedWidthimpl(jM88getTargetConstraintsOenEA2s)) {
            return Constraints.m3626getMaxWidthimpl(jM88getTargetConstraintsOenEA2s);
        }
        if (!this.read) {
            i = ConstraintsKt.m3642constrainHeightK40F9xA(jM88getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m3643constrainWidthK40F9xA(jM88getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM3628getMinWidthimpl;
        int iM3626getMaxWidthimpl;
        int iM3627getMinHeightimpl;
        int iM3625getMaxHeightimpl;
        long jConstraints;
        long jM88getTargetConstraintsOenEA2s = m88getTargetConstraintsOenEA2s(measureScope);
        if (this.read) {
            jConstraints = ConstraintsKt.m3641constrainN9IONVI(j, jM88getTargetConstraintsOenEA2s);
        } else {
            if (Float.isNaN(this.IconCompatParcelizer)) {
                iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
                int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jM88getTargetConstraintsOenEA2s);
                if (iM3628getMinWidthimpl > iM3626getMaxWidthimpl2) {
                    iM3628getMinWidthimpl = iM3626getMaxWidthimpl2;
                }
            } else {
                iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jM88getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.write)) {
                iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
                int iM3628getMinWidthimpl2 = Constraints.m3628getMinWidthimpl(jM88getTargetConstraintsOenEA2s);
                if (iM3626getMaxWidthimpl < iM3628getMinWidthimpl2) {
                    iM3626getMaxWidthimpl = iM3628getMinWidthimpl2;
                }
            } else {
                iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(jM88getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.RemoteActionCompatParcelizer)) {
                iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
                int iM3625getMaxHeightimpl2 = Constraints.m3625getMaxHeightimpl(jM88getTargetConstraintsOenEA2s);
                if (iM3627getMinHeightimpl > iM3625getMaxHeightimpl2) {
                    iM3627getMinHeightimpl = iM3625getMaxHeightimpl2;
                }
            } else {
                iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jM88getTargetConstraintsOenEA2s);
            }
            if (Float.isNaN(this.serializer)) {
                iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
                int iM3627getMinHeightimpl2 = Constraints.m3627getMinHeightimpl(jM88getTargetConstraintsOenEA2s);
                if (iM3625getMaxHeightimpl < iM3627getMinHeightimpl2) {
                    iM3625getMaxHeightimpl = iM3627getMinHeightimpl2;
                }
            } else {
                iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(jM88getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM3628getMinWidthimpl, iM3626getMaxWidthimpl, iM3627getMinHeightimpl, iM3625getMaxHeightimpl);
        }
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new OutlinedTextFieldDefaults(placeableMo2209measureBRTryo0, 1), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM88getTargetConstraintsOenEA2s = m88getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m3623getHasFixedHeightimpl(jM88getTargetConstraintsOenEA2s)) {
            return Constraints.m3625getMaxHeightimpl(jM88getTargetConstraintsOenEA2s);
        }
        if (!this.read) {
            i = ConstraintsKt.m3643constrainWidthK40F9xA(jM88getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m3642constrainHeightK40F9xA(jM88getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jM88getTargetConstraintsOenEA2s = m88getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m3624getHasFixedWidthimpl(jM88getTargetConstraintsOenEA2s)) {
            return Constraints.m3626getMaxWidthimpl(jM88getTargetConstraintsOenEA2s);
        }
        if (!this.read) {
            i = ConstraintsKt.m3642constrainHeightK40F9xA(jM88getTargetConstraintsOenEA2s, i);
        }
        return ConstraintsKt.m3643constrainWidthK40F9xA(jM88getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i));
    }
}
