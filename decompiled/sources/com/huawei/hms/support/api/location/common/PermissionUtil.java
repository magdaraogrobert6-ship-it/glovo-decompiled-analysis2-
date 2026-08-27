package com.huawei.hms.support.api.location.common;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionUtil {
    private static final String TAG = "PermissionUtil";

    private static boolean isImportanceForeground(int i) {
        return i <= 125;
    }

    public static boolean isPermissionAvailable(Context context, String str) {
        return checkSelfPermission(context, str);
    }

    public static boolean isGeofencePermissionAvailable(Context context) {
        if (!checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return true;
        }
        return checkSelfPermission(context, LocationConstant.BACKGROUND_PERMISSION);
    }

    public static boolean isLocationPermissionAvailable(Context context) {
        String str;
        if (!checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") && !checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            str = "checkSelfPermission is false";
        } else {
            if (Build.VERSION.SDK_INT <= 28 || !isAppIsInBackground(context) || checkSelfPermission(context, LocationConstant.BACKGROUND_PERMISSION)) {
                return true;
            }
            str = "App is in background , but BackgroundPermission is false";
        }
        HMSLog.i(TAG, str);
        return false;
    }

    public static boolean canAccessMockLocation(String str, Context context) {
        String str2;
        try {
            Object systemService = context.getSystemService("appops");
            if (systemService instanceof AppOpsManager) {
                return ((AppOpsManager) systemService).noteOp("android:mock_location", Process.myUid(), str) == 0;
            }
            HMSLog.i(TAG, "canCallerAccessMockLocation ,no AppOpsManager ");
            return false;
        } catch (SecurityException unused) {
            str2 = "canCallerAccessMockLocation ,SecurityException ";
            HMSLog.i(TAG, str2);
            return false;
        } catch (Exception unused2) {
            str2 = "canCallerAccessMockLocation ,Exception ";
            HMSLog.i(TAG, str2);
            return false;
        }
    }

    public static boolean isAppIsInBackground(Context context) {
        String str;
        if (context == null) {
            str = "context is null";
        } else {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                str = "managerResult is not a instance of ActivityManager";
            } else {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    str = "runningProcesses is null";
                } else {
                    boolean z = true;
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (isImportanceForeground(runningAppProcessInfo.importance)) {
                            for (String str2 : runningAppProcessInfo.pkgList) {
                                if (str2.equals(context.getPackageName())) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                    }
                    return z;
                }
            }
        }
        HMSLog.e(TAG, str);
        return false;
    }

    private static boolean checkSelfPermission(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        }
        HMSLog.i(TAG, "permission is null");
        return false;
    }
}
