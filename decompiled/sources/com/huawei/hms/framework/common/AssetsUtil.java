package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.compose.ui.graphics.Fields;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.setFontSizeR2X_6o;

/* JADX INFO: loaded from: classes2.dex */
public class AssetsUtil {
    private static final int GET_SP_TIMEOUT = 5;
    private static int IconCompatParcelizer = 0;
    private static final String TAG = "AssetsUtil";
    private static int read = 1;
    private static final String THREAD_NAME = "AssetsUtil_Operate";
    private static final ExecutorService EXECUTOR_SERVICE = ExecutorsUtils.newSingleThreadExecutor(THREAD_NAME);

    public static String[] list(final Context context, final String str) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return new String[0];
        }
        FutureTask futureTask = new FutureTask(new Callable<String[]>() { // from class: com.huawei.hms.framework.common.AssetsUtil.1
            @Override // java.util.concurrent.Callable
            public String[] call() throws Exception {
                return context.getAssets().list(str);
            }
        });
        EXECUTOR_SERVICE.execute(futureTask);
        try {
            return (String[]) futureTask.get(5L, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            Logger.w(TAG, "get local config files from sp task timed out");
            return new String[0];
        } catch (Exception unused2) {
            Logger.w(TAG, "get local config files from sp task occur unknown Exception");
            return new String[0];
        } catch (InterruptedException e) {
            Logger.w(TAG, "get local config files from sp task interrupted", e);
            return new String[0];
        } catch (ExecutionException e2) {
            Logger.w(TAG, "get local config files from sp task failed", e2);
            return new String[0];
        } finally {
            futureTask.cancel(true);
        }
    }

    public static InputStream open(Context context, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 41;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            try {
                Object[] objArr = {context.getAssets(), str};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (26243 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - TextUtils.lastIndexOf("", '0', 0, 0), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                }
                return (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            } catch (Throwable th) {
                try {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                } catch (RuntimeException e) {
                    Logger.e(TAG, "AssetManager has been destroyed", e);
                    return null;
                }
            }
        }
        int i4 = i2 + 55;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Logger.w(TAG, "context is null");
            int i5 = 83 / 0;
            return null;
        }
        Logger.w(TAG, "context is null");
        return null;
    }
}
