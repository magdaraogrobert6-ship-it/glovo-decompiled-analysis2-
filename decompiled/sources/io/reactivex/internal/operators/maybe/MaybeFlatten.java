package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeFlatten<T, R> extends AbstractMaybeWithUpstream<T, R> {
    public final Function read;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public Disposable IconCompatParcelizer;
        public final Function RemoteActionCompatParcelizer;
        public final MaybeObserver serializer;

        public final class InnerObserver implements MaybeObserver<R> {
            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                FlatMapMaybeObserver.this.serializer.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                FlatMapMaybeObserver.this.serializer.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                FlatMapMaybeObserver.this.serializer.onSuccess(obj);
            }

            public InnerObserver() {
            }
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
            if (DisposableHelper.validate(this.IconCompatParcelizer, disposable)) {
                this.IconCompatParcelizer = disposable;
                this.serializer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.RemoteActionCompatParcelizer.apply(obj);
                ObjectHelper.write(objApply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new InnerObserver());
            } catch (Exception e) {
                Exceptions.read(e);
                this.serializer.onError(e);
            }
        }

        public FlatMapMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.serializer = maybeObserver;
            this.RemoteActionCompatParcelizer = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.IconCompatParcelizer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new FlatMapMaybeObserver(maybeObserver, this.read));
    }

    public MaybeFlatten(Maybe maybe, Function function) {
        super(maybe);
        this.read = function;
    }
}
