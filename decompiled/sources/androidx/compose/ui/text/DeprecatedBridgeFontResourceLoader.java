package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onItemDismisslambda0;
import o.onRemeasuredozmzZPI;

/* JADX INFO: loaded from: classes4.dex */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = new Companion(null);
    private static onRemeasuredozmzZPI cache = new onRemeasuredozmzZPI();
    private static final SynchronizedObject lock = new SynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @onItemDismisslambda0
    public Object load(Font font) {
        return FontFamily.Resolver.m3161resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo3142getStyle_LCdwA(), 0, 8, null).getValue();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final onRemeasuredozmzZPI getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(onRemeasuredozmzZPI onremeasuredozmzzpi) {
            DeprecatedBridgeFontResourceLoader.cache = onremeasuredozmzzpi;
        }

        private Companion() {
        }

        public final Font.ResourceLoader from(FontFamily.Resolver resolver) {
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = (Font.ResourceLoader) companion.getCache().MediaBrowserCompatMediaItem(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, null);
                companion.getCache().write(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver);
    }
}
