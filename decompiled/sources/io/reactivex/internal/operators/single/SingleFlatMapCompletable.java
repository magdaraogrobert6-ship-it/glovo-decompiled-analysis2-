package io.reactivex.internal.operators.single;

import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleFlatMapCompletable<T> extends Completable {
    public final SingleObserveOn IconCompatParcelizer;
    public final RetryWithDelay$$ExternalSyntheticLambda1 RemoteActionCompatParcelizer;

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, CompletableObserver, Disposable {
        public final CompletableObserver IconCompatParcelizer;
        public final RetryWithDelay$$ExternalSyntheticLambda1 write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        @Override // io.reactivex.SingleObserver
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

        public FlatMapCompletableObserver(CompletableObserver completableObserver, RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1) {
            this.IconCompatParcelizer = completableObserver;
            this.write = retryWithDelay$$ExternalSyntheticLambda1;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.RemoteActionCompatParcelizer);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.IconCompatParcelizer.subscribe(flatMapCompletableObserver);
    }

    public SingleFlatMapCompletable(SingleObserveOn singleObserveOn, RetryWithDelay$$ExternalSyntheticLambda1 retryWithDelay$$ExternalSyntheticLambda1) {
        this.IconCompatParcelizer = singleObserveOn;
        this.RemoteActionCompatParcelizer = retryWithDelay$$ExternalSyntheticLambda1;
    }
}
