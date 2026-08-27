package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFromCallable<T> extends Maybe<T> implements Callable<T> {
    public final Callable serializer;

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        Disposable disposableRemoteActionCompatParcelizer = Disposables.RemoteActionCompatParcelizer(Functions.write);
        maybeObserver.onSubscribe(disposableRemoteActionCompatParcelizer);
        if (disposableRemoteActionCompatParcelizer.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.serializer.call();
            if (disposableRemoteActionCompatParcelizer.isDisposed()) {
                return;
            }
            if (objCall == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(objCall);
            }
        } catch (Throwable th) {
            Exceptions.read(th);
            if (disposableRemoteActionCompatParcelizer.isDisposed()) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                maybeObserver.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.serializer.call();
    }

    public MaybeFromCallable(Callable callable) {
        this.serializer = callable;
    }
}
