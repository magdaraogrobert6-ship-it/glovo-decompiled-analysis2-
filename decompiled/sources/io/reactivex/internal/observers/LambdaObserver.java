package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    public final Consumer IconCompatParcelizer;
    public final Consumer RemoteActionCompatParcelizer;
    public final Consumer read;
    public final Action write;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.read != Functions.RemoteActionCompatParcelizer;
    }

    public LambdaObserver(Consumer consumer, Consumer consumer2, Action action, Consumer consumer3) {
        this.RemoteActionCompatParcelizer = consumer;
        this.read = consumer2;
        this.write = action;
        this.IconCompatParcelizer = consumer3;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.write.run();
        } catch (Throwable th) {
            Exceptions.read(th);
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (isDisposed()) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.read.accept(th);
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.RemoteActionCompatParcelizer.accept(obj);
        } catch (Throwable th) {
            Exceptions.read(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            try {
                this.IconCompatParcelizer.accept(this);
            } catch (Throwable th) {
                Exceptions.read(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
