package o;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.view.inputmethod.CursorAnchorInfo;
import io.sentry.android.core.SentryLogcatAdapter;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class preferredFrameRate {
    public static void read(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            SentryLogcatAdapter.serializer("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static final void write(CursorAnchorInfo.Builder builder, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect) {
        if (rect.isEmpty()) {
            return;
        }
        int lineCount = textLayoutResult.getLineCount() - 1;
        if (lineCount < 0) {
            lineCount = 0;
        }
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(textLayoutResult.getLineForVerticalPosition(rect.getTop()), 0, lineCount);
        int iRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(textLayoutResult.getLineForVerticalPosition(rect.getBottom()), 0, lineCount);
        if (iRemoteActionCompatParcelizer > iRemoteActionCompatParcelizer2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(textLayoutResult.getLineLeft(iRemoteActionCompatParcelizer), textLayoutResult.getLineTop(iRemoteActionCompatParcelizer), textLayoutResult.getLineRight(iRemoteActionCompatParcelizer), textLayoutResult.getLineBottom(iRemoteActionCompatParcelizer));
            if (iRemoteActionCompatParcelizer == iRemoteActionCompatParcelizer2) {
                return;
            } else {
                iRemoteActionCompatParcelizer++;
            }
        }
    }
}
