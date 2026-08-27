package o;

import android.content.Intent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class scheduleInvalidation {
    public static Object IconCompatParcelizer(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static final void serializer(CursorAnchorInfo.Builder builder, androidx.compose.ui.geometry.Rect rect) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRectF(rect)).setHandwritingBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRectF(rect)).build());
    }
}
