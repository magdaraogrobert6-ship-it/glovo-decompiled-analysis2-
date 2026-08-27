package io.reactivex.internal.operators.maybe;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeCreate<T> extends Maybe<T> {
    public final JankStatsFrameTracker$$ExternalSyntheticLambda3 RemoteActionCompatParcelizer;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {
        public final MaybeObserver read;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return m1$$ExternalSyntheticOutline0.m(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        public Emitter(MaybeObserver maybeObserver) {
            this.read = maybeObserver;
        }

        @Override // io.reactivex.MaybeEmitter
        public final void IconCompatParcelizer(Object obj) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            MaybeObserver maybeObserver = this.read;
            try {
                if (obj == null) {
                    maybeObserver.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    maybeObserver.onSuccess(obj);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // io.reactivex.MaybeEmitter
        public final void RemoteActionCompatParcelizer() {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.read.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeEmitter
        public final void read(Throwable th) {
            Disposable andSet;
            Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper && (andSet = getAndSet(disposableHelper)) != disposableHelper) {
                try {
                    this.read.onError(nullPointerException);
                    if (andSet != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
            RxJavaPlugins.IconCompatParcelizer(th);
        }
    }

    @Override // io.reactivex.Maybe
    public final void IconCompatParcelizer(MaybeObserver maybeObserver) {
        Emitter emitter = new Emitter(maybeObserver);
        maybeObserver.onSubscribe(emitter);
        try {
            this.RemoteActionCompatParcelizer.write(emitter);
        } catch (Throwable th) {
            Exceptions.read(th);
            emitter.read(th);
        }
    }

    public MaybeCreate(JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3) {
        this.RemoteActionCompatParcelizer = jankStatsFrameTracker$$ExternalSyntheticLambda3;
    }
}
