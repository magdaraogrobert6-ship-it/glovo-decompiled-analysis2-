package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableAndThenCompletable extends Completable {
    public final Completable IconCompatParcelizer;
    public final Completable write;

    public static final class NextObserver implements CompletableObserver {
        public final CompletableObserver IconCompatParcelizer;
        public final AtomicReference serializer;

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.serializer, disposable);
        }

        public NextObserver(AtomicReference atomicReference, CompletableObserver completableObserver) {
            this.serializer = atomicReference;
            this.IconCompatParcelizer = completableObserver;
        }
    }

    public static final class SourceObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final CompletableObserver RemoteActionCompatParcelizer;
        public final Completable read;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.read.subscribe(new NextObserver(this, this.RemoteActionCompatParcelizer));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer.onError(th);
        }

        public SourceObserver(Completable completable, CompletableObserver completableObserver) {
            this.RemoteActionCompatParcelizer = completableObserver;
            this.read = completable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.RemoteActionCompatParcelizer.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.IconCompatParcelizer.subscribe(new SourceObserver(this.write, completableObserver));
    }

    public CompletableAndThenCompletable(Completable completable, Completable completable2) {
        this.IconCompatParcelizer = completable;
        this.write = completable2;
    }
}
