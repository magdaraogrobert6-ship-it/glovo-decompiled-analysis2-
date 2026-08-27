package io.reactivex.internal.operators.completable;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import o.InAppMessageManagerBase;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableCreate extends Completable {
    public final CompletableOnSubscribe read;

    public static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {
        public final CompletableObserver IconCompatParcelizer;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.CompletableEmitter
        public final void read(InAppMessageManagerBase inAppMessageManagerBase) {
            DisposableHelper.set(this, new CancellableDisposable(inAppMessageManagerBase));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return m1$$ExternalSyntheticOutline0.m(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        public Emitter(CompletableObserver completableObserver) {
            this.IconCompatParcelizer = completableObserver;
        }

        @Override // io.reactivex.CompletableEmitter
        public final void IconCompatParcelizer() {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.IconCompatParcelizer.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableEmitter
        public final void RemoteActionCompatParcelizer(Throwable th) {
            if (read(th)) {
                return;
            }
            RxJavaPlugins.IconCompatParcelizer(th);
        }

        @Override // io.reactivex.CompletableEmitter
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
                this.IconCompatParcelizer.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.onSubscribe(emitter);
        try {
            this.read.subscribe(emitter);
        } catch (Throwable th) {
            Exceptions.read(th);
            emitter.RemoteActionCompatParcelizer(th);
        }
    }

    public CompletableCreate(CompletableOnSubscribe completableOnSubscribe) {
        this.read = completableOnSubscribe;
    }
}
