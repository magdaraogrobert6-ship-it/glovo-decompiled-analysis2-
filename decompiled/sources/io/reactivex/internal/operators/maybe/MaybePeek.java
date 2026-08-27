package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Consumer read;
    public final Consumer serializer;

    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver IconCompatParcelizer;
        public final MaybePeek RemoteActionCompatParcelizer;
        public Disposable serializer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.serializer.dispose();
            this.serializer = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.serializer.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = this.serializer;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            this.serializer = disposableHelper;
            this.IconCompatParcelizer.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            if (this.serializer == DisposableHelper.DISPOSED) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                write(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.serializer, disposable)) {
                this.serializer = disposable;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = this.serializer;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.RemoteActionCompatParcelizer.serializer.accept(obj);
                this.serializer = disposableHelper;
                this.IconCompatParcelizer.onSuccess(obj);
            } catch (Throwable th) {
                Exceptions.read(th);
                write(th);
            }
        }

        public final void write(Throwable th) {
            try {
                this.RemoteActionCompatParcelizer.read.accept(th);
            } catch (Throwable th2) {
                Exceptions.read(th2);
                th = new CompositeException(th, th2);
            }
            this.serializer = DisposableHelper.DISPOSED;
            this.IconCompatParcelizer.onError(th);
        }

        public MaybePeekObserver(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.IconCompatParcelizer = maybeObserver;
            this.RemoteActionCompatParcelizer = maybePeek;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new MaybePeekObserver(maybeObserver, this));
    }

    public MaybePeek(Maybe maybe, Consumer consumer, Consumer consumer2) {
        super(maybe);
        this.serializer = consumer;
        this.read = consumer2;
    }
}
