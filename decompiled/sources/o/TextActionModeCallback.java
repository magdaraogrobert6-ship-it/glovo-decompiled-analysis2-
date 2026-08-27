package o;

import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TextActionModeCallback {
    public static String IconCompatParcelizer = "UNKNOWN";
    public static long RemoteActionCompatParcelizer = -1;

    /* JADX WARN: Code duplicated, block: B:25:0x0052 A[Catch: Exception -> 0x0074, TryCatch #2 {Exception -> 0x0074, blocks: (B:6:0x0021, B:8:0x0030, B:22:0x004c, B:25:0x0052, B:28:0x005f, B:30:0x0063, B:32:0x006b), top: B:67:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b A[Catch: Exception -> 0x0074, TRY_LEAVE, TryCatch #2 {Exception -> 0x0074, blocks: (B:6:0x0021, B:8:0x0030, B:22:0x004c, B:25:0x0052, B:28:0x005f, B:30:0x0063, B:32:0x006b), top: B:67:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0079, please report this as an issue */
    public static String RemoteActionCompatParcelizer() {
        String str;
        Object systemService;
        String str2 = "";
        boolean z = false;
        int i = Settings.Global.getInt(placeAtf8xVGno.read().getApplicationContext().getContentResolver(), "airplane_mode_on", 0);
        String str3 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (i != 0) {
            WrappedCompositionsetContent1211.read();
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        try {
            Object systemService2 = placeAtf8xVGno.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("phone");
            if (systemService2 instanceof TelephonyManager) {
                int simState = ((TelephonyManager) systemService2).getSimState();
                if (simState == 0 || simState == 1 || simState == 2 || simState == 3 || simState == 6 || simState == 7 || simState == 8) {
                    z = true;
                }
                WrappedCompositionsetContent1211.read();
                if (!z) {
                    systemService = placeAtf8xVGno.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("phone");
                    if (systemService != null) {
                        TelephonyManager telephonyManager = (TelephonyManager) systemService;
                        str = telephonyManager.getPhoneType() != 2 ? addMenuItemui.read(telephonyManager.getNetworkCountryIso()) : "";
                    }
                }
            } else {
                systemService = placeAtf8xVGno.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("phone");
                if (systemService != null && (systemService instanceof TelephonyManager)) {
                    TelephonyManager telephonyManager2 = (TelephonyManager) systemService;
                    if (telephonyManager2.getPhoneType() != 2) {
                    }
                }
            }
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer("TelephonyUtil", "getNetworkCountryCode exception");
        }
        if (TextUtils.isEmpty(str)) {
            try {
                Object systemService3 = placeAtf8xVGno.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("phone");
                if (!(systemService3 instanceof TelephonyManager) || !((TelephonyManager) systemService3).isNetworkRoaming()) {
                    try {
                        Object systemService4 = placeAtf8xVGno.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("phone");
                        if (systemService4 instanceof TelephonyManager) {
                            TelephonyManager telephonyManager3 = (TelephonyManager) systemService4;
                            str2 = addMenuItemui.read(telephonyManager3.getSimState() == 5 ? telephonyManager3.getSimCountryIso() : null);
                        }
                    } catch (Exception unused2) {
                        WrappedCompositionsetContent1211.serializer("TelephonyUtil", "getSimCountryCode exception");
                    }
                    str = str2;
                }
            } catch (Exception unused3) {
                WrappedCompositionsetContent1211.serializer("TelephonyUtil", "isSimRoaming exception");
            }
        }
        if (TextUtils.isEmpty(str)) {
            WrappedCompositionsetContent1211.read();
        } else {
            str3 = str;
        }
        if (write(str3)) {
            IconCompatParcelizer = str3;
            RemoteActionCompatParcelizer = SystemClock.elapsedRealtimeNanos();
        }
        return str3;
    }

    public static boolean write(String str) {
        return (TextUtils.isEmpty(str) || GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) ? false : true;
    }
}
