package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    public final Observable RemoteActionCompatParcelizer;

    public static final class SubscriberObserver<T> implements Observer<T>, FwFClientclose11 {
        public Disposable IconCompatParcelizer;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 serializer;

        @Override // o.FwFClientclose11
        public final void request(long j) {
        }

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.IconCompatParcelizer.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.serializer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.serializer.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.serializer.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.IconCompatParcelizer = disposable;
            this.serializer.onSubscribe(this);
        }

        public SubscriberObserver(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.serializer = fwFClientaddFeatureKeysfeaturesUpdated1;
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.RemoteActionCompatParcelizer.subscribe(new SubscriberObserver(fwFClientaddFeatureKeysfeaturesUpdated1));
    }

    public FlowableFromObservable(Observable observable) {
        this.RemoteActionCompatParcelizer = observable;
    }
}
