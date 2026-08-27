package androidx.compose.ui.text.font;

import java.util.List;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes.dex */
public final class FontFamilyKt {
    public static final FontFamily FontFamily(Font... fontArr) {
        return new FontListFontFamily(onContentCardClicked.read(fontArr));
    }

    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
