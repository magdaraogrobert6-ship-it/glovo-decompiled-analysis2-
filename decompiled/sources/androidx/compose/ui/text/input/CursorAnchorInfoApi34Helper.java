package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
final class CursorAnchorInfoApi34Helper {
    public static final CursorAnchorInfoApi34Helper INSTANCE = new CursorAnchorInfoApi34Helper();

    private CursorAnchorInfoApi34Helper() {
    }

    public static final CursorAnchorInfo.Builder addVisibleLineBounds(CursorAnchorInfo.Builder builder, TextLayoutResult textLayoutResult, Rect rect) {
        if (!rect.isEmpty()) {
            int lineCount = textLayoutResult.getLineCount() - 1;
            if (lineCount < 0) {
                lineCount = 0;
            }
            int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(textLayoutResult.getLineForVerticalPosition(rect.getTop()), 0, lineCount);
            int iRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(textLayoutResult.getLineForVerticalPosition(rect.getBottom()), 0, lineCount);
            if (iRemoteActionCompatParcelizer <= iRemoteActionCompatParcelizer2) {
                while (true) {
                    builder.addVisibleLineBounds(textLayoutResult.getLineLeft(iRemoteActionCompatParcelizer), textLayoutResult.getLineTop(iRemoteActionCompatParcelizer), textLayoutResult.getLineRight(iRemoteActionCompatParcelizer), textLayoutResult.getLineBottom(iRemoteActionCompatParcelizer));
                    if (iRemoteActionCompatParcelizer == iRemoteActionCompatParcelizer2) {
                        break;
                    }
                    iRemoteActionCompatParcelizer++;
                }
            }
        }
        return builder;
    }
}
