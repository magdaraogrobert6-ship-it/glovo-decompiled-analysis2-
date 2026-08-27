package o;

import android.location.Location;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class dispatchRotaryEvent {
    public static boolean read(Location location) {
        return location.isMock();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public static final boolean IconCompatParcelizer() {
        String lowerCase;
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        java.util.Locale locale = java.util.Locale.ROOT;
        String lowerCase2 = str.toLowerCase(locale);
        lowerCase2.getClass();
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(lowerCase2, "ums", false)) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase("Itel")) {
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(lowerCase, "sp", false)) {
                return true;
            }
        } else {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Itel")) {
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(lowerCase, "sp", false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
