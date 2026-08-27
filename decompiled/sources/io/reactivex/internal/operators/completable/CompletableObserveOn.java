package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableObserveOn extends Completable {
    public final Scheduler read;
    public final CompletableSubscribeOn write;

    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        public Throwable IconCompatParcelizer;
        public final Scheduler RemoteActionCompatParcelizer;
        public final CompletableObserver serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            DisposableHelper.replace(this, this.RemoteActionCompatParcelizer.read(this));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.IconCompatParcelizer = th;
            DisposableHelper.replace(this, this.RemoteActionCompatParcelizer.read(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.IconCompatParcelizer;
            CompletableObserver completableObserver = this.serializer;
            if (th == null) {
                completableObserver.onComplete();
            } else {
                this.IconCompatParcelizer = null;
                completableObserver.onError(th);
            }
        }

        public ObserveOnCompletableObserver(CompletableObserver completableObserver, Scheduler scheduler) {
            this.serializer = completableObserver;
            this.RemoteActionCompatParcelizer = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.serializer.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.write.subscribe(new ObserveOnCompletableObserver(completableObserver, this.read));
    }

    public CompletableObserveOn(CompletableSubscribeOn completableSubscribeOn, Scheduler scheduler) {
        this.write = completableSubscribeOn;
        this.read = scheduler;
    }
}
