package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.InternalTextApi;
import o.TextAnnouncementContentCardView;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), textAnnouncementContentCardView), null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalTextApi
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0), null, 18, null);
    }

    /* JADX INFO: renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final onViewAttachedToWindow m3164resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        onViewAttachedToWindow onviewattachedtowindowMo3162resolveDPcqOEQ = resolver.mo3162resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        onviewattachedtowindowMo3162resolveDPcqOEQ.getClass();
        return onviewattachedtowindowMo3162resolveDPcqOEQ;
    }

    /* JADX INFO: renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ onViewAttachedToWindow m3165resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            fontFamily = null;
        }
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.Companion.m3207getAllGVVA2EU();
        }
        return m3164resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i, i2);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }
}
