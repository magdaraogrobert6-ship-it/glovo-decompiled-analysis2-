package androidx.compose.ui.text.font;

import android.content.Context;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @onItemDismisslambda0
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader, Context context) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    @onItemDismisslambda0
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
