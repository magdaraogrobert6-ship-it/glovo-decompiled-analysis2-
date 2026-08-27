package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeIsEmptySingle<T> extends Single<Boolean> implements FuseToMaybe<Boolean> {
    public final MaybeFilter IconCompatParcelizer;

    public static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public Disposable read;
        public final SingleObserver serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.read.dispose();
            this.read = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.read.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.read = DisposableHelper.DISPOSED;
            this.serializer.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.read = DisposableHelper.DISPOSED;
            this.serializer.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.read, disposable)) {
                this.read = disposable;
                this.serializer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.read = DisposableHelper.DISPOSED;
            this.serializer.onSuccess(Boolean.FALSE);
        }

        public IsEmptyMaybeObserver(SingleObserver singleObserver) {
            this.serializer = singleObserver;
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.IconCompatParcelizer.subscribe(new IsEmptyMaybeObserver(singleObserver));
    }

    public final MaybeIsEmpty serializer() {
        return new MaybeIsEmpty(this.IconCompatParcelizer);
    }

    public MaybeIsEmptySingle(MaybeFilter maybeFilter) {
        this.IconCompatParcelizer = maybeFilter;
    }
}
