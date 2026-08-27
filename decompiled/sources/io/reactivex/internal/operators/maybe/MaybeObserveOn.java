package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    public final Scheduler serializer;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        public final Scheduler IconCompatParcelizer;
        public final MaybeObserver read;
        public Object serializer;
        public Throwable write;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.replace(this, this.IconCompatParcelizer.read(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.write = th;
            DisposableHelper.replace(this, this.IconCompatParcelizer.read(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.serializer = obj;
            DisposableHelper.replace(this, this.IconCompatParcelizer.read(this));
        }

        public ObserveOnMaybeObserver(MaybeObserver maybeObserver, Scheduler scheduler) {
            this.read = maybeObserver;
            this.IconCompatParcelizer = scheduler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.write;
            MaybeObserver maybeObserver = this.read;
            if (th != null) {
                this.write = null;
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.serializer;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                this.serializer = null;
                maybeObserver.onSuccess(obj);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.read.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        this.write.subscribe(new ObserveOnMaybeObserver(maybeObserver, this.serializer));
    }

    public MaybeObserveOn(Maybe maybe, Scheduler scheduler) {
        super(maybe);
        this.serializer = scheduler;
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 5606885;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
