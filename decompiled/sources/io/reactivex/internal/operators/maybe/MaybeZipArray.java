package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {
    public final Function serializer;
    public final MaybeSource[] write;

    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            Object objApply = MaybeZipArray.this.serializer.apply(new Object[]{obj});
            ObjectHelper.write(objApply, "The zipper returned a null value");
            return objApply;
        }

        public SingletonArrayFunc() {
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        public final Function RemoteActionCompatParcelizer;
        public final MaybeObserver read;
        public final ZipMaybeObserver[] serializer;
        public final Object[] write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver zipMaybeObserver : this.serializer) {
                    zipMaybeObserver.getClass();
                    DisposableHelper.dispose(zipMaybeObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() <= 0;
        }

        public final void IconCompatParcelizer(int i) {
            ZipMaybeObserver[] zipMaybeObserverArr = this.serializer;
            int length = zipMaybeObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ZipMaybeObserver zipMaybeObserver = zipMaybeObserverArr[i2];
                zipMaybeObserver.getClass();
                DisposableHelper.dispose(zipMaybeObserver);
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                }
                ZipMaybeObserver zipMaybeObserver2 = zipMaybeObserverArr[i];
                zipMaybeObserver2.getClass();
                DisposableHelper.dispose(zipMaybeObserver2);
            }
        }

        public ZipCoordinator(MaybeObserver maybeObserver, int i, Function function) {
            super(i);
            this.read = maybeObserver;
            this.RemoteActionCompatParcelizer = function;
            ZipMaybeObserver[] zipMaybeObserverArr = new ZipMaybeObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2] = new ZipMaybeObserver(this, i2);
            }
            this.serializer = zipMaybeObserverArr;
            this.write = new Object[i];
        }
    }

    public static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        public final int RemoteActionCompatParcelizer;
        public final ZipCoordinator serializer;

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            ZipCoordinator zipCoordinator = this.serializer;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                zipCoordinator.read.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            ZipCoordinator zipCoordinator = this.serializer;
            if (zipCoordinator.getAndSet(0) <= 0) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                zipCoordinator.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
                zipCoordinator.read.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            ZipCoordinator zipCoordinator = this.serializer;
            MaybeObserver maybeObserver = zipCoordinator.read;
            Object[] objArr = zipCoordinator.write;
            objArr[this.RemoteActionCompatParcelizer] = obj;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object objApply = zipCoordinator.RemoteActionCompatParcelizer.apply(objArr);
                    ObjectHelper.write(objApply, "The zipper returned a null value");
                    maybeObserver.onSuccess(objApply);
                } catch (Throwable th) {
                    Exceptions.read(th);
                    maybeObserver.onError(th);
                }
            }
        }

        public ZipMaybeObserver(ZipCoordinator zipCoordinator, int i) {
            this.serializer = zipCoordinator;
            this.RemoteActionCompatParcelizer = i;
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        MaybeSource[] maybeSourceArr = this.write;
        int length = maybeSourceArr.length;
        if (length == 1) {
            maybeSourceArr[0].subscribe(new MaybeMap.MapMaybeObserver(maybeObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(maybeObserver, length, this.serializer);
        maybeObserver.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            MaybeSource maybeSource = maybeSourceArr[i];
            if (maybeSource == null) {
                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                if (zipCoordinator.getAndSet(0) <= 0) {
                    RxJavaPlugins.IconCompatParcelizer(nullPointerException);
                    return;
                } else {
                    zipCoordinator.IconCompatParcelizer(i);
                    zipCoordinator.read.onError(nullPointerException);
                    return;
                }
            }
            maybeSource.subscribe(zipCoordinator.serializer[i]);
        }
    }

    public MaybeZipArray(MaybeSource[] maybeSourceArr, Function function) {
        this.write = maybeSourceArr;
        this.serializer = function;
    }
}
