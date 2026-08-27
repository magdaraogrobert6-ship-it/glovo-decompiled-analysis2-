package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;
    private final Context context;

    public AndroidFontResourceLoader(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @onItemDismisslambda0
    public Typeface load(Font font) {
        if (font instanceof ResourceFont) {
            return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
        }
        Gson$$ExternalSyntheticBUOutline0.m(font, "Unknown font type: ");
        return null;
    }
}
