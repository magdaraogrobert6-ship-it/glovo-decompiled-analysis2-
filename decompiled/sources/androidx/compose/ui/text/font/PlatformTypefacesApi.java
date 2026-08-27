package androidx.compose.ui.text.font;

import android.content.Context;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo3219createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        return m3222createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m3222createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i) {
        if (FontStyle.m3190equalsimpl0(i, FontStyle.Companion.m3197getNormal_LCdwA())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fontWeight, FontWeight.Companion.getNormal()}, getCieXyz.write())).booleanValue() && (str == null || str.length() == 0)) {
                return android.graphics.Typeface.DEFAULT;
            }
        }
        int iM3141getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m3141getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(iM3141getAndroidTypefaceStyleFO1MlWM) : android.graphics.Typeface.create(str, iM3141getAndroidTypefaceStyleFO1MlWM);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo3221optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context) {
        android.graphics.Typeface typefaceMo3220createNamedRetOiIg;
        FontFamily.Companion companion = FontFamily.Companion;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, companion.getSansSerif().getName()}, getCieXyz.write())).booleanValue()) {
            typefaceMo3220createNamedRetOiIg = mo3220createNamedRetOiIg(companion.getSansSerif(), fontWeight, i);
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, companion.getSerif().getName()}, getCieXyz.write())).booleanValue()) {
                typefaceMo3220createNamedRetOiIg = mo3220createNamedRetOiIg(companion.getSerif(), fontWeight, i);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, companion.getMonospace().getName()}, getCieXyz.write())).booleanValue()) {
                    typefaceMo3220createNamedRetOiIg = mo3220createNamedRetOiIg(companion.getMonospace(), fontWeight, i);
                } else {
                    typefaceMo3220createNamedRetOiIg = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, companion.getCursive().getName()}, getCieXyz.write())).booleanValue() ? mo3220createNamedRetOiIg(companion.getCursive(), fontWeight, i) : m3224loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i);
                }
            }
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceMo3220createNamedRetOiIg, settings, context);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo3220createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        android.graphics.Typeface typefaceM3224loadNamedFromTypefaceCacheOrNullRetOiIg = m3224loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i);
        return typefaceM3224loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m3222createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i) : typefaceM3224loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m3224loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM3222createAndroidTypefaceUsingTypefaceStyleRetOiIg = m3222createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
        Object[] objArr = {typefaceM3222createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m3141getAndroidTypefaceStyleFO1MlWM(fontWeight, i))};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {typefaceM3222createAndroidTypefaceUsingTypefaceStyleRetOiIg, m3222createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i)};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return typefaceM3222createAndroidTypefaceUsingTypefaceStyleRetOiIg;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ android.graphics.Typeface m3223createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m3197getNormal_LCdwA();
        }
        return platformTypefacesApi.m3222createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }
}
