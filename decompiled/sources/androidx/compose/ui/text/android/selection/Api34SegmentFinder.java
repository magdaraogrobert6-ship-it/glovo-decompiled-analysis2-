package androidx.compose.ui.text.android.selection;

/* JADX INFO: loaded from: classes4.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text(final SegmentFinder segmentFinder) {
        return new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int i) {
                return segmentFinder.nextEndBoundary(i);
            }

            public int nextStartBoundary(int i) {
                return segmentFinder.nextStartBoundary(i);
            }

            public int previousEndBoundary(int i) {
                return segmentFinder.previousEndBoundary(i);
            }

            public int previousStartBoundary(int i) {
                return segmentFinder.previousStartBoundary(i);
            }
        };
    }
}
