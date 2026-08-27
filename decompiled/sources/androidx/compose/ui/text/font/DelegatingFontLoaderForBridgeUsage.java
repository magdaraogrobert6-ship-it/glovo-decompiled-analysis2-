package androidx.compose.ui.text.font;

import android.content.Context;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey = new Object();
    private final Context context;
    private final Font.ResourceLoader loader;

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }

    public final Font.ResourceLoader getLoader$ui_text() {
        return this.loader;
    }

    public DelegatingFontLoaderForBridgeUsage(Font.ResourceLoader resourceLoader, Context context) {
        this.loader = resourceLoader;
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object awaitLoad(Font font, ShortNewsContentCardView<Object> shortNewsContentCardView) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, shortNewsContentCardView);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object loadBlocking(Font font) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }
}
