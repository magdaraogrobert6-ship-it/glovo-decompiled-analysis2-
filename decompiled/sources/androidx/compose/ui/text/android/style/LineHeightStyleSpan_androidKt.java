package androidx.compose.ui.text.android.style;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public final class LineHeightStyleSpan_androidKt {
    public static final int lineHeight(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
