package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    public final Object IconCompatParcelizer;
    public final FwFClientaddFeatureKeysfeaturesUpdated1 write;

    @Override // o.FwFClientclose11
    public final void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i) {
        return 1;
    }

    public ScalarSubscription(Object obj, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.write = fwFClientaddFeatureKeysfeaturesUpdated1;
        this.IconCompatParcelizer = obj;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.IconCompatParcelizer;
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        if (SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            Object obj = this.IconCompatParcelizer;
            FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1 = this.write;
            fwFClientaddFeatureKeysfeaturesUpdated1.onNext(obj);
            if (get() != 2) {
                fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
            }
        }
    }
}
