package io.reactivex.internal.operators.flowable;

import com.roadrunner.domain.util.RetryWithDelay;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.syncCustomerProfilefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    public final RetryWithDelay read;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            ((FlowableRepeatWhen$WhenReceiver) this.IconCompatParcelizer).cancel();
            this.serializer.onComplete();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            read(EmptySubscription.INSTANCE);
            long j = this.write;
            if (j != 0) {
                this.write = 0L;
                IconCompatParcelizer(j);
            }
            this.IconCompatParcelizer.request(1L);
            this.RemoteActionCompatParcelizer.onNext(th);
        }

        public RetryWhenSubscriber(SerializedSubscriber serializedSubscriber, FlowableProcessor flowableProcessor, FwFClientclose11 fwFClientclose11) {
            super(serializedSubscriber, flowableProcessor, fwFClientclose11);
        }
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1);
        FlowableProcessor flowableProcessorRemoteActionCompatParcelizer = new UnicastProcessor().RemoteActionCompatParcelizer();
        try {
            syncCustomerProfilefwf_client_release synccustomerprofilefwf_client_release = (syncCustomerProfilefwf_client_release) this.read.apply(flowableProcessorRemoteActionCompatParcelizer);
            FlowableRepeatWhen$WhenReceiver flowableRepeatWhen$WhenReceiver = new FlowableRepeatWhen$WhenReceiver(this.IconCompatParcelizer);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, flowableProcessorRemoteActionCompatParcelizer, flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.RemoteActionCompatParcelizer = retryWhenSubscriber;
            fwFClientaddFeatureKeysfeaturesUpdated1.onSubscribe(retryWhenSubscriber);
            synccustomerprofilefwf_client_release.subscribe(flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.read(th);
            EmptySubscription.error(th, fwFClientaddFeatureKeysfeaturesUpdated1);
        }
    }

    public FlowableRetryWhen(Flowable flowable, RetryWithDelay retryWithDelay) {
        super(flowable);
        this.read = retryWithDelay;
    }
}
