package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* JADX INFO: loaded from: classes.dex */
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3244updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM3072getLengthimpl;
        int iM3074getMinimpl = TextRange.m3074getMinimpl(j);
        int iM3073getMaximpl = TextRange.m3073getMaximpl(j);
        if (TextRange.m3078intersects5zctL8(j2, j)) {
            if (TextRange.m3066contains5zctL8(j2, j)) {
                iM3074getMinimpl = TextRange.m3074getMinimpl(j2);
                iM3073getMaximpl = iM3074getMinimpl;
            } else {
                if (TextRange.m3066contains5zctL8(j, j2)) {
                    iM3072getLengthimpl = TextRange.m3072getLengthimpl(j2);
                } else if (TextRange.m3067containsimpl(j2, iM3074getMinimpl)) {
                    iM3074getMinimpl = TextRange.m3074getMinimpl(j2);
                    iM3072getLengthimpl = TextRange.m3072getLengthimpl(j2);
                } else {
                    iM3073getMaximpl = TextRange.m3074getMinimpl(j2);
                }
                iM3073getMaximpl -= iM3072getLengthimpl;
            }
        } else if (iM3073getMaximpl > TextRange.m3074getMinimpl(j2)) {
            iM3074getMinimpl -= TextRange.m3072getLengthimpl(j2);
            iM3072getLengthimpl = TextRange.m3072getLengthimpl(j2);
            iM3073getMaximpl -= iM3072getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3074getMinimpl, iM3073getMaximpl);
    }
}
