package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleError<T> extends Single<T> {
    public final Callable RemoteActionCompatParcelizer;

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        try {
            Object objCall = this.RemoteActionCompatParcelizer.call();
            ObjectHelper.write(objCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) objCall;
        } catch (Throwable th) {
            th = th;
            Exceptions.read(th);
        }
        EmptyDisposable.error(th, (SingleObserver<?>) singleObserver);
    }

    public SingleError(Callable callable) {
        this.RemoteActionCompatParcelizer = callable;
    }
}
