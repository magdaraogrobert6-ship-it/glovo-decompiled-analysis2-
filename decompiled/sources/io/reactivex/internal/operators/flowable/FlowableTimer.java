package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableTimer extends Flowable<Long> {
    public final long IconCompatParcelizer;
    public final Scheduler read;
    public final TimeUnit serializer;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements FwFClientclose11, Runnable {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
        public volatile boolean RemoteActionCompatParcelizer;

        @Override // o.FwFClientclose11
        public final void cancel() {
            DisposableHelper.dispose(this);
        }

        public TimerSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.RemoteActionCompatParcelizer) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.IconCompatParcelizer.onError(new MissingBackpressureException("Can't deliver value due to lack of requests", 0));
                } else {
                    this.IconCompatParcelizer.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.IconCompatParcelizer.onComplete();
                }
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                this.RemoteActionCompatParcelizer = true;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1);
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(timerSubscriber);
        DisposableHelper.trySet(timerSubscriber, this.read.read(timerSubscriber, this.IconCompatParcelizer, this.serializer));
    }

    public FlowableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.IconCompatParcelizer = j;
        this.serializer = timeUnit;
        this.read = scheduler;
    }
}
