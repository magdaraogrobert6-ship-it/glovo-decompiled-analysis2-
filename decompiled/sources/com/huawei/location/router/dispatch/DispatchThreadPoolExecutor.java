package com.huawei.location.router.dispatch;

import com.huawei.location.router.BaseRouterTaskCallImpl;
import com.huawei.location.router.RouterTaskHandler;
import com.huawei.location.router.entity.RouterRequest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class DispatchThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    public DispatchThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    private void processRequest(DispatchBaseRunnable dispatchBaseRunnable) {
        try {
            RouterRequest routerRequest = dispatchBaseRunnable.getRouterRequest();
            if (routerRequest == null) {
                throw new DispatchException(IDispatchExceptionListener.API_TASK_EMPTY, "TaskApiEntity Object is Empty");
            }
            String str = RouterTaskHandler.getInstance().getApiRequestMap().get(routerRequest.getApiName());
            if (str == null) {
                throw new DispatchException(IDispatchExceptionListener.API_NOT_EXIST, "api interface not register");
            }
            try {
                try {
                    dispatchBaseRunnable.setApiRequest((BaseRouterTaskCallImpl) Class.forName(str).newInstance());
                } catch (InstantiationException unused) {
                    throw new DispatchException(IDispatchExceptionListener.OTHER_ERROR, "InstantiationException");
                } catch (Exception unused2) {
                    throw new DispatchException(IDispatchExceptionListener.OTHER_ERROR, "InstantiationException");
                }
            } catch (ClassNotFoundException unused3) {
                throw new DispatchException(IDispatchExceptionListener.OTHER_ERROR, "class not found exception");
            } catch (IllegalAccessException unused4) {
                throw new DispatchException(IDispatchExceptionListener.OTHER_ERROR, "IllegalAccessException");
            }
        } catch (DispatchException e) {
            dispatchBaseRunnable.onDispatchError(e.getExceptionCode(), e.getMessage());
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new FutureDispatch(callable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (runnable instanceof DispatchRunnable) {
            processRequest((DispatchRunnable) runnable);
        }
        if (runnable instanceof FutureDispatch) {
            Callable callable = ((FutureDispatch) runnable).getCallable();
            if (callable instanceof DispatchCallable) {
                processRequest((DispatchCallable) callable);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
