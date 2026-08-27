package io.reactivex.internal.operators.flowable;

import bo.app.c8$$ExternalSyntheticOutline0;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final TimeUnit RemoteActionCompatParcelizer;
    public final long read;
    public final Scheduler serializer;

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, FwFClientclose11, TimeoutSupport {
        public final Scheduler.Worker MediaSessionCompatQueueItem;
        public final long read;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 serializer;
        public final TimeUnit write;
        public final SequentialDisposable IconCompatParcelizer = new SequentialDisposable();
        public final AtomicReference MediaBrowserCompatMediaItem = new AtomicReference();
        public final AtomicLong RemoteActionCompatParcelizer = new AtomicLong();

        @Override // o.FwFClientclose11
        public final void cancel() {
            SubscriptionHelper.cancel(this.MediaBrowserCompatMediaItem);
            this.MediaSessionCompatQueueItem.dispose();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            SubscriptionHelper.deferredSetOnce(this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, fwFClientclose11);
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, j);
        }

        public TimeoutSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.serializer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.read = j;
            this.write = timeUnit;
            this.MediaSessionCompatQueueItem = worker;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.IconCompatParcelizer;
                sequentialDisposable.getClass();
                DisposableHelper.dispose(sequentialDisposable);
                this.serializer.onComplete();
                this.MediaSessionCompatQueueItem.dispose();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.IconCompatParcelizer;
                sequentialDisposable.getClass();
                DisposableHelper.dispose(sequentialDisposable);
                this.serializer.onError(th);
                this.MediaSessionCompatQueueItem.dispose();
                return;
            }
            RxJavaPlugins.IconCompatParcelizer(th);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void serializer(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.MediaBrowserCompatMediaItem);
                Throwable th = ExceptionHelper.serializer;
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.read, "The source did not signal an event for ", " ");
                sbM.append(this.write.toString().toLowerCase());
                sbM.append(" and has been terminated.");
                this.serializer.onError(new TimeoutException(sbM.toString()));
                this.MediaSessionCompatQueueItem.dispose();
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.IconCompatParcelizer;
                    sequentialDisposable.get().dispose();
                    this.serializer.onNext(obj);
                    Disposable disposable = this.MediaSessionCompatQueueItem.read(new TimeoutTask(j2, this), this.read, this.write);
                    sequentialDisposable.getClass();
                    DisposableHelper.replace(sequentialDisposable, disposable);
                }
            }
        }
    }

    public interface TimeoutSupport {
        void serializer(long j);
    }

    public static final class TimeoutTask implements Runnable {
        public final long IconCompatParcelizer;
        public final TimeoutSupport write;

        @Override // java.lang.Runnable
        public final void run() {
            this.write.serializer(this.IconCompatParcelizer);
        }

        public TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.IconCompatParcelizer = j;
            this.write = timeoutSupport;
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read, this.RemoteActionCompatParcelizer, this.serializer.write());
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(timeoutSubscriber);
        Disposable disposable = timeoutSubscriber.MediaSessionCompatQueueItem.read(new TimeoutTask(0L, timeoutSubscriber), timeoutSubscriber.read, timeoutSubscriber.write);
        SequentialDisposable sequentialDisposable = timeoutSubscriber.IconCompatParcelizer;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, disposable);
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) timeoutSubscriber);
    }

    public FlowableTimeoutTimed(Flowable flowable, Scheduler scheduler) {
        super(flowable);
        this.read = 3L;
        this.RemoteActionCompatParcelizer = TimeUnit.SECONDS;
        this.serializer = scheduler;
    }
}
