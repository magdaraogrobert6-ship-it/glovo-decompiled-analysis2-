package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableFilter<T> extends AbstractObservableWithUpstream<T, T> {
    public final Predicate write;

    public static final class FilterObserver<T> extends BasicFuseableObserver<T, T> {
        public final Predicate serializer;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return 0;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                if (this.serializer.read(obj)) {
                    this.IconCompatParcelizer.onNext(obj);
                }
            } catch (Throwable th) {
                Exceptions.read(th);
                this.RemoteActionCompatParcelizer.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll;
            do {
                objPoll = this.write.poll();
                if (objPoll == null) {
                    break;
                }
            } while (!this.serializer.read(objPoll));
            return objPoll;
        }

        public FilterObserver(Observer observer, Predicate predicate) {
            super(observer);
            this.serializer = predicate;
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        this.read.subscribe(new FilterObserver(observer, this.write));
    }

    public ObservableFilter(Observable observable, Predicate predicate) {
        super(observable);
        this.write = predicate;
    }
}
