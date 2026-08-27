package o;

import android.os.SystemClock;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.commonkit.config.Config;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.location.lite.common.adapter.CountryCodeAdapter;
import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onChange {
    public static String serializer(String str, String str2, String str3) {
        String string;
        if (Integer.parseInt("100") == 100) {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            if (TextUtils.equals(str2, "SITEROUTE") || TextUtils.equals(str2, "HIANALYTICROUTE")) {
                grsBaseInfo.setIssueCountry(str.toUpperCase(java.util.Locale.ROOT));
            } else {
                grsBaseInfo.setSerCountry(str.toUpperCase(java.util.Locale.ROOT));
            }
            string = new GrsClient(placeAtf8xVGno.read(), grsBaseInfo).synGetGrsUrl(str2, str3);
        } else {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("grs://", str2, "/", str3, "?issueCountry=");
            c8$$ExternalSyntheticOutline0.m(sbM, str, "&serCountry=", str, "&regCountry=");
            sbM.append(str);
            string = Config.getString("GRS", sbM.toString());
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("getGrsHostAddress serviceName:", str2, ", host:", string, ", addressesKey:");
        sbM2.append(str3);
        sbM2.append(", countryCode:");
        sbM2.append(str);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationNlpGrsHelper", sbM2.toString());
        return string;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public static /* synthetic */ String write(String str, String str2, String str3) {
        String strIconCompatParcelizer;
        str.getClass();
        switch (str) {
            case "SITEROUTE":
            case "HIGEOROUTE":
                strIconCompatParcelizer = IconCompatParcelizer(str2, com.huawei.hms.location.BuildConfig.LIBRARY_PACKAGE_NAME, str);
                break;
            case "HIANALYTICROUTE":
            case "LOGSERVERROUTE":
            case "MAPROUTE":
            case "AGREEMENTROUTE":
                strIconCompatParcelizer = IconCompatParcelizer(str2, "com.huawei.location.extService", str);
                break;
            case "com.huawei.hms.oobe":
                java.util.Locale locale = java.util.Locale.ENGLISH;
                strIconCompatParcelizer = Config.getString("GRS", ff$$ExternalSyntheticOutline0.m("grs://", str, "/ROOT"));
                break;
            default:
                strIconCompatParcelizer = IconCompatParcelizer(str2, str, str3);
                break;
        }
        if (TextUtils.isEmpty(strIconCompatParcelizer) && str.equals("LOGSERVERROUTE") && onActionItemClicked.write(placeAtf8xVGno.read()) == 8) {
            WrappedCompositionsetContent1211.read();
            if ("460".equals(addMenuItemui.read())) {
                return IconCompatParcelizer("CN", "com.huawei.location.extService", str);
            }
        }
        return strIconCompatParcelizer;
    }

    public static String IconCompatParcelizer(String str, String str2, String str3) {
        String str4;
        String str5 = "";
        String strSerializer = serializer(str, str2, str3);
        if (!TextUtils.isEmpty(strSerializer)) {
            return strSerializer;
        }
        String str6 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (!TextUtils.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN, str) || CountryCodeAdapter.isCountryCodeSet()) {
            return null;
        }
        if (!TextActionModeCallback.write(TextActionModeCallback.IconCompatParcelizer) || SystemClock.elapsedRealtimeNanos() - TextActionModeCallback.RemoteActionCompatParcelizer >= 1200000000000L) {
            try {
                String str7 = SystemPropertiesUtil.get("ro.hw.country", GrsBaseInfo.CountryCodeSource.UNKNOWN);
                str4 = ("eu".equalsIgnoreCase(str7) || "la".equalsIgnoreCase(str7)) ? "" : addMenuItemui.read(str7);
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.serializer("TelephonyUtil", "getVendorCountryCode exception");
            }
            if (TextActionModeCallback.write(str4)) {
                WrappedCompositionsetContent1211.read();
                str6 = str4;
            } else {
                try {
                    str5 = addMenuItemui.read(java.util.Locale.getDefault().getCountry());
                } catch (Exception unused2) {
                    WrappedCompositionsetContent1211.serializer("TelephonyUtil", "getLocalCountryCode exception");
                }
                if (TextActionModeCallback.write(str5)) {
                    WrappedCompositionsetContent1211.read();
                    str6 = str5;
                } else {
                    WrappedCompositionsetContent1211.write("CountryCodeUtil", "getFinalCountryCode, fail to get countryCode");
                }
            }
        } else {
            str6 = TextActionModeCallback.IconCompatParcelizer;
        }
        return serializer(str6.toUpperCase(java.util.Locale.ROOT), str2, str3);
    }

    public static String RemoteActionCompatParcelizer(String str, String str2, String str3) {
        String str4;
        String str5;
        if (CountryCodeAdapter.isCountryCodeSet()) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("use app countryCode, before: ", str, ", after: ");
            sbM.append(CountryCodeAdapter.getCountryCode());
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationNlpGrsHelper", sbM.toString());
            str = CountryCodeAdapter.getCountryCode();
        }
        FutureTask futureTask = new FutureTask(new WrappedComposition(str2, str, str3, 0));
        try {
            futureTask.run();
            str5 = (String) futureTask.get(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            str4 = "getGrsHostAddress future interr error";
            WrappedCompositionsetContent1211.read("LocationNlpGrsHelper", str4);
            str5 = null;
        } catch (ExecutionException unused2) {
            str4 = "getGrsHostAddress future exec error";
            WrappedCompositionsetContent1211.read("LocationNlpGrsHelper", str4);
            str5 = null;
        } catch (TimeoutException unused3) {
            str4 = "getGrsHostAddress future timeOut error";
            WrappedCompositionsetContent1211.read("LocationNlpGrsHelper", str4);
            str5 = null;
        }
        WrappedCompositionsetContent1211.read();
        return str5;
    }

    public static String IconCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer(TextActionModeCallback.RemoteActionCompatParcelizer(), str, "ROOT");
    }
}
