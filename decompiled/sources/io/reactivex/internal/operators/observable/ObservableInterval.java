package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableInterval extends Observable<Long> {
    public final long RemoteActionCompatParcelizer;
    public final Scheduler read;
    public final long serializer;

    public static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer IconCompatParcelizer;
        public long write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public IntervalObserver(Observer observer) {
            this.IconCompatParcelizer = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.DISPOSED) {
                long j = this.write;
                this.write = 1 + j;
                this.IconCompatParcelizer.onNext(Long.valueOf(j));
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        IntervalObserver intervalObserver = new IntervalObserver(observer);
        observer.onSubscribe(intervalObserver);
        Scheduler scheduler = this.read;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.setOnce(intervalObserver, scheduler.RemoteActionCompatParcelizer(intervalObserver, this.serializer, this.RemoteActionCompatParcelizer));
            return;
        }
        Scheduler.Worker workerWrite = scheduler.write();
        DisposableHelper.setOnce(intervalObserver, workerWrite);
        workerWrite.RemoteActionCompatParcelizer(intervalObserver, this.serializer, this.RemoteActionCompatParcelizer);
    }

    public ObservableInterval(long j, long j2, Scheduler scheduler) {
        this.serializer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.read = scheduler;
    }
}
