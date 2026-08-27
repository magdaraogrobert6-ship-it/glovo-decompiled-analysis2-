package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;
    public static final AndroidLayoutApi34 INSTANCE = new AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    public final int[] getRangeForRect$ui_text(TextLayout textLayout, RectF rectF, int i, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text(new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        }
        return textLayout.getLayout().getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.AndroidLayoutApi34$$ExternalSyntheticLambda0
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return AndroidLayoutApi34.getRangeForRect$lambda$0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, rectF2, rectF3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect$lambda$0(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, RectF rectF, RectF rectF2) {
        return ((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(rectF, rectF2)).booleanValue();
    }
}
