package com.huawei.location.lite.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.huawei.android.os.BuildEx;
import com.huawei.android.telephony.ServiceStateEx;
import com.huawei.hms.framework.common.EmuiUtil;
import o.WrappedCompositionsetContent1211;
import o.getTitleResource;
import o.onActionItemClicked;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NetworkUtil {
    public static boolean RemoteActionCompatParcelizer(Context context) {
        NetworkInfo activeNetworkInfo;
        if (!getTitleResource.read(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) read(context, "connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (RuntimeException unused) {
                WrappedCompositionsetContent1211.read();
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static int write(Context context) {
        NetworkInfo activeNetworkInfo;
        int i;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) read(context, "connectivity");
            if (connectivityManager != null) {
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (RuntimeException unused) {
                    WrappedCompositionsetContent1211.read();
                    activeNetworkInfo = null;
                }
            } else {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return -1;
            }
            int type = activeNetworkInfo.getType();
            int i2 = 1;
            if (1 != type && 13 != type && (onActionItemClicked.write(context) != 8 || 9 != type)) {
                i2 = 0;
                if (type == 0) {
                    int hwNetworkType = getHwNetworkType(context);
                    WrappedCompositionsetContent1211.read();
                    if (hwNetworkType == 0) {
                        hwNetworkType = activeNetworkInfo.getSubtype();
                    }
                    if (hwNetworkType != 20) {
                        switch (hwNetworkType) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                i = 2;
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                i = 3;
                                break;
                            case 13:
                                i = 4;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    } else {
                        i = 5;
                    }
                    if (i != 0) {
                        return i;
                    }
                    if (hwNetworkType == 16) {
                        return 2;
                    }
                    if (hwNetworkType == 17) {
                        return 3;
                    }
                }
            }
            return i2;
        } catch (Exception unused2) {
            WrappedCompositionsetContent1211.read("NetworkUtil", "getNetworkType exception");
            return -1;
        }
    }

    public static int getHwNetworkType(Context context) {
        ServiceState serviceState;
        try {
            ClassLoader classLoader = ReflectionUtils.class.getClassLoader();
            if (classLoader != null) {
                classLoader.loadClass(EmuiUtil.BUILDEX_VERSION);
                TelephonyManager telephonyManager = (TelephonyManager) read(context, "phone");
                if (telephonyManager == null) {
                    return 0;
                }
                try {
                    if (BuildEx.VERSION.EMUI_SDK_INT < 21 || (serviceState = telephonyManager.getServiceState()) == null) {
                        return 0;
                    }
                    return ServiceStateEx.getConfigRadioTechnology(serviceState);
                } catch (NoClassDefFoundError | NoSuchMethodError | SecurityException unused) {
                    WrappedCompositionsetContent1211.read();
                    return 0;
                }
            }
            throw new ClassNotFoundException("not found classloader");
        } catch (Exception unused2) {
            WrappedCompositionsetContent1211.write("ReflectionUtils", "com.huawei.android.os.BuildEx$VERSIONClassNotFoundException");
            return 0;
        }
    }

    public static Object read(Context context, String str) {
        try {
            return context.getSystemService(str);
        } catch (RuntimeException e) {
            WrappedCompositionsetContent1211.write("NetworkUtil", "SystemServer error:", e);
            return null;
        }
    }
}
