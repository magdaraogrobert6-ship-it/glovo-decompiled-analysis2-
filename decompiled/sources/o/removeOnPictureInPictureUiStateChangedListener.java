package o;

import android.app.LocaleManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class removeOnPictureInPictureUiStateChangedListener {
    public static void serializer(Object obj, android.os.LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static android.os.LocaleList write(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
