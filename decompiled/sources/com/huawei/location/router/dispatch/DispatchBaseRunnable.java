package com.huawei.location.router.dispatch;

import androidx.loader.content.ModernAsyncTask$1;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.agc.AGCManager;
import com.huawei.location.router.BaseRouterTaskCallImpl;
import com.huawei.location.router.entity.RouterRequest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.WrappedCompositionsetContent1211;
import o.onCreateActionMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DispatchBaseRunnable implements IDispatchExceptionListener {
    private static final int AGC_AUTH_TIME_OUT = 3;
    private static final String TAG = "DispatchBaseRunnable";
    protected BaseRouterTaskCallImpl apiRequest;
    protected boolean isError = false;
    protected RouterRequest routerRequest;

    public BaseRouterTaskCallImpl getApiRequest() {
        return this.apiRequest;
    }

    public RouterRequest getRouterRequest() {
        return this.routerRequest;
    }

    @Override // com.huawei.location.router.dispatch.IDispatchExceptionListener
    public void onDispatchError(int i, String str) {
        this.isError = true;
        if (i == 10001) {
            handlerErrorResult(LocationStatusCode.NOT_YET_SUPPORTED);
            return;
        }
        WrappedCompositionsetContent1211.read(TAG, "other error code :" + i + "msg:" + str);
    }

    public void setApiRequest(BaseRouterTaskCallImpl baseRouterTaskCallImpl) {
        this.apiRequest = baseRouterTaskCallImpl;
    }

    public boolean agcAuth() {
        boolean z;
        if (Integer.parseInt("100") != 100 || this.routerRequest.isResendFromHMS()) {
            return true;
        }
        synchronized (AGCManager.read()) {
            z = AGCManager.read().write() != null;
        }
        return z;
    }

    public boolean agcAuthDelay() {
        String str;
        try {
            FutureTask futureTask = new FutureTask(new ModernAsyncTask$1(9, this));
            onCreateActionMode.write.getClass();
            m.IconCompatParcelizer(futureTask);
            return ((Boolean) futureTask.get(3L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            str = "check agc future Interrupted error";
            WrappedCompositionsetContent1211.read(TAG, str);
            return false;
        } catch (ExecutionException unused2) {
            str = "check agc future Execution error";
            WrappedCompositionsetContent1211.read(TAG, str);
            return false;
        } catch (TimeoutException unused3) {
            str = "check agc future Timeout error";
            WrappedCompositionsetContent1211.read(TAG, str);
            return false;
        }
    }

    public void handlerErrorResult(int i) {
        ErrorTaskCall errorTaskCall = new ErrorTaskCall();
        errorTaskCall.setRouterRequest(this.routerRequest);
        errorTaskCall.onComplete(i);
    }

    public DispatchBaseRunnable(RouterRequest routerRequest) {
        this.routerRequest = routerRequest;
    }
}
