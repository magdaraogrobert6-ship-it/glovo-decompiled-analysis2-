package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarCallable<T> {
    public final Object RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(new ScalarSubscription(this.RemoteActionCompatParcelizer, fwFClientaddFeatureKeysfeaturesUpdated1));
    }

    public FlowableJust(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }
}
