package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, FwFClientclose11 {
    public FlowableRetryWhen.RetryWhenSubscriber RemoteActionCompatParcelizer;
    public final syncCustomerProfilefwf_client_release serializer;
    public final AtomicReference read = new AtomicReference();
    public final AtomicLong write = new AtomicLong();

    @Override // o.FwFClientclose11
    public final void cancel() {
        SubscriptionHelper.cancel(this.read);
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onComplete() {
        this.RemoteActionCompatParcelizer.cancel();
        this.RemoteActionCompatParcelizer.serializer.onComplete();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        this.RemoteActionCompatParcelizer.cancel();
        this.RemoteActionCompatParcelizer.serializer.onError(th);
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        SubscriptionHelper.deferredSetOnce(this.read, this.write, fwFClientclose11);
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.read, this.write, j);
    }

    public FlowableRepeatWhen$WhenReceiver(syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release) {
        this.serializer = synccustomerprofilefwf_client_release;
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.read.get() != SubscriptionHelper.CANCELLED) {
                this.serializer.subscribe(this.RemoteActionCompatParcelizer);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
