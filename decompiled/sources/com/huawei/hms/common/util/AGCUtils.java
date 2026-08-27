package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import o.accessgetMinimumFlingVelocityjd;
import o.accesssetUpdateDisplayListIfDirtyMethodcp;

/* JADX INFO: loaded from: classes2.dex */
public class AGCUtils {
    private static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), Fields.SpotShadowColor).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("cpid=") ? strValueOf.substring(5) : strValueOf;
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e);
            return "";
        }
    }

    public static String getAppId(Context context) {
        String strSerializer;
        if (context == null) {
            HMSLog.w("AGCUtils", "getAppId context is null");
            return "";
        }
        if (c(context)) {
            strSerializer = a(context, "client/app_id");
            if (!TextUtils.isEmpty(strSerializer)) {
                return strSerializer;
            }
        } else {
            strSerializer = null;
        }
        try {
            String str = accesssetUpdateDisplayListIfDirtyMethodcp.serializer;
            if (str == null) {
                str = "DEFAULT_INSTANCE";
            }
            accesssetUpdateDisplayListIfDirtyMethodcp accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer = accesssetUpdateDisplayListIfDirtyMethodcp.IconCompatParcelizer(str);
            if (accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer.write.write() != context) {
                accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer = accesssetUpdateDisplayListIfDirtyMethodcp.write(new accessgetMinimumFlingVelocityjd(context, null, new HashMap(), new ArrayList()), false);
            }
            strSerializer = accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer.write.serializer("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(strSerializer)) {
            return strSerializer;
        }
        String strA = a(context);
        return !TextUtils.isEmpty(strA) ? strA : a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        if (context == null) {
            HMSLog.w("AGCUtils", "getCpId context is null");
            return "";
        }
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        String strSerializer = null;
        try {
            String str = accesssetUpdateDisplayListIfDirtyMethodcp.serializer;
            if (str == null) {
                str = "DEFAULT_INSTANCE";
            }
            accesssetUpdateDisplayListIfDirtyMethodcp accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer = accesssetUpdateDisplayListIfDirtyMethodcp.IconCompatParcelizer(str);
            if (accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer.write.write() != context) {
                accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer = accesssetUpdateDisplayListIfDirtyMethodcp.write(new accessgetMinimumFlingVelocityjd(context, null, new HashMap(), new ArrayList()), false);
            }
            strSerializer = accesssetupdatedisplaylistifdirtymethodcpIconCompatParcelizer.write.serializer("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(strSerializer)) {
            return strSerializer;
        }
        String strB = b(context);
        return !TextUtils.isEmpty(strB) ? strB : a(context, "client/cp_id");
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    private static String a(Context context, String str) {
        String strSerializer;
        InputStream inputStreamOpen = null;
        try {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList();
                inputStreamOpen = context.getResources().getAssets().open("agconnect-services.json");
                strSerializer = new accessgetMinimumFlingVelocityjd(context, inputStreamOpen, map, arrayList).serializer(str);
            } catch (IOException e) {
                HMSLog.e("AGCUtils", "Get " + str + " failed: " + e);
                strSerializer = "";
            } catch (NullPointerException e2) {
                HMSLog.e("AGCUtils", "Get " + str + " with AGConnectServicesConfig failed: " + e2);
                strSerializer = "";
            }
            IOUtils.closeQuietly(inputStreamOpen);
            if (!TextUtils.isEmpty(strSerializer)) {
                return strSerializer;
            }
            HMSLog.e("AGCUtils", "The " + str + " is null.");
            return "";
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStreamOpen);
            throw th;
        }
    }

    private static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), Fields.SpotShadowColor).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("com.huawei.hms.client.appid")) != null) {
                String strValueOf = String.valueOf(obj);
                return strValueOf.startsWith("appid=") ? strValueOf.substring(6) : strValueOf;
            }
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (AndroidException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e);
            return "";
        }
    }
}
