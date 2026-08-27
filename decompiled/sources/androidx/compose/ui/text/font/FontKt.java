package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class FontKt {
    @onItemDismisslambda0
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m3168FontRetOiIg(int i, FontWeight fontWeight, int i2) {
        return new ResourceFont(i, fontWeight, i2, null, FontLoadingStrategy.Companion.m3182getBlockingPKNRLFQ(), 8, null);
    }

    /* JADX INFO: renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m3167FontF3nL8kk$default(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m3182getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = FontVariation.INSTANCE.m3213Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m3166FontF3nL8kk(i, fontWeight, i2, i3, settings);
    }

    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m3169FontRetOiIg$default(int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        return m3168FontRetOiIg(i, fontWeight, i2);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m3171FontYpTlLL0$default(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m3182getBlockingPKNRLFQ();
        }
        return m3170FontYpTlLL0(i, fontWeight, i2, i3);
    }

    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m3170FontYpTlLL0(int i, FontWeight fontWeight, int i2, int i3) {
        return new ResourceFont(i, fontWeight, i2, new FontVariation.Settings(new FontVariation.Setting[0]), i3, null);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m3166FontF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        return new ResourceFont(i, fontWeight, i2, settings, i3, null);
    }
}
