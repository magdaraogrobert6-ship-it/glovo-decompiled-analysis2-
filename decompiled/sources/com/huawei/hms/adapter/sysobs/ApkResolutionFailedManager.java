package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.deliveryhero.fwf_http.ConstantKt;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ApkResolutionFailedManager {
    private static final ApkResolutionFailedManager c = new ApkResolutionFailedManager();
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Map<String, Runnable> b = new HashMap(2);

    public static ApkResolutionFailedManager getInstance() {
        return c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "postTask is not in main thread");
        } else {
            this.b.put(str, runnable);
            this.a.postDelayed(runnable, ConstantKt.DEFAULT_REQUEST_TIMEOUT);
        }
    }

    public void removeTask(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeTask is not in main thread");
            return;
        }
        Runnable runnableRemove = this.b.remove(str);
        if (runnableRemove == null) {
            HMSLog.e("ApkResolutionFailedManager", "cancel runnable is null");
        } else {
            this.a.removeCallbacks(runnableRemove);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        } else {
            this.b.remove(str);
        }
    }

    private ApkResolutionFailedManager() {
    }
}
