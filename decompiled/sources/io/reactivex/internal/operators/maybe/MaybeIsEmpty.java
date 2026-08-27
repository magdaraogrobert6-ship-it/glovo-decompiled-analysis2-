package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeIsEmpty<T> extends AbstractMaybeWithUpstream<T, Boolean> {

    public static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public Disposable IconCompatParcelizer;
        public final MaybeObserver read;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.IconCompatParcelizer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.read.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.IconCompatParcelizer, disposable)) {
                this.IconCompatParcelizer = disposable;
                this.read.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.read.onSuccess(Boolean.FALSE);
        }

        public IsEmptyMaybeObserver(MaybeObserver maybeObserver) {
            this.read = maybeObserver;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new IsEmptyMaybeObserver(maybeObserver));
    }

    public MaybeIsEmpty(Maybe maybe) {
        super(maybe);
    }
}
