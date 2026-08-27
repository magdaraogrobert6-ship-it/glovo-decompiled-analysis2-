package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo3142getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m3183getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i;
    }

    public int hashCode() {
        int iM3156hashCodeimpl = DeviceFontFamilyName.m3156hashCodeimpl(this.familyName);
        int iHashCode = getWeight().hashCode();
        return getVariationSettings().hashCode() + ((FontStyle.m3191hashCodeimpl(mo3142getStyle_LCdwA()) + ((iHashCode + (iM3156hashCodeimpl * 31)) * 31)) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        if (!DeviceFontFamilyName.m3155equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getWeight(), deviceFontFamilyNameFont.getWeight()}, getCieXyz.write())).booleanValue() || !FontStyle.m3190equalsimpl0(mo3142getStyle_LCdwA(), deviceFontFamilyNameFont.mo3142getStyle_LCdwA())) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings()}, getCieXyz.write())).booleanValue();
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo3221optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo3142getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m3157toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3192toStringimpl(mo3142getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fontWeight, i, settings);
    }
}
