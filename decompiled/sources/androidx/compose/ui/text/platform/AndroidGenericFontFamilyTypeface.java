package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface nativeTypeface;

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo3334getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        return m3335buildStyledTypefaceFO1MlWM(fontWeight, i);
    }

    /* JADX INFO: renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m3335buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i) {
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m3190equalsimpl0(i, FontStyle.Companion.m3196getItalic_LCdwA()));
    }

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        Typeface typefaceCreate = Typeface.create(genericFontFamily.getName(), 0);
        typefaceCreate.getClass();
        this.nativeTypeface = typefaceCreate;
    }
}
