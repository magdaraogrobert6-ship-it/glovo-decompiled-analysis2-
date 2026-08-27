package androidx.compose.ui.text.font;

import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, ShortNewsContentCardView<Object> shortNewsContentCardView);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
