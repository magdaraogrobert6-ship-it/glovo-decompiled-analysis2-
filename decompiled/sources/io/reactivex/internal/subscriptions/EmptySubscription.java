package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    @Override // o.FwFClientclose11
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public Object poll() {
        return null;
    }

    @Override // o.FwFClientclose11
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i) {
        return i & 2;
    }

    public static void complete(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(INSTANCE);
        fwFClientaddFeatureKeysfeaturesUpdated1.onComplete();
    }

    public static void error(Throwable th, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(INSTANCE);
        fwFClientaddFeatureKeysfeaturesUpdated1.onError(th);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
