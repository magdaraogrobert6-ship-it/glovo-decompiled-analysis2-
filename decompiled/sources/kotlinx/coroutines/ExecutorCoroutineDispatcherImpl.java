package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.ConcurrentKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DefaultInAppMessageViewWrapperCompanion;
import o.TextAnnouncementContentCardView;
import o.getParentViewGroup;
import o.isAnimatingClose;
import o.onTouchEnded;
import o.openlambda1;
import o.prepareForActivityTransitionCarryover;
import o.setAndStartAnimation;
import o.setAnimatingClose;

/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements isAnimatingClose {
    public final Executor serializer;

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public final Executor getExecutor() {
        return this.serializer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.serializer;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        try {
            this.serializer.execute(runnable);
        } catch (RejectedExecutionException e) {
            JobKt.serializer(textAnnouncementContentCardView, DefaultInAppMessageViewWrapperCompanion.RemoteActionCompatParcelizer("The task was rejected", e));
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler.RemoteActionCompatParcelizer.dispatch(textAnnouncementContentCardView, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.serializer);
    }

    @Override // o.isAnimatingClose
    public final void serializer(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        Executor executor = this.serializer;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            ResumeUndispatchedRunnable resumeUndispatchedRunnable = new ResumeUndispatchedRunnable(this, 0, cancellableContinuationImpl);
            TextAnnouncementContentCardView textAnnouncementContentCardView = cancellableContinuationImpl.MediaBrowserCompatMediaItem;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(resumeUndispatchedRunnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                JobKt.serializer(textAnnouncementContentCardView, DefaultInAppMessageViewWrapperCompanion.RemoteActionCompatParcelizer("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            cancellableContinuationImpl.IconCompatParcelizer((onTouchEnded) new openlambda1(scheduledFutureSchedule));
        } else {
            getParentViewGroup.write.serializer(j, cancellableContinuationImpl);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.serializer.toString();
    }

    @Override // o.isAnimatingClose
    public final setAndStartAnimation write(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        Executor executor = this.serializer;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                JobKt.serializer(textAnnouncementContentCardView, DefaultInAppMessageViewWrapperCompanion.RemoteActionCompatParcelizer("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new setAnimatingClose(scheduledFutureSchedule) : getParentViewGroup.write.write(j, runnable, textAnnouncementContentCardView);
    }

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        Method method;
        this.serializer = executor;
        Method method2 = ConcurrentKt.RemoteActionCompatParcelizer;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = ConcurrentKt.RemoteActionCompatParcelizer) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).serializer == this.serializer;
    }
}
