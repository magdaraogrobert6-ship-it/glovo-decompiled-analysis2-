package o;

import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class setContentView {
    public static String read(java.util.Locale locale) {
        return locale.toLanguageTag();
    }

    public static boolean read(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }
}
