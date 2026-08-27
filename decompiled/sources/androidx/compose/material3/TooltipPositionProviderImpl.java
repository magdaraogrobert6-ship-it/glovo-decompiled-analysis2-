package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipPositionProviderImpl implements PopupPositionProvider {
    public final int IconCompatParcelizer;

    public TooltipPositionProviderImpl(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public final long mo134calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int width = ((intRect.getWidth() - i) / 2) + intRect.getLeft();
        if (width < 0) {
            width = intRect.getLeft();
        } else if (width + i > ((int) (j >> 32))) {
            width = intRect.getRight() - i;
        }
        int i2 = this.IconCompatParcelizer;
        int top = (intRect.getTop() - ((int) (j2 & 4294967295L))) - i2;
        if (top < 0) {
            top = intRect.getBottom() + i2;
        }
        return IntOffset.m3795constructorimpl((((long) top) & 4294967295L) | (((long) width) << 32));
    }
}
