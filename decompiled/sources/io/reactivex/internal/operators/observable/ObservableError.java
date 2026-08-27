package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableError<T> extends Observable<T> {
    public final Callable read;

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        try {
            Object objCall = this.read.call();
            ObjectHelper.write(objCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) objCall;
        } catch (Throwable th) {
            th = th;
            Exceptions.read(th);
        }
        EmptyDisposable.error(th, (Observer<?>) observer);
    }

    public ObservableError(Callable callable) {
        this.read = callable;
    }
}
