package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
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
public final class MaybeCallbackObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, LambdaConsumerIntrospection {
    public final Consumer RemoteActionCompatParcelizer;
    public final Action serializer;
    public final Consumer write;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.write != Functions.RemoteActionCompatParcelizer;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.serializer.run();
        } catch (Throwable th) {
            Exceptions.read(th);
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.write.accept(th);
        } catch (Throwable th2) {
            Exceptions.read(th2);
            RxJavaPlugins.IconCompatParcelizer(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.RemoteActionCompatParcelizer.accept(obj);
        } catch (Throwable th) {
            Exceptions.read(th);
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    public MaybeCallbackObserver(Consumer consumer, Consumer consumer2, Action action) {
        this.RemoteActionCompatParcelizer = consumer;
        this.write = consumer2;
        this.serializer = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }
}
