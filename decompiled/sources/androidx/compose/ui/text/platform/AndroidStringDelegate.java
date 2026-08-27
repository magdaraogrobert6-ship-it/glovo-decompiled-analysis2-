package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toLowerCase(String str, Locale locale) {
        String lowerCase = str.toLowerCase(locale.getPlatformLocale());
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toUpperCase(String str, Locale locale) {
        String upperCase = str.toUpperCase(locale.getPlatformLocale());
        upperCase.getClass();
        return upperCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String capitalize(String str, Locale locale) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            java.util.Locale platformLocale = locale.getPlatformLocale();
            platformLocale.getClass();
            String strValueOf2 = String.valueOf(cCharAt);
            strValueOf2.getClass();
            strValueOf = strValueOf2.toUpperCase(platformLocale);
            strValueOf.getClass();
            if (strValueOf.length() <= 1) {
                String strValueOf3 = String.valueOf(cCharAt);
                strValueOf3.getClass();
                String upperCase = strValueOf3.toUpperCase(java.util.Locale.ROOT);
                upperCase.getClass();
                if (strValueOf.equals(upperCase)) {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String lowerCase = strValueOf.substring(1).toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String decapitalize(String str, Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        java.util.Locale platformLocale = locale.getPlatformLocale();
        platformLocale.getClass();
        String strValueOf = String.valueOf(cCharAt);
        strValueOf.getClass();
        String lowerCase = strValueOf.toLowerCase(platformLocale);
        lowerCase.getClass();
        sb.append((Object) lowerCase);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
