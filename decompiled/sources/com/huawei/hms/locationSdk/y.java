package com.huawei.hms.locationSdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.log.HMSLog;
import o.WrappedCompositionsetContent1211;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class y implements u {
    private static volatile boolean a;

    private static boolean c(Context context) {
        String str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", Fields.Clip);
            if (packageInfo != null && (packageInfo.applicationInfo.flags & 1) != 0) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LiteSDKProxy", "is system app");
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str = "isSystemApplication NameNotFoundException";
            WrappedCompositionsetContent1211.read("LiteSDKProxy", str);
        } catch (RuntimeException unused2) {
            str = "Package Manager has died Exception";
            WrappedCompositionsetContent1211.read("LiteSDKProxy", str);
        }
        return false;
    }

    private static boolean b(Context context) {
        if (context == null) {
            return true;
        }
        boolean z = context.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", "com.huawei.hwid") == 0;
        HMSLog.i("LiteSDKProxy", "isHmsWithSysSignature：" + z);
        return z;
    }

    public static boolean a(Context context) {
        String str;
        boolean z = false;
        if (a) {
            str = "hms is abnormal";
        } else if (context == null) {
            str = "context is null";
        } else {
            z = c(context) || b(context);
            str = "isHMSEnable:" + z;
        }
        HMSLog.i("LiteSDKProxy", str);
        return z;
    }

    @Override // com.huawei.hms.locationSdk.u
    public <TResult, TClient extends AnyClient, TOption extends Api.ApiOptions> setShouldUseDispatchDrawui a(HuaweiApi<TOption> huaweiApi, TaskApiCall<TClient, TResult> taskApiCall, AbstractClientBuilder<TClient, TOption> abstractClientBuilder) {
        HMSLog.i("LiteSDKProxy", "LiteSDKProxy doWriteProxy");
        return huaweiApi.doWrite(taskApiCall);
    }

    public static boolean a() {
        return a;
    }

    public static void a(boolean z) {
        a = z;
    }
}
