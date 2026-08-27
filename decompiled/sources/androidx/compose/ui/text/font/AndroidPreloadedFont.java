package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable = 0;
    private boolean didInitWithContext;
    private final int style;
    private android.graphics.Typeface typeface;
    private final FontWeight weight;

    public abstract android.graphics.Typeface doLoad$ui_text(Context context);

    public abstract String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo3142getStyle_LCdwA() {
        return this.style;
    }

    public final android.graphics.Typeface getTypeface$ui_text() {
        return this.typeface;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final FontWeight getWeight() {
        return this.weight;
    }

    public final void setTypeface$ui_text(android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }

    private AndroidPreloadedFont(FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m3182getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i;
    }

    public final android.graphics.Typeface loadCached$ui_text(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i, settings);
    }
}
