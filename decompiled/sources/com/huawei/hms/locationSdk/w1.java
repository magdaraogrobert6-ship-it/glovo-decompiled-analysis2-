package com.huawei.hms.locationSdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LogConfig;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.File;
import java.util.Calendar;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.calculateIfHorizontallyStacked;
import o.getClipEntry;
import o.getTitleResource;
import o.placeAtf8xVGno;
import o.toAccessibilityCollectionItemInfo;

/* JADX INFO: loaded from: classes2.dex */
public class w1 {
    public static boolean b() {
        return false;
    }

    public static void b(Context context, String str, String str2) throws ApiException {
        if (TextUtils.isEmpty(str)) {
            throw new ApiException(new Status(LocationStatusCode.ARGUMENTS_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.ARGUMENTS_EMPTY)));
        }
        if (a(str)) {
            throw new ApiException(new Status(10101, LocationStatusCode.getStatusCodeString(10101)));
        }
        File file = new File(str);
        try {
            if (file.exists()) {
                return;
            }
            if (file.mkdirs()) {
                HMSLocationLog.i("WriteLocationResultUtil", str2, "createFolder success");
            } else {
                HMSLocationLog.e("WriteLocationResultUtil", str2, "createFolder fail");
                throw new ApiException(new Status(10101, LocationStatusCode.getStatusCodeString(10101)));
            }
        } catch (SecurityException e) {
            HMSLocationLog.e("WriteLocationResultUtil", str2, "createFolder SecurityException:" + e.getMessage());
        }
    }

    public static String a(String str, LocationResult locationResult) {
        StringBuilder sb = new StringBuilder("\t");
        c8$$ExternalSyntheticOutline0.m(sb, a(), ",", str, ",");
        Location location = locationResult.getLocations().get(0);
        if (location != null) {
            sb.append(location.getProvider());
            sb.append(",\t");
            sb.append(location.getLatitude());
            sb.append(",\t");
            sb.append(location.getLongitude());
            sb.append(",");
            sb.append(location.getAccuracy());
            sb.append(",\t");
            sb.append(location.getTime());
            sb.append(",");
            sb.append(location.getSpeed());
            sb.append(",");
            Bundle extras = location.getExtras();
            getClipEntry getclipentry = new getClipEntry(extras, 1);
            if (extras != null) {
                sb.append(getclipentry.RatingCompat("session_id"));
                sb.append(",");
                int iWrite = getclipentry.write(Constant.LOCATION_SOURCE_TYPE, Integer.MIN_VALUE);
                if (iWrite == Integer.MIN_VALUE) {
                    sb.append("null");
                } else {
                    sb.append(iWrite);
                }
                sb.append(",");
                sb.append(getclipentry.RatingCompat("locateType"));
                sb.append(",");
                sb.append(getclipentry.write("vendorType", 0));
                sb.append(",");
                sb.append(getclipentry.RatingCompat("src"));
                sb.append(",");
                sb.append(getclipentry.write("switchHd", 0));
                sb.append(",");
                sb.append(getclipentry.write("floor", 0));
                sb.append(",");
                sb.append(getclipentry.write("floorAcc", 0));
                sb.append(",");
                sb.append(getclipentry.RatingCompat("buildingId"));
            }
        }
        return sb.toString();
    }

    public static boolean a(String str) throws PatternSyntaxException {
        return !Pattern.compile("^[-a-zA-Z0-9_/.]+$").matcher(str).find();
    }

    private static String a() {
        return calculateIfHorizontallyStacked.IconCompatParcelizer(Calendar.getInstance().getTime());
    }

    public static toAccessibilityCollectionItemInfo a(LogConfig logConfig) {
        toAccessibilityCollectionItemInfo toaccessibilitycollectioniteminfo = new toAccessibilityCollectionItemInfo();
        toaccessibilitycollectioniteminfo.RemoteActionCompatParcelizer = logConfig.getFileExpiredTime();
        toaccessibilitycollectioniteminfo.write = logConfig.getFileNum();
        toaccessibilitycollectioniteminfo.IconCompatParcelizer = logConfig.getFileSize();
        toaccessibilitycollectioniteminfo.serializer = logConfig.getLogPath();
        return toaccessibilitycollectioniteminfo;
    }

    public static void a(Context context, String str, String str2) throws ApiException {
        String str3;
        if (TextUtils.isEmpty(str)) {
            throw new ApiException(new Status(LocationStatusCode.ARGUMENTS_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.ARGUMENTS_EMPTY)));
        }
        if (str.startsWith("data/user") || str.startsWith("/data/data/") || str.startsWith("data/data/") || str.startsWith("/data/user")) {
            str3 = "setLogConfig internal storage - read and write permissions not need to be verified";
        } else {
            HMSLocationLog.i("WriteLocationResultUtil", str2, "setLogConfig Non-internal storage - read and write permissions need to be verified");
            if (!getTitleResource.IconCompatParcelizer(placeAtf8xVGno.read())) {
                HMSLocationLog.e("WriteLocationResultUtil", "", "Storage permission check unPass");
                throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
            }
            str3 = "setLogConfig Permission check pass";
        }
        HMSLocationLog.i("WriteLocationResultUtil", str2, str3);
    }

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        String packageName = context.getPackageName();
        long versionCode = APKUtil.getVersionCode(context.getPackageName());
        long versionCode2 = APKUtil.getVersionCode("com.huawei.hwid");
        sb.append(packageName);
        sb.append(":");
        sb.append(String.valueOf(versionCode));
        return ff$$ExternalSyntheticOutline0.m(sb, ",locationSdkVersion:", String.valueOf(61600302), ",com.huawei.hwid:", String.valueOf(versionCode2));
    }
}
