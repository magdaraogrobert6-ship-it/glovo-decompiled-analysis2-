package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Maybe serializer;

    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final Maybe RemoteActionCompatParcelizer;
        public final MaybeObserver serializer;

        public static final class OtherMaybeObserver<T> implements MaybeObserver<T> {
            public final AtomicReference read;
            public final MaybeObserver write;

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.write.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                this.write.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.read, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.write.onSuccess(obj);
            }

            public OtherMaybeObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
                this.write = maybeObserver;
                this.read = atomicReference;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.serializer.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.serializer.onSuccess(obj);
        }

        public SwitchIfEmptyMaybeObserver(Maybe maybe, MaybeObserver maybeObserver) {
            this.serializer = maybeObserver;
            this.RemoteActionCompatParcelizer = maybe;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = get();
            if (disposable == DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.RemoteActionCompatParcelizer.subscribe(new OtherMaybeObserver(this.serializer, this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.serializer.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new SwitchIfEmptyMaybeObserver(this.serializer, maybeObserver));
    }

    public MaybeSwitchIfEmpty(Maybe maybe, Maybe maybe2) {
        super(maybe);
        this.serializer = maybe2;
    }
}
