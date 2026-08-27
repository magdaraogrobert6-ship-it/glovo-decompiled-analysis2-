package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableFromCallable extends Completable {
    public final Callable read;

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        Disposable disposableRemoteActionCompatParcelizer = Disposables.RemoteActionCompatParcelizer(Functions.write);
        completableObserver.onSubscribe(disposableRemoteActionCompatParcelizer);
        try {
            this.read.call();
            if (disposableRemoteActionCompatParcelizer.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (Throwable th) {
            Exceptions.read(th);
            if (disposableRemoteActionCompatParcelizer.isDisposed()) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                completableObserver.onError(th);
            }
        }
    }

    public CompletableFromCallable(Callable callable) {
        this.read = callable;
    }
}
