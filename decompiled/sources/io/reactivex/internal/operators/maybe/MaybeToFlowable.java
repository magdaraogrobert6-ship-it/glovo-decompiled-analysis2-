package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class MaybeToFlowable<T> extends Flowable<T> {
    public final MaybeFlatten serializer;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {
        public Disposable IconCompatParcelizer;

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.RatingCompat.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.RatingCompat.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.IconCompatParcelizer, disposable)) {
                this.IconCompatParcelizer = disposable;
                this.RatingCompat.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, o.FwFClientclose11
        public final void cancel() {
            super.cancel();
            this.IconCompatParcelizer.dispose();
        }

        public MaybeToFlowableSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            super(fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.serializer.subscribe(new MaybeToFlowableSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1));
    }

    public MaybeToFlowable(MaybeFlatten maybeFlatten) {
        this.serializer = maybeFlatten;
    }
}
