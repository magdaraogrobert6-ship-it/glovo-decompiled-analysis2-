package com.mapbox.common;

import java.util.concurrent.Executor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class SchedulerExecutorDispatcher extends ExecutorCoroutineDispatcher {
    private final Executor executor;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.executor;
    }

    public SchedulerExecutorDispatcher(Executor executor) {
        executor.getClass();
        this.executor = executor;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        textAnnouncementContentCardView.getClass();
        runnable.getClass();
        getExecutor().execute(runnable);
    }
}
