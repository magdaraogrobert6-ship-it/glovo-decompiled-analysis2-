package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import o.dragjO51t88;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final dragjO51t88 cache = new dragjO51t88();
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    public final Typeface getOrCreate(Context context, Font font) {
        Typeface typefaceLoadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = (Typeface) cache.write(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            typefaceLoadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
        } else {
            if (!(font instanceof AndroidFont)) {
                Gson$$ExternalSyntheticBUOutline0.m(font, "Unknown font type: ");
                return null;
            }
            AndroidFont androidFont = (AndroidFont) font;
            typefaceLoadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (typefaceLoadBlocking == null) {
            Gson$$ExternalSyntheticBUOutline0.m(font, "Unable to load font ");
            return null;
        }
        if (key != null) {
            cache.RemoteActionCompatParcelizer(key, typefaceLoadBlocking);
        }
        return typefaceLoadBlocking;
    }

    private final String getKey(Context context, Font font) {
        if (!(font instanceof ResourceFont)) {
            if (font instanceof AndroidPreloadedFont) {
                return ((AndroidPreloadedFont) font).getCacheKey();
            }
            Gson$$ExternalSyntheticBUOutline0.m(font, "Unknown font type: ");
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        string.getClass();
        return "res:".concat(string);
    }
}
