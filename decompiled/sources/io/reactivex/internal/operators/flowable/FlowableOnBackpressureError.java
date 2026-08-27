package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableOnBackpressureError<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, FwFClientclose11 {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
        public FwFClientclose11 RemoteActionCompatParcelizer;
        public boolean write;

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.RemoteActionCompatParcelizer.cancel();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.RemoteActionCompatParcelizer, fwFClientclose11)) {
                this.RemoteActionCompatParcelizer = fwFClientclose11;
                this.IconCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public BackpressureErrorSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
            this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.write) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.write = true;
                this.IconCompatParcelizer.onError(th);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.write) {
                return;
            }
            if (get() != 0) {
                this.IconCompatParcelizer.onNext(obj);
                BackpressureHelper.serializer(this, 1L);
            } else {
                this.RemoteActionCompatParcelizer.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests", 0));
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.write) {
                return;
            }
            this.write = true;
            this.IconCompatParcelizer.onComplete();
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this, j);
            }
        }
    }

    public FlowableOnBackpressureError(FlowableFromObservable flowableFromObservable) {
        super(flowableFromObservable);
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new BackpressureErrorSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1));
    }
}
