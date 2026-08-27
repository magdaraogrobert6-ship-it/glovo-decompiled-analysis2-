package o;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class addMenuItemui {
    public static String read() {
        String networkOperator;
        try {
            if (Settings.Global.getInt(placeAtf8xVGno.read().getApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                WrappedCompositionsetContent1211.read();
                return write();
            }
            Object systemService = placeAtf8xVGno.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("phone");
            if (systemService == null) {
                WrappedCompositionsetContent1211.read();
                return write();
            }
            String str = null;
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null) {
                WrappedCompositionsetContent1211.read();
                return write();
            }
            if (telephonyManager.getPhoneType() == 2) {
                if (telephonyManager.getSimState() == 5 && !telephonyManager.isNetworkRoaming()) {
                    networkOperator = telephonyManager.getSimOperator();
                }
                return (str != null || str.length() < 3) ? write() : str.substring(0, 3);
            }
            networkOperator = telephonyManager.getNetworkOperator();
            str = networkOperator;
            if (str != null) {
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static String write() {
        String str;
        if (onActionItemClicked.write(placeAtf8xVGno.read()) != 8) {
            return "";
        }
        String strSerializer = onChange.serializer(GrsBaseInfo.CountryCodeSource.UNKNOWN, com.huawei.hms.location.BuildConfig.LIBRARY_PACKAGE_NAME, "ROOT");
        if (TextUtils.isEmpty(strSerializer)) {
            str = "getCarMcc--getLocationIPAddress--host is empty";
        } else {
            if (strSerializer.contains("cn")) {
                return "460";
            }
            str = "getCarMcc--host is empty";
        }
        WrappedCompositionsetContent1211.write("TelephonyUtil", str);
        return "";
    }

    public static String read(String str) {
        return (TextUtils.isEmpty(str) || str.length() != 2) ? "" : str;
    }

    public static boolean read(Context context) {
        try {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            if (systemService instanceof WifiManager) {
                return ((WifiManager) systemService).isScanAlwaysAvailable();
            }
            return false;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("TelephonyUtil", "isWLANScan error, system exception");
            return false;
        }
    }
}
