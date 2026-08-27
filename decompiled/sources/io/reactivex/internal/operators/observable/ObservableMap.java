package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function IconCompatParcelizer;

    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {
        public final Function serializer;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.write.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.serializer.apply(objPoll);
            ObjectHelper.write(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        public MapObserver(Observer observer, Function function) {
            super(observer);
            this.serializer = function;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.read) {
                return;
            }
            try {
                Object objApply = this.serializer.apply(obj);
                ObjectHelper.write(objApply, "The mapper function returned a null value.");
                this.IconCompatParcelizer.onNext(objApply);
            } catch (Throwable th) {
                Exceptions.read(th);
                this.RemoteActionCompatParcelizer.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void read(Observer observer) {
        this.read.subscribe(new MapObserver(observer, this.IconCompatParcelizer));
    }

    public ObservableMap(Observable observable, Function function) {
        super(observable);
        this.IconCompatParcelizer = function;
    }
}
