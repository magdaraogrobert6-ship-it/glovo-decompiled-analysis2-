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
public final class ObservableElementAtSingle<T> extends Single<T> {
    public final Observable RemoteActionCompatParcelizer;

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        public final SingleObserver RemoteActionCompatParcelizer;
        public boolean read;
        public Disposable serializer;
        public long write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.serializer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.serializer.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.serializer, disposable)) {
                this.serializer = disposable;
                this.RemoteActionCompatParcelizer.onSubscribe(this);
            }
        }

        public ElementAtObserver(SingleObserver singleObserver) {
            this.RemoteActionCompatParcelizer = singleObserver;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.read) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.read = true;
                this.RemoteActionCompatParcelizer.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.read) {
                return;
            }
            this.read = true;
            this.RemoteActionCompatParcelizer.onError(new NoSuchElementException());
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.read) {
                return;
            }
            long j = this.write;
            if (j != 0) {
                this.write = j + 1;
                return;
            }
            this.read = true;
            this.serializer.dispose();
            this.RemoteActionCompatParcelizer.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Single
    public final void IconCompatParcelizer(SingleObserver singleObserver) {
        this.RemoteActionCompatParcelizer.subscribe(new ElementAtObserver(singleObserver));
    }

    public ObservableElementAtSingle(Observable observable) {
        this.RemoteActionCompatParcelizer = observable;
    }
}
