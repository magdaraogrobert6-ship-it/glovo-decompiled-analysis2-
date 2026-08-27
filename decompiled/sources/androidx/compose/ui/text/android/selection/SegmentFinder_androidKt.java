package androidx.compose.ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public final class SegmentFinder_androidKt {
    public static final SegmentFinder createGraphemeClusterSegmentFinder(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new GraphemeClusterSegmentFinderApi29(charSequence, textPaint) : new GraphemeClusterSegmentFinderUnderApi29(charSequence);
    }
}
