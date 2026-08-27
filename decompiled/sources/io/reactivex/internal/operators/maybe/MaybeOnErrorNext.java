package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Function read;

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final boolean IconCompatParcelizer = true;
        public final Function RemoteActionCompatParcelizer;
        public final MaybeObserver write;

        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {
            public final AtomicReference IconCompatParcelizer;
            public final MaybeObserver read;

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
                DisposableHelper.setOnce(this.IconCompatParcelizer, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.read.onSuccess(obj);
            }

            public NextMaybeObserver(MaybeObserver maybeObserver, AtomicReference atomicReference) {
                this.read = maybeObserver;
                this.IconCompatParcelizer = atomicReference;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.write.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            boolean z = this.IconCompatParcelizer;
            MaybeObserver maybeObserver = this.write;
            if (!z && !(th instanceof Exception)) {
                maybeObserver.onError(th);
                return;
            }
            try {
                Object objApply = this.RemoteActionCompatParcelizer.apply(th);
                ObjectHelper.write(objApply, "The resumeFunction returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objApply;
                DisposableHelper.replace(this, null);
                maybeSource.subscribe(new NextMaybeObserver(maybeObserver, this));
            } catch (Throwable th2) {
                Exceptions.read(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.write.onSuccess(obj);
        }

        public OnErrorNextMaybeObserver(MaybeObserver maybeObserver, Function function) {
            this.write = maybeObserver;
            this.RemoteActionCompatParcelizer = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.write.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new OnErrorNextMaybeObserver(maybeObserver, this.read));
    }

    public MaybeOnErrorNext(Maybe maybe, Function function) {
        super(maybe);
        this.read = function;
    }
}
