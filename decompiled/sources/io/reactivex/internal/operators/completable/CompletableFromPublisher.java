package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class CompletableFromPublisher<T> extends Completable {
    public final FlowableRetryWhen serializer;

    public static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public FwFClientclose11 IconCompatParcelizer;
        public final CompletableObserver write;

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.IconCompatParcelizer.cancel();
            this.IconCompatParcelizer = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.IconCompatParcelizer == SubscriptionHelper.CANCELLED;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            this.write.onComplete();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.IconCompatParcelizer, fwFClientclose11)) {
                this.IconCompatParcelizer = fwFClientclose11;
                this.write.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public FromPublisherSubscriber(CompletableObserver completableObserver) {
            this.write = completableObserver;
        }
    }

    @Override // io.reactivex.Completable
    public final void serializer(CompletableObserver completableObserver) {
        this.serializer.subscribe((FwFClientaddFeatureKeysfeaturesUpdated1) new FromPublisherSubscriber(completableObserver));
    }

    public CompletableFromPublisher(FlowableRetryWhen flowableRetryWhen) {
        this.serializer = flowableRetryWhen;
    }
}
