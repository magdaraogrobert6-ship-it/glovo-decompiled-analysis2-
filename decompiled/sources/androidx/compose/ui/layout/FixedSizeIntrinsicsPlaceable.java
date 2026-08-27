package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSize;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    @Override // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
    }

    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m2278setMeasuredSizeozmzZPI(IntSize.m3839constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32)));
    }
}
