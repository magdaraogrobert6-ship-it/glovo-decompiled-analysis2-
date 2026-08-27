package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleToFlowable<T> extends Flowable<T> {
    public final Single RemoteActionCompatParcelizer;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {
        public Disposable read;

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.RatingCompat.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.read, disposable)) {
                this.read = disposable;
                this.RatingCompat.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.FwFClientclose11
        public final void cancel() {
            super.cancel();
            this.read.dispose();
        }

        public SingleToFlowableObserver(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.RemoteActionCompatParcelizer.subscribe(new SingleToFlowableObserver(fwFClientaddFeatureKeysfeaturesUpdated1));
    }

    public SingleToFlowable(Single single) {
        this.RemoteActionCompatParcelizer = single;
    }
}
