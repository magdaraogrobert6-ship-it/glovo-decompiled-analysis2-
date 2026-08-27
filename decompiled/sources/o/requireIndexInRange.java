package o;

import java.util.IllformedLocaleException;

/* JADX INFO: loaded from: classes3.dex */
public final class requireIndexInRange {
    private static int read = 0;
    private static int serializer = 1;
    public final r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE RemoteActionCompatParcelizer;
    public final setTransactionSuccessful write;

    public requireIndexInRange(r8lambdaVSwqKAPZUGoM32l5XH3Xl8tsgCE r8lambdavswqkapzugom32l5xh3xl8tsgce, setTransactionSuccessful settransactionsuccessful) {
        r8lambdavswqkapzugom32l5xh3xl8tsgce.getClass();
        settransactionsuccessful.getClass();
        this.RemoteActionCompatParcelizer = r8lambdavswqkapzugom32l5xh3xl8tsgce;
        this.write = settransactionsuccessful;
    }

    public final String read() {
        java.util.Locale.Builder locale;
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setTransactionSuccessful settransactionsuccessful = this.write;
        String strRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            int i4 = read + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            strRemoteActionCompatParcelizer = "";
        }
        try {
            locale = new java.util.Locale.Builder().setLanguageTag(strRemoteActionCompatParcelizer);
            String country = locale.build().getCountry();
            country.getClass();
            if (country.length() == 0) {
                int i6 = serializer + 25;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    locale.setRegion(settransactionsuccessful.read().getCountry());
                    throw null;
                }
                locale.setRegion(settransactionsuccessful.read().getCountry());
            }
        } catch (IllformedLocaleException unused) {
            locale = new java.util.Locale.Builder().setLocale(settransactionsuccessful.read());
        }
        String languageTag = locale.setScript(null).build().toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }
}
