package com.huawei.hms.framework.common;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorsUtils {
    private static final String THREADNAME_HEADER = "NK_";

    public static ThreadFactory createThreadFactory(final String str) {
        if (str != null && !str.trim().isEmpty()) {
            return new ThreadFactory() { // from class: com.huawei.hms.framework.common.ExecutorsUtils.1
                private final AtomicInteger threadNumbers = new AtomicInteger(0);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    return ExecutorsUtils.newThread(runnable, str + BundleUtil.UNDERLINE_TAG + this.threadNumbers.getAndIncrement());
                }
            };
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("ThreadName is empty");
        return null;
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return ExecutorsEnhance.newSingleThreadExecutor(createThreadFactory(str));
    }

    public static Thread newThread(Runnable runnable, String str) {
        return new Thread(runnable, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(THREADNAME_HEADER, str));
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, String str) {
        return new ScheduledThreadPoolExecutorEnhance(i, createThreadFactory(str));
    }

    public static ExecutorService newCachedThreadPool(String str) {
        ThreadFactory threadFactoryCreateThreadFactory = createThreadFactory(str);
        ThreadPoolExcutorEnhance threadPoolExcutorEnhance = new ThreadPoolExcutorEnhance(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryCreateThreadFactory);
        threadPoolExcutorEnhance.allowCoreThreadTimeOut(true);
        return threadPoolExcutorEnhance;
    }

    public static ExecutorService newFixedThreadPool(int i, String str) {
        ThreadFactory threadFactoryCreateThreadFactory = createThreadFactory(str);
        ThreadPoolExcutorEnhance threadPoolExcutorEnhance = new ThreadPoolExcutorEnhance(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryCreateThreadFactory);
        threadPoolExcutorEnhance.allowCoreThreadTimeOut(true);
        return threadPoolExcutorEnhance;
    }
}
