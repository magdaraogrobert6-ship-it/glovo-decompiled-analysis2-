package io.reactivex.internal.operators.single;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleCreate<T> extends Single<T> {
    public final SingleOnSubscribe write;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {
        public final SingleObserver read;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return m1$$ExternalSyntheticOutline0.m(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        public Emitter(SingleObserver singleObserver) {
            this.read = singleObserver;
        }

        @Override // io.reactivex.SingleEmitter
        public final void IconCompatParcelizer(Object obj) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            SingleObserver singleObserver = this.read;
            try {
                if (obj == null) {
                    singleObserver.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    singleObserver.onSuccess(obj);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleEmitter
        public final boolean read(Throwable th) {
            Disposable andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.read.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.onSubscribe(emitter);
        try {
            this.write.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.read(th);
            if (emitter.read(th)) {
                return;
            }
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    public SingleCreate(SingleOnSubscribe singleOnSubscribe) {
        this.write = singleOnSubscribe;
    }
}
