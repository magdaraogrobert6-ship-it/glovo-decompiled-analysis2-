package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, FwFClientclose11 {
    public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public FwFClientclose11 serializer;
    public long write;

    @Override // o.FwFClientclose11
    public final void cancel() {
        this.serializer.cancel();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        if (SubscriptionHelper.validate(this.serializer, fwFClientclose11)) {
            this.serializer = fwFClientclose11;
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public SinglePostCompleteSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj = this.RemoteActionCompatParcelizer;
                        FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.IconCompatParcelizer;
                        fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
                        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.serializer(j2, j)));
            this.serializer.request(j);
        }
    }
}
