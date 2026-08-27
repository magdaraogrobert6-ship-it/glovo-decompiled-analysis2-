package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable {
    public final Observable IconCompatParcelizer;
    public final Function serializer;

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements Disposable, Observer<T> {
        public final CompletableObserver IconCompatParcelizer;
        public Disposable RatingCompat;
        public final Function read;
        public volatile boolean write;
        public final AtomicThrowable RemoteActionCompatParcelizer = new AtomicThrowable();
        public final CompositeDisposable serializer = new CompositeDisposable();

        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            public InnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.serializer.IconCompatParcelizer(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.serializer.IconCompatParcelizer(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.write = true;
            this.RatingCompat.dispose();
            this.serializer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.RatingCompat.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.RemoteActionCompatParcelizer;
            atomicThrowable.getClass();
            if (!ExceptionHelper.read(atomicThrowable, th)) {
                RxJavaPlugins.IconCompatParcelizer(th);
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.IconCompatParcelizer.onError(ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                Object objApply = this.read.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objApply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.write || !this.serializer.read(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.RatingCompat.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.RatingCompat, disposable)) {
                this.RatingCompat = disposable;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public FlatMapCompletableMainObserver(CompletableObserver completableObserver, Function function) {
            this.IconCompatParcelizer = completableObserver;
            this.read = function;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.RemoteActionCompatParcelizer;
                atomicThrowable.getClass();
                Throwable thRemoteActionCompatParcelizer = ExceptionHelper.RemoteActionCompatParcelizer(atomicThrowable);
                CompletableObserver completableObserver = this.IconCompatParcelizer;
                if (thRemoteActionCompatParcelizer != null) {
                    completableObserver.onError(thRemoteActionCompatParcelizer);
                } else {
                    completableObserver.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.IconCompatParcelizer.subscribe(new FlatMapCompletableMainObserver(completableObserver, this.serializer));
    }

    public ObservableFlatMapCompletableCompletable(Observable observable, Function function) {
        this.IconCompatParcelizer = observable;
        this.serializer = function;
    }
}
