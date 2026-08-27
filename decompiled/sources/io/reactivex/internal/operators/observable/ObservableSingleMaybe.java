package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {
    public final Observable IconCompatParcelizer;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        public final MaybeObserver IconCompatParcelizer;
        public boolean RemoteActionCompatParcelizer;
        public Object serializer;
        public Disposable write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.write.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.write.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.write, disposable)) {
                this.write = disposable;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public SingleElementObserver(MaybeObserver maybeObserver) {
            this.IconCompatParcelizer = maybeObserver;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.RemoteActionCompatParcelizer) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.RemoteActionCompatParcelizer = true;
                this.IconCompatParcelizer.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.serializer == null) {
                this.serializer = obj;
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.write.dispose();
            this.IconCompatParcelizer.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            Object obj = this.serializer;
            this.serializer = null;
            MaybeObserver maybeObserver = this.IconCompatParcelizer;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.IconCompatParcelizer.subscribe(new SingleElementObserver(maybeObserver));
    }

    public ObservableSingleMaybe(Observable observable) {
        this.IconCompatParcelizer = observable;
    }
}
