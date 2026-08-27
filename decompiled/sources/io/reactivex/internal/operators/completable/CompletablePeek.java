package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletablePeek extends Completable {
    public final Consumer RemoteActionCompatParcelizer;
    public final Completable read;
    public final Action write;

    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {
        public Disposable RemoteActionCompatParcelizer;
        public final CompletableObserver write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.RemoteActionCompatParcelizer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.RemoteActionCompatParcelizer.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.write;
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.RemoteActionCompatParcelizer == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                completablePeek.write.run();
                completableObserver.onComplete();
            } catch (Throwable th) {
                Exceptions.read(th);
                completableObserver.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.RemoteActionCompatParcelizer == DisposableHelper.DISPOSED) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            try {
                completablePeek.RemoteActionCompatParcelizer.accept(th);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                th = new CompositeException(th, th2);
            }
            this.write.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.RemoteActionCompatParcelizer, disposable)) {
                this.RemoteActionCompatParcelizer = disposable;
                this.write.onSubscribe(this);
            }
        }

        public CompletableObserverImplementation(CompletableObserver completableObserver) {
            this.write = completableObserver;
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.read.subscribe(new CompletableObserverImplementation(completableObserver));
    }

    public CompletablePeek(Completable completable, Consumer consumer, Action action) {
        this.read = completable;
        this.RemoteActionCompatParcelizer = consumer;
        this.write = action;
    }
}
