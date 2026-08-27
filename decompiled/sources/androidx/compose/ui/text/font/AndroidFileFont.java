package androidx.compose.ui.text.font;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidFileFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final String cacheKey;
    private final File file;

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final File getFile() {
        return this.file;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text(Context context) {
        return TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings());
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m3197getNormal_LCdwA() : i, settings, null);
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3192toStringimpl(mo3142getStyle_LCdwA())) + ')';
    }

    private AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(fontWeight, i, settings, null);
        this.file = file;
        setTypeface$ui_text(doLoad$ui_text(null));
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, fontWeight, i, settings);
    }
}
