package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getButtonR2EK5gGoQ {
    public static String RemoteActionCompatParcelizer;

    static {
        new HashMap();
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?".concat(String.valueOf(str))).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public static String IconCompatParcelizer(Context context, String str) {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (getButtonR2EK5gGoQ.class) {
                if (RemoteActionCompatParcelizer == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        RemoteActionCompatParcelizer = sharedPreferences.getString(com.adjust.sdk.Constants.REFERRER, "");
                    } else {
                        RemoteActionCompatParcelizer = "";
                    }
                }
            }
        }
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer, str);
    }
}
