package io.reactivex.internal.operators.observable;

import bo.app.m1$$ExternalSyntheticOutline0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import o.InAppMessageManagerBase;
import o.r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableCreate<T> extends Observable<T> {
    public final r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE IconCompatParcelizer;

    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        public final Observer write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.ObservableEmitter
        public final void IconCompatParcelizer(InAppMessageManagerBase inAppMessageManagerBase) {
            DisposableHelper.set(this, new CancellableDisposable(inAppMessageManagerBase));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return m1$$ExternalSyntheticOutline0.m(CreateEmitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        public CreateEmitter(Observer observer) {
            this.write = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.ObservableEmitter
        public final boolean IconCompatParcelizer(Throwable th) {
            if (isDisposed()) {
                return false;
            }
            try {
                this.write.onError(th);
                return true;
            } finally {
                DisposableHelper.dispose(this);
            }
        }

        @Override // io.reactivex.Emitter
        public final void RemoteActionCompatParcelizer() {
            if (isDisposed()) {
                return;
            }
            try {
                this.write.onComplete();
            } finally {
                DisposableHelper.dispose(this);
            }
        }

        @Override // io.reactivex.Emitter
        public final void write(Object obj) {
            if (obj == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (IconCompatParcelizer(nullPointerException)) {
                    return;
                }
                RxJavaPlugins.IconCompatParcelizer(nullPointerException);
                return;
            }
            if (isDisposed()) {
                return;
            }
            this.write.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            this.IconCompatParcelizer.IconCompatParcelizer(createEmitter);
        } catch (Throwable th) {
            Exceptions.read(th);
            if (createEmitter.IconCompatParcelizer(th)) {
                return;
            }
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    public ObservableCreate(r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE r8lambda8edymsnhzzlvj0t9bgz00krykue) {
        this.IconCompatParcelizer = r8lambda8edymsnhzzlvj0t9bgz00krykue;
    }
}
