package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class getFqName {
    public static final boolean write(int i) {
        androidx.compose.ui.text.style.TextOverflow.Companion companion = androidx.compose.ui.text.style.TextOverflow.Companion;
        return androidx.compose.ui.text.style.TextOverflow.m3559equalsimpl0(i, companion.m3569getEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m3559equalsimpl0(i, companion.m3571getStartEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m3559equalsimpl0(i, companion.m3570getMiddleEllipsisgIe3tQ8());
    }

    public static final long RemoteActionCompatParcelizer(long j, boolean z, int i, float f) {
        androidx.compose.ui.unit.Constraints.Companion companion = androidx.compose.ui.unit.Constraints.Companion;
        int iM3626getMaxWidthimpl = ((z || write(i)) && androidx.compose.ui.unit.Constraints.m3622getHasBoundedWidthimpl(j)) ? androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) : Integer.MAX_VALUE;
        if (androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j) != iM3626getMaxWidthimpl) {
            iM3626getMaxWidthimpl = RangesKt.RemoteActionCompatParcelizer(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(f), androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), iM3626getMaxWidthimpl);
        }
        return companion.m3635fitPrioritizingWidthZbe2FdA(0, iM3626getMaxWidthimpl, 0, androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j));
    }
}
