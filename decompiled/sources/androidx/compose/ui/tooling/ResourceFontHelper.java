package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.ResourceFont;

/* JADX INFO: loaded from: classes4.dex */
final class ResourceFontHelper {
    public static final ResourceFontHelper INSTANCE = new ResourceFontHelper();

    private ResourceFontHelper() {
    }

    public final Typeface load(Context context, ResourceFont resourceFont) {
        return context.getResources().getFont(resourceFont.getResId());
    }
}
