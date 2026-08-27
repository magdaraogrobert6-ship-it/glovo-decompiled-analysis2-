package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getHandwritingGestureLineMargin {
    public static final toZui_graphics read = new toZui_graphics("CommonUtils", "");

    public static String write(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            toZui_graphics tozui_graphics = read;
            if (!Log.isLoggable(tozui_graphics.serializer, 6)) {
                return "";
            }
            SentryLogcatAdapter.serializer("CommonUtils", tozui_graphics.read(strConcat));
            return "";
        }
    }
}
