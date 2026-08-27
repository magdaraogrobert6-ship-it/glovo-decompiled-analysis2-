package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableSubscribeOn extends Completable {
    public final Completable RemoteActionCompatParcelizer;
    public final Scheduler write;

    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        public final CompletableObserver IconCompatParcelizer;
        public final SequentialDisposable read = new SequentialDisposable();
        public final Completable write;

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.write.subscribe(this);
        }

        public SubscribeOnObserver(Completable completable, CompletableObserver completableObserver) {
            this.IconCompatParcelizer = completableObserver;
            this.write = completable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.read;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(this.RemoteActionCompatParcelizer, completableObserver);
        completableObserver.onSubscribe(subscribeOnObserver);
        Disposable disposable = this.write.read(subscribeOnObserver);
        SequentialDisposable sequentialDisposable = subscribeOnObserver.read;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, disposable);
    }

    public CompletableSubscribeOn(Completable completable, Scheduler scheduler) {
        this.RemoteActionCompatParcelizer = completable;
        this.write = scheduler;
    }
}
