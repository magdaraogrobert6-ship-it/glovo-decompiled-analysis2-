package o;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPictureInPictureParams {
    public static void IconCompatParcelizer(Configuration configuration, hasNonInteropFocusableContent hasnoninteropfocusablecontent) {
        configuration.setLocales(android.os.LocaleList.forLanguageTags(hasnoninteropfocusablecontent.read.RemoteActionCompatParcelizer.toLanguageTags()));
    }

    public static void serializer(hasNonInteropFocusableContent hasnoninteropfocusablecontent) {
        android.os.LocaleList.setDefault(android.os.LocaleList.forLanguageTags(hasnoninteropfocusablecontent.read.RemoteActionCompatParcelizer.toLanguageTags()));
    }

    public static hasNonInteropFocusableContent IconCompatParcelizer(Configuration configuration) {
        return hasNonInteropFocusableContent.RemoteActionCompatParcelizer(configuration.getLocales().toLanguageTags());
    }

    public static void read(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        android.os.LocaleList locales = configuration.getLocales();
        android.os.LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }
}
