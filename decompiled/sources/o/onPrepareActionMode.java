package o;

import android.content.Context;
import android.provider.Settings;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onPrepareActionMode {
    public static final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);

    public static boolean RemoteActionCompatParcelizer(Context context) {
        try {
            int i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationUtil", "isLocationEnabled locationMode is " + i);
            if (i != 0) {
                int i2 = Settings.Secure.getInt(context.getContentResolver(), "first_open_location_switch", 1);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationUtil", "isLocationEnabled agreed is " + i2);
                if (i2 == 1) {
                    return true;
                }
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            WrappedCompositionsetContent1211.read("LocationUtil", "isLocationEnabled SettingNotFoundException");
            return false;
        }
    }

    public static String IconCompatParcelizer(Context context) {
        try {
            return context.createDeviceProtectedStorageContext().getFilesDir().getCanonicalPath();
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("LocationUtil", "getCanonicalPath is IOException");
            return null;
        }
    }
}
