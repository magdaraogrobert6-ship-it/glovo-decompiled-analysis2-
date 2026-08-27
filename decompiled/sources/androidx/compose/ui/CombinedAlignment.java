package androidx.compose.ui;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes4.dex */
final class CombinedAlignment implements Alignment {
    private final Alignment.Horizontal horizontal;
    private final Alignment.Vertical vertical;

    public CombinedAlignment(Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.Alignment
    /* JADX INFO: renamed from: align-KFBX0sM */
    public long mo139alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        return IntOffset.m3795constructorimpl((((long) this.horizontal.align((int) (j >> 32), (int) (j2 >> 32), layoutDirection)) << 32) | (((long) this.vertical.align((int) (j & 4294967295L), (int) (j2 & 4294967295L))) & 4294967295L));
    }
}
