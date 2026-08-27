package io.reactivex.subjects;

import bo.app.af$$ExternalSyntheticOutline1;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class PublishSubject<T> extends Subject<T> {
    public static final PublishDisposable[] IconCompatParcelizer = new PublishDisposable[0];
    public static final PublishDisposable[] read = new PublishDisposable[0];
    public final AtomicReference serializer = new AtomicReference(read);
    public Throwable write;

    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        public final Observer read;
        public final PublishSubject serializer;

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.serializer.write(this);
            }
        }

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.read = observer;
            this.serializer = publishSubject;
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.serializer;
        Object obj = atomicReference.get();
        Object obj2 = IconCompatParcelizer;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.read.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.serializer.get() == IconCompatParcelizer) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        while (true) {
            AtomicReference atomicReference = this.serializer;
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == IconCompatParcelizer) {
                Throwable th = this.write;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            PublishDisposable[] publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
            do {
                if (atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                    if (publishDisposable.get()) {
                        write(publishDisposable);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == publishDisposableArr);
        }
    }

    public final void write(PublishDisposable publishDisposable) {
        AtomicReference atomicReference;
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            atomicReference = this.serializer;
            publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == IconCompatParcelizer || publishDisposableArr == (publishDisposableArr2 = read)) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishDisposableArr2 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr2, i, (length - i) - 1);
            }
        } while (!af$$ExternalSyntheticOutline1.IconCompatParcelizer(atomicReference, publishDisposableArr, publishDisposableArr2));
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.write(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.serializer;
        Object obj = atomicReference.get();
        Object obj2 = IconCompatParcelizer;
        if (obj == obj2) {
            RxJavaPlugins.IconCompatParcelizer(th);
            return;
        }
        this.write = th;
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (publishDisposable.get()) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                publishDisposable.read.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.write(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.serializer.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.read.onNext(obj);
            }
        }
    }
}
