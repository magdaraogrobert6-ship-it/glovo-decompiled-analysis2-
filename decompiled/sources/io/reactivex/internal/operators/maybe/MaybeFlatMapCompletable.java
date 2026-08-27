package io.reactivex.internal.operators.maybe;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFlatMapCompletable<T> extends Completable {
    public final Maybe RemoteActionCompatParcelizer;
    public final Function serializer;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, CompletableObserver, Disposable {
        public final CompletableObserver RemoteActionCompatParcelizer;
        public final Function write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.RemoteActionCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.RemoteActionCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.write.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objApply;
                if (isDisposed()) {
                    return;
                }
                completableSource.subscribe(this);
            } catch (Throwable th) {
                Exceptions.read(th);
                onError(th);
            }
        }

        public FlatMapCompletableObserver(CompletableObserver completableObserver, Function function) {
            this.RemoteActionCompatParcelizer = completableObserver;
            this.write = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.serializer);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.RemoteActionCompatParcelizer.subscribe(flatMapCompletableObserver);
    }

    public MaybeFlatMapCompletable(Maybe maybe, Function function) {
        this.RemoteActionCompatParcelizer = maybe;
        this.serializer = function;
    }
}
