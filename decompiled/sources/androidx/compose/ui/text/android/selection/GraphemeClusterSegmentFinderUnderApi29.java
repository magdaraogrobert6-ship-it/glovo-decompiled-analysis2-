package androidx.compose.ui.text.android.selection;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class GraphemeClusterSegmentFinderUnderApi29 extends GraphemeClusterSegmentFinder {
    public static final int $stable = 8;
    private final BreakIterator breakIterator;
    private final CharSequence text;

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int next(int i) {
        return this.breakIterator.following(i);
    }

    @Override // androidx.compose.ui.text.android.selection.GraphemeClusterSegmentFinder
    public int previous(int i) {
        return this.breakIterator.preceding(i);
    }

    public GraphemeClusterSegmentFinderUnderApi29(CharSequence charSequence) {
        this.text = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.breakIterator = characterInstance;
    }
}
