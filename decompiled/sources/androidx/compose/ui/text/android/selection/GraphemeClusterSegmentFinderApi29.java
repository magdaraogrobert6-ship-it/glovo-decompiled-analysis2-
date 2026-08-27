package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public final class GraphemeClusterSegmentFinderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final TextPaint textPaint;

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int i) {
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int i) {
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    public GraphemeClusterSegmentFinderApi29(CharSequence charSequence, TextPaint textPaint) {
        this.text = charSequence;
        this.textPaint = textPaint;
    }
}
