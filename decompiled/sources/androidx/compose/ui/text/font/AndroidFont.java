package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ShortNewsContentCardView;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, ShortNewsContentCardView<? super android.graphics.Typeface> shortNewsContentCardView);

        android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo3134getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader) {
        this(i, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }

    @onItemDismisslambda0
    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader);
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader, settings);
    }
}
