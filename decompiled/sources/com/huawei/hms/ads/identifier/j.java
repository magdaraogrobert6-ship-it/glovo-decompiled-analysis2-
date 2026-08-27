package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import java.io.Closeable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(Fields.CameraDistance), new ThreadPoolExecutor.DiscardPolicy());

    private static boolean a() {
        return true;
    }

    public static Integer b(Context context) {
        Bundle bundle;
        Object obj;
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(f.a(context), Fields.SpotShadowColor);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("ppskit_ver_code")) != null) {
                return Integer.valueOf(obj.toString());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
        if (providerInfoResolveContentProvider == null) {
            Log.e("StmUt", "verify provider invalid param");
            return false;
        }
        ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
        if (applicationInfo == null) {
            return false;
        }
        String str = applicationInfo.packageName;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return packageManager.checkSignatures(context.getPackageName(), str) == 0 || (applicationInfo.flags & 1) == 1;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.w("StmUt", "close ".concat(th.getClass().getSimpleName()));
            }
        }
    }

    public static Context a(Context context) {
        return a() ? context.createDeviceProtectedStorageContext() : context;
    }
}
