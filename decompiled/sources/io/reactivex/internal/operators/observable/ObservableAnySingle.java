package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableAnySingle<T> extends Single<Boolean> {
    public final ObservableMap serializer;
    public final Predicate write;

    public static final class AnyObserver<T> implements Observer<T>, Disposable {
        public final Predicate IconCompatParcelizer;
        public Disposable RemoteActionCompatParcelizer;
        public final SingleObserver read;
        public boolean write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.RemoteActionCompatParcelizer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.RemoteActionCompatParcelizer.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.RemoteActionCompatParcelizer, disposable)) {
                this.RemoteActionCompatParcelizer = disposable;
                this.read.onSubscribe(this);
            }
        }

        public AnyObserver(SingleObserver singleObserver, Predicate predicate) {
            this.read = singleObserver;
            this.IconCompatParcelizer = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.write) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.write = true;
                this.read.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.write) {
                return;
            }
            this.write = true;
            this.read.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.write) {
                return;
            }
            try {
                if (this.IconCompatParcelizer.read(obj)) {
                    this.write = true;
                    this.RemoteActionCompatParcelizer.dispose();
                    this.read.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                Exceptions.read(th);
                this.RemoteActionCompatParcelizer.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.serializer.subscribe(new AnyObserver(singleObserver, this.write));
    }

    public ObservableAnySingle(ObservableMap observableMap, Predicate predicate) {
        this.serializer = observableMap;
        this.write = predicate;
    }
}
