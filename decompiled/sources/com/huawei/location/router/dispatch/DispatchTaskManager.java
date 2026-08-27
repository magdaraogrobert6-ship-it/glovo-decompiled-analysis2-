package com.huawei.location.router.dispatch;

import com.huawei.location.router.entity.IRouterResponse;
import com.huawei.location.router.entity.RouterRequest;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.WrappedCompositionsetContent1211;
import o.getCurrentContentInsetEnd;

/* JADX INFO: loaded from: classes4.dex */
public class DispatchTaskManager {
    private static final long KEEP_ALIVE_TIME = 60;
    private static final String LOCATION_DISPATCH_TASK_MANAGER = "Location_DispatchTaskManager";
    private static final int THREAD_CORE = Runtime.getRuntime().availableProcessors();
    private static final int THREAD_TIME_OUT_SECONDS = 3;
    private ThreadPoolExecutor mExecutorService;

    public abstract class Vw {
        public static final DispatchTaskManager yn = new DispatchTaskManager();
    }

    public static DispatchTaskManager getInstance() {
        return Vw.yn;
    }

    private void init() {
        int i = THREAD_CORE;
        int i2 = i * 2;
        DispatchThreadPoolExecutor dispatchThreadPoolExecutor = new DispatchThreadPoolExecutor(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new getCurrentContentInsetEnd(2));
        this.mExecutorService = dispatchThreadPoolExecutor;
        dispatchThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private DispatchTaskManager() {
        init();
    }

    public void dispatchTask(RouterRequest routerRequest) {
        ThreadPoolExecutor threadPoolExecutor = this.mExecutorService;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(new DispatchRunnable(routerRequest));
        }
    }

    public IRouterResponse executeTask(RouterRequest routerRequest) {
        ThreadPoolExecutor threadPoolExecutor = this.mExecutorService;
        if (threadPoolExecutor == null) {
            return null;
        }
        try {
            return (IRouterResponse) threadPoolExecutor.submit(new DispatchCallable(routerRequest)).get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            WrappedCompositionsetContent1211.read("DispatchTaskManager", "enqueue task failed");
            return null;
        }
    }
}
