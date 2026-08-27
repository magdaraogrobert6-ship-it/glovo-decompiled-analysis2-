package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;

/* JADX INFO: loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m3065constructorimpl(packWithCheck(i, i2));
    }

    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m3083substringFDrldGo(CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m3074getMinimpl(j), TextRange.m3073getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    /* JADX INFO: renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m3082coerceIn8ffj60Q(long j, int i, int i2) {
        int iM3076getStartimpl = TextRange.m3076getStartimpl(j);
        if (iM3076getStartimpl < i) {
            iM3076getStartimpl = i;
        }
        if (iM3076getStartimpl > i2) {
            iM3076getStartimpl = i2;
        }
        int iM3071getEndimpl = TextRange.m3071getEndimpl(j);
        if (iM3071getEndimpl >= i) {
            i = iM3071getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (iM3076getStartimpl == TextRange.m3076getStartimpl(j) && i2 == TextRange.m3071getEndimpl(j)) ? j : TextRange(iM3076getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (i < 0 || i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }
}
