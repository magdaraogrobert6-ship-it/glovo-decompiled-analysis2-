package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutlibFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;
    private final Context context;

    public LayoutlibFontResourceLoader(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @onItemDismisslambda0
    public Typeface load(Font font) {
        if (font instanceof ResourceFont) {
            return ResourceFontHelper.INSTANCE.load(this.context, (ResourceFont) font);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unknown font type: ".concat(font.getClass().getName()));
        return null;
    }
}
