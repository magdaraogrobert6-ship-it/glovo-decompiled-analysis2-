package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {
    public final FlowableOnBackpressureDrop read;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, FwFClientclose11 {
        public final FwFClientaddFeatureKeysfeaturesUpdated1 IconCompatParcelizer;
        public boolean read;
        public FwFClientclose11 serializer;
        public final Consumer write;

        @Override // o.FwFClientclose11
        public final void cancel() {
            this.serializer.cancel();
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
            if (SubscriptionHelper.validate(this.serializer, fwFClientclose11)) {
                this.serializer = fwFClientclose11;
                this.IconCompatParcelizer.onSubscribe(this);
                fwFClientclose11.request(Long.MAX_VALUE);
            }
        }

        public BackpressureDropSubscriber(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, FlowableOnBackpressureDrop flowableOnBackpressureDrop) {
            this.IconCompatParcelizer = fwFClientaddFeatureKeysfeaturesUpdated1;
            this.write = flowableOnBackpressureDrop;
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onError(Throwable th) {
            if (this.read) {
                RxJavaPlugins.IconCompatParcelizer(th);
            } else {
                this.read = true;
                this.IconCompatParcelizer.onError(th);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onNext(Object obj) {
            if (this.read) {
                return;
            }
            if (get() != 0) {
                this.IconCompatParcelizer.onNext(obj);
                BackpressureHelper.serializer(this, 1L);
                return;
            }
            try {
                this.write.accept(obj);
            } catch (Throwable th) {
                Exceptions.read(th);
                cancel();
                onError(th);
            }
        }

        @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
        public final void onComplete() {
            if (this.read) {
                return;
            }
            this.read = true;
            this.IconCompatParcelizer.onComplete();
        }

        @Override // o.FwFClientclose11
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.write(this, j);
            }
        }
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
    }

    @Override // io.reactivex.Flowable
    public final void IconCompatParcelizer(FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1) {
        this.IconCompatParcelizer.subscribe((FlowableSubscriber) new BackpressureDropSubscriber(fwFClientaddFeatureKeysfeaturesUpdated1, this.read));
    }

    public FlowableOnBackpressureDrop(FlowableFromObservable flowableFromObservable) {
        super(flowableFromObservable);
        this.read = this;
    }
}
