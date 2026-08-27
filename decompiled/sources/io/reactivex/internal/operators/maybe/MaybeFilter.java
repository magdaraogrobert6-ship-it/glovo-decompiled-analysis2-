package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFilter<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Predicate read;

    public static final class FilterMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public final Predicate IconCompatParcelizer;
        public final MaybeObserver serializer;
        public Disposable write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.write;
            this.write = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.write.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.serializer.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.serializer.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.write, disposable)) {
                this.write = disposable;
                this.serializer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.serializer;
            try {
                if (this.IconCompatParcelizer.read(obj)) {
                    maybeObserver.onSuccess(obj);
                } else {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.read(th);
                maybeObserver.onError(th);
            }
        }

        public FilterMaybeObserver(MaybeObserver maybeObserver, Predicate predicate) {
            this.serializer = maybeObserver;
            this.IconCompatParcelizer = predicate;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new FilterMaybeObserver(maybeObserver, this.read));
    }

    public MaybeFilter(Maybe maybe, Predicate predicate) {
        super(maybe);
        this.read = predicate;
    }
}
