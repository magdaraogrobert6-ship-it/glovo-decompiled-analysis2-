package com.huawei.location.base.activity.permission;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.util.APKUtil;
import o.BrazeSdkAuthenticationErrorEvent;
import o.WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1;
import o.WrappedCompositionsetContent1211;
import o.getTitleResource;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes4.dex */
public class ARLocationPermissionManager {
    private static final String ACTIVITY_RECOGNITION_ANDROID_Q = "android.permission.ACTIVITY_RECOGNITION";
    private static final String PERMISSION_DENIED = "PERMISSION_DENIED";
    private static final String TAG = "ARLocationPermissionManager";

    public static boolean checkCPActivityRecognitionPermission(String str, int i, int i2) {
        int iCheckPermission;
        boolean z = true;
        if (Build.VERSION.SDK_INT <= 28) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(str, " Activity recognition permission is true");
        } else {
            Context context = placeAtf8xVGno.RemoteActionCompatParcelizer;
            int i3 = getTitleResource.IconCompatParcelizer;
            if (context == null) {
                WrappedCompositionsetContent1211.read("PermissionUtil", "hasPermission Context is null");
            } else {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    String[] packagesForUid = packageManager.getPackagesForUid(i2);
                    if (packagesForUid == null || packagesForUid.length <= 0) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("PermissionUtil", "checkPermission get packageName fail ");
                        iCheckPermission = -1;
                    } else {
                        String str2 = packagesForUid[0];
                        iCheckPermission = APKUtil.getApkInfo(Fields.Clip, str2).MediaDescriptionCompat >= 23 ? packageManager.checkPermission(ACTIVITY_RECOGNITION_ANDROID_Q, str2) : BrazeSdkAuthenticationErrorEvent.RemoteActionCompatParcelizer(context, ACTIVITY_RECOGNITION_ANDROID_Q, str2, i, i2);
                    }
                    if (iCheckPermission != 0) {
                        if (-1 != iCheckPermission) {
                            WrappedCompositionsetContent1211.read("PermissionUtil", "hasPermission, result is " + iCheckPermission);
                            int i4 = getTitleResource.IconCompatParcelizer;
                            throw new LocationServiceException(i4, WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1.serializer(i4));
                        }
                        WrappedCompositionsetContent1211.read("PermissionUtil", "hasPermission, result is " + iCheckPermission);
                    }
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(str, "Activity recognition permission on android Q   is " + z);
                } catch (Exception unused) {
                    WrappedCompositionsetContent1211.read("PermissionUtil", "checkPermission LocationServiceException");
                    throw new LocationServiceException(10000, WindowRecomposer_androidKtgetAnimationScaleFlowFor11contentObserver1.serializer(10000));
                }
            }
            z = false;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(str, "Activity recognition permission on android Q   is " + z);
        }
        if (!z) {
            WrappedCompositionsetContent1211.serializer(str, af$$ExternalSyntheticOutline0.m(i, i2, "pid: ", ",uid: ", " has no activity recognition permission "));
        }
        return z;
    }

    public static boolean checkCPActivityRecognitionPermissionByException(String str, String str2, int i, int i2) {
        boolean zCheckCPActivityRecognitionPermission = checkCPActivityRecognitionPermission(str, i, i2);
        if (zCheckCPActivityRecognitionPermission) {
            return zCheckCPActivityRecognitionPermission;
        }
        WrappedCompositionsetContent1211.read(str, str2 + " has no activity recognition permission");
        throw new LocationServiceException(10803, ff$$ExternalSyntheticOutline0.m("PERMISSION_DENIED ", str2, " has no Activity Recognition permission"));
    }
}
