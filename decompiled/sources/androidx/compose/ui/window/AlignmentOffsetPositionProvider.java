package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m3936getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo134calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        long jMo139alignKFBX0sM = alignment.mo139alignKFBX0sM(companion.m3849getZeroYbymL2g(), intRect.m3828getSizeYbymL2g(), layoutDirection);
        return IntOffset.m3805plusqkQi6aY(IntOffset.m3805plusqkQi6aY(IntOffset.m3805plusqkQi6aY(intRect.m3830getTopLeftnOccac(), jMo139alignKFBX0sM), IntOffset.m3809unaryMinusnOccac(this.alignment.mo139alignKFBX0sM(companion.m3849getZeroYbymL2g(), j2, layoutDirection))), IntOffset.m3795constructorimpl((((long) (IntOffset.m3801getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32) | (((long) IntOffset.m3802getYimpl(this.offset)) & 4294967295L)));
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j) {
        this.alignment = alignment;
        this.offset = j;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j);
    }
}
