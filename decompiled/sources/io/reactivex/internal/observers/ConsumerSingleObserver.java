package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, LambdaConsumerIntrospection {
    public final Consumer IconCompatParcelizer;
    public final Consumer read;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.read != Functions.RemoteActionCompatParcelizer;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.read.accept(th);
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.IconCompatParcelizer.accept(obj);
        } catch (Throwable th) {
            Exceptions.read(th);
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    public ConsumerSingleObserver(Consumer consumer, Consumer consumer2) {
        this.IconCompatParcelizer = consumer;
        this.read = consumer2;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
