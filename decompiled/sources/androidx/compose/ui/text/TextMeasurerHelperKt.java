package androidx.compose.ui.text;

import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;

/* JADX INFO: loaded from: classes.dex */
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 8;

    public static final TextMeasurer rememberTextMeasurer(int i, getBirthDateFull getbirthdatefull, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = DefaultCacheSize;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        FontFamily.Resolver resolver = (FontFamily.Resolver) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
        boolean z2 = getpostalcode.read(resolver);
        boolean z3 = getpostalcode.read(density);
        boolean z4 = getpostalcode.read(layoutDirection.ordinal());
        if ((((i2 & 14) ^ 6) <= 4 || !getpostalcode.read(i)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((z | z2 | z3 | z4) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new TextMeasurer(resolver, density, layoutDirection, i);
            getpostalcode.write(objComponentActivity);
        }
        return (TextMeasurer) objComponentActivity;
    }
}
