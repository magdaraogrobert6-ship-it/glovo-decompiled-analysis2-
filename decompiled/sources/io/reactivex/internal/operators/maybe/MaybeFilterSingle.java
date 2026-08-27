package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFilterSingle<T> extends Maybe<T> {
    public final Single IconCompatParcelizer;
    public final Predicate RemoteActionCompatParcelizer;

    public static final class FilterMaybeObserver<T> implements SingleObserver<T>, Disposable {
        public Disposable IconCompatParcelizer;
        public final MaybeObserver serializer;
        public final Predicate write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.IconCompatParcelizer;
            this.IconCompatParcelizer = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.serializer.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.IconCompatParcelizer, disposable)) {
                this.IconCompatParcelizer = disposable;
                this.serializer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.serializer;
            try {
                if (this.write.read(obj)) {
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
            this.write = predicate;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.IconCompatParcelizer.subscribe(new FilterMaybeObserver(maybeObserver, this.RemoteActionCompatParcelizer));
    }

    public MaybeFilterSingle(Single single, Predicate predicate) {
        this.IconCompatParcelizer = single;
        this.RemoteActionCompatParcelizer = predicate;
    }
}
