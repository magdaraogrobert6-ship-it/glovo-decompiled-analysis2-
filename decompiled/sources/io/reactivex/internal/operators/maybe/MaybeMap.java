package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeMap<T, R> extends AbstractMaybeWithUpstream<T, R> {
    public final Function IconCompatParcelizer;

    public static final class MapMaybeObserver<T, R> implements MaybeObserver<T>, Disposable {
        public final Function IconCompatParcelizer;
        public final MaybeObserver read;
        public Disposable serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.serializer;
            this.serializer = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.serializer.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.read.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.serializer, disposable)) {
                this.serializer = disposable;
                this.read.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            MaybeObserver maybeObserver = this.read;
            try {
                Object objApply = this.IconCompatParcelizer.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null item");
                maybeObserver.onSuccess(objApply);
            } catch (Throwable th) {
                Exceptions.read(th);
                maybeObserver.onError(th);
            }
        }

        public MapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.read = maybeObserver;
            this.IconCompatParcelizer = function;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new MapMaybeObserver(maybeObserver, this.IconCompatParcelizer));
    }

    public MaybeMap(Maybe maybe, Function function) {
        super(maybe);
        this.IconCompatParcelizer = function;
    }
}
