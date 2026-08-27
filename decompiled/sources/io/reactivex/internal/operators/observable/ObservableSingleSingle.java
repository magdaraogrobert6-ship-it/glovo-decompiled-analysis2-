package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableSingleSingle<T> extends Single<T> {
    public final Observable RemoteActionCompatParcelizer;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        public Disposable IconCompatParcelizer;
        public Object RemoteActionCompatParcelizer;
        public final SingleObserver serializer;
        public boolean write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.IconCompatParcelizer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.IconCompatParcelizer, disposable)) {
                this.IconCompatParcelizer = disposable;
                this.serializer.onSubscribe(this);
            }
        }

        public SingleElementObserver(SingleObserver singleObserver) {
            this.serializer = singleObserver;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.write) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.write = true;
                this.serializer.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.write) {
                return;
            }
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = obj;
                return;
            }
            this.write = true;
            this.IconCompatParcelizer.dispose();
            this.serializer.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.write) {
                return;
            }
            this.write = true;
            Object obj = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
            if (obj == null) {
                obj = null;
            }
            SingleObserver singleObserver = this.serializer;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.RemoteActionCompatParcelizer.subscribe(new SingleElementObserver(singleObserver));
    }

    public ObservableSingleSingle(Observable observable) {
        this.RemoteActionCompatParcelizer = observable;
    }
}
