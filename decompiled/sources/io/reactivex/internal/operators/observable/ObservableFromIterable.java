package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableFromIterable<T> extends Observable<T> {
    public final Iterable read;

    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {
        public volatile boolean IconCompatParcelizer;
        public final Iterator RatingCompat;
        public final Observer RemoteActionCompatParcelizer;
        public boolean read;
        public boolean serializer;
        public boolean write;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.read = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.IconCompatParcelizer = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.read;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            this.serializer = true;
            return 1;
        }

        public FromIterableDisposable(Observer observer, Iterator it) {
            this.RemoteActionCompatParcelizer = observer;
            this.RatingCompat = it;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.read) {
                return null;
            }
            boolean z = this.write;
            Iterator it = this.RatingCompat;
            if (!z) {
                this.write = true;
            } else if (!it.hasNext()) {
                this.read = true;
                return null;
            }
            Object next = it.next();
            ObjectHelper.write(next, "The iterator returned a null value");
            return next;
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        try {
            Iterator<T> it = this.read.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete((Observer<?>) observer);
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it);
                observer.onSubscribe(fromIterableDisposable);
                if (fromIterableDisposable.serializer) {
                    return;
                }
                while (!fromIterableDisposable.IconCompatParcelizer) {
                    try {
                        Object next = fromIterableDisposable.RatingCompat.next();
                        ObjectHelper.write(next, "The iterator returned a null value");
                        fromIterableDisposable.RemoteActionCompatParcelizer.onNext(next);
                        if (fromIterableDisposable.IconCompatParcelizer) {
                            return;
                        }
                        try {
                            if (!fromIterableDisposable.RatingCompat.hasNext()) {
                                if (fromIterableDisposable.IconCompatParcelizer) {
                                    return;
                                }
                                fromIterableDisposable.RemoteActionCompatParcelizer.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.read(th);
                            fromIterableDisposable.RemoteActionCompatParcelizer.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.read(th2);
                        fromIterableDisposable.RemoteActionCompatParcelizer.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.read(th3);
                EmptyDisposable.error(th3, (Observer<?>) observer);
            }
        } catch (Throwable th4) {
            Exceptions.read(th4);
            EmptyDisposable.error(th4, (Observer<?>) observer);
        }
    }

    public ObservableFromIterable(List list) {
        this.read = list;
    }
}
