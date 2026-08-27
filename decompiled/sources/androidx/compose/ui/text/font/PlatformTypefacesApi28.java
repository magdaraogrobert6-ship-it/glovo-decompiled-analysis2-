package androidx.compose.ui.text.font;

import android.content.Context;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo3219createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        return m3225createAndroidTypefaceApi28RetOiIg(null, fontWeight, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m3225createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m3190equalsimpl0(i, companion.m3197getNormal_LCdwA())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fontWeight, FontWeight.Companion.getNormal()}, getCieXyz.write())).booleanValue() && (str == null || str.length() == 0)) {
                return android.graphics.Typeface.DEFAULT;
            }
        }
        return android.graphics.Typeface.create(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), fontWeight.getWeight(), FontStyle.m3190equalsimpl0(i, companion.m3196getItalic_LCdwA()));
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
                    typefaceMo3220createNamedRetOiIg = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, companion.getCursive().getName()}, getCieXyz.write())).booleanValue() ? mo3220createNamedRetOiIg(companion.getCursive(), fontWeight, i) : m3227loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i);
                }
            }
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceMo3220createNamedRetOiIg, settings, context);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo3220createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        return m3225createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ android.graphics.Typeface m3226createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m3225createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m3227loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM3225createAndroidTypefaceApi28RetOiIg = m3225createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
        Object[] objArr = {typefaceM3225createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m3190equalsimpl0(i, FontStyle.Companion.m3196getItalic_LCdwA()))};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {typefaceM3225createAndroidTypefaceApi28RetOiIg, m3225createAndroidTypefaceApi28RetOiIg(null, fontWeight, i)};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return typefaceM3225createAndroidTypefaceApi28RetOiIg;
            }
        }
        return null;
    }
}
