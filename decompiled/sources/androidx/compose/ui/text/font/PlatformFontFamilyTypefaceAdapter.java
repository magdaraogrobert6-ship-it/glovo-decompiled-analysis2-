package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.AndroidTypeface;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        android.graphics.Typeface typefaceMo3219createDefaultFO1MlWM;
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            typefaceMo3219createDefaultFO1MlWM = this.platformTypefaceResolver.mo3219createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo3219createDefaultFO1MlWM = this.platformTypefaceResolver.mo3220createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            typeface.getClass();
            typefaceMo3219createDefaultFO1MlWM = ((AndroidTypeface) typeface).mo3334getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m3237getFontStyle_LCdwA(), typefaceRequest.m3238getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo3219createDefaultFO1MlWM, false, 2, null);
    }
}
