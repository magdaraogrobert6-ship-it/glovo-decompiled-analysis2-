package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Scheduler IconCompatParcelizer;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final SequentialDisposable RemoteActionCompatParcelizer = new SequentialDisposable();
        public final MaybeObserver read;

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.read.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.read.onSuccess(obj);
        }

        public SubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.read = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.RemoteActionCompatParcelizer;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    public static final class SubscribeTask<T> implements Runnable {
        public final Maybe read;
        public final MaybeObserver write;

        @Override // java.lang.Runnable
        public final void run() {
            this.read.subscribe(this.write);
        }

        public SubscribeTask(Maybe maybe, MaybeObserver maybeObserver) {
            this.write = maybeObserver;
            this.read = maybe;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(subscribeOnMaybeObserver);
        Disposable disposable = this.IconCompatParcelizer.read(new SubscribeTask(this.write, subscribeOnMaybeObserver));
        SequentialDisposable sequentialDisposable = subscribeOnMaybeObserver.RemoteActionCompatParcelizer;
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, disposable);
    }

    public MaybeSubscribeOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.IconCompatParcelizer = scheduler;
    }
}
