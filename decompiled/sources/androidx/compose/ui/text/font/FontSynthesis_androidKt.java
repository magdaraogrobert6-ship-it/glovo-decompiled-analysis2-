package androidx.compose.ui.text.font;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FontSynthesis_androidKt {
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m3212synthesizeTypefaceFxwP2eA(int i, Object obj, Font font, FontWeight fontWeight, int i2) {
        boolean z;
        if (!(obj instanceof android.graphics.Typeface)) {
            return obj;
        }
        if (FontSynthesis.m3204isWeightOnimpl$ui_text(i)) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{font.getWeight(), fontWeight}, getCieXyz.write())).booleanValue()) {
                z = false;
            } else {
                FontWeight.Companion companion = FontWeight.Companion;
                if (fontWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) < 0 || font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) >= 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        boolean z2 = FontSynthesis.m3203isStyleOnimpl$ui_text(i) && !FontStyle.m3190equalsimpl0(i2, font.mo3142getStyle_LCdwA());
        if (z2 || z) {
            return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, z ? fontWeight.getWeight() : font.getWeight().getWeight(), z2 ? FontStyle.m3190equalsimpl0(i2, FontStyle.Companion.m3196getItalic_LCdwA()) : FontStyle.m3190equalsimpl0(font.mo3142getStyle_LCdwA(), FontStyle.Companion.m3196getItalic_LCdwA()));
        }
        return obj;
    }
}
