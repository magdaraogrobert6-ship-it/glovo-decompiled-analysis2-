package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
    public final FwFClientclose11 IconCompatParcelizer;
    public final FlowableProcessor RemoteActionCompatParcelizer;
    public final SerializedSubscriber serializer;
    public long write;

    public FlowableRepeatWhen$WhenSourceSubscriber(SerializedSubscriber serializedSubscriber, FlowableProcessor flowableProcessor, FwFClientclose11 fwFClientclose11) {
        super(false);
        this.serializer = serializedSubscriber;
        this.RemoteActionCompatParcelizer = flowableProcessor;
        this.IconCompatParcelizer = fwFClientclose11;
    }

    @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, o.FwFClientclose11
    public final void cancel() {
        super.cancel();
        this.IconCompatParcelizer.cancel();
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        this.write++;
        this.serializer.onNext(obj);
    }
}
