package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {
    public final Runnable serializer;
    public static final Object write = new Object();
    public static final Object read = new Object();
    public static final Object IconCompatParcelizer = new Object();
    public static final Object RemoteActionCompatParcelizer = new Object();

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.serializer = runnable;
        lazySet(0, disposableContainer);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = RemoteActionCompatParcelizer;
            if (obj6 == obj || obj6 == (obj4 = read) || obj6 == (obj5 = IconCompatParcelizer)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = write) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).IconCompatParcelizer(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == write || obj == RemoteActionCompatParcelizer;
    }

    public final void write(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == RemoteActionCompatParcelizer) {
                return;
            }
            if (obj == read) {
                future.cancel(false);
                return;
            } else if (obj == IconCompatParcelizer) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = IconCompatParcelizer;
        Object obj3 = read;
        Object obj4 = write;
        Object obj5 = RemoteActionCompatParcelizer;
        lazySet(2, Thread.currentThread());
        try {
            this.serializer.run();
        } catch (Throwable th) {
            try {
                RxJavaPlugins.IconCompatParcelizer(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((DisposableContainer) obj6).IconCompatParcelizer(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((DisposableContainer) obj7).IconCompatParcelizer(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
