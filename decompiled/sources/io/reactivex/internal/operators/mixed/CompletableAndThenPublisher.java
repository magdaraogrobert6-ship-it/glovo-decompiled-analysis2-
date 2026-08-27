package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.internal.operators.flowable.FlowableJust;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    public final CompletableOnErrorComplete IconCompatParcelizer;
    public final FlowableJust read;

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<FwFClientclose11> implements FlowableSubscriber<R>, CompletableObserver, FwFClientclose11 {
        public final AtomicLong IconCompatParcelizer = new AtomicLong();
        public Disposable RemoteActionCompatParcelizer;
        public FlowableJust read;
        public final FwFClientaddFeatureKeysfeaturesUpdated1 write;

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.RemoteActionCompatParcelizer.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            this.write.onNext(obj);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.RemoteActionCompatParcelizer, disposable)) {
                this.RemoteActionCompatParcelizer = disposable;
                this.write.onSubscribe(this);
            }
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.IconCompatParcelizer, j);
        }

        public AndThenPublisherSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, FlowableJust flowableJust) {
            this.write = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.read = flowableJust;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            FlowableJust flowableJust = this.read;
            if (flowableJust == null) {
                this.write.onComplete();
            } else {
                this.read = null;
                flowableJust.subscribe((FwFClientaddFeatureKeysfeaturesUpdated1) this);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            SubscriptionHelper.deferredSetOnce(this, this.IconCompatParcelizer, fwFClientclose11);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe(new AndThenPublisherSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read));
    }

    public CompletableAndThenPublisher(CompletableOnErrorComplete completableOnErrorComplete, FlowableJust flowableJust) {
        this.IconCompatParcelizer = completableOnErrorComplete;
        this.read = flowableJust;
    }
}
