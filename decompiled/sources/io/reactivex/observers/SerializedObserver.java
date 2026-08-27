package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes4.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {
    public AppendOnlyLinkedArrayList IconCompatParcelizer;
    public final Observer RemoteActionCompatParcelizer;
    public boolean read;
    public volatile boolean serializer;
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
            this.RemoteActionCompatParcelizer.onSubscribe(this);
        }
    }

    public SerializedObserver(Observer observer) {
        this.RemoteActionCompatParcelizer = observer;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.serializer) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.serializer) {
                if (this.read) {
                    this.serializer = true;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.IconCompatParcelizer;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.IconCompatParcelizer = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.IconCompatParcelizer[0] = NotificationLite.error(th);
                    return;
                }
                this.serializer = true;
                this.read = true;
                z = false;
            }
            if (z) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.RemoteActionCompatParcelizer.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.serializer) {
            return;
        }
        synchronized (this) {
            if (this.serializer) {
                return;
            }
            if (!this.read) {
                this.serializer = true;
                this.read = true;
                this.RemoteActionCompatParcelizer.onComplete();
            } else {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.IconCompatParcelizer;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.IconCompatParcelizer = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.write(NotificationLite.complete());
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        Object[] objArr;
        if (this.serializer) {
            return;
        }
        if (obj == null) {
            this.write.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.serializer) {
                return;
            }
            if (this.read) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.IconCompatParcelizer;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.IconCompatParcelizer = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.write(NotificationLite.next(obj));
                return;
            }
            this.read = true;
            this.RemoteActionCompatParcelizer.onNext(obj);
            while (true) {
                synchronized (this) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.IconCompatParcelizer;
                    if (appendOnlyLinkedArrayList2 == null) {
                        this.read = false;
                        return;
                    }
                    this.IconCompatParcelizer = null;
                    Observer observer = this.RemoteActionCompatParcelizer;
                    for (Object[] objArr2 = appendOnlyLinkedArrayList2.IconCompatParcelizer; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (NotificationLite.acceptFull(objArr, observer)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
